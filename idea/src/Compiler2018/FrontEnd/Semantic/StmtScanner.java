package Compiler2018.FrontEnd.Semantic;

import Compiler2018.AST.*;
import Compiler2018.FrontEnd.IASTVistor;
import Compiler2018.Symbol.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class StmtScanner implements IASTVistor {
    private final TopTable topTable;
    private final Stack<AbstractSymbolTable> currentTable = new Stack<>();
    private Integer loopScopeCount = 0;
    private CstrSymbol cstrSymbol = null;
    private FuncSymbol funcSymbol = null;
    private ClassSymbol classSymbol = null;
    private boolean blockScopePushed = false;
    private List<String> primitiveType = new LinkedList<>();

    private void addPrimitiveType() {
        primitiveType.add("int");
        primitiveType.add("string");
        primitiveType.add("bool");
        primitiveType.add("void");
    }

    public StmtScanner(TopTable topTable) {
        this.topTable = topTable;
    }

    @Override
    public void visit(Program node) {
        addPrimitiveType();

        currentTable.push(topTable);
        node.getSections().forEach(x -> x.accept(this));
        currentTable.pop();
    }

    @Override
    public void visit(ClassDecl node) {
        classSymbol = topTable.getMyClass(node.getName());
        currentTable.push(topTable.getMyClass(node.getName()).getInClassTable());
        node.getItems().forEach(x -> x.accept(this));
        currentTable.pop();
        classSymbol = null;
    }

    @Override
    public void visit(FuncDecl node) {
        funcSymbol = currentTable.peek().getFunc(node.getName());
        currentTable.push(currentTable.peek().getFunc(node.getName()).getBlockTable());
        blockScopePushed = true;
        node.getBlock().accept(this);
        currentTable.pop();
        funcSymbol = null;
    }

    @Override
    public void visit(VarDecl node) {
        // type
        if (node.getType().getBaseType().equals("void")) {
            throw new RuntimeException("Void type should not be declared.");
        }
        if (topTable.getMyClass(node.getType().getBaseType()) == null) {
            throw new RuntimeException("Undeclared class occurred.");
        }
        // name
        if (node.getName().equals("this")) {
            throw new RuntimeException("'this' should not be a variable name.");
        }
        if (currentTable.peek() == topTable && topTable.getMyClass(node.getName()) != null) {
            throw new RuntimeException("Variable has the same name of class");
        }
        if (currentTable.peek().getFunc(node.getName()) != null) {
            throw new RuntimeException("Variable has the same name of function.");
        }
        if (currentTable.peek().getVar(node.getName()) != null) {
            throw new RuntimeException("Variable is previously declared.");
        }
        // init
        if (node.getInit() != null) {
            node.getInit().accept(this);
            if (node.getInit().getType().getBaseType().equals("null")) {
                if (node.getType().getDim() == 0 && primitiveType.contains(node.getType().getBaseType())) {
                    throw new RuntimeException("null assignment error.");
                }
            } else if (!node.getType().equals(node.getInit().getType())) {
                throw new RuntimeException("Init Type mismatch.");
            }
        }
        VarSymbol varSymbol = new VarSymbol(currentTable.peek(), node);
        node.setVarSymbol(varSymbol);
        currentTable.peek().addVar(node.getName(), varSymbol);
    }

    @Override
    public void visit(ClassVarDecl node) {
    }

    @Override
    public void visit(ClassCstrDecl node) {
        if (!classSymbol.getName().equals(node.getName())) {
            throw new RuntimeException("constructor name error.");
        }
        currentTable.push(currentTable.peek().getCstr(node.getName()).getBlockTable());
        cstrSymbol = classSymbol.getInClassTable().getCstr(node.getName());
        blockScopePushed = true;
        node.getBlock().accept(this);
        cstrSymbol = null;
        currentTable.pop();
    }

    @Override
    public void visit(ClassFuncDecl node) {
        node.getDecl().accept(this);
    }

    @Override
    public void visit(BlockStmt node) {
        boolean selfBlock = false;
        if (!blockScopePushed) {
            currentTable.push(new BlockTable(currentTable.peek(), "")); // FIXME
            selfBlock = true;
        }
        blockScopePushed = false;
        node.getStmts().forEach(x -> x.accept(this));
        if (selfBlock) {
            currentTable.pop();
        }
    }

    @Override
    public void visit(VarDeclStmt node) {
        node.getDecl().accept(this);
    }

    @Override
    public void visit(BranchStmt node) {
        node.getCond().accept(this);
        currentTable.push(new BlockTable(currentTable.peek(), "")); // FIXME
        blockScopePushed = true;
        node.getIfStmt().accept(this);
        blockScopePushed = false; // if does not always enter a blockStmt, may be other stmt.
        if (!node.getCond().getType().equals(new ClassType("bool", 0))) {
            throw new RuntimeException("bool required in IfStmt.");
        }
        currentTable.pop();
        if (node.getElseStmt() != null) {
            currentTable.push(new BlockTable(currentTable.peek(), "")); // FIXME
            blockScopePushed = true;
            node.getElseStmt().accept(this);
            blockScopePushed = false; // else does not always enter a blockStmt, may be other stmt.
            currentTable.pop();
        }
    }

    @Override
    public void visit(ExprStmt node) {
        node.getExpr().accept(this);
    }

    @Override
    public void visit(EmptyStmt node) {
    }

    @Override
    public void visit(ReturnStmt node) { // without returnStmt is always OK
        // cstr
        if (cstrSymbol != null) {
            if (node.getExpr() != null) {
                throw new RuntimeException("Cstr return error.");
            }
            // prepare for IR Generation
            node.setClassType(null);
            return;
        }

        // func
        if (funcSymbol == null) {
            throw new RuntimeException("Return should be in FuncScope");
        }

        // with returnExpr
        if (node.getExpr() != null) {
            node.getExpr().accept(this);
            if (node.getExpr().getType().getBaseType().equals("null")) {
                if (funcSymbol.getReturnType().getDim() == 0
                        && primitiveType.contains(funcSymbol.getReturnType().getBaseType())) {
                    throw new RuntimeException("Return Type couldn't accept null");
                }
            } else if (!funcSymbol.getReturnType().equals(node.getExpr().getType())) {
                throw new RuntimeException("Return Type mismatch.");
            }
        } else {
            if (!funcSymbol.getReturnType().getBaseType().equals("void")) {
                throw new RuntimeException("returnExpr is required.");
            }
        }

        // prepare for IR Generation
        if (node.getExpr() == null) {
            node.setClassType(null);
        } else {
            node.setClassType(node.getExpr().getType());
        }
    }

    @Override
    public void visit(BreakStmt node) {
        if (loopScopeCount == 0) {
            throw new RuntimeException("Break should be in LoopScope");
        }
    }

    @Override
    public void visit(ContinueStmt node) {
        if (loopScopeCount == 0) {
            throw new RuntimeException("Continue should be in LoopScope");
        }
    }

    @Override
    public void visit(ForStmt node) {
        if (node.getInit() != null) {
            node.getInit().accept(this);
        }
        if (node.getCond() != null) {
            node.getCond().accept(this);
            if (!node.getCond().getType().equals(new ClassType("bool", 0))) {
                throw new RuntimeException("bool required in ForStmt.");
            }
        }
        if (node.getStep() != null) {
            node.getStep().accept(this);
        }
        loopScopeCount += 1;
        currentTable.push(new BlockTable(currentTable.peek(), "")); // FIXME
        blockScopePushed = true;
        node.getStmt().accept(this);
        blockScopePushed = false; // for does not always enter a blockStmt, may be other stmt.
        currentTable.pop();
        loopScopeCount -= 1;
    }

    @Override
    public void visit(WhileStmt node) {
        node.getCond().accept(this);
        if (!node.getCond().getType().equals(new ClassType("bool", 0))) {
            throw new RuntimeException("bool required in WhileStmt");
        }
        loopScopeCount += 1;
        currentTable.push(new BlockTable(currentTable.peek(), "")); // FIXME
        blockScopePushed = true;
        node.getStmt().accept(this);
        blockScopePushed = false; // while does not always enter a blockStmt, may be other stmt.
        currentTable.pop();
        loopScopeCount -= 1;
    }

    @Override
    public void visit(ClassType node) {
    }

    @Override
    public void visit(FunctionCall node) {
        // for built-in size
        if (node.getFunc() != null && node.getFunc().getName().equals("size")) {
            node.setType(node.getFunc().getReturnType());
            node.setLValue(false);
            node.setProcessedName("size"); // prepare for IR Generation
            return;
        }

        // normal function
        node.getName().accept(this);
        node.getParameters().forEach(x -> x.accept(this));
        Map<Integer, VarSymbol> intParameters = node.getName().getFunc().getIntParameters();
        List<AbstractExpr> parameters = node.getParameters();
        if (intParameters.size() != parameters.size()) {
            throw new RuntimeException("Parameter num mismatch.");
        }
        for (int i = 0; i < intParameters.size(); i++) {
            if (parameters.get(i).getType().getBaseType().equals("null")) {
                if (intParameters.get(i).getType().getDim() == 0
                        && primitiveType.contains(intParameters.get(i).getType().getBaseType())) {
                    throw new RuntimeException("Parameter " + i + " couldn't accept null.");
                }
            } else if (!intParameters.get(i).getType().equals(parameters.get(i).getType())) {
                throw new RuntimeException("Parameter " + i + " type mismatch.");
            }
        }
        ClassType classType = node.getName().getFunc().getReturnType();
        node.setType(classType);
        node.setLValue(false);

        // prepare for IR Generation
        node.setProcessedName(node.getName().getFunc().getProcessedName());
    }

    @Override
    public void visit(ArrayAcess node) {
        node.getArray().accept(this);
        node.getSubscript().accept(this);
        ClassType lType = node.getArray().getType();
        ClassType rType = node.getSubscript().getType();
        if (!rType.equals(new ClassType("int", 0))) {
            throw new RuntimeException("Subscript should be int.");
        }
        if (lType.getDim() == 0) {
            throw new RuntimeException("ArrayType is required in ArrayAcess.");
        }
        node.setType(new ClassType(lType.getBaseType(), lType.getDim() - 1));
    }

    @Override
    public void visit(MemberAcess node) {
        node.getExpr().accept(this);
        ClassType lType = node.getExpr().getType();
        String name = node.getName();

        // for normal member
        if (lType.getDim() != 0) {
            // for built-in size()
            if (name.equals("size")) {
//                if (lType.getAddrFlag() == 0) {
//                    throw new RuntimeException("size() is for Array Type.");
//                } // FIXME no use
                FuncSymbol.Builder builder = new FuncSymbol.Builder();
                builder.setBelongTable(topTable); // FIXME size belong to what ?
                builder.setName("size");
                builder.setReturnType(new ClassType("int", 0));
                node.setFunc(builder.build());
                return;
            }
            throw new RuntimeException("Array is not acceptable in MemberAcess.");
        }
        ClassSymbol symbol = topTable.getMyClass(node.getExpr().getType().getBaseType()); // assert symbol cannot be null
        if (symbol == null) {
            throw new RuntimeException("IRClass is not declared.");
        }

        // assert Var Func share the same scope.
        if (symbol.getInClassTable().getFunc(name) != null) {
            node.setFunc(symbol.getInClassTable().getFunc(name));
        } else if (symbol.getInClassTable().getVar(name) != null) {
            node.setType(symbol.getInClassTable().getVar(name).getType());
        } else {
            throw new RuntimeException(name + " is not a member.");
        }
    }

    @Override
    public void visit(NewExpr node) {
        node.getNewObject().accept(this);
        node.setType(node.getNewObject().getType());
    }

    @Override
    public void visit(UnaryExpr node) {
        node.getExpr().accept(this);
        switch (node.getOp()) {
            case POSTFIX_INC:
            case POSTFIX_DEC:
            case PREFIX_INC:
            case PREFIX_DEC:
                if (!node.getExpr().getLValue()) {
                    throw new RuntimeException("LValur required.");
                }
                //                break;    // don't break
            case POS:
            case NEG:
            case BITWISE_NOT:
                if (!node.getExpr().getType().equals(new ClassType("int", 0))) {
                    throw new RuntimeException("int required.");
                }
                break;
            case LOGICAL_NOT:
                if (!node.getExpr().getType().equals(new ClassType("bool", 0))) {
                    throw new RuntimeException("bool required");
                }
                break;
        }
        switch (node.getOp()) {
            case POSTFIX_INC:
            case POSTFIX_DEC:
            case BITWISE_NOT:
            case LOGICAL_NOT:
            case POS:
            case NEG:
                node.setLValue(false);
            case PREFIX_INC:
            case PREFIX_DEC:
        }
        node.setType(node.getExpr().getType());
    }

    @Override
    public void visit(BinaryExpr node) {
        node.getLhs().accept(this);
        node.getRhs().accept(this);
        switch (node.getOp()) {
            case LOGICAL_OR:
            case LOGICAL_AND:
                ClassType boolType = new ClassType("bool", 0);
                if (node.getLhs().getType().equals(boolType) && node.getRhs().getType().equals(boolType)) {
                    break;
                } else {
                    throw new RuntimeException("bool required.");
                }
            case XOR:
            case BITWISE_OR:
            case BITWISE_AND:
            case LEFT_SHIFT:
            case RIGHT_SHIFT:
                ClassType intType = new ClassType("int", 0);
                if (node.getLhs().getType().equals(intType) && node.getRhs().getType().equals(intType)) {
                    break;
                } else {
                    throw new RuntimeException("int required");
                }
            case EQ:
            case NE:
            case GE:
            case GT:
            case LE:
            case LT:
                if (node.getRhs().getType().getBaseType().equals("null")) {
                    if (node.getLhs().getType().getDim() != 0) break;
                    switch (node.getLhs().getType().getBaseType()) {
                        case "int":
                        case "string":
                        case "bool":
                        case "void":
                        case "null": // may be redundant
                            throw new RuntimeException("primitive type can not compare with null");
                        default:
                            break;
                    }
                } else if (node.getLhs().getType().equals(node.getRhs().getType())) {
                    if (node.getLhs().getType().getDim() != 0) {
                        throw new RuntimeException("array does not suppot this operation.");
                    }
                    switch (node.getLhs().getType().getBaseType()) {
                        case "int":
                        case "string":
                            break;
                        case "bool":
                            switch (node.getOp()) {
                                case EQ:
                                case NE:
                                    break;
                                default:
                                    throw new RuntimeException("bool does not support this operation.");
                            }
                            break;
                        case "null":
                        case "void":
                        default:
                            throw new RuntimeException("type does not support comparison.");
                    }
                } else {
                    throw new RuntimeException("same type required.");
                }
                break;
            case ADD:
            case SUB:
            case MUL:
            case DIV:
            case MOD:
                if (node.getLhs().getType().equals(node.getRhs().getType())) {
                    if (node.getLhs().getType().getDim() != 0) {
                        throw new RuntimeException("array does not suppot this operation.");
                    }
                    switch (node.getLhs().getType().getBaseType()) {
                        case "int":
                            break;
                        case "string":
                            if (node.getOp().equals(BinaryExpr.BinaryOp.ADD)) {
                                break;
                            } else {
                                throw new RuntimeException("string does not support this operation.");
                            }
                        case "null":
                        case "bool":
                        case "void":
                        default:
                            throw new RuntimeException("type does not support basic arithmetic.");
                    }
                }
                break;
            case ASSIGN:
                if (node.getLhs().getLValue()) {
                    if (node.getRhs().getType().getBaseType().equals("null")) {
                        if (node.getLhs().getType().getDim() == 0
                                && primitiveType.contains(node.getLhs().getType().getBaseType())) {
                            throw new RuntimeException("null assignment error");
                        }
                    } else if (!node.getLhs().getType().equals(node.getRhs().getType())) {
                        throw new RuntimeException("same type required.");
                    }
                } else {
                    throw new RuntimeException("Assign require LValue LHS");
                }
        }
        switch (node.getOp()) {
            case XOR:
            case BITWISE_OR:
            case BITWISE_AND:
            case LOGICAL_OR:
            case LOGICAL_AND:
            case LEFT_SHIFT:
            case RIGHT_SHIFT:
            case ADD:
            case SUB:
            case MUL:
            case DIV:
            case MOD:
                node.setType(node.getRhs().getType());
                break;
            case EQ:
            case NE:
            case GE:
            case GT:
            case LE:
            case LT:
                node.setType(new ClassType("bool", 0));
                break;
            case ASSIGN:
                node.setType(node.getLhs().getType());
                break;
        }

        node.setLValue(false); // also for assign
    }

    @Override
    public void visit(Identifier node) {
        // this
        if (node.getName().equals("this")) {
            if (classSymbol == null) {
                throw new RuntimeException("this should be in IRClass");
            } else {
                node.setType(new ClassType(classSymbol.getName(), 0));
            }
            return;
        }

        AbstractSymbol symbol = currentTable.peek().findIdentifier(node.getName());
        if (symbol instanceof FuncSymbol) {
            node.setFunc(((FuncSymbol) symbol));
        } else if (symbol instanceof VarSymbol) {
            node.setType(((VarSymbol) symbol).getType());
            // prepare for IR Generation
            node.setVarSymbol(((VarSymbol) symbol));
            node.setFuncSymbol(funcSymbol);
        } else {
            throw new RuntimeException("Identifier " + node.getName() + " is not declared.");
        }
    }

    @Override
    public void visit(NewArray node) {
        node.getLens().forEach(x -> x.accept(this));
        ClassSymbol myClass = topTable.getMyClass(node.getType().getBaseType());
        if (myClass == null) {
            throw new RuntimeException("IRClass is not declared.");
        }
        if (myClass.getName().equals("void")) {
            throw new RuntimeException("Void should not be declared.");
        }
        node.getLens()
                .forEach(
                        x -> {
                            if (!x.getType().getBaseType().equals("int") || x.getType().getDim() != 0) {
                                throw new RuntimeException("New Array Dim should be int.");
                            }
                        });
    }

    @Override
    public void visit(NewNonArray node) {
        node.getParameters().forEach(x -> x.accept(this));
        ClassSymbol myClass = topTable.getMyClass(node.getType().getBaseType());
        if (myClass == null) {
            throw new RuntimeException("IRClass is not declared.");
        }
        // TODO void
        if (myClass.getName().equals("void")) {
            throw new RuntimeException("Void should not be declared.");
        }
        CstrSymbol cstr = myClass.getInClassTable().getCstr(myClass.getName());
        // if class contains constructor TODO
        if (cstr != null) {
            if (cstr.getIntParameters().size() != node.getParameters().size()) {
                throw new RuntimeException("Parameter num mismatch.");
            }
            for (int i = 0; i < cstr.getIntParameters().size(); i++) {
                if (cstr.getIntParameters().get(i).getType().getDim() == 0
                        && primitiveType.contains(cstr.getIntParameters().get(i).getType().getBaseType())) {
                    throw new RuntimeException("Parameter " + i + " couldn't accept null");
                } else if (!cstr.getIntParameters()
                        .get(i)
                        .getType()
                        .equals(node.getParameters().get(i).getType())) {
                    throw new RuntimeException("Parameter " + i + " type mismatch.");
                }
            }
        }
    }

    @Override
    public void visit(BoolConst node) {
        node.setType(new ClassType("bool", 0));
        node.setLValue(false);
    }

    @Override
    public void visit(NumConst node) {
        node.setType(new ClassType("int", 0));
        node.setLValue(false);
    }

    @Override
    public void visit(StrConst node) {
        node.setType(new ClassType("string", 0));
        node.setLValue(false);
    }

    @Override
    public void visit(NullConst node) {
        node.setType(new ClassType("null", 0));
        node.setLValue(false);
    }

}

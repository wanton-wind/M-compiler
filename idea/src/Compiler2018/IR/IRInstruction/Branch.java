package Compiler2018.IR.IRInstruction;

import Compiler2018.BackEnd.IIRVistor;
import Compiler2018.IR.IRStructure.BasicBlock;
import Compiler2018.IR.IRValue.Register;

import java.util.List;
import java.util.Map;

public class Branch extends AbstractIRInstruction {
    private final Compare cond;
    private final BasicBlock ifTrue;
    private final BasicBlock ifFalse;

    public Branch(BasicBlock basicBlock, Compare cond, BasicBlock ifTrue, BasicBlock ifFalse) {
        super(basicBlock);
        this.cond = cond;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }

    public Compare getCond() {
        return cond;
    }

    public BasicBlock getIfTrue() {
        return ifTrue;
    }

    public BasicBlock getIfFalse() {
        return ifFalse;
    }

    @Override
    public String toIRString() {
        String str =
//                cond.toIRString() +
                "\tBR " +
//                cond.getDestination().toIRString() + " " +
                ifTrue.getProcessedName() + " " +
                ifFalse.getProcessedName() + "\n";
        return str;
    }

    @Override
    public void accept(IIRVistor vistor) {
        vistor.visit(this);
    }

    @Override
    public Register getDefinedRegister() {
        return null;
    }

    @Override
    public List<Register> getUsedRegisterList() {
        return null;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Branch(super.getBasicBlock(), cond, ifTrue, ifFalse);
    }

    public Branch partClone(Map<Register, Register> renameMap) {
        return new Branch(super.getBasicBlock(), cond, ifTrue, ifFalse);
    }
}

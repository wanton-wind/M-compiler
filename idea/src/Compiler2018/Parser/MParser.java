// Generated from D:/Coding/M-compiler/idea/src/Compiler2018\M.g4 by ANTLR 4.7
package Compiler2018.Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Bool=1, Int=2, String=3, Void=4, If=5, Else=6, For=7, While=8, Break=9, 
		Continue=10, Return=11, New=12, Class=13, This=14, Add=15, Sub=16, Mul=17, 
		Div=18, Mod=19, LT=20, GT=21, LE=22, GE=23, EQ=24, NE=25, And=26, Or=27, 
		Not=28, LShift=29, RShift=30, BNot=31, BOr=32, BXor=33, BAnd=34, Assign=35, 
		AddAdd=36, SubSub=37, Semi=38, Comma=39, Dot=40, LParen=41, RParen=42, 
		LBracket=43, RBracket=44, LBrace=45, RBrace=46, BoolConst=47, NumConst=48, 
		StrConst=49, NullConst=50, Identifier=51, WhiteSpace=52, LineComment=53, 
		BlockComment=54;
	public static final int
		RULE_program = 0, RULE_programSection = 1, RULE_classDeclaration = 2, 
		RULE_functionDeclaration = 3, RULE_variableDeclaration = 4, RULE_variableDeclarationStatement = 5, 
		RULE_functionParameters = 6, RULE_classBlock = 7, RULE_classBlockItem = 8, 
		RULE_constructorDeclaration = 9, RULE_statement = 10, RULE_blockStatement = 11, 
		RULE_branchStatement = 12, RULE_loopStatement = 13, RULE_jumpStatement = 14, 
		RULE_classType = 15, RULE_arrayClass = 16, RULE_nonArrayClass = 17, RULE_expression = 18, 
		RULE_callParameter = 19, RULE_newObject = 20, RULE_brackets = 21, RULE_constant = 22;
	public static final String[] ruleNames = {
		"program", "programSection", "classDeclaration", "functionDeclaration", 
		"variableDeclaration", "variableDeclarationStatement", "functionParameters", 
		"classBlock", "classBlockItem", "constructorDeclaration", "statement", 
		"blockStatement", "branchStatement", "loopStatement", "jumpStatement", 
		"classType", "arrayClass", "nonArrayClass", "expression", "callParameter", 
		"newObject", "brackets", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'bool'", "'int'", "'string'", "'void'", "'if'", "'else'", "'for'", 
		"'while'", "'break'", "'continue'", "'return'", "'new'", "'class'", "'this'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", 
		"'!='", "'&&'", "'||'", "'!'", "'<<'", "'>>'", "'~'", "'|'", "'^'", "'&'", 
		"'='", "'++'", "'--'", "';'", "','", "'.'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", null, null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Bool", "Int", "String", "Void", "If", "Else", "For", "While", "Break", 
		"Continue", "Return", "New", "Class", "This", "Add", "Sub", "Mul", "Div", 
		"Mod", "LT", "GT", "LE", "GE", "EQ", "NE", "And", "Or", "Not", "LShift", 
		"RShift", "BNot", "BOr", "BXor", "BAnd", "Assign", "AddAdd", "SubSub", 
		"Semi", "Comma", "Dot", "LParen", "RParen", "LBracket", "RBracket", "LBrace", 
		"RBrace", "BoolConst", "NumConst", "StrConst", "NullConst", "Identifier", 
		"WhiteSpace", "LineComment", "BlockComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "M.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MParser.EOF, 0); }
		public List<ProgramSectionContext> programSection() {
			return getRuleContexts(ProgramSectionContext.class);
		}
		public ProgramSectionContext programSection(int i) {
			return getRuleContext(ProgramSectionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Int) | (1L << String) | (1L << Void) | (1L << Class) | (1L << Identifier))) != 0)) {
				{
				{
				setState(46);
				programSection();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramSectionContext extends ParserRuleContext {
		public ProgramSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programSection; }
	 
		public ProgramSectionContext() { }
		public void copyFrom(ProgramSectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDeclContext extends ProgramSectionContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassDeclContext(ProgramSectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitClassDecl(this);
		}
	}
	public static class VarDeclContext extends ProgramSectionContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public VarDeclContext(ProgramSectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitVarDecl(this);
		}
	}
	public static class FuncDeclContext extends ProgramSectionContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FuncDeclContext(ProgramSectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitFuncDecl(this);
		}
	}

	public final ProgramSectionContext programSection() throws RecognitionException {
		ProgramSectionContext _localctx = new ProgramSectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programSection);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ClassDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				classDeclaration();
				}
				break;
			case 2:
				_localctx = new FuncDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				functionDeclaration();
				}
				break;
			case 3:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				variableDeclarationStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MParser.Identifier, 0); }
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(Class);
			setState(60);
			match(Identifier);
			setState(61);
			classBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MParser.Identifier, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			classType();
			setState(64);
			match(Identifier);
			setState(65);
			match(LParen);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Int) | (1L << String) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(66);
				functionParameters();
				}
			}

			setState(69);
			match(RParen);
			setState(70);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			classType();
			setState(73);
			match(Identifier);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(74);
				match(Assign);
				setState(75);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitVariableDeclarationStatement(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			variableDeclaration();
			setState(79);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParametersContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitFunctionParameters(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionParameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					variableDeclaration();
					setState(82);
					match(Comma);
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(89);
			variableDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBlockContext extends ParserRuleContext {
		public List<ClassBlockItemContext> classBlockItem() {
			return getRuleContexts(ClassBlockItemContext.class);
		}
		public ClassBlockItemContext classBlockItem(int i) {
			return getRuleContext(ClassBlockItemContext.class,i);
		}
		public ClassBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterClassBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitClassBlock(this);
		}
	}

	public final ClassBlockContext classBlock() throws RecognitionException {
		ClassBlockContext _localctx = new ClassBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(LBrace);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Int) | (1L << String) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				{
				setState(92);
				classBlockItem();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBlockItemContext extends ParserRuleContext {
		public ClassBlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBlockItem; }
	 
		public ClassBlockItemContext() { }
		public void copyFrom(ClassBlockItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassCstrDeclContext extends ClassBlockItemContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassCstrDeclContext(ClassBlockItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterClassCstrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitClassCstrDecl(this);
		}
	}
	public static class ClassFuncDeclContext extends ClassBlockItemContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassFuncDeclContext(ClassBlockItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterClassFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitClassFuncDecl(this);
		}
	}
	public static class ClassVarDeclContext extends ClassBlockItemContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ClassVarDeclContext(ClassBlockItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterClassVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitClassVarDecl(this);
		}
	}

	public final ClassBlockItemContext classBlockItem() throws RecognitionException {
		ClassBlockItemContext _localctx = new ClassBlockItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classBlockItem);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ClassVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				variableDeclarationStatement();
				}
				break;
			case 2:
				_localctx = new ClassCstrDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				constructorDeclaration();
				}
				break;
			case 3:
				_localctx = new ClassFuncDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MParser.Identifier, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(Identifier);
			setState(106);
			match(LParen);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Int) | (1L << String) | (1L << Void) | (1L << Identifier))) != 0)) {
				{
				setState(107);
				functionParameters();
				}
			}

			setState(110);
			match(RParen);
			setState(111);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BranchStmtContext extends StatementContext {
		public BranchStatementContext branchStatement() {
			return getRuleContext(BranchStatementContext.class,0);
		}
		public BranchStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterBranchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitBranchStmt(this);
		}
	}
	public static class LoopStmtContext extends StatementContext {
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public LoopStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitLoopStmt(this);
		}
	}
	public static class ExprStmtContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitExprStmt(this);
		}
	}
	public static class JumpStmtContext extends StatementContext {
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public JumpStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterJumpStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitJumpStmt(this);
		}
	}
	public static class VarDeclStmtContext extends StatementContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public VarDeclStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterVarDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitVarDeclStmt(this);
		}
	}
	public static class BlockStmtContext extends StatementContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public BlockStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitBlockStmt(this);
		}
	}
	public static class EmptyStmtContext extends StatementContext {
		public EmptyStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitEmptyStmt(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				blockStatement();
				}
				break;
			case 2:
				_localctx = new VarDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				variableDeclarationStatement();
				}
				break;
			case 3:
				_localctx = new BranchStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				branchStatement();
				}
				break;
			case 4:
				_localctx = new LoopStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				loopStatement();
				}
				break;
			case 5:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				expression(0);
				setState(118);
				match(Semi);
				}
				break;
			case 6:
				_localctx = new JumpStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				jumpStatement();
				}
				break;
			case 7:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(LBrace);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Int) | (1L << String) | (1L << Void) | (1L << If) | (1L << For) | (1L << While) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << New) | (1L << Add) | (1L << Sub) | (1L << Not) | (1L << BNot) | (1L << AddAdd) | (1L << SubSub) | (1L << Semi) | (1L << LParen) | (1L << LBrace) | (1L << BoolConst) | (1L << NumConst) | (1L << StrConst) | (1L << NullConst) | (1L << Identifier))) != 0)) {
				{
				{
				setState(125);
				statement();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BranchStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(MParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(MParser.Else, 0); }
		public BranchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterBranchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitBranchStatement(this);
		}
	}

	public final BranchStatementContext branchStatement() throws RecognitionException {
		BranchStatementContext _localctx = new BranchStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_branchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(If);
			setState(134);
			match(LParen);
			setState(135);
			expression(0);
			setState(136);
			match(RParen);
			setState(137);
			statement();
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(138);
				match(Else);
				setState(139);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	 
		public LoopStatementContext() { }
		public void copyFrom(LoopStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStmtContext extends LoopStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitWhileStmt(this);
		}
	}
	public static class ForStmtContext extends LoopStatementContext {
		public ExpressionContext init;
		public ExpressionContext cond;
		public ExpressionContext step;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStmtContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitForStmt(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loopStatement);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case For:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(For);
				setState(143);
				match(LParen);
				setState(144);
				((ForStmtContext)_localctx).init = expression(0);
				setState(145);
				match(Semi);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Add) | (1L << Sub) | (1L << Not) | (1L << BNot) | (1L << AddAdd) | (1L << SubSub) | (1L << LParen) | (1L << BoolConst) | (1L << NumConst) | (1L << StrConst) | (1L << NullConst) | (1L << Identifier))) != 0)) {
					{
					setState(146);
					((ForStmtContext)_localctx).cond = expression(0);
					}
				}

				setState(149);
				match(Semi);
				setState(150);
				((ForStmtContext)_localctx).step = expression(0);
				setState(151);
				match(RParen);
				setState(152);
				statement();
				}
				break;
			case While:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(While);
				setState(155);
				match(LParen);
				setState(156);
				expression(0);
				setState(157);
				match(RParen);
				setState(158);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	 
		public JumpStatementContext() { }
		public void copyFrom(JumpStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContinueStmtContext extends JumpStatementContext {
		public ContinueStmtContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitContinueStmt(this);
		}
	}
	public static class BreakStmtContext extends JumpStatementContext {
		public BreakStmtContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitBreakStmt(this);
		}
	}
	public static class ReturnStmtContext extends JumpStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitReturnStmt(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jumpStatement);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Return:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(Return);
				setState(163);
				expression(0);
				setState(164);
				match(Semi);
				}
				break;
			case Break:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(Break);
				setState(167);
				match(Semi);
				}
				break;
			case Continue:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(Continue);
				setState(169);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
	 
		public ClassTypeContext() { }
		public void copyFrom(ClassTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeContext extends ClassTypeContext {
		public ArrayClassContext arrayClass() {
			return getRuleContext(ArrayClassContext.class,0);
		}
		public ArrayTypeContext(ClassTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitArrayType(this);
		}
	}
	public static class NonArrayTypeContext extends ClassTypeContext {
		public NonArrayClassContext nonArrayClass() {
			return getRuleContext(NonArrayClassContext.class,0);
		}
		public NonArrayTypeContext(ClassTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterNonArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitNonArrayType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classType);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				arrayClass();
				}
				break;
			case 2:
				_localctx = new NonArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				nonArrayClass();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayClassContext extends ParserRuleContext {
		public NonArrayClassContext nonArrayClass() {
			return getRuleContext(NonArrayClassContext.class,0);
		}
		public List<BracketsContext> brackets() {
			return getRuleContexts(BracketsContext.class);
		}
		public BracketsContext brackets(int i) {
			return getRuleContext(BracketsContext.class,i);
		}
		public ArrayClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterArrayClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitArrayClass(this);
		}
	}

	public final ArrayClassContext arrayClass() throws RecognitionException {
		ArrayClassContext _localctx = new ArrayClassContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			nonArrayClass();
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				brackets();
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBracket );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonArrayClassContext extends ParserRuleContext {
		public Token type;
		public TerminalNode Identifier() { return getToken(MParser.Identifier, 0); }
		public NonArrayClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonArrayClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterNonArrayClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitNonArrayClass(this);
		}
	}

	public final NonArrayClassContext nonArrayClass() throws RecognitionException {
		NonArrayClassContext _localctx = new NonArrayClassContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nonArrayClass);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				((NonArrayClassContext)_localctx).type = match(Bool);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				((NonArrayClassContext)_localctx).type = match(Int);
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				((NonArrayClassContext)_localctx).type = match(Void);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				((NonArrayClassContext)_localctx).type = match(String);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				((NonArrayClassContext)_localctx).type = match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(MParser.Identifier, 0); }
		public IdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitIdentifier(this);
		}
	}
	public static class MemberAcessContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MParser.Identifier, 0); }
		public MemberAcessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterMemberAcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitMemberAcess(this);
		}
	}
	public static class ArrayAcessContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayAcessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterArrayAcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitArrayAcess(this);
		}
	}
	public static class ConstContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitConst(this);
		}
	}
	public static class SubExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitSubExpr(this);
		}
	}
	public static class BinaryExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitBinaryExpr(this);
		}
	}
	public static class NewExprContext extends ExpressionContext {
		public NewObjectContext newObject() {
			return getRuleContext(NewObjectContext.class,0);
		}
		public NewExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitNewExpr(this);
		}
	}
	public static class FunctionCallContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallParameterContext callParameter() {
			return getRuleContext(CallParameterContext.class,0);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitFunctionCall(this);
		}
	}
	public static class PostfixIncDecContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostfixIncDecContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterPostfixIncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitPostfixIncDec(this);
		}
	}
	public static class UnaryExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitUnaryExpr(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AddAdd:
			case SubSub:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(190);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AddAdd || _la==SubSub) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(191);
				expression(18);
				}
				break;
			case Add:
			case Sub:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Sub) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(193);
				expression(17);
				}
				break;
			case Not:
			case BNot:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Not || _la==BNot) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
				expression(16);
				}
				break;
			case New:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(New);
				setState(197);
				newObject();
				}
				break;
			case Identifier:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(Identifier);
				}
				break;
			case BoolConst:
			case NumConst:
			case StrConst:
			case NullConst:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				constant();
				}
				break;
			case LParen:
				{
				_localctx = new SubExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(LParen);
				setState(201);
				expression(0);
				setState(202);
				match(RParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(207);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mul) | (1L << Div) | (1L << Mod))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(208);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(210);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Sub) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(211);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(213);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LShift || _la==RShift) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(214);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(215);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(216);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(219);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NE) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(220);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(222);
						((BinaryExprContext)_localctx).op = match(BAnd);
						setState(223);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(225);
						((BinaryExprContext)_localctx).op = match(BXor);
						setState(226);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(228);
						((BinaryExprContext)_localctx).op = match(BOr);
						setState(229);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(231);
						((BinaryExprContext)_localctx).op = match(And);
						setState(232);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(234);
						((BinaryExprContext)_localctx).op = match(Or);
						setState(235);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(237);
						((BinaryExprContext)_localctx).op = match(Assign);
						setState(238);
						expression(4);
						}
						break;
					case 12:
						{
						_localctx = new PostfixIncDecContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(239);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(240);
						((PostfixIncDecContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AddAdd || _la==SubSub) ) {
							((PostfixIncDecContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 13:
						{
						_localctx = new FunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(242);
						match(LParen);
						setState(244);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Add) | (1L << Sub) | (1L << Not) | (1L << BNot) | (1L << AddAdd) | (1L << SubSub) | (1L << LParen) | (1L << BoolConst) | (1L << NumConst) | (1L << StrConst) | (1L << NullConst) | (1L << Identifier))) != 0)) {
							{
							setState(243);
							callParameter();
							}
						}

						setState(246);
						match(RParen);
						}
						break;
					case 14:
						{
						_localctx = new ArrayAcessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(248);
						match(LBracket);
						setState(249);
						expression(0);
						setState(250);
						match(RBracket);
						}
						break;
					case 15:
						{
						_localctx = new MemberAcessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(253);
						match(Dot);
						setState(254);
						match(Identifier);
						}
						break;
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CallParameterContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CallParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterCallParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitCallParameter(this);
		}
	}

	public final CallParameterContext callParameter() throws RecognitionException {
		CallParameterContext _localctx = new CallParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_callParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					expression(0);
					setState(261);
					match(Comma);
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(268);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewObjectContext extends ParserRuleContext {
		public NewObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newObject; }
	 
		public NewObjectContext() { }
		public void copyFrom(NewObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewArrayContext extends NewObjectContext {
		public NonArrayClassContext nonArrayClass() {
			return getRuleContext(NonArrayClassContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BracketsContext> brackets() {
			return getRuleContexts(BracketsContext.class);
		}
		public BracketsContext brackets(int i) {
			return getRuleContext(BracketsContext.class,i);
		}
		public NewArrayContext(NewObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitNewArray(this);
		}
	}
	public static class NewNonArrayContext extends NewObjectContext {
		public NonArrayClassContext nonArrayClass() {
			return getRuleContext(NonArrayClassContext.class,0);
		}
		public CallParameterContext callParameter() {
			return getRuleContext(CallParameterContext.class,0);
		}
		public NewNonArrayContext(NewObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterNewNonArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitNewNonArray(this);
		}
	}
	public static class NewErrorContext extends NewObjectContext {
		public NonArrayClassContext nonArrayClass() {
			return getRuleContext(NonArrayClassContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BracketsContext> brackets() {
			return getRuleContexts(BracketsContext.class);
		}
		public BracketsContext brackets(int i) {
			return getRuleContext(BracketsContext.class,i);
		}
		public NewErrorContext(NewObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterNewError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitNewError(this);
		}
	}

	public final NewObjectContext newObject() throws RecognitionException {
		NewObjectContext _localctx = new NewObjectContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_newObject);
		int _la;
		try {
			int _alt;
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new NewErrorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				nonArrayClass();
				setState(275); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(271);
						match(LBracket);
						setState(272);
						expression(0);
						setState(273);
						match(RBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(277); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(280); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(279);
						brackets();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(282); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(288); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(284);
						match(LBracket);
						setState(285);
						expression(0);
						setState(286);
						match(RBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(290); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new NewArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				nonArrayClass();
				setState(297); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(293);
						match(LBracket);
						setState(294);
						expression(0);
						setState(295);
						match(RBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(299); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(301);
						brackets();
						}
						} 
					}
					setState(306);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new NewNonArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				nonArrayClass();
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(308);
					match(LParen);
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << Add) | (1L << Sub) | (1L << Not) | (1L << BNot) | (1L << AddAdd) | (1L << SubSub) | (1L << LParen) | (1L << BoolConst) | (1L << NumConst) | (1L << StrConst) | (1L << NullConst) | (1L << Identifier))) != 0)) {
						{
						setState(309);
						callParameter();
						}
					}

					setState(312);
					match(RParen);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketsContext extends ParserRuleContext {
		public BracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitBrackets(this);
		}
	}

	public final BracketsContext brackets() throws RecognitionException {
		BracketsContext _localctx = new BracketsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_brackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(LBracket);
			setState(318);
			match(RBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public Token type;
		public TerminalNode BoolConst() { return getToken(MParser.BoolConst, 0); }
		public TerminalNode NumConst() { return getToken(MParser.NumConst, 0); }
		public TerminalNode StrConst() { return getToken(MParser.StrConst, 0); }
		public TerminalNode NullConst() { return getToken(MParser.NullConst, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MListener ) ((MListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constant);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolConst:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				((ConstantContext)_localctx).type = match(BoolConst);
				}
				break;
			case NumConst:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				((ConstantContext)_localctx).type = match(NumConst);
				}
				break;
			case StrConst:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				((ConstantContext)_localctx).type = match(StrConst);
				}
				break;
			case NullConst:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				((ConstantContext)_localctx).type = match(NullConst);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 22);
		case 12:
			return precpred(_ctx, 21);
		case 13:
			return precpred(_ctx, 20);
		case 14:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0149\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\5\5F\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\7\bW\n\b\f\b\16\bZ\13\b\3\b\3\b\3\t\3\t\7\t`\n\t\f\t\16\t"+
		"c\13\t\3\t\3\t\3\n\3\n\3\n\5\nj\n\n\3\13\3\13\3\13\5\13o\n\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f}\n\f\3\r\3\r\7\r\u0081\n"+
		"\r\f\r\16\r\u0084\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u008f\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0096\n\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a3\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00ad\n\20\3\21\3\21\5\21\u00b1\n\21\3"+
		"\22\3\22\6\22\u00b5\n\22\r\22\16\22\u00b6\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00be\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00cf\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00f7\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u0102\n\24\f\24\16\24\u0105\13\24\3\25\3\25\3\25\7\25\u010a\n\25"+
		"\f\25\16\25\u010d\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\6\26\u0116"+
		"\n\26\r\26\16\26\u0117\3\26\6\26\u011b\n\26\r\26\16\26\u011c\3\26\3\26"+
		"\3\26\3\26\6\26\u0123\n\26\r\26\16\26\u0124\3\26\3\26\3\26\3\26\3\26\6"+
		"\26\u012c\n\26\r\26\16\26\u012d\3\26\7\26\u0131\n\26\f\26\16\26\u0134"+
		"\13\26\3\26\3\26\3\26\5\26\u0139\n\26\3\26\5\26\u013c\n\26\5\26\u013e"+
		"\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0147\n\30\3\30\2\3&\31"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\t\3\2&\'\3\2\21\22"+
		"\4\2\36\36!!\3\2\23\25\3\2\37 \3\2\26\31\3\2\32\33\2\u0170\2\63\3\2\2"+
		"\2\4;\3\2\2\2\6=\3\2\2\2\bA\3\2\2\2\nJ\3\2\2\2\fP\3\2\2\2\16X\3\2\2\2"+
		"\20]\3\2\2\2\22i\3\2\2\2\24k\3\2\2\2\26|\3\2\2\2\30~\3\2\2\2\32\u0087"+
		"\3\2\2\2\34\u00a2\3\2\2\2\36\u00ac\3\2\2\2 \u00b0\3\2\2\2\"\u00b2\3\2"+
		"\2\2$\u00bd\3\2\2\2&\u00ce\3\2\2\2(\u010b\3\2\2\2*\u013d\3\2\2\2,\u013f"+
		"\3\2\2\2.\u0146\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\2\2\3\67\3"+
		"\3\2\2\28<\5\6\4\29<\5\b\5\2:<\5\f\7\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<"+
		"\5\3\2\2\2=>\7\17\2\2>?\7\65\2\2?@\5\20\t\2@\7\3\2\2\2AB\5 \21\2BC\7\65"+
		"\2\2CE\7+\2\2DF\5\16\b\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7,\2\2HI\5\30"+
		"\r\2I\t\3\2\2\2JK\5 \21\2KN\7\65\2\2LM\7%\2\2MO\5&\24\2NL\3\2\2\2NO\3"+
		"\2\2\2O\13\3\2\2\2PQ\5\n\6\2QR\7(\2\2R\r\3\2\2\2ST\5\n\6\2TU\7)\2\2UW"+
		"\3\2\2\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2["+
		"\\\5\n\6\2\\\17\3\2\2\2]a\7/\2\2^`\5\22\n\2_^\3\2\2\2`c\3\2\2\2a_\3\2"+
		"\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\60\2\2e\21\3\2\2\2fj\5\f\7\2gj"+
		"\5\24\13\2hj\5\b\5\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\23\3\2\2\2kl\7\65"+
		"\2\2ln\7+\2\2mo\5\16\b\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7,\2\2qr\5\30"+
		"\r\2r\25\3\2\2\2s}\5\30\r\2t}\5\f\7\2u}\5\32\16\2v}\5\34\17\2wx\5&\24"+
		"\2xy\7(\2\2y}\3\2\2\2z}\5\36\20\2{}\7(\2\2|s\3\2\2\2|t\3\2\2\2|u\3\2\2"+
		"\2|v\3\2\2\2|w\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\27\3\2\2\2~\u0082\7/\2\2\177"+
		"\u0081\5\26\f\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7\60\2\2\u0086\31\3\2\2\2\u0087\u0088\7\7\2\2\u0088\u0089\7+\2"+
		"\2\u0089\u008a\5&\24\2\u008a\u008b\7,\2\2\u008b\u008e\5\26\f\2\u008c\u008d"+
		"\7\b\2\2\u008d\u008f\5\26\f\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2"+
		"\u008f\33\3\2\2\2\u0090\u0091\7\t\2\2\u0091\u0092\7+\2\2\u0092\u0093\5"+
		"&\24\2\u0093\u0095\7(\2\2\u0094\u0096\5&\24\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7(\2\2\u0098\u0099\5&\24"+
		"\2\u0099\u009a\7,\2\2\u009a\u009b\5\26\f\2\u009b\u00a3\3\2\2\2\u009c\u009d"+
		"\7\n\2\2\u009d\u009e\7+\2\2\u009e\u009f\5&\24\2\u009f\u00a0\7,\2\2\u00a0"+
		"\u00a1\5\26\f\2\u00a1\u00a3\3\2\2\2\u00a2\u0090\3\2\2\2\u00a2\u009c\3"+
		"\2\2\2\u00a3\35\3\2\2\2\u00a4\u00a5\7\r\2\2\u00a5\u00a6\5&\24\2\u00a6"+
		"\u00a7\7(\2\2\u00a7\u00ad\3\2\2\2\u00a8\u00a9\7\13\2\2\u00a9\u00ad\7("+
		"\2\2\u00aa\u00ab\7\f\2\2\u00ab\u00ad\7(\2\2\u00ac\u00a4\3\2\2\2\u00ac"+
		"\u00a8\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\37\3\2\2\2\u00ae\u00b1\5\"\22"+
		"\2\u00af\u00b1\5$\23\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1!"+
		"\3\2\2\2\u00b2\u00b4\5$\23\2\u00b3\u00b5\5,\27\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7#\3\2\2\2"+
		"\u00b8\u00be\7\3\2\2\u00b9\u00be\7\4\2\2\u00ba\u00be\7\6\2\2\u00bb\u00be"+
		"\7\5\2\2\u00bc\u00be\7\65\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2"+
		"\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be%\3"+
		"\2\2\2\u00bf\u00c0\b\24\1\2\u00c0\u00c1\t\2\2\2\u00c1\u00cf\5&\24\24\u00c2"+
		"\u00c3\t\3\2\2\u00c3\u00cf\5&\24\23\u00c4\u00c5\t\4\2\2\u00c5\u00cf\5"+
		"&\24\22\u00c6\u00c7\7\16\2\2\u00c7\u00cf\5*\26\2\u00c8\u00cf\7\65\2\2"+
		"\u00c9\u00cf\5.\30\2\u00ca\u00cb\7+\2\2\u00cb\u00cc\5&\24\2\u00cc\u00cd"+
		"\7,\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00bf\3\2\2\2\u00ce\u00c2\3\2\2\2\u00ce"+
		"\u00c4\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00c9\3\2"+
		"\2\2\u00ce\u00ca\3\2\2\2\u00cf\u0103\3\2\2\2\u00d0\u00d1\f\20\2\2\u00d1"+
		"\u00d2\t\5\2\2\u00d2\u0102\5&\24\21\u00d3\u00d4\f\17\2\2\u00d4\u00d5\t"+
		"\3\2\2\u00d5\u0102\5&\24\20\u00d6\u00d7\f\16\2\2\u00d7\u00d8\t\6\2\2\u00d8"+
		"\u0102\5&\24\17\u00d9\u00da\f\r\2\2\u00da\u00db\t\7\2\2\u00db\u0102\5"+
		"&\24\16\u00dc\u00dd\f\f\2\2\u00dd\u00de\t\b\2\2\u00de\u0102\5&\24\r\u00df"+
		"\u00e0\f\13\2\2\u00e0\u00e1\7$\2\2\u00e1\u0102\5&\24\f\u00e2\u00e3\f\n"+
		"\2\2\u00e3\u00e4\7#\2\2\u00e4\u0102\5&\24\13\u00e5\u00e6\f\t\2\2\u00e6"+
		"\u00e7\7\"\2\2\u00e7\u0102\5&\24\n\u00e8\u00e9\f\b\2\2\u00e9\u00ea\7\34"+
		"\2\2\u00ea\u0102\5&\24\t\u00eb\u00ec\f\7\2\2\u00ec\u00ed\7\35\2\2\u00ed"+
		"\u0102\5&\24\b\u00ee\u00ef\f\6\2\2\u00ef\u00f0\7%\2\2\u00f0\u0102\5&\24"+
		"\6\u00f1\u00f2\f\30\2\2\u00f2\u0102\t\2\2\2\u00f3\u00f4\f\27\2\2\u00f4"+
		"\u00f6\7+\2\2\u00f5\u00f7\5(\25\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0102\7,\2\2\u00f9\u00fa\f\26\2\2\u00fa"+
		"\u00fb\7-\2\2\u00fb\u00fc\5&\24\2\u00fc\u00fd\7.\2\2\u00fd\u0102\3\2\2"+
		"\2\u00fe\u00ff\f\25\2\2\u00ff\u0100\7*\2\2\u0100\u0102\7\65\2\2\u0101"+
		"\u00d0\3\2\2\2\u0101\u00d3\3\2\2\2\u0101\u00d6\3\2\2\2\u0101\u00d9\3\2"+
		"\2\2\u0101\u00dc\3\2\2\2\u0101\u00df\3\2\2\2\u0101\u00e2\3\2\2\2\u0101"+
		"\u00e5\3\2\2\2\u0101\u00e8\3\2\2\2\u0101\u00eb\3\2\2\2\u0101\u00ee\3\2"+
		"\2\2\u0101\u00f1\3\2\2\2\u0101\u00f3\3\2\2\2\u0101\u00f9\3\2\2\2\u0101"+
		"\u00fe\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\'\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\5&\24\2\u0107\u0108"+
		"\7)\2\2\u0108\u010a\3\2\2\2\u0109\u0106\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u010f\5&\24\2\u010f)\3\2\2\2\u0110\u0115\5$\23\2\u0111\u0112"+
		"\7-\2\2\u0112\u0113\5&\24\2\u0113\u0114\7.\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0111\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u011a\3\2\2\2\u0119\u011b\5,\27\2\u011a\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0122\3\2"+
		"\2\2\u011e\u011f\7-\2\2\u011f\u0120\5&\24\2\u0120\u0121\7.\2\2\u0121\u0123"+
		"\3\2\2\2\u0122\u011e\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u013e\3\2\2\2\u0126\u012b\5$\23\2\u0127\u0128\7-"+
		"\2\2\u0128\u0129\5&\24\2\u0129\u012a\7.\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0127\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u0132\3\2\2\2\u012f\u0131\5,\27\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u013e\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0135\u013b\5$\23\2\u0136\u0138\7+\2\2\u0137"+
		"\u0139\5(\25\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013c\7,\2\2\u013b\u0136\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u0110\3\2\2\2\u013d\u0126\3\2\2\2\u013d\u0135\3\2"+
		"\2\2\u013e+\3\2\2\2\u013f\u0140\7-\2\2\u0140\u0141\7.\2\2\u0141-\3\2\2"+
		"\2\u0142\u0147\7\61\2\2\u0143\u0147\7\62\2\2\u0144\u0147\7\63\2\2\u0145"+
		"\u0147\7\64\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3"+
		"\2\2\2\u0146\u0145\3\2\2\2\u0147/\3\2\2\2!\63;ENXain|\u0082\u008e\u0095"+
		"\u00a2\u00ac\u00b0\u00b6\u00bd\u00ce\u00f6\u0101\u0103\u010b\u0117\u011c"+
		"\u0124\u012d\u0132\u0138\u013b\u013d\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
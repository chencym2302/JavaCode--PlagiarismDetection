package parser;

import java.util.List;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGN=90, MUL_ASSIGN=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier=100, AT=101, ELLIPSIS=102, WS=103, COMMENT=104, LINE_COMMENT=105;
	public static final String[] tokenNames = {
		"<INVALID>", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_typeList = 16, RULE_classBody = 17, 
		RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20, 
		RULE_methodDeclaration = 21, RULE_genericMethodDeclaration = 22, RULE_constructorDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_fieldDeclaration = 25, RULE_interfaceBodyDeclaration = 26, 
		RULE_interfaceMemberDeclaration = 27, RULE_constDeclaration = 28, RULE_constantDeclarator = 29, 
		RULE_interfaceMethodDeclaration = 30, RULE_genericInterfaceMethodDeclaration = 31, 
		RULE_variableDeclarators = 32, RULE_variableDeclarator = 33, RULE_variableDeclaratorId = 34, 
		RULE_variableInitializer = 35, RULE_arrayInitializer = 36, RULE_enumConstantName = 37, 
		RULE_type = 38, RULE_classOrInterfaceType = 39, RULE_primitiveType = 40, 
		RULE_typeArguments = 41, RULE_typeArgument = 42, RULE_qualifiedNameList = 43, 
		RULE_formalParameters = 44, RULE_formalParameterList = 45, RULE_formalParameter = 46, 
		RULE_lastFormalParameter = 47, RULE_methodBody = 48, RULE_constructorBody = 49, 
		RULE_qualifiedName = 50, RULE_literal = 51, RULE_annotation = 52, RULE_annotationName = 53, 
		RULE_elementValuePairs = 54, RULE_elementValuePair = 55, RULE_elementValue = 56, 
		RULE_elementValueArrayInitializer = 57, RULE_annotationTypeDeclaration = 58, 
		RULE_annotationTypeBody = 59, RULE_annotationTypeElementDeclaration = 60, 
		RULE_annotationTypeElementRest = 61, RULE_annotationMethodOrConstantRest = 62, 
		RULE_annotationMethodRest = 63, RULE_annotationConstantRest = 64, RULE_defaultValue = 65, 
		RULE_block = 66, RULE_blockStatement = 67, RULE_localVariableDeclarationStatement = 68, 
		RULE_localVariableDeclaration = 69, RULE_conditionalIf = 70, RULE_loop = 71, 
		RULE_statement = 72, RULE_catchClause = 73, RULE_catchType = 74, RULE_finallyBlock = 75, 
		RULE_resourceSpecification = 76, RULE_resources = 77, RULE_resource = 78, 
		RULE_switchBlockStatementGroup = 79, RULE_switchLabel = 80, RULE_forControl = 81, 
		RULE_forInit = 82, RULE_enhancedForControl = 83, RULE_forUpdate = 84, 
		RULE_parExpression = 85, RULE_expressionList = 86, RULE_statementExpression = 87, 
		RULE_constantExpression = 88, RULE_expression = 89, RULE_primary = 90, 
		RULE_creator = 91, RULE_createdName = 92, RULE_innerCreator = 93, RULE_arrayCreatorRest = 94, 
		RULE_classCreatorRest = 95, RULE_explicitGenericInvocation = 96, RULE_nonWildcardTypeArguments = 97, 
		RULE_typeArgumentsOrDiamond = 98, RULE_nonWildcardTypeArgumentsOrDiamond = 99, 
		RULE_superSuffix = 100, RULE_explicitGenericInvocationSuffix = 101, RULE_arguments = 102;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList", 
		"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
		"methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
		"genericConstructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
		"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
		"interfaceMethodDeclaration", "genericInterfaceMethodDeclaration", "variableDeclarators", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "arrayInitializer", 
		"enumConstantName", "type", "classOrInterfaceType", "primitiveType", "typeArguments", 
		"typeArgument", "qualifiedNameList", "formalParameters", "formalParameterList", 
		"formalParameter", "lastFormalParameter", "methodBody", "constructorBody", 
		"qualifiedName", "literal", "annotation", "annotationName", "elementValuePairs", 
		"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
		"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
		"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
		"defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "conditionalIf", "loop", "statement", "catchClause", 
		"catchType", "finallyBlock", "resourceSpecification", "resources", "resource", 
		"switchBlockStatementGroup", "switchLabel", "forControl", "forInit", "enhancedForControl", 
		"forUpdate", "parExpression", "expressionList", "statementExpression", 
		"constantExpression", "expression", "primary", "creator", "createdName", 
		"innerCreator", "arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
		"nonWildcardTypeArguments", "typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", 
		"superSuffix", "explicitGenericInvocationSuffix", "arguments"
	};

	@Override
	public String getGrammarFileName() { return "Java.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(final TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(final int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(final int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		final CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(206); packageDeclaration();
				}
				break;
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(209); importDeclaration();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(215); typeDeclaration();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221); match(EOF);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public AnnotationContext annotation(final int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public PackageDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		final PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(223); annotation();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229); match(PACKAGE);
			setState(230); qualifiedName();
			setState(231); match(SEMI);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		final ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(IMPORT);
			setState(235);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(234); match(STATIC);
				}
			}

			setState(237); qualifiedName();
			setState(240);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(238); match(DOT);
				setState(239); match(MUL);
				}
			}

			setState(242); match(SEMI);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(final int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TypeDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		final TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(244); classOrInterfaceModifier();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250); classDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(251); classOrInterfaceModifier();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257); enumDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(258); classOrInterfaceModifier();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264); interfaceDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(265); classOrInterfaceModifier();
						}
						} 
					}
					setState(270);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(271); annotationTypeDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272); match(SEMI);
				}
				break;
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		final ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		int _la;
		try {
			setState(277);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(275); classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		final ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(281);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		final VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(285);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(283); match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(284); annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
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
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		final ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(CLASS);
			setState(288); match(Identifier);
			setState(290);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(289); typeParameters();
				}
			}

			setState(294);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(292); match(EXTENDS);
				setState(293); type();
				}
			}

			setState(298);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(296); match(IMPLEMENTS);
				setState(297); typeList();
				}
			}

			setState(300); classBody();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(final int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		final TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); match(LT);
			setState(303); typeParameter();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(304); match(COMMA);
				setState(305); typeParameter();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311); match(GT);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		final TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(Identifier);
			setState(316);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(314); match(EXTENDS);
				setState(315); typeBound();
				}
			}

			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeContext type(final int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeBoundContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		final TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); type();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(319); match(BITAND);
				setState(320); type();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		final EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); match(ENUM);
			setState(327); match(Identifier);
			setState(330);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(328); match(IMPLEMENTS);
				setState(329); typeList();
				}
			}

			setState(332); match(LBRACE);
			setState(334);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(333); enumConstants();
				}
			}

			setState(337);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(336); match(COMMA);
				}
			}

			setState(340);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(339); enumBodyDeclarations();
				}
			}

			setState(342); match(RBRACE);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(final int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		final EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344); enumConstant();
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(345); match(COMMA);
					setState(346); enumConstant();
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public AnnotationContext annotation(final int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public EnumConstantContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		final EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(352); annotation();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358); match(Identifier);
			setState(360);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(359); arguments();
				}
			}

			setState(363);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(362); classBody();
				}
			}

			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(final int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public EnumBodyDeclarationsContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		final EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); match(SEMI);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(366); classBodyDeclaration();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public InterfaceDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		final InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372); match(INTERFACE);
			setState(373); match(Identifier);
			setState(375);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(374); typeParameters();
				}
			}

			setState(379);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(377); match(EXTENDS);
				setState(378); typeList();
				}
			}

			setState(381); interfaceBody();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public TypeContext type(final int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeListContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		final TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); type();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(384); match(COMMA);
				setState(385); type();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(final int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		final ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); match(LBRACE);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(392); classBodyDeclaration();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398); match(RBRACE);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(final int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		final InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400); match(LBRACE);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(401); interfaceBodyDeclaration();
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407); match(RBRACE);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierContext modifier(final int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		final ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(421);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(410); match(STATIC);
					}
				}

				setState(413); block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(414); modifier();
						}
						} 
					}
					setState(419);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(420); memberDeclaration();
				}
				break;
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		final MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberDeclaration);
		try {
			setState(432);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423); methodDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424); genericMethodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(425); fieldDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(426); constructorDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(427); genericConstructorDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(428); interfaceDeclaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(429); annotationTypeDeclaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(430); classDeclaration();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(431); enumDeclaration();
				}
				break;
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		final MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(434); type();
				}
				break;
			case VOID:
				{
				setState(435); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(438); match(Identifier);
			setState(439); formalParameters();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(440); match(LBRACK);
				setState(441); match(RBRACK);
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(447); match(THROWS);
				setState(448); qualifiedNameList();
				}
			}

			setState(453);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(451); methodBody();
				}
				break;
			case SEMI:
				{
				setState(452); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		final GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455); typeParameters();
			setState(456); methodDeclaration();
			}
		}
		catch (final RecognitionException re) {
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
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		final ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); match(Identifier);
			setState(459); formalParameters();
			setState(462);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(460); match(THROWS);
				setState(461); qualifiedNameList();
				}
			}

			setState(464); constructorBody();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		final GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466); typeParameters();
			setState(467); constructorDeclaration();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		final FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469); type();
			setState(470); variableDeclarators();
			setState(471); match(SEMI);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(final int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceBodyDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		final InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(481);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(473); modifier();
						}
						} 
					}
					setState(478);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(479); interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(480); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		final InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceMemberDeclaration);
		try {
			setState(490);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483); constDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484); interfaceMethodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(485); genericInterfaceMethodDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(486); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(487); annotationTypeDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(488); classDeclaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(489); enumDeclaration();
				}
				break;
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(final int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		final ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492); type();
			setState(493); constantDeclarator();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(494); match(COMMA);
				setState(495); constantDeclarator();
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501); match(SEMI);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		final ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503); match(Identifier);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(504); match(LBRACK);
				setState(505); match(RBRACK);
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511); match(ASSIGN);
			setState(512); variableInitializer();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		final InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(514); type();
				}
				break;
			case VOID:
				{
				setState(515); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(518); match(Identifier);
			setState(519); formalParameters();
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(520); match(LBRACK);
				setState(521); match(RBRACK);
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(527); match(THROWS);
				setState(528); qualifiedNameList();
				}
			}

			setState(531); match(SEMI);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		final GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); typeParameters();
			setState(534); interfaceMethodDeclaration();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator(final int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorsContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		final VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536); variableDeclarator();
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(537); match(COMMA);
				setState(538); variableDeclarator();
				}
				}
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		final VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544); variableDeclaratorId();
			setState(547);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(545); match(ASSIGN);
				setState(546); variableInitializer();
				}
			}

			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VariableDeclaratorIdContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		final VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549); match(Identifier);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(550); match(LBRACK);
				setState(551); match(RBRACK);
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		final VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableInitializer);
		try {
			setState(559);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(557); arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(558); expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer(final int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public ArrayInitializerContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		final ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(561); match(LBRACE);
			setState(573);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(562); variableInitializer();
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(563); match(COMMA);
						setState(564); variableInitializer();
						}
						} 
					}
					setState(569);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(571);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(570); match(COMMA);
					}
				}

				}
			}

			setState(575); match(RBRACE);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumConstantNameContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		final EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577); match(Identifier);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		final TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type);
		try {
			int _alt;
			setState(595);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(579); classOrInterfaceType();
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(580); match(LBRACK);
						setState(581); match(RBRACK);
						}
						} 
					}
					setState(586);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(587); primitiveType();
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(588); match(LBRACK);
						setState(589); match(RBRACK);
						}
						} 
					}
					setState(594);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments(final int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public TerminalNode Identifier(final int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public ClassOrInterfaceTypeContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		final ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(597); match(Identifier);
			setState(599);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(598); typeArguments();
				}
				break;
			}
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(601); match(DOT);
					setState(602); match(Identifier);
					setState(604);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(603); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		final PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(final int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		final TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613); match(LT);
			setState(614); typeArgument();
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(615); match(COMMA);
				setState(616); typeArgument();
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(622); match(GT);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeArgumentContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		final TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeArgument);
		int _la;
		try {
			setState(630);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(624); type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(625); match(QUESTION);
				setState(628);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(626);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(627); type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName(final int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameListContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		final QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632); qualifiedName();
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(633); match(COMMA);
				setState(634); qualifiedName();
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		final FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640); match(LPAREN);
			setState(642);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(641); formalParameterList();
				}
			}

			setState(644); match(RPAREN);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterContext formalParameter(final int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		final FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(659);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646); formalParameter();
				setState(651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(647); match(COMMA);
						setState(648); formalParameter();
						}
						} 
					}
					setState(653);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(656);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(654); match(COMMA);
					setState(655); lastFormalParameter();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(658); lastFormalParameter();
				}
				break;
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(final int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		final FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(661); variableModifier();
				}
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(667); type();
			setState(668); variableDeclaratorId();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(final int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public LastFormalParameterContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		final LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(670); variableModifier();
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(676); type();
			setState(677); match(ELLIPSIS);
			setState(678); variableDeclaratorId();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		final MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680); block();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		final ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682); block();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode Identifier(final int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public QualifiedNameContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		final QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(684); match(Identifier);
			setState(689);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(685); match(DOT);
					setState(686); match(Identifier);
					}
					} 
				}
				setState(691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CharacterLiteral() { return getToken(JavaParser.CharacterLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JavaParser.StringLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JavaParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JavaParser.BooleanLiteral, 0); }
		public LiteralContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		final LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public AnnotationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		final AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694); match(AT);
			setState(695); annotationName();
			setState(702);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(696); match(LPAREN);
				setState(699);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(697); elementValuePairs();
					}
					break;

				case 2:
					{
					setState(698); elementValue();
					}
					break;
				}
				setState(701); match(RPAREN);
				}
			}

			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		final AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704); qualifiedName();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(final int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		final ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706); elementValuePair();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(707); match(COMMA);
				setState(708); elementValuePair();
				}
				}
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ElementValuePairContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		final ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714); match(Identifier);
			setState(715); match(ASSIGN);
			setState(716); elementValue();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		final ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValue);
		try {
			setState(721);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(718); expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(719); annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(720); elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueContext elementValue(final int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueArrayInitializerContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		final ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(723); match(LBRACE);
			setState(732);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				setState(724); elementValue();
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(725); match(COMMA);
						setState(726); elementValue();
						}
						} 
					}
					setState(731);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				}
			}

			setState(735);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(734); match(COMMA);
				}
			}

			setState(737); match(RBRACE);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public AnnotationTypeDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		final AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739); match(AT);
			setState(740); match(INTERFACE);
			setState(741); match(Identifier);
			setState(742); annotationTypeBody();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(final int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		final AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744); match(LBRACE);
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(745); annotationTypeElementDeclaration();
				}
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(751); match(RBRACE);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public ModifierContext modifier(final int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		final AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(761);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(753); modifier();
						}
						} 
					}
					setState(758);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				setState(759); annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(760); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		final AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationTypeElementRest);
		try {
			setState(783);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(763); type();
				setState(764); annotationMethodOrConstantRest();
				setState(765); match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(767); classDeclaration();
				setState(769);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(768); match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(771); interfaceDeclaration();
				setState(773);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(772); match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(775); enumDeclaration();
				setState(777);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(776); match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(779); annotationTypeDeclaration();
				setState(781);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(780); match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		final AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationMethodOrConstantRest);
		try {
			setState(787);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(785); annotationMethodRest();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(786); annotationConstantRest();
				}
				break;
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public AnnotationMethodRestContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		final AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789); match(Identifier);
			setState(790); match(LPAREN);
			setState(791); match(RPAREN);
			setState(793);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(792); defaultValue();
				}
			}

			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		final AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795); variableDeclarators();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		final DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797); match(DEFAULT);
			setState(798); elementValue();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(final int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		final BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800); match(LBRACE);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(801); blockStatement();
				}
				}
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(807); match(RBRACE);
			}
		}
		catch (final RecognitionException re) {
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public BlockStatementContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		final BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_blockStatement);
		try {
			setState(812);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(809); localVariableDeclarationStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(810); statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(811); typeDeclaration();
				}
				break;
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		final LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814); localVariableDeclaration();
			setState(815); match(SEMI);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public VariableModifierContext variableModifier(final int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LocalVariableDeclarationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		final LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(817); variableModifier();
				}
				}
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(823); type();
			setState(824); variableDeclarators();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalIfContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression(final int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SwitchLabelContext switchLabel(final int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(final int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementContext statement(final int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public ConditionalIfContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalIf; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConditionalIf(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConditionalIf(this);
		}
	}

	public final ConditionalIfContext conditionalIf() throws RecognitionException {
		final ConditionalIfContext _localctx = new ConditionalIfContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_conditionalIf);
		int _la;
		try {
			int _alt;
			setState(856);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(826); match(IF);
				setState(827); parExpression();
				setState(828); statement();
				setState(831);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(829); match(ELSE);
					setState(830); statement();
					}
					break;
				}
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(833); match(SWITCH);
				setState(834); parExpression();
				setState(835); match(LBRACE);
				setState(839);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(836); switchBlockStatementGroup();
						}
						} 
					}
					setState(841);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(842); switchLabel();
					}
					}
					setState(847);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(848); match(RBRACE);
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(850); expression(0);
				setState(851); match(QUESTION);
				setState(852); expression(0);
				setState(853); match(COLON);
				setState(854); expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public LoopContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		final LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_loop);
		try {
			setState(875);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(858); match(FOR);
				setState(859); match(LPAREN);
				setState(860); forControl();
				setState(861); match(RPAREN);
				setState(862); statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(864); match(WHILE);
				setState(865); parExpression();
				setState(866); statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(868); match(DO);
				setState(869); statement();
				setState(870); match(WHILE);
				setState(871); parExpression();
				setState(872); match(SEMI);
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FINAL:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(874); enhancedForControl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SwitchLabelContext switchLabel(final int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public ConditionalIfContext conditionalIf() {
			return getRuleContext(ConditionalIfContext.class,0);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CatchClauseContext catchClause(final int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public ExpressionContext expression(final int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(final int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public StatementContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		final StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(960);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(877); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(878); conditionalIf();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(879); loop();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(880); match(ASSERT);
				setState(881); expression(0);
				setState(884);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(882); match(COLON);
					setState(883); expression(0);
					}
				}

				setState(886); match(SEMI);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(888); match(TRY);
				setState(889); block();
				setState(899);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(891); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(890); catchClause();
						}
						}
						setState(893); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(896);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(895); finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(898); finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(901); match(TRY);
				setState(902); resourceSpecification();
				setState(903); block();
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(904); catchClause();
					}
					}
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(911);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(910); finallyBlock();
					}
				}

				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(913); match(SWITCH);
				setState(914); parExpression();
				setState(915); match(LBRACE);
				setState(919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(916); switchBlockStatementGroup();
						}
						} 
					}
					setState(921);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(922); switchLabel();
					}
					}
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(928); match(RBRACE);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(930); match(SYNCHRONIZED);
				setState(931); parExpression();
				setState(932); block();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(934); match(RETURN);
				setState(936);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(935); expression(0);
					}
				}

				setState(938); match(SEMI);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(939); match(THROW);
				setState(940); expression(0);
				setState(941); match(SEMI);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(943); match(BREAK);
				setState(945);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(944); match(Identifier);
					}
				}

				setState(947); match(SEMI);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(948); match(CONTINUE);
				setState(950);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(949); match(Identifier);
					}
				}

				setState(952); match(SEMI);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(953); match(SEMI);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(954); statementExpression();
				setState(955); match(SEMI);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(957); match(Identifier);
				setState(958); match(COLON);
				setState(959); statement();
				}
				break;
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(final int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public CatchClauseContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		final CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962); match(CATCH);
			setState(963); match(LPAREN);
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(964); variableModifier();
				}
				}
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(970); catchType();
			setState(971); match(Identifier);
			setState(972); match(RPAREN);
			setState(973); block();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName(final int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public CatchTypeContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		final CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975); qualifiedName();
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(976); match(BITOR);
				setState(977); qualifiedName();
				}
				}
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		final FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983); match(FINALLY);
			setState(984); block();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		final ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986); match(LPAREN);
			setState(987); resources();
			setState(989);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(988); match(SEMI);
				}
			}

			setState(991); match(RPAREN);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(final int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourcesContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		final ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(993); resource();
			setState(998);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(994); match(SEMI);
					setState(995); resource();
					}
					} 
				}
				setState(1000);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(final int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ResourceContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		final ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1001); variableModifier();
				}
				}
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1007); classOrInterfaceType();
			setState(1008); variableDeclaratorId();
			setState(1009); match(ASSIGN);
			setState(1010); expression(0);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public SwitchLabelContext switchLabel(final int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public BlockStatementContext blockStatement(final int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		final SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1012); switchLabel();
				}
				}
				setState(1015); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1018); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1017); blockStatement();
				}
				}
				setState(1020); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0) );
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		final SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_switchLabel);
		try {
			setState(1032);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1022); match(CASE);
				setState(1023); constantExpression();
				setState(1024); match(COLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026); match(CASE);
				setState(1027); enumConstantName();
				setState(1028); match(COLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1030); match(DEFAULT);
				setState(1031); match(COLON);
				}
				break;
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		final ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_forControl);
		int _la;
		try {
			setState(1046);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034); enhancedForControl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
					{
					setState(1035); forInit();
					}
				}

				setState(1038); match(SEMI);
				setState(1040);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(1039); expression(0);
					}
				}

				setState(1042); match(SEMI);
				setState(1044);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(1043); forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		final ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_forInit);
		try {
			setState(1050);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1048); localVariableDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1049); expressionList();
				}
				break;
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(final int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		final EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1052); variableModifier();
				}
				}
				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1058); type();
			setState(1059); match(Identifier);
			setState(1060); match(COLON);
			setState(1061); expression(0);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		final ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063); expressionList();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		final ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065); match(LPAREN);
			setState(1066); expression(0);
			setState(1067); match(RPAREN);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(final int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		final ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069); expression(0);
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1070); match(COMMA);
				setState(1071); expression(0);
				}
				}
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		final StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077); expression(0);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		final ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079); expression(0);
			}
		}
		catch (final RecognitionException re) {
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
		public int _p;
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExpressionContext expression(final int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public ExpressionContext(final ParserRuleContext parent, final int invokingState) { super(parent, invokingState); }
		public ExpressionContext(final ParserRuleContext parent, final int invokingState, final int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression(final int _p) throws RecognitionException {
		final ParserRuleContext _parentctx = _ctx;
		final int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		final int _startState = 178;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1082); match(LPAREN);
				setState(1083); type();
				setState(1084); match(RPAREN);
				setState(1085); expression(17);
				}
				break;

			case 2:
				{
				setState(1087);
				_la = _input.LA(1);
				if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1088); expression(15);
				}
				break;

			case 3:
				{
				setState(1089);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1090); expression(14);
				}
				break;

			case 4:
				{
				setState(1091); primary();
				}
				break;

			case 5:
				{
				setState(1092); match(NEW);
				setState(1093); creator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1192);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1096);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(1097);
						_la = _input.LA(1);
						if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (MUL - 83)) | (1L << (DIV - 83)) | (1L << (MOD - 83)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1098); expression(14);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1099);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(1100);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1101); expression(13);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1102);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(1110);
						switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
						case 1:
							{
							setState(1103); match(LT);
							setState(1104); match(LT);
							}
							break;

						case 2:
							{
							setState(1105); match(GT);
							setState(1106); match(GT);
							setState(1107); match(GT);
							}
							break;

						case 3:
							{
							setState(1108); match(GT);
							setState(1109); match(GT);
							}
							break;
						}
						setState(1112); expression(12);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1113);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(1114);
						_la = _input.LA(1);
						if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GT - 67)) | (1L << (LT - 67)) | (1L << (LE - 67)) | (1L << (GE - 67)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1115); expression(11);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1116);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(1117);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1118); expression(9);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1119);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(1120); match(BITAND);
						setState(1121); expression(8);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1122);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(1123); match(CARET);
						setState(1124); expression(7);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1125);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(1126); match(BITOR);
						setState(1127); expression(6);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1128);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1129); match(AND);
						setState(1130); expression(5);
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1131);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(1132); match(OR);
						setState(1133); expression(4);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1134);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1147);
						switch (_input.LA(1)) {
						case ASSIGN:
							{
							setState(1135); match(ASSIGN);
							}
							break;
						case ADD_ASSIGN:
							{
							setState(1136); match(ADD_ASSIGN);
							}
							break;
						case SUB_ASSIGN:
							{
							setState(1137); match(SUB_ASSIGN);
							}
							break;
						case MUL_ASSIGN:
							{
							setState(1138); match(MUL_ASSIGN);
							}
							break;
						case DIV_ASSIGN:
							{
							setState(1139); match(DIV_ASSIGN);
							}
							break;
						case AND_ASSIGN:
							{
							setState(1140); match(AND_ASSIGN);
							}
							break;
						case OR_ASSIGN:
							{
							setState(1141); match(OR_ASSIGN);
							}
							break;
						case XOR_ASSIGN:
							{
							setState(1142); match(XOR_ASSIGN);
							}
							break;
						case RSHIFT_ASSIGN:
							{
							setState(1143); match(RSHIFT_ASSIGN);
							}
							break;
						case URSHIFT_ASSIGN:
							{
							setState(1144); match(URSHIFT_ASSIGN);
							}
							break;
						case LSHIFT_ASSIGN:
							{
							setState(1145); match(LSHIFT_ASSIGN);
							}
							break;
						case MOD_ASSIGN:
							{
							setState(1146); match(MOD_ASSIGN);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1149); expression(1);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1150);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1151); match(QUESTION);
						setState(1152); expression(0);
						setState(1153); match(COLON);
						setState(1154); expression(3);
						}
						break;

					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1156);
						if (!(25 >= _localctx._p)) throw new FailedPredicateException(this, "25 >= $_p");
						setState(1157); match(DOT);
						setState(1158); match(Identifier);
						}
						break;

					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1159);
						if (!(24 >= _localctx._p)) throw new FailedPredicateException(this, "24 >= $_p");
						setState(1160); match(DOT);
						setState(1161); match(THIS);
						}
						break;

					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1162);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(1163); match(DOT);
						setState(1164); match(NEW);
						setState(1166);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1165); nonWildcardTypeArguments();
							}
						}

						setState(1168); innerCreator();
						}
						break;

					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1169);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(1170); match(DOT);
						setState(1171); match(SUPER);
						setState(1172); superSuffix();
						}
						break;

					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1173);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(1174); match(DOT);
						setState(1175); explicitGenericInvocation();
						}
						break;

					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1176);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(1177); match(LBRACK);
						setState(1178); expression(0);
						setState(1179); match(RBRACK);
						}
						break;

					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1181);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(1182); match(LPAREN);
						setState(1184);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
							{
							setState(1183); expressionList();
							}
						}

						setState(1186); match(RPAREN);
						}
						break;

					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1187);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(1188);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;

					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1189);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(1190); match(INSTANCEOF);
						setState(1191); type();
						}
						break;
					}
					} 
				}
				setState(1196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		final PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_primary);
		try {
			setState(1218);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1197); match(LPAREN);
				setState(1198); expression(0);
				setState(1199); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201); match(THIS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1202); match(SUPER);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1203); literal();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1204); match(Identifier);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1205); type();
				setState(1206); match(DOT);
				setState(1207); match(CLASS);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1209); match(VOID);
				setState(1210); match(DOT);
				setState(1211); match(CLASS);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1212); nonWildcardTypeArguments();
				setState(1216);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1213); explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1214); match(THIS);
					setState(1215); arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public CreatorContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		final CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_creator);
		try {
			setState(1229);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1220); nonWildcardTypeArguments();
				setState(1221); createdName();
				setState(1222); classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224); createdName();
				setState(1227);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1225); arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1226); classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(final int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public TerminalNode Identifier(final int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		final CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_createdName);
		int _la;
		try {
			setState(1246);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1231); match(Identifier);
				setState(1233);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1232); typeArgumentsOrDiamond();
					}
				}

				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1235); match(DOT);
					setState(1236); match(Identifier);
					setState(1238);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1237); typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1245); primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public InnerCreatorContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		final InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248); match(Identifier);
			setState(1250);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1249); nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1252); classCreatorRest();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ExpressionContext expression(final int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreatorRestContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		final ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1254); match(LBRACK);
			setState(1282);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1255); match(RBRACK);
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1256); match(LBRACK);
					setState(1257); match(RBRACK);
					}
					}
					setState(1262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1263); arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1264); expression(0);
				setState(1265); match(RBRACK);
				setState(1272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1266); match(LBRACK);
						setState(1267); expression(0);
						setState(1268); match(RBRACK);
						}
						} 
					}
					setState(1274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				setState(1279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1275); match(LBRACK);
						setState(1276); match(RBRACK);
						}
						} 
					}
					setState(1281);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassCreatorRestContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		final ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284); arguments();
			setState(1286);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1285); classBody();
				}
				break;
			}
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		final ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288); nonWildcardTypeArguments();
			setState(1289); explicitGenericInvocationSuffix();
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		final NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291); match(LT);
			setState(1292); typeList();
			setState(1293); match(GT);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		final TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_typeArgumentsOrDiamond);
		try {
			setState(1298);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1295); match(LT);
				setState(1296); match(GT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1297); typeArguments();
				}
				break;
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		final NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1303);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1300); match(LT);
				setState(1301); match(GT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1302); nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SuperSuffixContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		final SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_superSuffix);
		try {
			setState(1311);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1305); arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306); match(DOT);
				setState(1307); match(Identifier);
				setState(1309);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1308); arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		final ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1317);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1313); match(SUPER);
				setState(1314); superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1315); match(Identifier);
				setState(1316); arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(final ParserRuleContext parent, final int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(final ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		final ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319); match(LPAREN);
			setState(1321);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(1320); expressionList();
				}
			}

			setState(1323); match(RPAREN);
			}
		}
		catch (final RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@Override
    public boolean sempred(final RuleContext _localctx, final int ruleIndex, final int predIndex) {
		switch (ruleIndex) {
		case 89: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(final ExpressionContext _localctx, final int predIndex) {
		switch (predIndex) {
		case 0: return 13 >= _localctx._p;

		case 1: return 12 >= _localctx._p;

		case 2: return 11 >= _localctx._p;

		case 3: return 10 >= _localctx._p;

		case 4: return 8 >= _localctx._p;

		case 5: return 7 >= _localctx._p;

		case 6: return 6 >= _localctx._p;

		case 7: return 5 >= _localctx._p;

		case 8: return 4 >= _localctx._p;

		case 9: return 3 >= _localctx._p;

		case 10: return 1 >= _localctx._p;

		case 11: return 2 >= _localctx._p;

		case 12: return 25 >= _localctx._p;

		case 13: return 24 >= _localctx._p;

		case 14: return 23 >= _localctx._p;

		case 15: return 22 >= _localctx._p;

		case 17: return 20 >= _localctx._p;

		case 16: return 21 >= _localctx._p;

		case 19: return 16 >= _localctx._p;

		case 18: return 19 >= _localctx._p;

		case 20: return 9 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3k\u0530\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\3\2\5\2\u00d2\n\2"+
		"\3\2\7\2\u00d5\n\2\f\2\16\2\u00d8\13\2\3\2\7\2\u00db\n\2\f\2\16\2\u00de"+
		"\13\2\3\2\3\2\3\3\7\3\u00e3\n\3\f\3\16\3\u00e6\13\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\5\4\u00ee\n\4\3\4\3\4\3\4\5\4\u00f3\n\4\3\4\3\4\3\5\7\5\u00f8\n"+
		"\5\f\5\16\5\u00fb\13\5\3\5\3\5\7\5\u00ff\n\5\f\5\16\5\u0102\13\5\3\5\3"+
		"\5\7\5\u0106\n\5\f\5\16\5\u0109\13\5\3\5\3\5\7\5\u010d\n\5\f\5\16\5\u0110"+
		"\13\5\3\5\3\5\5\5\u0114\n\5\3\6\3\6\5\6\u0118\n\6\3\7\3\7\5\7\u011c\n"+
		"\7\3\b\3\b\5\b\u0120\n\b\3\t\3\t\3\t\5\t\u0125\n\t\3\t\3\t\5\t\u0129\n"+
		"\t\3\t\3\t\5\t\u012d\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0135\n\n\f\n\16"+
		"\n\u0138\13\n\3\n\3\n\3\13\3\13\3\13\5\13\u013f\n\13\3\f\3\f\3\f\7\f\u0144"+
		"\n\f\f\f\16\f\u0147\13\f\3\r\3\r\3\r\3\r\5\r\u014d\n\r\3\r\3\r\5\r\u0151"+
		"\n\r\3\r\5\r\u0154\n\r\3\r\5\r\u0157\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u015e"+
		"\n\16\f\16\16\16\u0161\13\16\3\17\7\17\u0164\n\17\f\17\16\17\u0167\13"+
		"\17\3\17\3\17\5\17\u016b\n\17\3\17\5\17\u016e\n\17\3\20\3\20\7\20\u0172"+
		"\n\20\f\20\16\20\u0175\13\20\3\21\3\21\3\21\5\21\u017a\n\21\3\21\3\21"+
		"\5\21\u017e\n\21\3\21\3\21\3\22\3\22\3\22\7\22\u0185\n\22\f\22\16\22\u0188"+
		"\13\22\3\23\3\23\7\23\u018c\n\23\f\23\16\23\u018f\13\23\3\23\3\23\3\24"+
		"\3\24\7\24\u0195\n\24\f\24\16\24\u0198\13\24\3\24\3\24\3\25\3\25\5\25"+
		"\u019e\n\25\3\25\3\25\7\25\u01a2\n\25\f\25\16\25\u01a5\13\25\3\25\5\25"+
		"\u01a8\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01b3\n"+
		"\26\3\27\3\27\5\27\u01b7\n\27\3\27\3\27\3\27\3\27\7\27\u01bd\n\27\f\27"+
		"\16\27\u01c0\13\27\3\27\3\27\5\27\u01c4\n\27\3\27\3\27\5\27\u01c8\n\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u01d1\n\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\7\34\u01dd\n\34\f\34\16\34\u01e0\13\34"+
		"\3\34\3\34\5\34\u01e4\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01ed"+
		"\n\35\3\36\3\36\3\36\3\36\7\36\u01f3\n\36\f\36\16\36\u01f6\13\36\3\36"+
		"\3\36\3\37\3\37\3\37\7\37\u01fd\n\37\f\37\16\37\u0200\13\37\3\37\3\37"+
		"\3\37\3 \3 \5 \u0207\n \3 \3 \3 \3 \7 \u020d\n \f \16 \u0210\13 \3 \3"+
		" \5 \u0214\n \3 \3 \3!\3!\3!\3\"\3\"\3\"\7\"\u021e\n\"\f\"\16\"\u0221"+
		"\13\"\3#\3#\3#\5#\u0226\n#\3$\3$\3$\7$\u022b\n$\f$\16$\u022e\13$\3%\3"+
		"%\5%\u0232\n%\3&\3&\3&\3&\7&\u0238\n&\f&\16&\u023b\13&\3&\5&\u023e\n&"+
		"\5&\u0240\n&\3&\3&\3\'\3\'\3(\3(\3(\7(\u0249\n(\f(\16(\u024c\13(\3(\3"+
		"(\3(\7(\u0251\n(\f(\16(\u0254\13(\5(\u0256\n(\3)\3)\5)\u025a\n)\3)\3)"+
		"\3)\5)\u025f\n)\7)\u0261\n)\f)\16)\u0264\13)\3*\3*\3+\3+\3+\3+\7+\u026c"+
		"\n+\f+\16+\u026f\13+\3+\3+\3,\3,\3,\3,\5,\u0277\n,\5,\u0279\n,\3-\3-\3"+
		"-\7-\u027e\n-\f-\16-\u0281\13-\3.\3.\5.\u0285\n.\3.\3.\3/\3/\3/\7/\u028c"+
		"\n/\f/\16/\u028f\13/\3/\3/\5/\u0293\n/\3/\5/\u0296\n/\3\60\7\60\u0299"+
		"\n\60\f\60\16\60\u029c\13\60\3\60\3\60\3\60\3\61\7\61\u02a2\n\61\f\61"+
		"\16\61\u02a5\13\61\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\64\7\64\u02b2\n\64\f\64\16\64\u02b5\13\64\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\66\5\66\u02be\n\66\3\66\5\66\u02c1\n\66\3\67\3\67\38\38\38\78\u02c8"+
		"\n8\f8\168\u02cb\138\39\39\39\39\3:\3:\3:\5:\u02d4\n:\3;\3;\3;\3;\7;\u02da"+
		"\n;\f;\16;\u02dd\13;\5;\u02df\n;\3;\5;\u02e2\n;\3;\3;\3<\3<\3<\3<\3<\3"+
		"=\3=\7=\u02ed\n=\f=\16=\u02f0\13=\3=\3=\3>\7>\u02f5\n>\f>\16>\u02f8\13"+
		">\3>\3>\5>\u02fc\n>\3?\3?\3?\3?\3?\3?\5?\u0304\n?\3?\3?\5?\u0308\n?\3"+
		"?\3?\5?\u030c\n?\3?\3?\5?\u0310\n?\5?\u0312\n?\3@\3@\5@\u0316\n@\3A\3"+
		"A\3A\3A\5A\u031c\nA\3B\3B\3C\3C\3C\3D\3D\7D\u0325\nD\fD\16D\u0328\13D"+
		"\3D\3D\3E\3E\3E\5E\u032f\nE\3F\3F\3F\3G\7G\u0335\nG\fG\16G\u0338\13G\3"+
		"G\3G\3G\3H\3H\3H\3H\3H\5H\u0342\nH\3H\3H\3H\3H\7H\u0348\nH\fH\16H\u034b"+
		"\13H\3H\7H\u034e\nH\fH\16H\u0351\13H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u035b"+
		"\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u036e\nI\3J"+
		"\3J\3J\3J\3J\3J\3J\5J\u0377\nJ\3J\3J\3J\3J\3J\6J\u037e\nJ\rJ\16J\u037f"+
		"\3J\5J\u0383\nJ\3J\5J\u0386\nJ\3J\3J\3J\3J\7J\u038c\nJ\fJ\16J\u038f\13"+
		"J\3J\5J\u0392\nJ\3J\3J\3J\3J\7J\u0398\nJ\fJ\16J\u039b\13J\3J\7J\u039e"+
		"\nJ\fJ\16J\u03a1\13J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u03ab\nJ\3J\3J\3J\3J\3"+
		"J\3J\3J\5J\u03b4\nJ\3J\3J\3J\5J\u03b9\nJ\3J\3J\3J\3J\3J\3J\3J\3J\5J\u03c3"+
		"\nJ\3K\3K\3K\7K\u03c8\nK\fK\16K\u03cb\13K\3K\3K\3K\3K\3K\3L\3L\3L\7L\u03d5"+
		"\nL\fL\16L\u03d8\13L\3M\3M\3M\3N\3N\3N\5N\u03e0\nN\3N\3N\3O\3O\3O\7O\u03e7"+
		"\nO\fO\16O\u03ea\13O\3P\7P\u03ed\nP\fP\16P\u03f0\13P\3P\3P\3P\3P\3P\3"+
		"Q\6Q\u03f8\nQ\rQ\16Q\u03f9\3Q\6Q\u03fd\nQ\rQ\16Q\u03fe\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\5R\u040b\nR\3S\3S\5S\u040f\nS\3S\3S\5S\u0413\nS\3S\3S"+
		"\5S\u0417\nS\5S\u0419\nS\3T\3T\5T\u041d\nT\3U\7U\u0420\nU\fU\16U\u0423"+
		"\13U\3U\3U\3U\3U\3U\3V\3V\3W\3W\3W\3W\3X\3X\3X\7X\u0433\nX\fX\16X\u0436"+
		"\13X\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0449\n[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0459\n[\3[\3[\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\5[\u047e\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\5[\u0491\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\3[\5[\u04a3\n[\3[\3[\3[\3[\3[\3[\7[\u04ab\n[\f[\16[\u04ae\13[\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\5\\\u04c3\n\\\5\\\u04c5\n\\\3]\3]\3]\3]\3]\3]\3]\5]\u04ce\n]\5]\u04d0"+
		"\n]\3^\3^\5^\u04d4\n^\3^\3^\3^\5^\u04d9\n^\7^\u04db\n^\f^\16^\u04de\13"+
		"^\3^\5^\u04e1\n^\3_\3_\5_\u04e5\n_\3_\3_\3`\3`\3`\3`\7`\u04ed\n`\f`\16"+
		"`\u04f0\13`\3`\3`\3`\3`\3`\3`\3`\7`\u04f9\n`\f`\16`\u04fc\13`\3`\3`\7"+
		"`\u0500\n`\f`\16`\u0503\13`\5`\u0505\n`\3a\3a\5a\u0509\na\3b\3b\3b\3c"+
		"\3c\3c\3c\3d\3d\3d\5d\u0515\nd\3e\3e\3e\5e\u051a\ne\3f\3f\3f\3f\5f\u0520"+
		"\nf\5f\u0522\nf\3g\3g\3g\3g\5g\u0528\ng\3h\3h\5h\u052c\nh\3h\3h\3h\2i"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\2\16\6\2  ,,\60"+
		"\60\63\63\6\2\3\3\24\24#%()\n\2\5\5\7\7\n\n\20\20\26\26\35\35\37\37\'"+
		"\'\4\2\23\23**\3\2\65:\3\2QT\3\2GH\4\2UVZZ\3\2ST\4\2EFLM\4\2KKNN\3\2Q"+
		"R\u05b0\2\u00d1\3\2\2\2\4\u00e4\3\2\2\2\6\u00eb\3\2\2\2\b\u0113\3\2\2"+
		"\2\n\u0117\3\2\2\2\f\u011b\3\2\2\2\16\u011f\3\2\2\2\20\u0121\3\2\2\2\22"+
		"\u0130\3\2\2\2\24\u013b\3\2\2\2\26\u0140\3\2\2\2\30\u0148\3\2\2\2\32\u015a"+
		"\3\2\2\2\34\u0165\3\2\2\2\36\u016f\3\2\2\2 \u0176\3\2\2\2\"\u0181\3\2"+
		"\2\2$\u0189\3\2\2\2&\u0192\3\2\2\2(\u01a7\3\2\2\2*\u01b2\3\2\2\2,\u01b6"+
		"\3\2\2\2.\u01c9\3\2\2\2\60\u01cc\3\2\2\2\62\u01d4\3\2\2\2\64\u01d7\3\2"+
		"\2\2\66\u01e3\3\2\2\28\u01ec\3\2\2\2:\u01ee\3\2\2\2<\u01f9\3\2\2\2>\u0206"+
		"\3\2\2\2@\u0217\3\2\2\2B\u021a\3\2\2\2D\u0222\3\2\2\2F\u0227\3\2\2\2H"+
		"\u0231\3\2\2\2J\u0233\3\2\2\2L\u0243\3\2\2\2N\u0255\3\2\2\2P\u0257\3\2"+
		"\2\2R\u0265\3\2\2\2T\u0267\3\2\2\2V\u0278\3\2\2\2X\u027a\3\2\2\2Z\u0282"+
		"\3\2\2\2\\\u0295\3\2\2\2^\u029a\3\2\2\2`\u02a3\3\2\2\2b\u02aa\3\2\2\2"+
		"d\u02ac\3\2\2\2f\u02ae\3\2\2\2h\u02b6\3\2\2\2j\u02b8\3\2\2\2l\u02c2\3"+
		"\2\2\2n\u02c4\3\2\2\2p\u02cc\3\2\2\2r\u02d3\3\2\2\2t\u02d5\3\2\2\2v\u02e5"+
		"\3\2\2\2x\u02ea\3\2\2\2z\u02fb\3\2\2\2|\u0311\3\2\2\2~\u0315\3\2\2\2\u0080"+
		"\u0317\3\2\2\2\u0082\u031d\3\2\2\2\u0084\u031f\3\2\2\2\u0086\u0322\3\2"+
		"\2\2\u0088\u032e\3\2\2\2\u008a\u0330\3\2\2\2\u008c\u0336\3\2\2\2\u008e"+
		"\u035a\3\2\2\2\u0090\u036d\3\2\2\2\u0092\u03c2\3\2\2\2\u0094\u03c4\3\2"+
		"\2\2\u0096\u03d1\3\2\2\2\u0098\u03d9\3\2\2\2\u009a\u03dc\3\2\2\2\u009c"+
		"\u03e3\3\2\2\2\u009e\u03ee\3\2\2\2\u00a0\u03f7\3\2\2\2\u00a2\u040a\3\2"+
		"\2\2\u00a4\u0418\3\2\2\2\u00a6\u041c\3\2\2\2\u00a8\u0421\3\2\2\2\u00aa"+
		"\u0429\3\2\2\2\u00ac\u042b\3\2\2\2\u00ae\u042f\3\2\2\2\u00b0\u0437\3\2"+
		"\2\2\u00b2\u0439\3\2\2\2\u00b4\u0448\3\2\2\2\u00b6\u04c4\3\2\2\2\u00b8"+
		"\u04cf\3\2\2\2\u00ba\u04e0\3\2\2\2\u00bc\u04e2\3\2\2\2\u00be\u04e8\3\2"+
		"\2\2\u00c0\u0506\3\2\2\2\u00c2\u050a\3\2\2\2\u00c4\u050d\3\2\2\2\u00c6"+
		"\u0514\3\2\2\2\u00c8\u0519\3\2\2\2\u00ca\u0521\3\2\2\2\u00cc\u0527\3\2"+
		"\2\2\u00ce\u0529\3\2\2\2\u00d0\u00d2\5\4\3\2\u00d1\u00d0\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5\5\6\4\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00dc\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\5\b\5\2\u00da\u00d9\3\2"+
		"\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\2\2\3\u00e0\3\3\2\2\2"+
		"\u00e1\u00e3\5j\66\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00e8\7\"\2\2\u00e8\u00e9\5f\64\2\u00e9\u00ea\7A\2\2\u00ea\5\3\2\2\2"+
		"\u00eb\u00ed\7\33\2\2\u00ec\u00ee\7(\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\5f\64\2\u00f0\u00f1\7C\2\2\u00f1"+
		"\u00f3\7U\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f5\7A\2\2\u00f5\7\3\2\2\2\u00f6\u00f8\5\f\7\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0114\5\20\t\2\u00fd\u00ff\5"+
		"\f\7\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0114\5\30"+
		"\r\2\u0104\u0106\5\f\7\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u0114\5 \21\2\u010b\u010d\5\f\7\2\u010c\u010b\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0111\u0114\5v<\2\u0112\u0114\7A\2\2\u0113\u00f9"+
		"\3\2\2\2\u0113\u0100\3\2\2\2\u0113\u0107\3\2\2\2\u0113\u010e\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\t\3\2\2\2\u0115\u0118\5\f\7\2\u0116\u0118\t\2\2\2"+
		"\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\13\3\2\2\2\u0119\u011c"+
		"\5j\66\2\u011a\u011c\t\3\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\r\3\2\2\2\u011d\u0120\7\24\2\2\u011e\u0120\5j\66\2\u011f\u011d\3\2\2"+
		"\2\u011f\u011e\3\2\2\2\u0120\17\3\2\2\2\u0121\u0122\7\13\2\2\u0122\u0124"+
		"\7f\2\2\u0123\u0125\5\22\n\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0128\3\2\2\2\u0126\u0127\7\23\2\2\u0127\u0129\5N(\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u012b\7\32\2\2\u012b"+
		"\u012d\5\"\22\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3"+
		"\2\2\2\u012e\u012f\5$\23\2\u012f\21\3\2\2\2\u0130\u0131\7F\2\2\u0131\u0136"+
		"\5\24\13\2\u0132\u0133\7B\2\2\u0133\u0135\5\24\13\2\u0134\u0132\3\2\2"+
		"\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7E\2\2\u013a\23\3\2\2\2\u013b"+
		"\u013e\7f\2\2\u013c\u013d\7\23\2\2\u013d\u013f\5\26\f\2\u013e\u013c\3"+
		"\2\2\2\u013e\u013f\3\2\2\2\u013f\25\3\2\2\2\u0140\u0145\5N(\2\u0141\u0142"+
		"\7W\2\2\u0142\u0144\5N(\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\27\3\2\2\2\u0147\u0145\3\2\2"+
		"\2\u0148\u0149\7\22\2\2\u0149\u014c\7f\2\2\u014a\u014b\7\32\2\2\u014b"+
		"\u014d\5\"\22\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u0150\7=\2\2\u014f\u0151\5\32\16\2\u0150\u014f\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0154\7B\2\2\u0153\u0152\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0157\5\36\20\2\u0156"+
		"\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\7>"+
		"\2\2\u0159\31\3\2\2\2\u015a\u015f\5\34\17\2\u015b\u015c\7B\2\2\u015c\u015e"+
		"\5\34\17\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2"+
		"\u015f\u0160\3\2\2\2\u0160\33\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164"+
		"\5j\66\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016a\7f"+
		"\2\2\u0169\u016b\5\u00ceh\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016d\3\2\2\2\u016c\u016e\5$\23\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\35\3\2\2\2\u016f\u0173\7A\2\2\u0170\u0172\5(\25\2\u0171\u0170"+
		"\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\37\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7\36\2\2\u0177\u0179\7f\2"+
		"\2\u0178\u017a\5\22\n\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017d\3\2\2\2\u017b\u017c\7\23\2\2\u017c\u017e\5\"\22\2\u017d\u017b\3"+
		"\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\5&\24\2\u0180"+
		"!\3\2\2\2\u0181\u0186\5N(\2\u0182\u0183\7B\2\2\u0183\u0185\5N(\2\u0184"+
		"\u0182\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187#\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018d\7=\2\2\u018a\u018c"+
		"\5(\25\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7>"+
		"\2\2\u0191%\3\2\2\2\u0192\u0196\7=\2\2\u0193\u0195\5\66\34\2\u0194\u0193"+
		"\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\7>\2\2\u019a\'\3\2\2\2"+
		"\u019b\u01a8\7A\2\2\u019c\u019e\7(\2\2\u019d\u019c\3\2\2\2\u019d\u019e"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a8\5\u0086D\2\u01a0\u01a2\5\n\6"+
		"\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\5*\26\2\u01a7"+
		"\u019b\3\2\2\2\u01a7\u019d\3\2\2\2\u01a7\u01a3\3\2\2\2\u01a8)\3\2\2\2"+
		"\u01a9\u01b3\5,\27\2\u01aa\u01b3\5.\30\2\u01ab\u01b3\5\64\33\2\u01ac\u01b3"+
		"\5\60\31\2\u01ad\u01b3\5\62\32\2\u01ae\u01b3\5 \21\2\u01af\u01b3\5v<\2"+
		"\u01b0\u01b3\5\20\t\2\u01b1\u01b3\5\30\r\2\u01b2\u01a9\3\2\2\2\u01b2\u01aa"+
		"\3\2\2\2\u01b2\u01ab\3\2\2\2\u01b2\u01ac\3\2\2\2\u01b2\u01ad\3\2\2\2\u01b2"+
		"\u01ae\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2"+
		"\2\2\u01b3+\3\2\2\2\u01b4\u01b7\5N(\2\u01b5\u01b7\7\62\2\2\u01b6\u01b4"+
		"\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\7f\2\2\u01b9"+
		"\u01be\5Z.\2\u01ba\u01bb\7?\2\2\u01bb\u01bd\7@\2\2\u01bc\u01ba\3\2\2\2"+
		"\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c3"+
		"\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\7/\2\2\u01c2\u01c4\5X-\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c8\5b"+
		"\62\2\u01c6\u01c8\7A\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8"+
		"-\3\2\2\2\u01c9\u01ca\5\22\n\2\u01ca\u01cb\5,\27\2\u01cb/\3\2\2\2\u01cc"+
		"\u01cd\7f\2\2\u01cd\u01d0\5Z.\2\u01ce\u01cf\7/\2\2\u01cf\u01d1\5X-\2\u01d0"+
		"\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\5d"+
		"\63\2\u01d3\61\3\2\2\2\u01d4\u01d5\5\22\n\2\u01d5\u01d6\5\60\31\2\u01d6"+
		"\63\3\2\2\2\u01d7\u01d8\5N(\2\u01d8\u01d9\5B\"\2\u01d9\u01da\7A\2\2\u01da"+
		"\65\3\2\2\2\u01db\u01dd\5\n\6\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2"+
		"\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de"+
		"\3\2\2\2\u01e1\u01e4\58\35\2\u01e2\u01e4\7A\2\2\u01e3\u01de\3\2\2\2\u01e3"+
		"\u01e2\3\2\2\2\u01e4\67\3\2\2\2\u01e5\u01ed\5:\36\2\u01e6\u01ed\5> \2"+
		"\u01e7\u01ed\5@!\2\u01e8\u01ed\5 \21\2\u01e9\u01ed\5v<\2\u01ea\u01ed\5"+
		"\20\t\2\u01eb\u01ed\5\30\r\2\u01ec\u01e5\3\2\2\2\u01ec\u01e6\3\2\2\2\u01ec"+
		"\u01e7\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ec\u01eb\3\2\2\2\u01ed9\3\2\2\2\u01ee\u01ef\5N(\2\u01ef\u01f4"+
		"\5<\37\2\u01f0\u01f1\7B\2\2\u01f1\u01f3\5<\37\2\u01f2\u01f0\3\2\2\2\u01f3"+
		"\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2"+
		"\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\7A\2\2\u01f8;\3\2\2\2\u01f9\u01fe"+
		"\7f\2\2\u01fa\u01fb\7?\2\2\u01fb\u01fd\7@\2\2\u01fc\u01fa\3\2\2\2\u01fd"+
		"\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2"+
		"\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\7D\2\2\u0202\u0203\5H%\2\u0203=\3"+
		"\2\2\2\u0204\u0207\5N(\2\u0205\u0207\7\62\2\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\7f\2\2\u0209\u020e\5Z."+
		"\2\u020a\u020b\7?\2\2\u020b\u020d\7@\2\2\u020c\u020a\3\2\2\2\u020d\u0210"+
		"\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0213\3\2\2\2\u0210"+
		"\u020e\3\2\2\2\u0211\u0212\7/\2\2\u0212\u0214\5X-\2\u0213\u0211\3\2\2"+
		"\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\7A\2\2\u0216?\3"+
		"\2\2\2\u0217\u0218\5\22\n\2\u0218\u0219\5> \2\u0219A\3\2\2\2\u021a\u021f"+
		"\5D#\2\u021b\u021c\7B\2\2\u021c\u021e\5D#\2\u021d\u021b\3\2\2\2\u021e"+
		"\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220C\3\2\2\2"+
		"\u0221\u021f\3\2\2\2\u0222\u0225\5F$\2\u0223\u0224\7D\2\2\u0224\u0226"+
		"\5H%\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226E\3\2\2\2\u0227\u022c"+
		"\7f\2\2\u0228\u0229\7?\2\2\u0229\u022b\7@\2\2\u022a\u0228\3\2\2\2\u022b"+
		"\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022dG\3\2\2\2"+
		"\u022e\u022c\3\2\2\2\u022f\u0232\5J&\2\u0230\u0232\5\u00b4[\2\u0231\u022f"+
		"\3\2\2\2\u0231\u0230\3\2\2\2\u0232I\3\2\2\2\u0233\u023f\7=\2\2\u0234\u0239"+
		"\5H%\2\u0235\u0236\7B\2\2\u0236\u0238\5H%\2\u0237\u0235\3\2\2\2\u0238"+
		"\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023d\3\2"+
		"\2\2\u023b\u0239\3\2\2\2\u023c\u023e\7B\2\2\u023d\u023c\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u0234\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0241\u0242\7>\2\2\u0242K\3\2\2\2\u0243\u0244"+
		"\7f\2\2\u0244M\3\2\2\2\u0245\u024a\5P)\2\u0246\u0247\7?\2\2\u0247\u0249"+
		"\7@\2\2\u0248\u0246\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a"+
		"\u024b\3\2\2\2\u024b\u0256\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u0252\5R"+
		"*\2\u024e\u024f\7?\2\2\u024f\u0251\7@\2\2\u0250\u024e\3\2\2\2\u0251\u0254"+
		"\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0256\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0255\u0245\3\2\2\2\u0255\u024d\3\2\2\2\u0256O\3\2\2\2"+
		"\u0257\u0259\7f\2\2\u0258\u025a\5T+\2\u0259\u0258\3\2\2\2\u0259\u025a"+
		"\3\2\2\2\u025a\u0262\3\2\2\2\u025b\u025c\7C\2\2\u025c\u025e\7f\2\2\u025d"+
		"\u025f\5T+\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261\3\2\2"+
		"\2\u0260\u025b\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263"+
		"\3\2\2\2\u0263Q\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0266\t\4\2\2\u0266"+
		"S\3\2\2\2\u0267\u0268\7F\2\2\u0268\u026d\5V,\2\u0269\u026a\7B\2\2\u026a"+
		"\u026c\5V,\2\u026b\u0269\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2"+
		"\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0271"+
		"\7E\2\2\u0271U\3\2\2\2\u0272\u0279\5N(\2\u0273\u0276\7I\2\2\u0274\u0275"+
		"\t\5\2\2\u0275\u0277\5N(\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u0279\3\2\2\2\u0278\u0272\3\2\2\2\u0278\u0273\3\2\2\2\u0279W\3\2\2\2"+
		"\u027a\u027f\5f\64\2\u027b\u027c\7B\2\2\u027c\u027e\5f\64\2\u027d\u027b"+
		"\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"Y\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0284\7;\2\2\u0283\u0285\5\\/\2\u0284"+
		"\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\7<"+
		"\2\2\u0287[\3\2\2\2\u0288\u028d\5^\60\2\u0289\u028a\7B\2\2\u028a\u028c"+
		"\5^\60\2\u028b\u0289\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u0292\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291\7B"+
		"\2\2\u0291\u0293\5`\61\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0296\3\2\2\2\u0294\u0296\5`\61\2\u0295\u0288\3\2\2\2\u0295\u0294\3\2"+
		"\2\2\u0296]\3\2\2\2\u0297\u0299\5\16\b\2\u0298\u0297\3\2\2\2\u0299\u029c"+
		"\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029d\u029e\5N(\2\u029e\u029f\5F$\2\u029f_\3\2\2\2\u02a0"+
		"\u02a2\5\16\b\2\u02a1\u02a0\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3"+
		"\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6"+
		"\u02a7\5N(\2\u02a7\u02a8\7h\2\2\u02a8\u02a9\5F$\2\u02a9a\3\2\2\2\u02aa"+
		"\u02ab\5\u0086D\2\u02abc\3\2\2\2\u02ac\u02ad\5\u0086D\2\u02ade\3\2\2\2"+
		"\u02ae\u02b3\7f\2\2\u02af\u02b0\7C\2\2\u02b0\u02b2\7f\2\2\u02b1\u02af"+
		"\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"g\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7\t\6\2\2\u02b7i\3\2\2\2\u02b8"+
		"\u02b9\7g\2\2\u02b9\u02c0\5l\67\2\u02ba\u02bd\7;\2\2\u02bb\u02be\5n8\2"+
		"\u02bc\u02be\5r:\2\u02bd\u02bb\3\2\2\2\u02bd\u02bc\3\2\2\2\u02bd\u02be"+
		"\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\7<\2\2\u02c0\u02ba\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1k\3\2\2\2\u02c2\u02c3\5f\64\2\u02c3m\3\2\2\2\u02c4"+
		"\u02c9\5p9\2\u02c5\u02c6\7B\2\2\u02c6\u02c8\5p9\2\u02c7\u02c5\3\2\2\2"+
		"\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02cao\3"+
		"\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02cd\7f\2\2\u02cd\u02ce\7D\2\2\u02ce"+
		"\u02cf\5r:\2\u02cfq\3\2\2\2\u02d0\u02d4\5\u00b4[\2\u02d1\u02d4\5j\66\2"+
		"\u02d2\u02d4\5t;\2\u02d3\u02d0\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d2"+
		"\3\2\2\2\u02d4s\3\2\2\2\u02d5\u02de\7=\2\2\u02d6\u02db\5r:\2\u02d7\u02d8"+
		"\7B\2\2\u02d8\u02da\5r:\2\u02d9\u02d7\3\2\2\2\u02da\u02dd\3\2\2\2\u02db"+
		"\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2"+
		"\2\2\u02de\u02d6\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0"+
		"\u02e2\7B\2\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2"+
		"\2\2\u02e3\u02e4\7>\2\2\u02e4u\3\2\2\2\u02e5\u02e6\7g\2\2\u02e6\u02e7"+
		"\7\36\2\2\u02e7\u02e8\7f\2\2\u02e8\u02e9\5x=\2\u02e9w\3\2\2\2\u02ea\u02ee"+
		"\7=\2\2\u02eb\u02ed\5z>\2\u02ec\u02eb\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee"+
		"\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02ee\3\2"+
		"\2\2\u02f1\u02f2\7>\2\2\u02f2y\3\2\2\2\u02f3\u02f5\5\n\6\2\u02f4\u02f3"+
		"\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02f9\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fc\5|?\2\u02fa\u02fc\7A\2"+
		"\2\u02fb\u02f6\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fc{\3\2\2\2\u02fd\u02fe"+
		"\5N(\2\u02fe\u02ff\5~@\2\u02ff\u0300\7A\2\2\u0300\u0312\3\2\2\2\u0301"+
		"\u0303\5\20\t\2\u0302\u0304\7A\2\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2"+
		"\2\2\u0304\u0312\3\2\2\2\u0305\u0307\5 \21\2\u0306\u0308\7A\2\2\u0307"+
		"\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0312\3\2\2\2\u0309\u030b\5\30"+
		"\r\2\u030a\u030c\7A\2\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c"+
		"\u0312\3\2\2\2\u030d\u030f\5v<\2\u030e\u0310\7A\2\2\u030f\u030e\3\2\2"+
		"\2\u030f\u0310\3\2\2\2\u0310\u0312\3\2\2\2\u0311\u02fd\3\2\2\2\u0311\u0301"+
		"\3\2\2\2\u0311\u0305\3\2\2\2\u0311\u0309\3\2\2\2\u0311\u030d\3\2\2\2\u0312"+
		"}\3\2\2\2\u0313\u0316\5\u0080A\2\u0314\u0316\5\u0082B\2\u0315\u0313\3"+
		"\2\2\2\u0315\u0314\3\2\2\2\u0316\177\3\2\2\2\u0317\u0318\7f\2\2\u0318"+
		"\u0319\7;\2\2\u0319\u031b\7<\2\2\u031a\u031c\5\u0084C\2\u031b\u031a\3"+
		"\2\2\2\u031b\u031c\3\2\2\2\u031c\u0081\3\2\2\2\u031d\u031e\5B\"\2\u031e"+
		"\u0083\3\2\2\2\u031f\u0320\7\16\2\2\u0320\u0321\5r:\2\u0321\u0085\3\2"+
		"\2\2\u0322\u0326\7=\2\2\u0323\u0325\5\u0088E\2\u0324\u0323\3\2\2\2\u0325"+
		"\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0329\3\2"+
		"\2\2\u0328\u0326\3\2\2\2\u0329\u032a\7>\2\2\u032a\u0087\3\2\2\2\u032b"+
		"\u032f\5\u008aF\2\u032c\u032f\5\u0092J\2\u032d\u032f\5\b\5\2\u032e\u032b"+
		"\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032d\3\2\2\2\u032f\u0089\3\2\2\2\u0330"+
		"\u0331\5\u008cG\2\u0331\u0332\7A\2\2\u0332\u008b\3\2\2\2\u0333\u0335\5"+
		"\16\b\2\u0334\u0333\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0336"+
		"\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u033a\5N"+
		"(\2\u033a\u033b\5B\"\2\u033b\u008d\3\2\2\2\u033c\u033d\7\30\2\2\u033d"+
		"\u033e\5\u00acW\2\u033e\u0341\5\u0092J\2\u033f\u0340\7\21\2\2\u0340\u0342"+
		"\5\u0092J\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u035b\3\2\2"+
		"\2\u0343\u0344\7+\2\2\u0344\u0345\5\u00acW\2\u0345\u0349\7=\2\2\u0346"+
		"\u0348\5\u00a0Q\2\u0347\u0346\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347"+
		"\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034f\3\2\2\2\u034b\u0349\3\2\2\2\u034c"+
		"\u034e\5\u00a2R\2\u034d\u034c\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d"+
		"\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0352\3\2\2\2\u0351\u034f\3\2\2\2\u0352"+
		"\u0353\7>\2\2\u0353\u035b\3\2\2\2\u0354\u0355\5\u00b4[\2\u0355\u0356\7"+
		"I\2\2\u0356\u0357\5\u00b4[\2\u0357\u0358\7J\2\2\u0358\u0359\5\u00b4[\2"+
		"\u0359\u035b\3\2\2\2\u035a\u033c\3\2\2\2\u035a\u0343\3\2\2\2\u035a\u0354"+
		"\3\2\2\2\u035b\u008f\3\2\2\2\u035c\u035d\7\27\2\2\u035d\u035e\7;\2\2\u035e"+
		"\u035f\5\u00a4S\2\u035f\u0360\7<\2\2\u0360\u0361\5\u0092J\2\u0361\u036e"+
		"\3\2\2\2\u0362\u0363\7\64\2\2\u0363\u0364\5\u00acW\2\u0364\u0365\5\u0092"+
		"J\2\u0365\u036e\3\2\2\2\u0366\u0367\7\17\2\2\u0367\u0368\5\u0092J\2\u0368"+
		"\u0369\7\64\2\2\u0369\u036a\5\u00acW\2\u036a\u036b\7A\2\2\u036b\u036e"+
		"\3\2\2\2\u036c\u036e\5\u00a8U\2\u036d\u035c\3\2\2\2\u036d\u0362\3\2\2"+
		"\2\u036d\u0366\3\2\2\2\u036d\u036c\3\2\2\2\u036e\u0091\3\2\2\2\u036f\u03c3"+
		"\5\u0086D\2\u0370\u03c3\5\u008eH\2\u0371\u03c3\5\u0090I\2\u0372\u0373"+
		"\7\4\2\2\u0373\u0376\5\u00b4[\2\u0374\u0375\7J\2\2\u0375\u0377\5\u00b4"+
		"[\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\3\2\2\2\u0378"+
		"\u0379\7A\2\2\u0379\u03c3\3\2\2\2\u037a\u037b\7\61\2\2\u037b\u0385\5\u0086"+
		"D\2\u037c\u037e\5\u0094K\2\u037d\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f"+
		"\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0382\3\2\2\2\u0381\u0383\5\u0098"+
		"M\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0386\3\2\2\2\u0384"+
		"\u0386\5\u0098M\2\u0385\u037d\3\2\2\2\u0385\u0384\3\2\2\2\u0386\u03c3"+
		"\3\2\2\2\u0387\u0388\7\61\2\2\u0388\u0389\5\u009aN\2\u0389\u038d\5\u0086"+
		"D\2\u038a\u038c\5\u0094K\2\u038b\u038a\3\2\2\2\u038c\u038f\3\2\2\2\u038d"+
		"\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0391\3\2\2\2\u038f\u038d\3\2"+
		"\2\2\u0390\u0392\5\u0098M\2\u0391\u0390\3\2\2\2\u0391\u0392\3\2\2\2\u0392"+
		"\u03c3\3\2\2\2\u0393\u0394\7+\2\2\u0394\u0395\5\u00acW\2\u0395\u0399\7"+
		"=\2\2\u0396\u0398\5\u00a0Q\2\u0397\u0396\3\2\2\2\u0398\u039b\3\2\2\2\u0399"+
		"\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039f\3\2\2\2\u039b\u0399\3\2"+
		"\2\2\u039c\u039e\5\u00a2R\2\u039d\u039c\3\2\2\2\u039e\u03a1\3\2\2\2\u039f"+
		"\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\3\2\2\2\u03a1\u039f\3\2"+
		"\2\2\u03a2\u03a3\7>\2\2\u03a3\u03c3\3\2\2\2\u03a4\u03a5\7,\2\2\u03a5\u03a6"+
		"\5\u00acW\2\u03a6\u03a7\5\u0086D\2\u03a7\u03c3\3\2\2\2\u03a8\u03aa\7&"+
		"\2\2\u03a9\u03ab\5\u00b4[\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab"+
		"\u03ac\3\2\2\2\u03ac\u03c3\7A\2\2\u03ad\u03ae\7.\2\2\u03ae\u03af\5\u00b4"+
		"[\2\u03af\u03b0\7A\2\2\u03b0\u03c3\3\2\2\2\u03b1\u03b3\7\6\2\2\u03b2\u03b4"+
		"\7f\2\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5"+
		"\u03c3\7A\2\2\u03b6\u03b8\7\r\2\2\u03b7\u03b9\7f\2\2\u03b8\u03b7\3\2\2"+
		"\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03c3\7A\2\2\u03bb\u03c3"+
		"\7A\2\2\u03bc\u03bd\5\u00b0Y\2\u03bd\u03be\7A\2\2\u03be\u03c3\3\2\2\2"+
		"\u03bf\u03c0\7f\2\2\u03c0\u03c1\7J\2\2\u03c1\u03c3\5\u0092J\2\u03c2\u036f"+
		"\3\2\2\2\u03c2\u0370\3\2\2\2\u03c2\u0371\3\2\2\2\u03c2\u0372\3\2\2\2\u03c2"+
		"\u037a\3\2\2\2\u03c2\u0387\3\2\2\2\u03c2\u0393\3\2\2\2\u03c2\u03a4\3\2"+
		"\2\2\u03c2\u03a8\3\2\2\2\u03c2\u03ad\3\2\2\2\u03c2\u03b1\3\2\2\2\u03c2"+
		"\u03b6\3\2\2\2\u03c2\u03bb\3\2\2\2\u03c2\u03bc\3\2\2\2\u03c2\u03bf\3\2"+
		"\2\2\u03c3\u0093\3\2\2\2\u03c4\u03c5\7\t\2\2\u03c5\u03c9\7;\2\2\u03c6"+
		"\u03c8\5\16\b\2\u03c7\u03c6\3\2\2\2\u03c8\u03cb\3\2\2\2\u03c9\u03c7\3"+
		"\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cc\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cc"+
		"\u03cd\5\u0096L\2\u03cd\u03ce\7f\2\2\u03ce\u03cf\7<\2\2\u03cf\u03d0\5"+
		"\u0086D\2\u03d0\u0095\3\2\2\2\u03d1\u03d6\5f\64\2\u03d2\u03d3\7X\2\2\u03d3"+
		"\u03d5\5f\64\2\u03d4\u03d2\3\2\2\2\u03d5\u03d8\3\2\2\2\u03d6\u03d4\3\2"+
		"\2\2\u03d6\u03d7\3\2\2\2\u03d7\u0097\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d9"+
		"\u03da\7\25\2\2\u03da\u03db\5\u0086D\2\u03db\u0099\3\2\2\2\u03dc\u03dd"+
		"\7;\2\2\u03dd\u03df\5\u009cO\2\u03de\u03e0\7A\2\2\u03df\u03de\3\2\2\2"+
		"\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\7<\2\2\u03e2\u009b"+
		"\3\2\2\2\u03e3\u03e8\5\u009eP\2\u03e4\u03e5\7A\2\2\u03e5\u03e7\5\u009e"+
		"P\2\u03e6\u03e4\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u009d\3\2\2\2\u03ea\u03e8\3\2\2\2\u03eb\u03ed\5\16"+
		"\b\2\u03ec\u03eb\3\2\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee"+
		"\u03ef\3\2\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f2\5P"+
		")\2\u03f2\u03f3\5F$\2\u03f3\u03f4\7D\2\2\u03f4\u03f5\5\u00b4[\2\u03f5"+
		"\u009f\3\2\2\2\u03f6\u03f8\5\u00a2R\2\u03f7\u03f6\3\2\2\2\u03f8\u03f9"+
		"\3\2\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb"+
		"\u03fd\5\u0088E\2\u03fc\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03fc"+
		"\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u00a1\3\2\2\2\u0400\u0401\7\b\2\2\u0401"+
		"\u0402\5\u00b2Z\2\u0402\u0403\7J\2\2\u0403\u040b\3\2\2\2\u0404\u0405\7"+
		"\b\2\2\u0405\u0406\5L\'\2\u0406\u0407\7J\2\2\u0407\u040b\3\2\2\2\u0408"+
		"\u0409\7\16\2\2\u0409\u040b\7J\2\2\u040a\u0400\3\2\2\2\u040a\u0404\3\2"+
		"\2\2\u040a\u0408\3\2\2\2\u040b\u00a3\3\2\2\2\u040c\u0419\5\u00a8U\2\u040d"+
		"\u040f\5\u00a6T\2\u040e\u040d\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410"+
		"\3\2\2\2\u0410\u0412\7A\2\2\u0411\u0413\5\u00b4[\2\u0412\u0411\3\2\2\2"+
		"\u0412\u0413\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0416\7A\2\2\u0415\u0417"+
		"\5\u00aaV\2\u0416\u0415\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0419\3\2\2"+
		"\2\u0418\u040c\3\2\2\2\u0418\u040e\3\2\2\2\u0419\u00a5\3\2\2\2\u041a\u041d"+
		"\5\u008cG\2\u041b\u041d\5\u00aeX\2\u041c\u041a\3\2\2\2\u041c\u041b\3\2"+
		"\2\2\u041d\u00a7\3\2\2\2\u041e\u0420\5\16\b\2\u041f\u041e\3\2\2\2\u0420"+
		"\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0424\3\2"+
		"\2\2\u0423\u0421\3\2\2\2\u0424\u0425\5N(\2\u0425\u0426\7f\2\2\u0426\u0427"+
		"\7J\2\2\u0427\u0428\5\u00b4[\2\u0428\u00a9\3\2\2\2\u0429\u042a\5\u00ae"+
		"X\2\u042a\u00ab\3\2\2\2\u042b\u042c\7;\2\2\u042c\u042d\5\u00b4[\2\u042d"+
		"\u042e\7<\2\2\u042e\u00ad\3\2\2\2\u042f\u0434\5\u00b4[\2\u0430\u0431\7"+
		"B\2\2\u0431\u0433\5\u00b4[\2\u0432\u0430\3\2\2\2\u0433\u0436\3\2\2\2\u0434"+
		"\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u00af\3\2\2\2\u0436\u0434\3\2"+
		"\2\2\u0437\u0438\5\u00b4[\2\u0438\u00b1\3\2\2\2\u0439\u043a\5\u00b4[\2"+
		"\u043a\u00b3\3\2\2\2\u043b\u043c\b[\1\2\u043c\u043d\7;\2\2\u043d\u043e"+
		"\5N(\2\u043e\u043f\7<\2\2\u043f\u0440\5\u00b4[\2\u0440\u0449\3\2\2\2\u0441"+
		"\u0442\t\7\2\2\u0442\u0449\5\u00b4[\2\u0443\u0444\t\b\2\2\u0444\u0449"+
		"\5\u00b4[\2\u0445\u0449\5\u00b6\\\2\u0446\u0447\7!\2\2\u0447\u0449\5\u00b8"+
		"]\2\u0448\u043b\3\2\2\2\u0448\u0441\3\2\2\2\u0448\u0443\3\2\2\2\u0448"+
		"\u0445\3\2\2\2\u0448\u0446\3\2\2\2\u0449\u04ac\3\2\2\2\u044a\u044b\6["+
		"\2\3\u044b\u044c\t\t\2\2\u044c\u04ab\5\u00b4[\2\u044d\u044e\6[\3\3\u044e"+
		"\u044f\t\n\2\2\u044f\u04ab\5\u00b4[\2\u0450\u0458\6[\4\3\u0451\u0452\7"+
		"F\2\2\u0452\u0459\7F\2\2\u0453\u0454\7E\2\2\u0454\u0455\7E\2\2\u0455\u0459"+
		"\7E\2\2\u0456\u0457\7E\2\2\u0457\u0459\7E\2\2\u0458\u0451\3\2\2\2\u0458"+
		"\u0453\3\2\2\2\u0458\u0456\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u04ab\5\u00b4"+
		"[\2\u045b\u045c\6[\5\3\u045c\u045d\t\13\2\2\u045d\u04ab\5\u00b4[\2\u045e"+
		"\u045f\6[\6\3\u045f\u0460\t\f\2\2\u0460\u04ab\5\u00b4[\2\u0461\u0462\6"+
		"[\7\3\u0462\u0463\7W\2\2\u0463\u04ab\5\u00b4[\2\u0464\u0465\6[\b\3\u0465"+
		"\u0466\7Y\2\2\u0466\u04ab\5\u00b4[\2\u0467\u0468\6[\t\3\u0468\u0469\7"+
		"X\2\2\u0469\u04ab\5\u00b4[\2\u046a\u046b\6[\n\3\u046b\u046c\7O\2\2\u046c"+
		"\u04ab\5\u00b4[\2\u046d\u046e\6[\13\3\u046e\u046f\7P\2\2\u046f\u04ab\5"+
		"\u00b4[\2\u0470\u047d\6[\f\3\u0471\u047e\7D\2\2\u0472\u047e\7[\2\2\u0473"+
		"\u047e\7\\\2\2\u0474\u047e\7]\2\2\u0475\u047e\7^\2\2\u0476\u047e\7_\2"+
		"\2\u0477\u047e\7`\2\2\u0478\u047e\7a\2\2\u0479\u047e\7d\2\2\u047a\u047e"+
		"\7e\2\2\u047b\u047e\7c\2\2\u047c\u047e\7b\2\2\u047d\u0471\3\2\2\2\u047d"+
		"\u0472\3\2\2\2\u047d\u0473\3\2\2\2\u047d\u0474\3\2\2\2\u047d\u0475\3\2"+
		"\2\2\u047d\u0476\3\2\2\2\u047d\u0477\3\2\2\2\u047d\u0478\3\2\2\2\u047d"+
		"\u0479\3\2\2\2\u047d\u047a\3\2\2\2\u047d\u047b\3\2\2\2\u047d\u047c\3\2"+
		"\2\2\u047e\u047f\3\2\2\2\u047f\u04ab\5\u00b4[\2\u0480\u0481\6[\r\3\u0481"+
		"\u0482\7I\2\2\u0482\u0483\5\u00b4[\2\u0483\u0484\7J\2\2\u0484\u0485\5"+
		"\u00b4[\2\u0485\u04ab\3\2\2\2\u0486\u0487\6[\16\3\u0487\u0488\7C\2\2\u0488"+
		"\u04ab\7f\2\2\u0489\u048a\6[\17\3\u048a\u048b\7C\2\2\u048b\u04ab\7-\2"+
		"\2\u048c\u048d\6[\20\3\u048d\u048e\7C\2\2\u048e\u0490\7!\2\2\u048f\u0491"+
		"\5\u00c4c\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2"+
		"\2\u0492\u04ab\5\u00bc_\2\u0493\u0494\6[\21\3\u0494\u0495\7C\2\2\u0495"+
		"\u0496\7*\2\2\u0496\u04ab\5\u00caf\2\u0497\u0498\6[\22\3\u0498\u0499\7"+
		"C\2\2\u0499\u04ab\5\u00c2b\2\u049a\u049b\6[\23\3\u049b\u049c\7?\2\2\u049c"+
		"\u049d\5\u00b4[\2\u049d\u049e\7@\2\2\u049e\u04ab\3\2\2\2\u049f\u04a0\6"+
		"[\24\3\u04a0\u04a2\7;\2\2\u04a1\u04a3\5\u00aeX\2\u04a2\u04a1\3\2\2\2\u04a2"+
		"\u04a3\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04ab\7<\2\2\u04a5\u04a6\6[\25"+
		"\3\u04a6\u04ab\t\r\2\2\u04a7\u04a8\6[\26\3\u04a8\u04a9\7\34\2\2\u04a9"+
		"\u04ab\5N(\2\u04aa\u044a\3\2\2\2\u04aa\u044d\3\2\2\2\u04aa\u0450\3\2\2"+
		"\2\u04aa\u045b\3\2\2\2\u04aa\u045e\3\2\2\2\u04aa\u0461\3\2\2\2\u04aa\u0464"+
		"\3\2\2\2\u04aa\u0467\3\2\2\2\u04aa\u046a\3\2\2\2\u04aa\u046d\3\2\2\2\u04aa"+
		"\u0470\3\2\2\2\u04aa\u0480\3\2\2\2\u04aa\u0486\3\2\2\2\u04aa\u0489\3\2"+
		"\2\2\u04aa\u048c\3\2\2\2\u04aa\u0493\3\2\2\2\u04aa\u0497\3\2\2\2\u04aa"+
		"\u049a\3\2\2\2\u04aa\u049f\3\2\2\2\u04aa\u04a5\3\2\2\2\u04aa\u04a7\3\2"+
		"\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad"+
		"\u00b5\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af\u04b0\7;\2\2\u04b0\u04b1\5\u00b4"+
		"[\2\u04b1\u04b2\7<\2\2\u04b2\u04c5\3\2\2\2\u04b3\u04c5\7-\2\2\u04b4\u04c5"+
		"\7*\2\2\u04b5\u04c5\5h\65\2\u04b6\u04c5\7f\2\2\u04b7\u04b8\5N(\2\u04b8"+
		"\u04b9\7C\2\2\u04b9\u04ba\7\13\2\2\u04ba\u04c5\3\2\2\2\u04bb\u04bc\7\62"+
		"\2\2\u04bc\u04bd\7C\2\2\u04bd\u04c5\7\13\2\2\u04be\u04c2\5\u00c4c\2\u04bf"+
		"\u04c3\5\u00ccg\2\u04c0\u04c1\7-\2\2\u04c1\u04c3\5\u00ceh\2\u04c2\u04bf"+
		"\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c3\u04c5\3\2\2\2\u04c4\u04af\3\2\2\2\u04c4"+
		"\u04b3\3\2\2\2\u04c4\u04b4\3\2\2\2\u04c4\u04b5\3\2\2\2\u04c4\u04b6\3\2"+
		"\2\2\u04c4\u04b7\3\2\2\2\u04c4\u04bb\3\2\2\2\u04c4\u04be\3\2\2\2\u04c5"+
		"\u00b7\3\2\2\2\u04c6\u04c7\5\u00c4c\2\u04c7\u04c8\5\u00ba^\2\u04c8\u04c9"+
		"\5\u00c0a\2\u04c9\u04d0\3\2\2\2\u04ca\u04cd\5\u00ba^\2\u04cb\u04ce\5\u00be"+
		"`\2\u04cc\u04ce\5\u00c0a\2\u04cd\u04cb\3\2\2\2\u04cd\u04cc\3\2\2\2\u04ce"+
		"\u04d0\3\2\2\2\u04cf\u04c6\3\2\2\2\u04cf\u04ca\3\2\2\2\u04d0\u00b9\3\2"+
		"\2\2\u04d1\u04d3\7f\2\2\u04d2\u04d4\5\u00c6d\2\u04d3\u04d2\3\2\2\2\u04d3"+
		"\u04d4\3\2\2\2\u04d4\u04dc\3\2\2\2\u04d5\u04d6\7C\2\2\u04d6\u04d8\7f\2"+
		"\2\u04d7\u04d9\5\u00c6d\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9"+
		"\u04db\3\2\2\2\u04da\u04d5\3\2\2\2\u04db\u04de\3\2\2\2\u04dc\u04da\3\2"+
		"\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04e1\3\2\2\2\u04de\u04dc\3\2\2\2\u04df"+
		"\u04e1\5R*\2\u04e0\u04d1\3\2\2\2\u04e0\u04df\3\2\2\2\u04e1\u00bb\3\2\2"+
		"\2\u04e2\u04e4\7f\2\2\u04e3\u04e5\5\u00c8e\2\u04e4\u04e3\3\2\2\2\u04e4"+
		"\u04e5\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\5\u00c0a\2\u04e7\u00bd"+
		"\3\2\2\2\u04e8\u0504\7?\2\2\u04e9\u04ee\7@\2\2\u04ea\u04eb\7?\2\2\u04eb"+
		"\u04ed\7@\2\2\u04ec\u04ea\3\2\2\2\u04ed\u04f0\3\2\2\2\u04ee\u04ec\3\2"+
		"\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f1\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f1"+
		"\u0505\5J&\2\u04f2\u04f3\5\u00b4[\2\u04f3\u04fa\7@\2\2\u04f4\u04f5\7?"+
		"\2\2\u04f5\u04f6\5\u00b4[\2\u04f6\u04f7\7@\2\2\u04f7\u04f9\3\2\2\2\u04f8"+
		"\u04f4\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fa\u04fb\3\2"+
		"\2\2\u04fb\u0501\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fd\u04fe\7?\2\2\u04fe"+
		"\u0500\7@\2\2\u04ff\u04fd\3\2\2\2\u0500\u0503\3\2\2\2\u0501\u04ff\3\2"+
		"\2\2\u0501\u0502\3\2\2\2\u0502\u0505\3\2\2\2\u0503\u0501\3\2\2\2\u0504"+
		"\u04e9\3\2\2\2\u0504\u04f2\3\2\2\2\u0505\u00bf\3\2\2\2\u0506\u0508\5\u00ce"+
		"h\2\u0507\u0509\5$\23\2\u0508\u0507\3\2\2\2\u0508\u0509\3\2\2\2\u0509"+
		"\u00c1\3\2\2\2\u050a\u050b\5\u00c4c\2\u050b\u050c\5\u00ccg\2\u050c\u00c3"+
		"\3\2\2\2\u050d\u050e\7F\2\2\u050e\u050f\5\"\22\2\u050f\u0510\7E\2\2\u0510"+
		"\u00c5\3\2\2\2\u0511\u0512\7F\2\2\u0512\u0515\7E\2\2\u0513\u0515\5T+\2"+
		"\u0514\u0511\3\2\2\2\u0514\u0513\3\2\2\2\u0515\u00c7\3\2\2\2\u0516\u0517"+
		"\7F\2\2\u0517\u051a\7E\2\2\u0518\u051a\5\u00c4c\2\u0519\u0516\3\2\2\2"+
		"\u0519\u0518\3\2\2\2\u051a\u00c9\3\2\2\2\u051b\u0522\5\u00ceh\2\u051c"+
		"\u051d\7C\2\2\u051d\u051f\7f\2\2\u051e\u0520\5\u00ceh\2\u051f\u051e\3"+
		"\2\2\2\u051f\u0520\3\2\2\2\u0520\u0522\3\2\2\2\u0521\u051b\3\2\2\2\u0521"+
		"\u051c\3\2\2\2\u0522\u00cb\3\2\2\2\u0523\u0524\7*\2\2\u0524\u0528\5\u00ca"+
		"f\2\u0525\u0526\7f\2\2\u0526\u0528\5\u00ceh\2\u0527\u0523\3\2\2\2\u0527"+
		"\u0525\3\2\2\2\u0528\u00cd\3\2\2\2\u0529\u052b\7;\2\2\u052a\u052c\5\u00ae"+
		"X\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\3\2\2\2\u052d"+
		"\u052e\7<\2\2\u052e\u00cf\3\2\2\2\u009c\u00d1\u00d6\u00dc\u00e4\u00ed"+
		"\u00f2\u00f9\u0100\u0107\u010e\u0113\u0117\u011b\u011f\u0124\u0128\u012c"+
		"\u0136\u013e\u0145\u014c\u0150\u0153\u0156\u015f\u0165\u016a\u016d\u0173"+
		"\u0179\u017d\u0186\u018d\u0196\u019d\u01a3\u01a7\u01b2\u01b6\u01be\u01c3"+
		"\u01c7\u01d0\u01de\u01e3\u01ec\u01f4\u01fe\u0206\u020e\u0213\u021f\u0225"+
		"\u022c\u0231\u0239\u023d\u023f\u024a\u0252\u0255\u0259\u025e\u0262\u026d"+
		"\u0276\u0278\u027f\u0284\u028d\u0292\u0295\u029a\u02a3\u02b3\u02bd\u02c0"+
		"\u02c9\u02d3\u02db\u02de\u02e1\u02ee\u02f6\u02fb\u0303\u0307\u030b\u030f"+
		"\u0311\u0315\u031b\u0326\u032e\u0336\u0341\u0349\u034f\u035a\u036d\u0376"+
		"\u037f\u0382\u0385\u038d\u0391\u0399\u039f\u03aa\u03b3\u03b8\u03c2\u03c9"+
		"\u03d6\u03df\u03e8\u03ee\u03f9\u03fe\u040a\u040e\u0412\u0416\u0418\u041c"+
		"\u0421\u0434\u0448\u0458\u047d\u0490\u04a2\u04aa\u04ac\u04c2\u04c4\u04cd"+
		"\u04cf\u04d3\u04d8\u04dc\u04e0\u04e4\u04ee\u04fa\u0501\u0504\u0508\u0514"+
		"\u0519\u051f\u0521\u0527\u052b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
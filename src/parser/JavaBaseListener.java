package parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link JavaListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class JavaBaseListener implements JavaListener {
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterInnerCreator(@NotNull final JavaParser.InnerCreatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitInnerCreator(@NotNull final JavaParser.InnerCreatorContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterGenericMethodDeclaration(@NotNull final JavaParser.GenericMethodDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitGenericMethodDeclaration(@NotNull final JavaParser.GenericMethodDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterExpressionList(@NotNull final JavaParser.ExpressionListContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitExpressionList(@NotNull final JavaParser.ExpressionListContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTypeDeclaration(@NotNull final JavaParser.TypeDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTypeDeclaration(@NotNull final JavaParser.TypeDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterForUpdate(@NotNull final JavaParser.ForUpdateContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitForUpdate(@NotNull final JavaParser.ForUpdateContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAnnotation(@NotNull final JavaParser.AnnotationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAnnotation(@NotNull final JavaParser.AnnotationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEnumConstant(@NotNull final JavaParser.EnumConstantContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEnumConstant(@NotNull final JavaParser.EnumConstantContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterImportDeclaration(@NotNull final JavaParser.ImportDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitImportDeclaration(@NotNull final JavaParser.ImportDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAnnotationMethodOrConstantRest(@NotNull final JavaParser.AnnotationMethodOrConstantRestContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAnnotationMethodOrConstantRest(@NotNull final JavaParser.AnnotationMethodOrConstantRestContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEnumConstantName(@NotNull final JavaParser.EnumConstantNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEnumConstantName(@NotNull final JavaParser.EnumConstantNameContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFinallyBlock(@NotNull final JavaParser.FinallyBlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFinallyBlock(@NotNull final JavaParser.FinallyBlockContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVariableDeclarators(@NotNull final JavaParser.VariableDeclaratorsContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVariableDeclarators(@NotNull final JavaParser.VariableDeclaratorsContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterElementValuePairs(@NotNull final JavaParser.ElementValuePairsContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitElementValuePairs(@NotNull final JavaParser.ElementValuePairsContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterInterfaceMethodDeclaration(@NotNull final JavaParser.InterfaceMethodDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitInterfaceMethodDeclaration(@NotNull final JavaParser.InterfaceMethodDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterInterfaceBodyDeclaration(@NotNull final JavaParser.InterfaceBodyDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitInterfaceBodyDeclaration(@NotNull final JavaParser.InterfaceBodyDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEnumConstants(@NotNull final JavaParser.EnumConstantsContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEnumConstants(@NotNull final JavaParser.EnumConstantsContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterCatchClause(@NotNull final JavaParser.CatchClauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitCatchClause(@NotNull final JavaParser.CatchClauseContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterConstantExpression(@NotNull final JavaParser.ConstantExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitConstantExpression(@NotNull final JavaParser.ConstantExpressionContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEnumDeclaration(@NotNull final JavaParser.EnumDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEnumDeclaration(@NotNull final JavaParser.EnumDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterExplicitGenericInvocationSuffix(@NotNull final JavaParser.ExplicitGenericInvocationSuffixContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitExplicitGenericInvocationSuffix(@NotNull final JavaParser.ExplicitGenericInvocationSuffixContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTypeParameter(@NotNull final JavaParser.TypeParameterContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTypeParameter(@NotNull final JavaParser.TypeParameterContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEnumBodyDeclarations(@NotNull final JavaParser.EnumBodyDeclarationsContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEnumBodyDeclarations(@NotNull final JavaParser.EnumBodyDeclarationsContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTypeBound(@NotNull final JavaParser.TypeBoundContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTypeBound(@NotNull final JavaParser.TypeBoundContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterStatementExpression(@NotNull final JavaParser.StatementExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitStatementExpression(@NotNull final JavaParser.StatementExpressionContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVariableInitializer(@NotNull final JavaParser.VariableInitializerContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVariableInitializer(@NotNull final JavaParser.VariableInitializerContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterBlock(@NotNull final JavaParser.BlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitBlock(@NotNull final JavaParser.BlockContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterGenericInterfaceMethodDeclaration(@NotNull final JavaParser.GenericInterfaceMethodDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitGenericInterfaceMethodDeclaration(@NotNull final JavaParser.GenericInterfaceMethodDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterLocalVariableDeclarationStatement(@NotNull final JavaParser.LocalVariableDeclarationStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitLocalVariableDeclarationStatement(@NotNull final JavaParser.LocalVariableDeclarationStatementContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterSuperSuffix(@NotNull final JavaParser.SuperSuffixContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitSuperSuffix(@NotNull final JavaParser.SuperSuffixContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFieldDeclaration(@NotNull final JavaParser.FieldDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFieldDeclaration(@NotNull final JavaParser.FieldDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterLoop(@NotNull final JavaParser.LoopContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitLoop(@NotNull final JavaParser.LoopContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFormalParameterList(@NotNull final JavaParser.FormalParameterListContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFormalParameterList(@NotNull final JavaParser.FormalParameterListContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterExplicitGenericInvocation(@NotNull final JavaParser.ExplicitGenericInvocationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitExplicitGenericInvocation(@NotNull final JavaParser.ExplicitGenericInvocationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterParExpression(@NotNull final JavaParser.ParExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitParExpression(@NotNull final JavaParser.ParExpressionContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterConditionalIf(@NotNull final JavaParser.ConditionalIfContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitConditionalIf(@NotNull final JavaParser.ConditionalIfContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterSwitchLabel(@NotNull final JavaParser.SwitchLabelContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitSwitchLabel(@NotNull final JavaParser.SwitchLabelContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTypeParameters(@NotNull final JavaParser.TypeParametersContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTypeParameters(@NotNull final JavaParser.TypeParametersContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterQualifiedName(@NotNull final JavaParser.QualifiedNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitQualifiedName(@NotNull final JavaParser.QualifiedNameContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterClassDeclaration(@NotNull final JavaParser.ClassDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitClassDeclaration(@NotNull final JavaParser.ClassDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAnnotationConstantRest(@NotNull final JavaParser.AnnotationConstantRestContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAnnotationConstantRest(@NotNull final JavaParser.AnnotationConstantRestContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterArguments(@NotNull final JavaParser.ArgumentsContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitArguments(@NotNull final JavaParser.ArgumentsContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterConstructorBody(@NotNull final JavaParser.ConstructorBodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitConstructorBody(@NotNull final JavaParser.ConstructorBodyContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFormalParameters(@NotNull final JavaParser.FormalParametersContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFormalParameters(@NotNull final JavaParser.FormalParametersContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTypeArgument(@NotNull final JavaParser.TypeArgumentContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTypeArgument(@NotNull final JavaParser.TypeArgumentContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterForInit(@NotNull final JavaParser.ForInitContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitForInit(@NotNull final JavaParser.ForInitContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVariableDeclarator(@NotNull final JavaParser.VariableDeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVariableDeclarator(@NotNull final JavaParser.VariableDeclaratorContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAnnotationTypeDeclaration(@NotNull final JavaParser.AnnotationTypeDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAnnotationTypeDeclaration(@NotNull final JavaParser.AnnotationTypeDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterExpression(@NotNull final JavaParser.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitExpression(@NotNull final JavaParser.ExpressionContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterResources(@NotNull final JavaParser.ResourcesContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitResources(@NotNull final JavaParser.ResourcesContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFormalParameter(@NotNull final JavaParser.FormalParameterContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFormalParameter(@NotNull final JavaParser.FormalParameterContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterType(@NotNull final JavaParser.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitType(@NotNull final JavaParser.TypeContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterElementValueArrayInitializer(@NotNull final JavaParser.ElementValueArrayInitializerContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitElementValueArrayInitializer(@NotNull final JavaParser.ElementValueArrayInitializerContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAnnotationName(@NotNull final JavaParser.AnnotationNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAnnotationName(@NotNull final JavaParser.AnnotationNameContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEnhancedForControl(@NotNull final JavaParser.EnhancedForControlContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEnhancedForControl(@NotNull final JavaParser.EnhancedForControlContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAnnotationMethodRest(@NotNull final JavaParser.AnnotationMethodRestContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAnnotationMethodRest(@NotNull final JavaParser.AnnotationMethodRestContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterPrimary(@NotNull final JavaParser.PrimaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitPrimary(@NotNull final JavaParser.PrimaryContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterClassBody(@NotNull final JavaParser.ClassBodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitClassBody(@NotNull final JavaParser.ClassBodyContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterClassOrInterfaceModifier(@NotNull final JavaParser.ClassOrInterfaceModifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitClassOrInterfaceModifier(@NotNull final JavaParser.ClassOrInterfaceModifierContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDefaultValue(@NotNull final JavaParser.DefaultValueContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDefaultValue(@NotNull final JavaParser.DefaultValueContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVariableModifier(@NotNull final JavaParser.VariableModifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVariableModifier(@NotNull final JavaParser.VariableModifierContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterConstDeclaration(@NotNull final JavaParser.ConstDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitConstDeclaration(@NotNull final JavaParser.ConstDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterCreatedName(@NotNull final JavaParser.CreatedNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitCreatedName(@NotNull final JavaParser.CreatedNameContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterInterfaceDeclaration(@NotNull final JavaParser.InterfaceDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitInterfaceDeclaration(@NotNull final JavaParser.InterfaceDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterPackageDeclaration(@NotNull final JavaParser.PackageDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitPackageDeclaration(@NotNull final JavaParser.PackageDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterConstantDeclarator(@NotNull final JavaParser.ConstantDeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitConstantDeclarator(@NotNull final JavaParser.ConstantDeclaratorContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterCatchType(@NotNull final JavaParser.CatchTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitCatchType(@NotNull final JavaParser.CatchTypeContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTypeArguments(@NotNull final JavaParser.TypeArgumentsContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTypeArguments(@NotNull final JavaParser.TypeArgumentsContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterClassCreatorRest(@NotNull final JavaParser.ClassCreatorRestContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitClassCreatorRest(@NotNull final JavaParser.ClassCreatorRestContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterModifier(@NotNull final JavaParser.ModifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitModifier(@NotNull final JavaParser.ModifierContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterStatement(@NotNull final JavaParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitStatement(@NotNull final JavaParser.StatementContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterInterfaceBody(@NotNull final JavaParser.InterfaceBodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitInterfaceBody(@NotNull final JavaParser.InterfaceBodyContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterClassBodyDeclaration(@NotNull final JavaParser.ClassBodyDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitClassBodyDeclaration(@NotNull final JavaParser.ClassBodyDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterLastFormalParameter(@NotNull final JavaParser.LastFormalParameterContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitLastFormalParameter(@NotNull final JavaParser.LastFormalParameterContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterForControl(@NotNull final JavaParser.ForControlContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitForControl(@NotNull final JavaParser.ForControlContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTypeList(@NotNull final JavaParser.TypeListContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTypeList(@NotNull final JavaParser.TypeListContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterLocalVariableDeclaration(@NotNull final JavaParser.LocalVariableDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitLocalVariableDeclaration(@NotNull final JavaParser.LocalVariableDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVariableDeclaratorId(@NotNull final JavaParser.VariableDeclaratorIdContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVariableDeclaratorId(@NotNull final JavaParser.VariableDeclaratorIdContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterCompilationUnit(@NotNull final JavaParser.CompilationUnitContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitCompilationUnit(@NotNull final JavaParser.CompilationUnitContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterElementValue(@NotNull final JavaParser.ElementValueContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitElementValue(@NotNull final JavaParser.ElementValueContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterClassOrInterfaceType(@NotNull final JavaParser.ClassOrInterfaceTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitClassOrInterfaceType(@NotNull final JavaParser.ClassOrInterfaceTypeContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTypeArgumentsOrDiamond(@NotNull final JavaParser.TypeArgumentsOrDiamondContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTypeArgumentsOrDiamond(@NotNull final JavaParser.TypeArgumentsOrDiamondContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAnnotationTypeElementDeclaration(@NotNull final JavaParser.AnnotationTypeElementDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAnnotationTypeElementDeclaration(@NotNull final JavaParser.AnnotationTypeElementDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterBlockStatement(@NotNull final JavaParser.BlockStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitBlockStatement(@NotNull final JavaParser.BlockStatementContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAnnotationTypeBody(@NotNull final JavaParser.AnnotationTypeBodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAnnotationTypeBody(@NotNull final JavaParser.AnnotationTypeBodyContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterQualifiedNameList(@NotNull final JavaParser.QualifiedNameListContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitQualifiedNameList(@NotNull final JavaParser.QualifiedNameListContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterCreator(@NotNull final JavaParser.CreatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitCreator(@NotNull final JavaParser.CreatorContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMemberDeclaration(@NotNull final JavaParser.MemberDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMemberDeclaration(@NotNull final JavaParser.MemberDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMethodDeclaration(@NotNull final JavaParser.MethodDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMethodDeclaration(@NotNull final JavaParser.MethodDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAnnotationTypeElementRest(@NotNull final JavaParser.AnnotationTypeElementRestContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAnnotationTypeElementRest(@NotNull final JavaParser.AnnotationTypeElementRestContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterResourceSpecification(@NotNull final JavaParser.ResourceSpecificationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitResourceSpecification(@NotNull final JavaParser.ResourceSpecificationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterConstructorDeclaration(@NotNull final JavaParser.ConstructorDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitConstructorDeclaration(@NotNull final JavaParser.ConstructorDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterResource(@NotNull final JavaParser.ResourceContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitResource(@NotNull final JavaParser.ResourceContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterElementValuePair(@NotNull final JavaParser.ElementValuePairContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitElementValuePair(@NotNull final JavaParser.ElementValuePairContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMethodBody(@NotNull final JavaParser.MethodBodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMethodBody(@NotNull final JavaParser.MethodBodyContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterArrayInitializer(@NotNull final JavaParser.ArrayInitializerContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitArrayInitializer(@NotNull final JavaParser.ArrayInitializerContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterNonWildcardTypeArgumentsOrDiamond(@NotNull final JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitNonWildcardTypeArgumentsOrDiamond(@NotNull final JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterPrimitiveType(@NotNull final JavaParser.PrimitiveTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitPrimitiveType(@NotNull final JavaParser.PrimitiveTypeContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterNonWildcardTypeArguments(@NotNull final JavaParser.NonWildcardTypeArgumentsContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitNonWildcardTypeArguments(@NotNull final JavaParser.NonWildcardTypeArgumentsContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterArrayCreatorRest(@NotNull final JavaParser.ArrayCreatorRestContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitArrayCreatorRest(@NotNull final JavaParser.ArrayCreatorRestContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterInterfaceMemberDeclaration(@NotNull final JavaParser.InterfaceMemberDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitInterfaceMemberDeclaration(@NotNull final JavaParser.InterfaceMemberDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterGenericConstructorDeclaration(@NotNull final JavaParser.GenericConstructorDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitGenericConstructorDeclaration(@NotNull final JavaParser.GenericConstructorDeclarationContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterLiteral(@NotNull final JavaParser.LiteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitLiteral(@NotNull final JavaParser.LiteralContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterSwitchBlockStatementGroup(@NotNull final JavaParser.SwitchBlockStatementGroupContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitSwitchBlockStatementGroup(@NotNull final JavaParser.SwitchBlockStatementGroupContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEveryRule(@NotNull final ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEveryRule(@NotNull final ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitTerminal(@NotNull final TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitErrorNode(@NotNull final ErrorNode node) { }
}
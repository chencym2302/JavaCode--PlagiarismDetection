package parser;

import org.antlr.v4.runtime.TokenStream;

import parser.JavaParser.ConditionalIfContext;
import parser.JavaParser.CreatorContext;
import parser.JavaParser.ExpressionContext;
import parser.JavaParser.ExpressionListContext;
import parser.JavaParser.LoopContext;

public class MyListener extends JavaBaseListener {
    public static final String ASSIGNMENT = "A";
    public static final String IF_BEGIN = "IB";
    public static final String IF_END = "IE";
    public static final String LOOP_BEGIN = "LB";
    public static final String LOOP_END = "LE";
    public static final String FUNCCALL = "F";
    //待添加各种元素
    
    private final JavaParser parser;
    private final StringBuilder signature = new StringBuilder();

    public MyListener(final JavaParser parser) {
        this.parser = parser;

    }

    @Override
    public void enterConditionalIf(final ConditionalIfContext ctx) {
        signature.append(IF_BEGIN);
    }

    @Override
    public void exitConditionalIf(final ConditionalIfContext ctx) {
        signature.append(IF_END);
    }

    @Override
    public void enterLoop(final LoopContext ctx) {
        signature.append(LOOP_BEGIN);
    }

    @Override
    public void exitLoop(final LoopContext ctx) {
        signature.append(LOOP_END);
    }

    @Override
    public void enterExpression(final ExpressionContext ctx) {
        final TokenStream tokens = parser.getTokenStream();
        final String fullSignature = tokens.getText(ctx);
        if (fullSignature.contains("=") && !fullSignature.contains("==")) {
            signature.append(ASSIGNMENT);
        }
    }

    @Override
    public void enterCreator(final CreatorContext ctx) {
        signature.append(FUNCCALL);
    }

    @Override
    public void exitExpressionList(final ExpressionListContext ctx) {
        signature.append(FUNCCALL);
    }

    public String getSignature() {
        return signature.toString();
    }
}

package parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

public interface MyParseTreeListener extends ParseTreeListener{
	    /**
	     * Enter a parse tree produced by {@link assign2Parser#assign}.
	     * @param ctx the parse tree
	     */
		final JavaParser parser;
    
		public MyParseTreeListener(final JavaParser parser) {
			this.parser = parser;
			
		}
	
	    void enterAssign(MyParseTreeListener.AssignContext ctx);
	    /**
	     * Exit a parse tree produced by {@link assign2Parser#assign}.
	     * @param ctx the parse tree
	     */
	    void exitAssign(MyParseTreeListener.AssignContext ctx);
	    /**
	     * Enter a parse tree produced by {@link assign2Parser#expr}.
	     * @param ctx the parse tree
	     */
	    void enterExpr(MyParseTreeListener.ExprContext ctx);
	    /**
	     * Exit a parse tree produced by {@link assign2Parser#expr}.
	     * @param ctx the parse tree
	     */
	    void exitExpr(MyParseTreeListener.ExprContext ctx);
	
}
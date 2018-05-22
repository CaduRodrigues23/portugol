// Generated from edu\u005Cuezo\portugol\interprete\Portugol.g4 by ANTLR 4.5.1
package edu.uezo.portugol.interprete;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PortugolParser}.
 */
public interface PortugolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PortugolParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(PortugolParser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(PortugolParser.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#sentenca}.
	 * @param ctx the parse tree
	 */
	void enterSentenca(PortugolParser.SentencaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#sentenca}.
	 * @param ctx the parse tree
	 */
	void exitSentenca(PortugolParser.SentencaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#decl_var_r}.
	 * @param ctx the parse tree
	 */
	void enterDecl_var_r(PortugolParser.Decl_var_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#decl_var_r}.
	 * @param ctx the parse tree
	 */
	void exitDecl_var_r(PortugolParser.Decl_var_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#atr_var_r}.
	 * @param ctx the parse tree
	 */
	void enterAtr_var_r(PortugolParser.Atr_var_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#atr_var_r}.
	 * @param ctx the parse tree
	 */
	void exitAtr_var_r(PortugolParser.Atr_var_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#imprima}.
	 * @param ctx the parse tree
	 */
	void enterImprima(PortugolParser.ImprimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#imprima}.
	 * @param ctx the parse tree
	 */
	void exitImprima(PortugolParser.ImprimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#leia_r}.
	 * @param ctx the parse tree
	 */
	void enterLeia_r(PortugolParser.Leia_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#leia_r}.
	 * @param ctx the parse tree
	 */
	void exitLeia_r(PortugolParser.Leia_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(PortugolParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(PortugolParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(PortugolParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(PortugolParser.CondicionalContext ctx);
}
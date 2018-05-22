// Generated from edu\u005Cuezo\portugol\interprete\Portugol.g4 by ANTLR 4.5.1
package edu.uezo.portugol.interprete;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PortugolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PortugolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PortugolParser#algoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgoritmo(PortugolParser.AlgoritmoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugolParser#sentenca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenca(PortugolParser.SentencaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugolParser#decl_var_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_var_r(PortugolParser.Decl_var_rContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugolParser#atr_var_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtr_var_r(PortugolParser.Atr_var_rContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugolParser#imprima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprima(PortugolParser.ImprimaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugolParser#leia_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeia_r(PortugolParser.Leia_rContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugolParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(PortugolParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugolParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(PortugolParser.CondicionalContext ctx);
}
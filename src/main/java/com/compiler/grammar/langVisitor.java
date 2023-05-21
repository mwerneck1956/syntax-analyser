// Generated from lang.g4 by ANTLR 4.8
 
	package com.compiler.grammar;
	import com.compiler.ast.*;

 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link langParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface langVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link langParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(langParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(langParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(langParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(langParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(langParser.ParamsContext ctx);
}
// Generated from D:/@ Abeer @/”‰… —«»⁄…/ﬂÊ„»«Ì·—/Compiler/src\Parser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#pages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPages(Parser.PagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#controller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitController(Parser.ControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#controller_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitController_content(Parser.Controller_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#homePage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHomePage(Parser.HomePageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#page_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage_content(Parser.Page_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(Parser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#header_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_content(Parser.Header_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#footer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooter(Parser.FooterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#footer_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooter_content(Parser.Footer_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#optionsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionsList(Parser.OptionsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(Parser.ButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(Parser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(Parser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(Parser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#body_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_content(Parser.Body_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(Parser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#field_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_content(Parser.Field_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#article}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticle(Parser.ArticleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#article_title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticle_title(Parser.Article_titleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#article_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticle_content(Parser.Article_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#picker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPicker(Parser.PickerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#choices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoices(Parser.ChoicesContext ctx);
}
// Generated from D:/@ Abeer @/”‰… —«»⁄…/ﬂÊ„»«Ì·—/Compiler/src\Parser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#pages}.
	 * @param ctx the parse tree
	 */
	void enterPages(Parser.PagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#pages}.
	 * @param ctx the parse tree
	 */
	void exitPages(Parser.PagesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#controller}.
	 * @param ctx the parse tree
	 */
	void enterController(Parser.ControllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#controller}.
	 * @param ctx the parse tree
	 */
	void exitController(Parser.ControllerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#controller_content}.
	 * @param ctx the parse tree
	 */
	void enterController_content(Parser.Controller_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#controller_content}.
	 * @param ctx the parse tree
	 */
	void exitController_content(Parser.Controller_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#homePage}.
	 * @param ctx the parse tree
	 */
	void enterHomePage(Parser.HomePageContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#homePage}.
	 * @param ctx the parse tree
	 */
	void exitHomePage(Parser.HomePageContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#page_content}.
	 * @param ctx the parse tree
	 */
	void enterPage_content(Parser.Page_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#page_content}.
	 * @param ctx the parse tree
	 */
	void exitPage_content(Parser.Page_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(Parser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(Parser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#header_content}.
	 * @param ctx the parse tree
	 */
	void enterHeader_content(Parser.Header_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#header_content}.
	 * @param ctx the parse tree
	 */
	void exitHeader_content(Parser.Header_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#footer}.
	 * @param ctx the parse tree
	 */
	void enterFooter(Parser.FooterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#footer}.
	 * @param ctx the parse tree
	 */
	void exitFooter(Parser.FooterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#footer_content}.
	 * @param ctx the parse tree
	 */
	void enterFooter_content(Parser.Footer_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#footer_content}.
	 * @param ctx the parse tree
	 */
	void exitFooter_content(Parser.Footer_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#optionsList}.
	 * @param ctx the parse tree
	 */
	void enterOptionsList(Parser.OptionsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#optionsList}.
	 * @param ctx the parse tree
	 */
	void exitOptionsList(Parser.OptionsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#button}.
	 * @param ctx the parse tree
	 */
	void enterButton(Parser.ButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#button}.
	 * @param ctx the parse tree
	 */
	void exitButton(Parser.ButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(Parser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(Parser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(Parser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(Parser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(Parser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(Parser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#body_content}.
	 * @param ctx the parse tree
	 */
	void enterBody_content(Parser.Body_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#body_content}.
	 * @param ctx the parse tree
	 */
	void exitBody_content(Parser.Body_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(Parser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(Parser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#field_content}.
	 * @param ctx the parse tree
	 */
	void enterField_content(Parser.Field_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#field_content}.
	 * @param ctx the parse tree
	 */
	void exitField_content(Parser.Field_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#article}.
	 * @param ctx the parse tree
	 */
	void enterArticle(Parser.ArticleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#article}.
	 * @param ctx the parse tree
	 */
	void exitArticle(Parser.ArticleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#article_title}.
	 * @param ctx the parse tree
	 */
	void enterArticle_title(Parser.Article_titleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#article_title}.
	 * @param ctx the parse tree
	 */
	void exitArticle_title(Parser.Article_titleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#article_content}.
	 * @param ctx the parse tree
	 */
	void enterArticle_content(Parser.Article_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#article_content}.
	 * @param ctx the parse tree
	 */
	void exitArticle_content(Parser.Article_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#picker}.
	 * @param ctx the parse tree
	 */
	void enterPicker(Parser.PickerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#picker}.
	 * @param ctx the parse tree
	 */
	void exitPicker(Parser.PickerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#choices}.
	 * @param ctx the parse tree
	 */
	void enterChoices(Parser.ChoicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#choices}.
	 * @param ctx the parse tree
	 */
	void exitChoices(Parser.ChoicesContext ctx);
}
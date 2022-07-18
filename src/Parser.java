// Generated from D:/@ Abeer @/”‰… —«»⁄…/ﬂÊ„»«Ì·—/Compiler/src\Parser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HOMEPAGE=1, OPEN_CURLY_BRACKET=2, CLOSE_CURLY_BRACKET=3, HEADER=4, SITE_NAME=5, 
		IS=6, FOOTER=7, OPTIONSLIST=8, OPEN_SQUARE_BRACKET=9, CLOSE_SQUARE_BRACKET=10, 
		SEMICOLON=11, BUTTON=12, MYPHONENUMBER=13, MYEMAIL=14, MYACCOUNT=15, DESCRIPTION=16, 
		IMAGE=17, ARTICLE=18, ARTICLE_TITLE=19, ARTICLE_CONTENT=20, PICKER=21, 
		COMMA=22, CHOICES=23, OPEN_BRACKET=24, CLOSE_BRACKET=25, SINGLE_QOUT=26, 
		BODY=27, FIELD=28, NAME=29, PASSWORD=30, EMAIL=31, STRING=32, VARIABLE=33, 
		CONTROLLER=34, CONTROLS=35, OPEN_CURLY_BRACKETS=36, CLOSE_CURLY_BRACKETS=37, 
		CONTACTINFO=38, PHONENUMBER=39;
	public static final int
		RULE_program = 0, RULE_pages = 1, RULE_controller = 2, RULE_controller_content = 3, 
		RULE_homePage = 4, RULE_page_content = 5, RULE_header = 6, RULE_header_content = 7, 
		RULE_footer = 8, RULE_footer_content = 9, RULE_optionsList = 10, RULE_button = 11, 
		RULE_description = 12, RULE_image = 13, RULE_body = 14, RULE_body_content = 15, 
		RULE_field = 16, RULE_field_content = 17, RULE_article = 18, RULE_article_title = 19, 
		RULE_article_content = 20, RULE_picker = 21, RULE_choices = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "pages", "controller", "controller_content", "homePage", "page_content", 
			"header", "header_content", "footer", "footer_content", "optionsList", 
			"button", "description", "image", "body", "body_content", "field", "field_content", 
			"article", "article_title", "article_content", "picker", "choices"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HOMEPAGE", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", "HEADER", 
			"SITE_NAME", "IS", "FOOTER", "OPTIONSLIST", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", 
			"SEMICOLON", "BUTTON", "MYPHONENUMBER", "MYEMAIL", "MYACCOUNT", "DESCRIPTION", 
			"IMAGE", "ARTICLE", "ARTICLE_TITLE", "ARTICLE_CONTENT", "PICKER", "COMMA", 
			"CHOICES", "OPEN_BRACKET", "CLOSE_BRACKET", "SINGLE_QOUT", "BODY", "FIELD", 
			"NAME", "PASSWORD", "EMAIL", "STRING", "VARIABLE", "CONTROLLER", "CONTROLS", 
			"OPEN_CURLY_BRACKETS", "CLOSE_CURLY_BRACKETS", "CONTACTINFO", "PHONENUMBER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public PagesContext pages() {
			return getRuleContext(PagesContext.class,0);
		}
		public List<ControllerContext> controller() {
			return getRuleContexts(ControllerContext.class);
		}
		public ControllerContext controller(int i) {
			return getRuleContext(ControllerContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HOMEPAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				pages();
				}
				break;
			case CONTROLLER:
				enterOuterAlt(_localctx, 2);
				{
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(47);
					controller();
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONTROLLER );
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

	public static class PagesContext extends ParserRuleContext {
		public HomePageContext homePage() {
			return getRuleContext(HomePageContext.class,0);
		}
		public PagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pages; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPages(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPages(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPages(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PagesContext pages() throws RecognitionException {
		PagesContext _localctx = new PagesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pages);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			homePage();
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

	public static class ControllerContext extends ParserRuleContext {
		public TerminalNode CONTROLLER() { return getToken(Parser.CONTROLLER, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(Parser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(Parser.VARIABLE, i);
		}
		public TerminalNode CONTROLS() { return getToken(Parser.CONTROLS, 0); }
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(Parser.OPEN_CURLY_BRACKETS, 0); }
		public Controller_contentContext controller_content() {
			return getRuleContext(Controller_contentContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(Parser.CLOSE_CURLY_BRACKETS, 0); }
		public ControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControllerContext controller() throws RecognitionException {
		ControllerContext _localctx = new ControllerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_controller);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(CONTROLLER);
			setState(57);
			match(VARIABLE);
			setState(58);
			match(CONTROLS);
			setState(59);
			match(VARIABLE);
			setState(60);
			match(OPEN_CURLY_BRACKETS);
			setState(61);
			controller_content();
			setState(62);
			match(CLOSE_CURLY_BRACKETS);
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

	public static class Controller_contentContext extends ParserRuleContext {
		public Controller_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controller_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterController_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitController_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitController_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Controller_contentContext controller_content() throws RecognitionException {
		Controller_contentContext _localctx = new Controller_contentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_controller_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class HomePageContext extends ParserRuleContext {
		public TerminalNode HOMEPAGE() { return getToken(Parser.HOMEPAGE, 0); }
		public TerminalNode VARIABLE() { return getToken(Parser.VARIABLE, 0); }
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(Parser.OPEN_CURLY_BRACKET, 0); }
		public Page_contentContext page_content() {
			return getRuleContext(Page_contentContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(Parser.CLOSE_CURLY_BRACKET, 0); }
		public HomePageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_homePage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterHomePage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitHomePage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitHomePage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HomePageContext homePage() throws RecognitionException {
		HomePageContext _localctx = new HomePageContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_homePage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(HOMEPAGE);
			setState(67);
			match(VARIABLE);
			setState(68);
			match(OPEN_CURLY_BRACKET);
			setState(69);
			page_content();
			setState(70);
			match(CLOSE_CURLY_BRACKET);
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

	public static class Page_contentContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public Page_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPage_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPage_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPage_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Page_contentContext page_content() throws RecognitionException {
		Page_contentContext _localctx = new Page_contentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_page_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			header();
			setState(73);
			body();
			setState(74);
			footer();
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(Parser.HEADER, 0); }
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(Parser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(Parser.CLOSE_CURLY_BRACKET, 0); }
		public List<Header_contentContext> header_content() {
			return getRuleContexts(Header_contentContext.class);
		}
		public Header_contentContext header_content(int i) {
			return getRuleContext(Header_contentContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(HEADER);
			setState(77);
			match(OPEN_CURLY_BRACKET);
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				header_content();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SITE_NAME) | (1L << OPTIONSLIST) | (1L << BUTTON))) != 0) );
			setState(83);
			match(CLOSE_CURLY_BRACKET);
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

	public static class Header_contentContext extends ParserRuleContext {
		public TerminalNode SITE_NAME() { return getToken(Parser.SITE_NAME, 0); }
		public TerminalNode VARIABLE() { return getToken(Parser.VARIABLE, 0); }
		public TerminalNode IS() { return getToken(Parser.IS, 0); }
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parser.SEMICOLON, 0); }
		public OptionsListContext optionsList() {
			return getRuleContext(OptionsListContext.class,0);
		}
		public ButtonContext button() {
			return getRuleContext(ButtonContext.class,0);
		}
		public Header_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterHeader_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitHeader_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitHeader_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header_contentContext header_content() throws RecognitionException {
		Header_contentContext _localctx = new Header_contentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_header_content);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SITE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(SITE_NAME);
				setState(86);
				match(VARIABLE);
				setState(87);
				match(IS);
				setState(88);
				match(STRING);
				setState(89);
				match(SEMICOLON);
				}
				break;
			case OPTIONSLIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				optionsList();
				setState(91);
				match(SEMICOLON);
				}
				break;
			case BUTTON:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				button();
				setState(94);
				match(SEMICOLON);
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

	public static class FooterContext extends ParserRuleContext {
		public TerminalNode FOOTER() { return getToken(Parser.FOOTER, 0); }
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(Parser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(Parser.CLOSE_CURLY_BRACKET, 0); }
		public List<Footer_contentContext> footer_content() {
			return getRuleContexts(Footer_contentContext.class);
		}
		public Footer_contentContext footer_content(int i) {
			return getRuleContext(Footer_contentContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parser.SEMICOLON, i);
		}
		public FooterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFooter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFooter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFooter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterContext footer() throws RecognitionException {
		FooterContext _localctx = new FooterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_footer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(FOOTER);
			setState(99);
			match(OPEN_CURLY_BRACKET);
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				footer_content();
				setState(101);
				match(SEMICOLON);
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONTACTINFO );
			setState(107);
			match(CLOSE_CURLY_BRACKET);
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

	public static class Footer_contentContext extends ParserRuleContext {
		public TerminalNode CONTACTINFO() { return getToken(Parser.CONTACTINFO, 0); }
		public TerminalNode VARIABLE() { return getToken(Parser.VARIABLE, 0); }
		public TerminalNode IS() { return getToken(Parser.IS, 0); }
		public List<TerminalNode> SINGLE_QOUT() { return getTokens(Parser.SINGLE_QOUT); }
		public TerminalNode SINGLE_QOUT(int i) {
			return getToken(Parser.SINGLE_QOUT, i);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode PHONENUMBER() { return getToken(Parser.PHONENUMBER, 0); }
		public TerminalNode EMAIL() { return getToken(Parser.EMAIL, 0); }
		public Footer_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footer_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFooter_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFooter_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFooter_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Footer_contentContext footer_content() throws RecognitionException {
		Footer_contentContext _localctx = new Footer_contentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_footer_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(CONTACTINFO);
			setState(110);
			match(VARIABLE);
			setState(111);
			match(IS);
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QOUT:
				{
				setState(112);
				match(SINGLE_QOUT);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EMAIL || _la==PHONENUMBER) {
					{
					setState(113);
					_la = _input.LA(1);
					if ( !(_la==EMAIL || _la==PHONENUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(116);
				match(SINGLE_QOUT);
				}
				break;
			case DESCRIPTION:
				{
				setState(117);
				description();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OptionsListContext extends ParserRuleContext {
		public TerminalNode OPTIONSLIST() { return getToken(Parser.OPTIONSLIST, 0); }
		public TerminalNode VARIABLE() { return getToken(Parser.VARIABLE, 0); }
		public TerminalNode IS() { return getToken(Parser.IS, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Parser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Parser.CLOSE_SQUARE_BRACKET, 0); }
		public List<TerminalNode> STRING() { return getTokens(Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(Parser.STRING, i);
		}
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(Parser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(Parser.OPEN_BRACKET, i);
		}
		public List<ImageContext> image() {
			return getRuleContexts(ImageContext.class);
		}
		public ImageContext image(int i) {
			return getRuleContext(ImageContext.class,i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(Parser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(Parser.CLOSE_BRACKET, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public OptionsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterOptionsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitOptionsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitOptionsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionsListContext optionsList() throws RecognitionException {
		OptionsListContext _localctx = new OptionsListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_optionsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(OPTIONSLIST);
			setState(121);
			match(VARIABLE);
			setState(122);
			match(IS);
			setState(123);
			match(OPEN_SQUARE_BRACKET);
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(124);
				match(STRING);
				}
				break;
			case OPEN_BRACKET:
				{
				setState(125);
				match(OPEN_BRACKET);
				setState(126);
				image();
				setState(127);
				match(CLOSE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131);
				match(COMMA);
				setState(137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(132);
					match(STRING);
					}
					break;
				case OPEN_BRACKET:
					{
					setState(133);
					match(OPEN_BRACKET);
					setState(134);
					image();
					setState(135);
					match(CLOSE_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(CLOSE_SQUARE_BRACKET);
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

	public static class ButtonContext extends ParserRuleContext {
		public TerminalNode BUTTON() { return getToken(Parser.BUTTON, 0); }
		public TerminalNode VARIABLE() { return getToken(Parser.VARIABLE, 0); }
		public TerminalNode IS() { return getToken(Parser.IS, 0); }
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public ButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonContext button() throws RecognitionException {
		ButtonContext _localctx = new ButtonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_button);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(BUTTON);
			setState(147);
			match(VARIABLE);
			setState(148);
			match(IS);
			setState(149);
			match(STRING);
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

	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode DESCRIPTION() { return getToken(Parser.DESCRIPTION, 0); }
		public TerminalNode IS() { return getToken(Parser.IS, 0); }
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(DESCRIPTION);
			setState(152);
			match(IS);
			setState(153);
			match(STRING);
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

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGE() { return getToken(Parser.IMAGE, 0); }
		public TerminalNode VARIABLE() { return getToken(Parser.VARIABLE, 0); }
		public TerminalNode IS() { return getToken(Parser.IS, 0); }
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(IMAGE);
			setState(156);
			match(VARIABLE);
			setState(157);
			match(IS);
			setState(158);
			match(STRING);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(Parser.BODY, 0); }
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(Parser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(Parser.CLOSE_CURLY_BRACKET, 0); }
		public List<ArticleContext> article() {
			return getRuleContexts(ArticleContext.class);
		}
		public ArticleContext article(int i) {
			return getRuleContext(ArticleContext.class,i);
		}
		public List<Body_contentContext> body_content() {
			return getRuleContexts(Body_contentContext.class);
		}
		public Body_contentContext body_content(int i) {
			return getRuleContext(Body_contentContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parser.SEMICOLON, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(BODY);
			setState(161);
			match(OPEN_CURLY_BRACKET);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTIONSLIST) | (1L << DESCRIPTION) | (1L << IMAGE) | (1L << ARTICLE) | (1L << PICKER) | (1L << CHOICES) | (1L << FIELD))) != 0)) {
				{
				setState(166);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ARTICLE:
					{
					setState(162);
					article();
					}
					break;
				case OPTIONSLIST:
				case DESCRIPTION:
				case IMAGE:
				case PICKER:
				case CHOICES:
				case FIELD:
					{
					setState(163);
					body_content();
					setState(164);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(CLOSE_CURLY_BRACKET);
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

	public static class Body_contentContext extends ParserRuleContext {
		public OptionsListContext optionsList() {
			return getRuleContext(OptionsListContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public PickerContext picker() {
			return getRuleContext(PickerContext.class,0);
		}
		public ChoicesContext choices() {
			return getRuleContext(ChoicesContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Body_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterBody_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitBody_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBody_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_contentContext body_content() throws RecognitionException {
		Body_contentContext _localctx = new Body_contentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_body_content);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONSLIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				optionsList();
				}
				break;
			case DESCRIPTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				description();
				}
				break;
			case PICKER:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				picker();
				}
				break;
			case CHOICES:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				choices();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				image();
				}
				break;
			case FIELD:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				field();
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(Parser.FIELD, 0); }
		public TerminalNode VARIABLE() { return getToken(Parser.VARIABLE, 0); }
		public TerminalNode IS() { return getToken(Parser.IS, 0); }
		public Field_contentContext field_content() {
			return getRuleContext(Field_contentContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(FIELD);
			setState(182);
			match(VARIABLE);
			setState(183);
			match(IS);
			setState(184);
			field_content();
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

	public static class Field_contentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(Parser.NAME, 0); }
		public TerminalNode PASSWORD() { return getToken(Parser.PASSWORD, 0); }
		public TerminalNode EMAIL() { return getToken(Parser.EMAIL, 0); }
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public Field_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterField_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitField_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitField_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_contentContext field_content() throws RecognitionException {
		Field_contentContext _localctx = new Field_contentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_field_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << PASSWORD) | (1L << EMAIL) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ArticleContext extends ParserRuleContext {
		public TerminalNode ARTICLE() { return getToken(Parser.ARTICLE, 0); }
		public TerminalNode VARIABLE() { return getToken(Parser.VARIABLE, 0); }
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(Parser.OPEN_CURLY_BRACKET, 0); }
		public Article_titleContext article_title() {
			return getRuleContext(Article_titleContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(Parser.CLOSE_CURLY_BRACKET, 0); }
		public List<Article_contentContext> article_content() {
			return getRuleContexts(Article_contentContext.class);
		}
		public Article_contentContext article_content(int i) {
			return getRuleContext(Article_contentContext.class,i);
		}
		public ArticleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_article; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArticle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArticle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArticle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArticleContext article() throws RecognitionException {
		ArticleContext _localctx = new ArticleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_article);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ARTICLE);
			setState(189);
			match(VARIABLE);
			setState(190);
			match(OPEN_CURLY_BRACKET);
			setState(191);
			article_title();
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(192);
				article_content();
				}
				}
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ARTICLE_CONTENT );
			setState(197);
			match(CLOSE_CURLY_BRACKET);
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

	public static class Article_titleContext extends ParserRuleContext {
		public TerminalNode ARTICLE_TITLE() { return getToken(Parser.ARTICLE_TITLE, 0); }
		public TerminalNode VARIABLE() { return getToken(Parser.VARIABLE, 0); }
		public TerminalNode IS() { return getToken(Parser.IS, 0); }
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parser.SEMICOLON, 0); }
		public Article_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_article_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArticle_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArticle_title(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArticle_title(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Article_titleContext article_title() throws RecognitionException {
		Article_titleContext _localctx = new Article_titleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_article_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ARTICLE_TITLE);
			setState(200);
			match(VARIABLE);
			setState(201);
			match(IS);
			setState(202);
			match(STRING);
			setState(203);
			match(SEMICOLON);
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

	public static class Article_contentContext extends ParserRuleContext {
		public TerminalNode ARTICLE_CONTENT() { return getToken(Parser.ARTICLE_CONTENT, 0); }
		public TerminalNode VARIABLE() { return getToken(Parser.VARIABLE, 0); }
		public TerminalNode IS() { return getToken(Parser.IS, 0); }
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parser.SEMICOLON, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Parser.OPEN_SQUARE_BRACKET, 0); }
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(Parser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(Parser.OPEN_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(Parser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(Parser.CLOSE_BRACKET, i);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Parser.CLOSE_SQUARE_BRACKET, 0); }
		public List<ImageContext> image() {
			return getRuleContexts(ImageContext.class);
		}
		public ImageContext image(int i) {
			return getRuleContext(ImageContext.class,i);
		}
		public List<DescriptionContext> description() {
			return getRuleContexts(DescriptionContext.class);
		}
		public DescriptionContext description(int i) {
			return getRuleContext(DescriptionContext.class,i);
		}
		public List<OptionsListContext> optionsList() {
			return getRuleContexts(OptionsListContext.class);
		}
		public OptionsListContext optionsList(int i) {
			return getRuleContext(OptionsListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public Article_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_article_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArticle_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArticle_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArticle_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Article_contentContext article_content() throws RecognitionException {
		Article_contentContext _localctx = new Article_contentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_article_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ARTICLE_CONTENT);
			setState(206);
			match(VARIABLE);
			setState(207);
			match(IS);
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(208);
				match(STRING);
				setState(209);
				match(SEMICOLON);
				}
				break;
			case OPEN_SQUARE_BRACKET:
				{
				setState(210);
				match(OPEN_SQUARE_BRACKET);
				setState(211);
				match(OPEN_BRACKET);
				setState(221);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMAGE:
					{
					setState(212);
					image();
					setState(213);
					match(SEMICOLON);
					}
					break;
				case DESCRIPTION:
					{
					setState(215);
					description();
					setState(216);
					match(SEMICOLON);
					}
					break;
				case OPTIONSLIST:
					{
					setState(218);
					optionsList();
					setState(219);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(223);
				match(CLOSE_BRACKET);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(224);
					match(COMMA);
					setState(225);
					match(OPEN_BRACKET);
					setState(229);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IMAGE:
						{
						setState(226);
						image();
						}
						break;
					case DESCRIPTION:
						{
						setState(227);
						description();
						}
						break;
					case OPTIONSLIST:
						{
						setState(228);
						optionsList();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(231);
					match(CLOSE_BRACKET);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PickerContext extends ParserRuleContext {
		public TerminalNode PICKER() { return getToken(Parser.PICKER, 0); }
		public TerminalNode VARIABLE() { return getToken(Parser.VARIABLE, 0); }
		public TerminalNode IS() { return getToken(Parser.IS, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Parser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Parser.CLOSE_SQUARE_BRACKET, 0); }
		public List<TerminalNode> STRING() { return getTokens(Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(Parser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public PickerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_picker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPicker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPicker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPicker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PickerContext picker() throws RecognitionException {
		PickerContext _localctx = new PickerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_picker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(PICKER);
			setState(243);
			match(VARIABLE);
			setState(244);
			match(IS);
			setState(245);
			match(OPEN_SQUARE_BRACKET);
			{
			setState(246);
			match(STRING);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(247);
				match(COMMA);
				setState(248);
				match(STRING);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(254);
			match(CLOSE_SQUARE_BRACKET);
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

	public static class ChoicesContext extends ParserRuleContext {
		public TerminalNode CHOICES() { return getToken(Parser.CHOICES, 0); }
		public TerminalNode VARIABLE() { return getToken(Parser.VARIABLE, 0); }
		public TerminalNode IS() { return getToken(Parser.IS, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Parser.OPEN_SQUARE_BRACKET, 0); }
		public List<TerminalNode> STRING() { return getTokens(Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(Parser.STRING, i);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Parser.CLOSE_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ChoicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterChoices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitChoices(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitChoices(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoicesContext choices() throws RecognitionException {
		ChoicesContext _localctx = new ChoicesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_choices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(CHOICES);
			setState(257);
			match(VARIABLE);
			setState(258);
			match(IS);
			setState(259);
			match(OPEN_SQUARE_BRACKET);
			setState(260);
			match(STRING);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(261);
				match(COMMA);
				setState(262);
				match(STRING);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(CLOSE_SQUARE_BRACKET);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\6"+
		"\2\63\n\2\r\2\16\2\64\5\2\67\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\6\bR\n"+
		"\b\r\b\16\bS\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tc"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\6\nj\n\n\r\n\16\nk\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\5\13u\n\13\3\13\3\13\5\13y\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0084\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008c\n\f\7\f\u008e\n\f"+
		"\f\f\16\f\u0091\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a9\n\20"+
		"\f\20\16\20\u00ac\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b6"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\6\24"+
		"\u00c4\n\24\r\24\16\24\u00c5\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u00e0\n\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e8\n\26"+
		"\3\26\3\26\7\26\u00ec\n\26\f\26\16\26\u00ef\13\26\3\26\3\26\5\26\u00f3"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00fc\n\27\f\27\16\27\u00ff"+
		"\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u010a\n\30\f"+
		"\30\16\30\u010d\13\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\2\4\4\2!!))\3\2\37\"\2\u0114\2\66\3\2\2\2\48\3\2"+
		"\2\2\6:\3\2\2\2\bB\3\2\2\2\nD\3\2\2\2\fJ\3\2\2\2\16N\3\2\2\2\20b\3\2\2"+
		"\2\22d\3\2\2\2\24o\3\2\2\2\26z\3\2\2\2\30\u0094\3\2\2\2\32\u0099\3\2\2"+
		"\2\34\u009d\3\2\2\2\36\u00a2\3\2\2\2 \u00b5\3\2\2\2\"\u00b7\3\2\2\2$\u00bc"+
		"\3\2\2\2&\u00be\3\2\2\2(\u00c9\3\2\2\2*\u00cf\3\2\2\2,\u00f4\3\2\2\2."+
		"\u0102\3\2\2\2\60\67\5\4\3\2\61\63\5\6\4\2\62\61\3\2\2\2\63\64\3\2\2\2"+
		"\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\60\3\2\2\2\66\62\3\2\2\2"+
		"\67\3\3\2\2\289\5\n\6\29\5\3\2\2\2:;\7$\2\2;<\7#\2\2<=\7%\2\2=>\7#\2\2"+
		">?\7&\2\2?@\5\b\5\2@A\7\'\2\2A\7\3\2\2\2BC\3\2\2\2C\t\3\2\2\2DE\7\3\2"+
		"\2EF\7#\2\2FG\7\4\2\2GH\5\f\7\2HI\7\5\2\2I\13\3\2\2\2JK\5\16\b\2KL\5\36"+
		"\20\2LM\5\22\n\2M\r\3\2\2\2NO\7\6\2\2OQ\7\4\2\2PR\5\20\t\2QP\3\2\2\2R"+
		"S\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\5\2\2V\17\3\2\2\2WX\7\7\2"+
		"\2XY\7#\2\2YZ\7\b\2\2Z[\7\"\2\2[c\7\r\2\2\\]\5\26\f\2]^\7\r\2\2^c\3\2"+
		"\2\2_`\5\30\r\2`a\7\r\2\2ac\3\2\2\2bW\3\2\2\2b\\\3\2\2\2b_\3\2\2\2c\21"+
		"\3\2\2\2de\7\t\2\2ei\7\4\2\2fg\5\24\13\2gh\7\r\2\2hj\3\2\2\2if\3\2\2\2"+
		"jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\5\2\2n\23\3\2\2\2op\7(\2"+
		"\2pq\7#\2\2qx\7\b\2\2rt\7\34\2\2su\t\2\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2"+
		"\2vy\7\34\2\2wy\5\32\16\2xr\3\2\2\2xw\3\2\2\2y\25\3\2\2\2z{\7\n\2\2{|"+
		"\7#\2\2|}\7\b\2\2}\u0083\7\13\2\2~\u0084\7\"\2\2\177\u0080\7\32\2\2\u0080"+
		"\u0081\5\34\17\2\u0081\u0082\7\33\2\2\u0082\u0084\3\2\2\2\u0083~\3\2\2"+
		"\2\u0083\177\3\2\2\2\u0084\u008f\3\2\2\2\u0085\u008b\7\30\2\2\u0086\u008c"+
		"\7\"\2\2\u0087\u0088\7\32\2\2\u0088\u0089\5\34\17\2\u0089\u008a\7\33\2"+
		"\2\u008a\u008c\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008c\u008e"+
		"\3\2\2\2\u008d\u0085\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\f"+
		"\2\2\u0093\27\3\2\2\2\u0094\u0095\7\16\2\2\u0095\u0096\7#\2\2\u0096\u0097"+
		"\7\b\2\2\u0097\u0098\7\"\2\2\u0098\31\3\2\2\2\u0099\u009a\7\22\2\2\u009a"+
		"\u009b\7\b\2\2\u009b\u009c\7\"\2\2\u009c\33\3\2\2\2\u009d\u009e\7\23\2"+
		"\2\u009e\u009f\7#\2\2\u009f\u00a0\7\b\2\2\u00a0\u00a1\7\"\2\2\u00a1\35"+
		"\3\2\2\2\u00a2\u00a3\7\35\2\2\u00a3\u00aa\7\4\2\2\u00a4\u00a9\5&\24\2"+
		"\u00a5\u00a6\5 \21\2\u00a6\u00a7\7\r\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4"+
		"\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\5"+
		"\2\2\u00ae\37\3\2\2\2\u00af\u00b6\5\26\f\2\u00b0\u00b6\5\32\16\2\u00b1"+
		"\u00b6\5,\27\2\u00b2\u00b6\5.\30\2\u00b3\u00b6\5\34\17\2\u00b4\u00b6\5"+
		"\"\22\2\u00b5\u00af\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5"+
		"\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6!\3\2\2\2"+
		"\u00b7\u00b8\7\36\2\2\u00b8\u00b9\7#\2\2\u00b9\u00ba\7\b\2\2\u00ba\u00bb"+
		"\5$\23\2\u00bb#\3\2\2\2\u00bc\u00bd\t\3\2\2\u00bd%\3\2\2\2\u00be\u00bf"+
		"\7\24\2\2\u00bf\u00c0\7#\2\2\u00c0\u00c1\7\4\2\2\u00c1\u00c3\5(\25\2\u00c2"+
		"\u00c4\5*\26\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\5\2\2\u00c8"+
		"\'\3\2\2\2\u00c9\u00ca\7\25\2\2\u00ca\u00cb\7#\2\2\u00cb\u00cc\7\b\2\2"+
		"\u00cc\u00cd\7\"\2\2\u00cd\u00ce\7\r\2\2\u00ce)\3\2\2\2\u00cf\u00d0\7"+
		"\26\2\2\u00d0\u00d1\7#\2\2\u00d1\u00f2\7\b\2\2\u00d2\u00d3\7\"\2\2\u00d3"+
		"\u00f3\7\r\2\2\u00d4\u00d5\7\13\2\2\u00d5\u00df\7\32\2\2\u00d6\u00d7\5"+
		"\34\17\2\u00d7\u00d8\7\r\2\2\u00d8\u00e0\3\2\2\2\u00d9\u00da\5\32\16\2"+
		"\u00da\u00db\7\r\2\2\u00db\u00e0\3\2\2\2\u00dc\u00dd\5\26\f\2\u00dd\u00de"+
		"\7\r\2\2\u00de\u00e0\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d9\3\2\2\2\u00df"+
		"\u00dc\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00ed\7\33\2\2\u00e2\u00e3\7"+
		"\30\2\2\u00e3\u00e7\7\32\2\2\u00e4\u00e8\5\34\17\2\u00e5\u00e8\5\32\16"+
		"\2\u00e6\u00e8\5\26\f\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\33\2\2\u00ea\u00ec\3"+
		"\2\2\2\u00eb\u00e2\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\f"+
		"\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00d2\3\2\2\2\u00f2\u00d4\3\2\2\2\u00f3"+
		"+\3\2\2\2\u00f4\u00f5\7\27\2\2\u00f5\u00f6\7#\2\2\u00f6\u00f7\7\b\2\2"+
		"\u00f7\u00f8\7\13\2\2\u00f8\u00fd\7\"\2\2\u00f9\u00fa\7\30\2\2\u00fa\u00fc"+
		"\7\"\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\f"+
		"\2\2\u0101-\3\2\2\2\u0102\u0103\7\31\2\2\u0103\u0104\7#\2\2\u0104\u0105"+
		"\7\b\2\2\u0105\u0106\7\13\2\2\u0106\u010b\7\"\2\2\u0107\u0108\7\30\2\2"+
		"\u0108\u010a\7\"\2\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\7\f\2\2\u010f/\3\2\2\2\26\64\66Sbktx\u0083\u008b\u008f\u00a8\u00aa"+
		"\u00b5\u00c5\u00df\u00e7\u00ed\u00f2\u00fd\u010b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
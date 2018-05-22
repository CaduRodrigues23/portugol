// Generated from edu\u005Cuezo\portugol\interprete\Portugol.g4 by ANTLR 4.5.1
package edu.uezo.portugol.interprete;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PortugolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO=1, REAL=2, INTEIRO=3, CARACTER=4, BOOLEANO=5, IMPRIMA=6, LEIA=7, 
		SE=8, ENTAO=9, SENAO=10, FIMSE=11, FIM=12, SOMA=13, SUB=14, MULT=15, DIV=16, 
		E=17, OU=18, NAO=19, MAIOR=20, MENOR=21, MAIORIGUAL=22, MENORIGUAL=23, 
		IGUAL=24, DIFERENTE=25, ATRIB=26, PAREN_ABRE=27, PAREN_FECHA=28, ASPAS=29, 
		PONTO_VIRGULA=30, BOOL=31, ID=32, NUM_FLUT=33, NUM=34, TXT=35, ESPACO=36;
	public static final int
		RULE_algoritmo = 0, RULE_sentenca = 1, RULE_decl_var_r = 2, RULE_atr_var_r = 3, 
		RULE_imprima = 4, RULE_leia_r = 5, RULE_expressao = 6, RULE_condicional = 7;
	public static final String[] ruleNames = {
		"algoritmo", "sentenca", "decl_var_r", "atr_var_r", "imprima", "leia_r", 
		"expressao", "condicional"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'inicio'", "'real'", "'inteiro'", "'caracter'", "'booleano'", "'imprima'", 
		"'leia'", "'se'", "'entao'", "'senao'", "'fimse'", "'fim.'", "'+'", "'-'", 
		"'*'", "'/'", "'E'", "'OU'", "'NAO'", "'>'", "'<'", "'>='", "'<='", "'=='", 
		"'!='", "':='", "'('", "')'", "'\"'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INICIO", "REAL", "INTEIRO", "CARACTER", "BOOLEANO", "IMPRIMA", 
		"LEIA", "SE", "ENTAO", "SENAO", "FIMSE", "FIM", "SOMA", "SUB", "MULT", 
		"DIV", "E", "OU", "NAO", "MAIOR", "MENOR", "MAIORIGUAL", "MENORIGUAL", 
		"IGUAL", "DIFERENTE", "ATRIB", "PAREN_ABRE", "PAREN_FECHA", "ASPAS", "PONTO_VIRGULA", 
		"BOOL", "ID", "NUM_FLUT", "NUM", "TXT", "ESPACO"
	};
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
	public String getGrammarFileName() { return "Portugol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PortugolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AlgoritmoContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(PortugolParser.INICIO, 0); }
		public TerminalNode FIM() { return getToken(PortugolParser.FIM, 0); }
		public List<SentencaContext> sentenca() {
			return getRuleContexts(SentencaContext.class);
		}
		public SentencaContext sentenca(int i) {
			return getRuleContext(SentencaContext.class,i);
		}
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitAlgoritmo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAlgoritmo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_algoritmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(INICIO);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << IMPRIMA) | (1L << LEIA) | (1L << SE) | (1L << ID))) != 0)) {
				{
				{
				setState(17);
				sentenca();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			match(FIM);
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

	public static class SentencaContext extends ParserRuleContext {
		public Decl_var_rContext decl_var_r() {
			return getRuleContext(Decl_var_rContext.class,0);
		}
		public Atr_var_rContext atr_var_r() {
			return getRuleContext(Atr_var_rContext.class,0);
		}
		public ImprimaContext imprima() {
			return getRuleContext(ImprimaContext.class,0);
		}
		public Leia_rContext leia_r() {
			return getRuleContext(Leia_rContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public SentencaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterSentenca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitSentenca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitSentenca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentencaContext sentenca() throws RecognitionException {
		SentencaContext _localctx = new SentencaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentenca);
		try {
			setState(30);
			switch (_input.LA(1)) {
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				decl_var_r();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				atr_var_r();
				}
				break;
			case IMPRIMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				imprima();
				}
				break;
			case LEIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				leia_r();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 5);
				{
				setState(29);
				condicional();
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

	public static class Decl_var_rContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(PortugolParser.REAL, 0); }
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(PortugolParser.PONTO_VIRGULA, 0); }
		public Decl_var_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_var_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDecl_var_r(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDecl_var_r(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDecl_var_r(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_var_rContext decl_var_r() throws RecognitionException {
		Decl_var_rContext _localctx = new Decl_var_rContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_var_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(REAL);
			setState(33);
			match(ID);
			setState(34);
			match(PONTO_VIRGULA);
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

	public static class Atr_var_rContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(PortugolParser.ATRIB, 0); }
		public TerminalNode NUM_FLUT() { return getToken(PortugolParser.NUM_FLUT, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(PortugolParser.PONTO_VIRGULA, 0); }
		public Atr_var_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr_var_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterAtr_var_r(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitAtr_var_r(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtr_var_r(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atr_var_rContext atr_var_r() throws RecognitionException {
		Atr_var_rContext _localctx = new Atr_var_rContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atr_var_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ID);
			setState(37);
			match(ATRIB);
			setState(38);
			match(NUM_FLUT);
			setState(39);
			match(PONTO_VIRGULA);
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

	public static class ImprimaContext extends ParserRuleContext {
		public TerminalNode IMPRIMA() { return getToken(PortugolParser.IMPRIMA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(PortugolParser.PONTO_VIRGULA, 0); }
		public ImprimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterImprima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitImprima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitImprima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimaContext imprima() throws RecognitionException {
		ImprimaContext _localctx = new ImprimaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_imprima);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(IMPRIMA);
			setState(42);
			expressao();
			setState(43);
			match(PONTO_VIRGULA);
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

	public static class Leia_rContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(PortugolParser.LEIA, 0); }
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(PortugolParser.PONTO_VIRGULA, 0); }
		public Leia_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leia_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterLeia_r(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitLeia_r(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitLeia_r(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leia_rContext leia_r() throws RecognitionException {
		Leia_rContext _localctx = new Leia_rContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_leia_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(LEIA);
			setState(46);
			match(ID);
			setState(47);
			match(PONTO_VIRGULA);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Object valor;
		public Token TXT;
		public Token NUM;
		public Token NUM_FLUT;
		public Token ID;
		public TerminalNode TXT() { return getToken(PortugolParser.TXT, 0); }
		public TerminalNode NUM() { return getToken(PortugolParser.NUM, 0); }
		public TerminalNode NUM_FLUT() { return getToken(PortugolParser.NUM_FLUT, 0); }
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressao);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case TXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				((ExpressaoContext)_localctx).TXT = match(TXT);
				((ExpressaoContext)_localctx).valor =  (((ExpressaoContext)_localctx).TXT!=null?((ExpressaoContext)_localctx).TXT.getText():null);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				((ExpressaoContext)_localctx).NUM = match(NUM);
				((ExpressaoContext)_localctx).valor =  Integer.parseInt((((ExpressaoContext)_localctx).NUM!=null?((ExpressaoContext)_localctx).NUM.getText():null));
				}
				break;
			case NUM_FLUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				((ExpressaoContext)_localctx).NUM_FLUT = match(NUM_FLUT);
				((ExpressaoContext)_localctx).valor =  Double.parseDouble((((ExpressaoContext)_localctx).NUM_FLUT!=null?((ExpressaoContext)_localctx).NUM_FLUT.getText():null));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				((ExpressaoContext)_localctx).ID = match(ID);
				((ExpressaoContext)_localctx).valor =  (((ExpressaoContext)_localctx).ID!=null?((ExpressaoContext)_localctx).ID.getText():null);
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(PortugolParser.SE, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(PortugolParser.PAREN_ABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PAREN_FECHA() { return getToken(PortugolParser.PAREN_FECHA, 0); }
		public TerminalNode ENTAO() { return getToken(PortugolParser.ENTAO, 0); }
		public TerminalNode SENAO() { return getToken(PortugolParser.SENAO, 0); }
		public TerminalNode FIMSE() { return getToken(PortugolParser.FIMSE, 0); }
		public List<SentencaContext> sentenca() {
			return getRuleContexts(SentencaContext.class);
		}
		public SentencaContext sentenca(int i) {
			return getRuleContext(SentencaContext.class,i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(SE);
			setState(60);
			match(PAREN_ABRE);
			setState(61);
			expressao();
			setState(62);
			match(PAREN_FECHA);
			setState(63);
			match(ENTAO);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << IMPRIMA) | (1L << LEIA) | (1L << SE) | (1L << ID))) != 0)) {
				{
				{
				setState(64);
				sentenca();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(SENAO);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << IMPRIMA) | (1L << LEIA) | (1L << SE) | (1L << ID))) != 0)) {
				{
				{
				setState(71);
				sentenca();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(FIMSE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&R\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25\n\2\f"+
		"\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b<\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tD\n\t\f\t\16\tG\13\t"+
		"\3\t\3\t\7\tK\n\t\f\t\16\tN\13\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2"+
		"\2S\2\22\3\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\b&\3\2\2\2\n+\3\2\2\2\f/\3\2\2"+
		"\2\16;\3\2\2\2\20=\3\2\2\2\22\26\7\3\2\2\23\25\5\4\3\2\24\23\3\2\2\2\25"+
		"\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31"+
		"\32\7\16\2\2\32\3\3\2\2\2\33!\5\6\4\2\34!\5\b\5\2\35!\5\n\6\2\36!\5\f"+
		"\7\2\37!\5\20\t\2 \33\3\2\2\2 \34\3\2\2\2 \35\3\2\2\2 \36\3\2\2\2 \37"+
		"\3\2\2\2!\5\3\2\2\2\"#\7\4\2\2#$\7\"\2\2$%\7 \2\2%\7\3\2\2\2&\'\7\"\2"+
		"\2\'(\7\34\2\2()\7#\2\2)*\7 \2\2*\t\3\2\2\2+,\7\b\2\2,-\5\16\b\2-.\7 "+
		"\2\2.\13\3\2\2\2/\60\7\t\2\2\60\61\7\"\2\2\61\62\7 \2\2\62\r\3\2\2\2\63"+
		"\64\7%\2\2\64<\b\b\1\2\65\66\7$\2\2\66<\b\b\1\2\678\7#\2\28<\b\b\1\29"+
		":\7\"\2\2:<\b\b\1\2;\63\3\2\2\2;\65\3\2\2\2;\67\3\2\2\2;9\3\2\2\2<\17"+
		"\3\2\2\2=>\7\n\2\2>?\7\35\2\2?@\5\16\b\2@A\7\36\2\2AE\7\13\2\2BD\5\4\3"+
		"\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HL\7\f\2"+
		"\2IK\5\4\3\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2"+
		"\2OP\7\r\2\2P\21\3\2\2\2\7\26 ;EL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
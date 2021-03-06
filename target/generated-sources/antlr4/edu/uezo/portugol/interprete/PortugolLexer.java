// Generated from edu\u005Cuezo\portugol\interprete\Portugol.g4 by ANTLR 4.5.1
package edu.uezo.portugol.interprete;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PortugolLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INICIO", "REAL", "INTEIRO", "CARACTER", "BOOLEANO", "IMPRIMA", "LEIA", 
		"SE", "ENTAO", "SENAO", "FIMSE", "FIM", "SOMA", "SUB", "MULT", "DIV", 
		"E", "OU", "NAO", "MAIOR", "MENOR", "MAIORIGUAL", "MENORIGUAL", "IGUAL", 
		"DIFERENTE", "ATRIB", "PAREN_ABRE", "PAREN_FECHA", "ASPAS", "PONTO_VIRGULA", 
		"BOOL", "ID", "NUM_FLUT", "NUM", "TXT", "ESPACO"
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


	public PortugolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Portugol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u00fd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00d4\n \3!\3!\7"+
		"!\u00d8\n!\f!\16!\u00db\13!\3\"\6\"\u00de\n\"\r\"\16\"\u00df\3\"\3\"\7"+
		"\"\u00e4\n\"\f\"\16\"\u00e7\13\"\3#\6#\u00ea\n#\r#\16#\u00eb\3$\3$\7$"+
		"\u00f0\n$\f$\16$\u00f3\13$\3$\3$\3%\6%\u00f8\n%\r%\16%\u00f9\3%\3%\2\2"+
		"&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\7\2\"\"\62;C\\"+
		"aac|\5\2\13\f\17\17\"\"\u0103\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5R\3\2\2\2\7W\3"+
		"\2\2\2\t_\3\2\2\2\13h\3\2\2\2\rq\3\2\2\2\17y\3\2\2\2\21~\3\2\2\2\23\u0081"+
		"\3\2\2\2\25\u0087\3\2\2\2\27\u008d\3\2\2\2\31\u0093\3\2\2\2\33\u0098\3"+
		"\2\2\2\35\u009a\3\2\2\2\37\u009c\3\2\2\2!\u009e\3\2\2\2#\u00a0\3\2\2\2"+
		"%\u00a2\3\2\2\2\'\u00a5\3\2\2\2)\u00a9\3\2\2\2+\u00ab\3\2\2\2-\u00ad\3"+
		"\2\2\2/\u00b0\3\2\2\2\61\u00b3\3\2\2\2\63\u00b6\3\2\2\2\65\u00b9\3\2\2"+
		"\2\67\u00bc\3\2\2\29\u00be\3\2\2\2;\u00c0\3\2\2\2=\u00c2\3\2\2\2?\u00d3"+
		"\3\2\2\2A\u00d5\3\2\2\2C\u00dd\3\2\2\2E\u00e9\3\2\2\2G\u00ed\3\2\2\2I"+
		"\u00f7\3\2\2\2KL\7k\2\2LM\7p\2\2MN\7k\2\2NO\7e\2\2OP\7k\2\2PQ\7q\2\2Q"+
		"\4\3\2\2\2RS\7t\2\2ST\7g\2\2TU\7c\2\2UV\7n\2\2V\6\3\2\2\2WX\7k\2\2XY\7"+
		"p\2\2YZ\7v\2\2Z[\7g\2\2[\\\7k\2\2\\]\7t\2\2]^\7q\2\2^\b\3\2\2\2_`\7e\2"+
		"\2`a\7c\2\2ab\7t\2\2bc\7c\2\2cd\7e\2\2de\7v\2\2ef\7g\2\2fg\7t\2\2g\n\3"+
		"\2\2\2hi\7d\2\2ij\7q\2\2jk\7q\2\2kl\7n\2\2lm\7g\2\2mn\7c\2\2no\7p\2\2"+
		"op\7q\2\2p\f\3\2\2\2qr\7k\2\2rs\7o\2\2st\7r\2\2tu\7t\2\2uv\7k\2\2vw\7"+
		"o\2\2wx\7c\2\2x\16\3\2\2\2yz\7n\2\2z{\7g\2\2{|\7k\2\2|}\7c\2\2}\20\3\2"+
		"\2\2~\177\7u\2\2\177\u0080\7g\2\2\u0080\22\3\2\2\2\u0081\u0082\7g\2\2"+
		"\u0082\u0083\7p\2\2\u0083\u0084\7v\2\2\u0084\u0085\7c\2\2\u0085\u0086"+
		"\7q\2\2\u0086\24\3\2\2\2\u0087\u0088\7u\2\2\u0088\u0089\7g\2\2\u0089\u008a"+
		"\7p\2\2\u008a\u008b\7c\2\2\u008b\u008c\7q\2\2\u008c\26\3\2\2\2\u008d\u008e"+
		"\7h\2\2\u008e\u008f\7k\2\2\u008f\u0090\7o\2\2\u0090\u0091\7u\2\2\u0091"+
		"\u0092\7g\2\2\u0092\30\3\2\2\2\u0093\u0094\7h\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7o\2\2\u0096\u0097\7\60\2\2\u0097\32\3\2\2\2\u0098\u0099\7-\2\2"+
		"\u0099\34\3\2\2\2\u009a\u009b\7/\2\2\u009b\36\3\2\2\2\u009c\u009d\7,\2"+
		"\2\u009d \3\2\2\2\u009e\u009f\7\61\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7G"+
		"\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a4\7W\2\2\u00a4&\3\2\2"+
		"\2\u00a5\u00a6\7P\2\2\u00a6\u00a7\7C\2\2\u00a7\u00a8\7Q\2\2\u00a8(\3\2"+
		"\2\2\u00a9\u00aa\7@\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac,\3\2\2"+
		"\2\u00ad\u00ae\7@\2\2\u00ae\u00af\7?\2\2\u00af.\3\2\2\2\u00b0\u00b1\7"+
		">\2\2\u00b1\u00b2\7?\2\2\u00b2\60\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4\u00b5"+
		"\7?\2\2\u00b5\62\3\2\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b8\7?\2\2\u00b8\64"+
		"\3\2\2\2\u00b9\u00ba\7<\2\2\u00ba\u00bb\7?\2\2\u00bb\66\3\2\2\2\u00bc"+
		"\u00bd\7*\2\2\u00bd8\3\2\2\2\u00be\u00bf\7+\2\2\u00bf:\3\2\2\2\u00c0\u00c1"+
		"\7$\2\2\u00c1<\3\2\2\2\u00c2\u00c3\7=\2\2\u00c3>\3\2\2\2\u00c4\u00c5\7"+
		"x\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7k\2\2\u00cc"+
		"\u00cd\7t\2\2\u00cd\u00d4\7q\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7c\2\2"+
		"\u00d0\u00d1\7n\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d4\7q\2\2\u00d3\u00c4"+
		"\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4@\3\2\2\2\u00d5\u00d9\t\2\2\2\u00d6"+
		"\u00d8\t\3\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00daB\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de"+
		"\t\4\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e5\7\60\2\2\u00e2\u00e4\t"+
		"\4\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6D\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\t\4\2\2"+
		"\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ecF\3\2\2\2\u00ed\u00f1\7$\2\2\u00ee\u00f0\t\5\2\2\u00ef\u00ee"+
		"\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7$\2\2\u00f5H\3\2\2\2\u00f6"+
		"\u00f8\t\6\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b%\2\2\u00fc"+
		"J\3\2\2\2\n\2\u00d3\u00d9\u00df\u00e5\u00eb\u00f1\u00f9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
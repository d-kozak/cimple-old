// Generated from /home/dkozak/projects/cimple/src/main/kotlin/io/dkozak/cimple/Cimple.g4 by ANTLR 4.7
package io.dkozak.cimple;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CimpleLexer extends Lexer {
    public static final int
            EQUALS = 1, NOT_EQUALS = 2, LT = 3, LE = 4, GT = 5, GE = 6, MULT = 7, DIV = 8, PLUS = 9,
            MINUS = 10, MOD = 11, AND = 12, OR = 13, NOT = 14, ASSIGN = 15, SEMICOLON = 16, PRINT = 17,
            INPUT = 18, FN = 19, COLON = 20, FOR = 21, IF = 22, ELSE = 23, RETURN = 24, COMMA = 25,
            LPAREN = 26, RPAREN = 27, LBRAC = 28, RBRAC = 29, STRING = 30, DOUBLE = 31, INT = 32,
            ID = 33, WS = 34;
    public static final String[] ruleNames = {
            "EQUALS", "NOT_EQUALS", "LT", "LE", "GT", "GE", "MULT", "DIV", "PLUS",
            "MINUS", "MOD", "AND", "OR", "NOT", "ASSIGN", "SEMICOLON", "PRINT", "INPUT",
            "FN", "COLON", "FOR", "IF", "ELSE", "RETURN", "COMMA", "LPAREN", "RPAREN",
            "LBRAC", "RBRAC", "STRING", "DOUBLE", "INT", "ID", "WS"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00c2\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6" +
                    "\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r" +
                    "\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22" +
                    "\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25" +
                    "\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31" +
                    "\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36" +
                    "\3\36\3\37\3\37\7\37\u00a1\n\37\f\37\16\37\u00a4\13\37\3\37\3\37\3 \6" +
                    " \u00a9\n \r \16 \u00aa\3 \3 \6 \u00af\n \r \16 \u00b0\3!\6!\u00b4\n!" +
                    "\r!\16!\u00b5\3\"\3\"\7\"\u00ba\n\"\f\"\16\"\u00bd\13\"\3#\3#\3#\3#\3" +
                    "\u00a2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33" +
                    "\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67" +
                    "\359\36;\37= ?!A\"C#E$\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\13" +
                    "\f\"\"\2\u00c6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3" +
                    "\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2" +
                    "\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3" +
                    "\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2" +
                    "\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2" +
                    "9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3" +
                    "\2\2\2\3G\3\2\2\2\5J\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13R\3\2\2\2\rT\3\2" +
                    "\2\2\17W\3\2\2\2\21Y\3\2\2\2\23[\3\2\2\2\25]\3\2\2\2\27_\3\2\2\2\31a\3" +
                    "\2\2\2\33e\3\2\2\2\35h\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#p\3\2\2\2%v\3\2\2" +
                    "\2\'|\3\2\2\2)\177\3\2\2\2+\u0081\3\2\2\2-\u0085\3\2\2\2/\u0088\3\2\2" +
                    "\2\61\u008d\3\2\2\2\63\u0094\3\2\2\2\65\u0096\3\2\2\2\67\u0098\3\2\2\2" +
                    "9\u009a\3\2\2\2;\u009c\3\2\2\2=\u009e\3\2\2\2?\u00a8\3\2\2\2A\u00b3\3" +
                    "\2\2\2C\u00b7\3\2\2\2E\u00be\3\2\2\2GH\7?\2\2HI\7?\2\2I\4\3\2\2\2JK\7" +
                    "#\2\2KL\7?\2\2L\6\3\2\2\2MN\7>\2\2N\b\3\2\2\2OP\7>\2\2PQ\7?\2\2Q\n\3\2" +
                    "\2\2RS\7@\2\2S\f\3\2\2\2TU\7@\2\2UV\7?\2\2V\16\3\2\2\2WX\7,\2\2X\20\3" +
                    "\2\2\2YZ\7\61\2\2Z\22\3\2\2\2[\\\7-\2\2\\\24\3\2\2\2]^\7/\2\2^\26\3\2" +
                    "\2\2_`\7\'\2\2`\30\3\2\2\2ab\7c\2\2bc\7p\2\2cd\7f\2\2d\32\3\2\2\2ef\7" +
                    "q\2\2fg\7t\2\2g\34\3\2\2\2hi\7p\2\2ij\7q\2\2jk\7v\2\2k\36\3\2\2\2lm\7" +
                    "?\2\2m \3\2\2\2no\7=\2\2o\"\3\2\2\2pq\7r\2\2qr\7t\2\2rs\7k\2\2st\7p\2" +
                    "\2tu\7v\2\2u$\3\2\2\2vw\7k\2\2wx\7p\2\2xy\7r\2\2yz\7w\2\2z{\7v\2\2{&\3" +
                    "\2\2\2|}\7h\2\2}~\7p\2\2~(\3\2\2\2\177\u0080\7<\2\2\u0080*\3\2\2\2\u0081" +
                    "\u0082\7h\2\2\u0082\u0083\7q\2\2\u0083\u0084\7t\2\2\u0084,\3\2\2\2\u0085" +
                    "\u0086\7k\2\2\u0086\u0087\7h\2\2\u0087.\3\2\2\2\u0088\u0089\7g\2\2\u0089" +
                    "\u008a\7n\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c\60\3\2\2\2\u008d" +
                    "\u008e\7t\2\2\u008e\u008f\7g\2\2\u008f\u0090\7v\2\2\u0090\u0091\7w\2\2" +
                    "\u0091\u0092\7t\2\2\u0092\u0093\7p\2\2\u0093\62\3\2\2\2\u0094\u0095\7" +
                    ".\2\2\u0095\64\3\2\2\2\u0096\u0097\7*\2\2\u0097\66\3\2\2\2\u0098\u0099" +
                    "\7+\2\2\u00998\3\2\2\2\u009a\u009b\7}\2\2\u009b:\3\2\2\2\u009c\u009d\7" +
                    "\177\2\2\u009d<\3\2\2\2\u009e\u00a2\7$\2\2\u009f\u00a1\13\2\2\2\u00a0" +
                    "\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a2\u00a0\3\2" +
                    "\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7$\2\2\u00a6" +
                    ">\3\2\2\2\u00a7\u00a9\t\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2" +
                    "\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae" +
                    "\7\60\2\2\u00ad\u00af\t\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2" +
                    "\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1@\3\2\2\2\u00b2\u00b4\t" +
                    "\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5" +
                    "\u00b6\3\2\2\2\u00b6B\3\2\2\2\u00b7\u00bb\t\3\2\2\u00b8\u00ba\t\4\2\2" +
                    "\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc" +
                    "\3\2\2\2\u00bcD\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\t\5\2\2\u00bf" +
                    "\u00c0\3\2\2\2\u00c0\u00c1\b#\2\2\u00c1F\3\2\2\2\b\2\u00a2\u00aa\u00b0" +
                    "\u00b5\u00bb\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'+'",
            "'-'", "'%'", "'and'", "'or'", "'not'", "'='", "';'", "'print'", "'input'",
            "'fn'", "':'", "'for'", "'if'", "'else'", "'return'", "','", "'('", "')'",
            "'{'", "'}'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "EQUALS", "NOT_EQUALS", "LT", "LE", "GT", "GE", "MULT", "DIV", "PLUS",
            "MINUS", "MOD", "AND", "OR", "NOT", "ASSIGN", "SEMICOLON", "PRINT", "INPUT",
            "FN", "COLON", "FOR", "IF", "ELSE", "RETURN", "COMMA", "LPAREN", "RPAREN",
            "LBRAC", "RBRAC", "STRING", "DOUBLE", "INT", "ID", "WS"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public CimpleLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public String getGrammarFileName() {
        return "Cimple.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}
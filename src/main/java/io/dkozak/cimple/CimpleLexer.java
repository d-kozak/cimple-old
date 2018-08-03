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
            INPUT = 18, FOR = 19, IF = 20, ELSE = 21, LPAREN = 22, RPAREN = 23, LBRAC = 24, RBRAC = 25,
            INT = 26, ID = 27, WS = 28;
    public static final String[] ruleNames = {
            "EQUALS", "NOT_EQUALS", "LT", "LE", "GT", "GE", "MULT", "DIV", "PLUS",
            "MINUS", "MOD", "AND", "OR", "NOT", "ASSIGN", "SEMICOLON", "PRINT", "INPUT",
            "FOR", "IF", "ELSE", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "INT", "ID",
            "WS"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0094\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\3\3\3\3" +
                    "\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13" +
                    "\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20" +
                    "\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23" +
                    "\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27" +
                    "\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\6\33\u0086\n\33\r\33\16\33\u0087" +
                    "\3\34\3\34\7\34\u008c\n\34\f\34\16\34\u008f\13\34\3\35\3\35\3\35\3\35" +
                    "\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17" +
                    "\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35" +
                    "9\36\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\f\"\"\2\u0095\2\3" +
                    "\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2" +
                    "\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31" +
                    "\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2" +
                    "\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2" +
                    "\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2" +
                    "\2\5>\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13F\3\2\2\2\rH\3\2\2\2\17K\3\2\2\2" +
                    "\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33Y\3\2\2" +
                    "\2\35\\\3\2\2\2\37`\3\2\2\2!b\3\2\2\2#d\3\2\2\2%j\3\2\2\2\'p\3\2\2\2)" +
                    "t\3\2\2\2+w\3\2\2\2-|\3\2\2\2/~\3\2\2\2\61\u0080\3\2\2\2\63\u0082\3\2" +
                    "\2\2\65\u0085\3\2\2\2\67\u0089\3\2\2\29\u0090\3\2\2\2;<\7?\2\2<=\7?\2" +
                    "\2=\4\3\2\2\2>?\7#\2\2?@\7?\2\2@\6\3\2\2\2AB\7>\2\2B\b\3\2\2\2CD\7>\2" +
                    "\2DE\7?\2\2E\n\3\2\2\2FG\7@\2\2G\f\3\2\2\2HI\7@\2\2IJ\7?\2\2J\16\3\2\2" +
                    "\2KL\7,\2\2L\20\3\2\2\2MN\7\61\2\2N\22\3\2\2\2OP\7-\2\2P\24\3\2\2\2QR" +
                    "\7/\2\2R\26\3\2\2\2ST\7\'\2\2T\30\3\2\2\2UV\7c\2\2VW\7p\2\2WX\7f\2\2X" +
                    "\32\3\2\2\2YZ\7q\2\2Z[\7t\2\2[\34\3\2\2\2\\]\7p\2\2]^\7q\2\2^_\7v\2\2" +
                    "_\36\3\2\2\2`a\7?\2\2a \3\2\2\2bc\7=\2\2c\"\3\2\2\2de\7r\2\2ef\7t\2\2" +
                    "fg\7k\2\2gh\7p\2\2hi\7v\2\2i$\3\2\2\2jk\7k\2\2kl\7p\2\2lm\7r\2\2mn\7w" +
                    "\2\2no\7v\2\2o&\3\2\2\2pq\7h\2\2qr\7q\2\2rs\7t\2\2s(\3\2\2\2tu\7k\2\2" +
                    "uv\7h\2\2v*\3\2\2\2wx\7g\2\2xy\7n\2\2yz\7u\2\2z{\7g\2\2{,\3\2\2\2|}\7" +
                    "*\2\2}.\3\2\2\2~\177\7+\2\2\177\60\3\2\2\2\u0080\u0081\7}\2\2\u0081\62" +
                    "\3\2\2\2\u0082\u0083\7\177\2\2\u0083\64\3\2\2\2\u0084\u0086\t\2\2\2\u0085" +
                    "\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2" +
                    "\2\2\u0088\66\3\2\2\2\u0089\u008d\t\3\2\2\u008a\u008c\t\4\2\2\u008b\u008a" +
                    "\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e" +
                    "8\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\t\5\2\2\u0091\u0092\3\2\2\2" +
                    "\u0092\u0093\b\35\2\2\u0093:\3\2\2\2\5\2\u0087\u008d\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'+'",
            "'-'", "'%'", "'and'", "'or'", "'not'", "'='", "';'", "'print'", "'input'",
            "'for'", "'if'", "'else'", "'('", "')'", "'{'", "'}'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "EQUALS", "NOT_EQUALS", "LT", "LE", "GT", "GE", "MULT", "DIV", "PLUS",
            "MINUS", "MOD", "AND", "OR", "NOT", "ASSIGN", "SEMICOLON", "PRINT", "INPUT",
            "FOR", "IF", "ELSE", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "INT", "ID",
            "WS"
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
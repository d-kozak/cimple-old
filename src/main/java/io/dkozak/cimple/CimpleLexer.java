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
            INPUT = 18, IF = 19, ELSE = 20, LPAREN = 21, RPAREN = 22, LBRAC = 23, RBRAC = 24, INT = 25,
            ID = 26, WS = 27;
    public static final String[] ruleNames = {
            "EQUALS", "NOT_EQUALS", "LT", "LE", "GT", "GE", "MULT", "DIV", "PLUS",
            "MINUS", "MOD", "AND", "OR", "NOT", "ASSIGN", "SEMICOLON", "PRINT", "INPUT",
            "IF", "ELSE", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "INT", "ID", "WS"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u008e\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3" +
                    "\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3" +
                    "\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3" +
                    "\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3" +
                    "\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3" +
                    "\31\3\32\6\32\u0080\n\32\r\32\16\32\u0081\3\33\3\33\7\33\u0086\n\33\f" +
                    "\33\16\33\u0089\13\33\3\34\3\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7" +
                    "\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25" +
                    ")\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\6\3\2\62;\5\2C\\aac|\6\2" +
                    "\62;C\\aac|\4\2\13\f\"\"\2\u008f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2" +
                    "\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2" +
                    "\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2" +
                    "\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2" +
                    "\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2" +
                    "\2\2\67\3\2\2\2\39\3\2\2\2\5<\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13D\3\2\2" +
                    "\2\rF\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27Q\3\2" +
                    "\2\2\31S\3\2\2\2\33W\3\2\2\2\35Z\3\2\2\2\37^\3\2\2\2!`\3\2\2\2#b\3\2\2" +
                    "\2%h\3\2\2\2\'n\3\2\2\2)q\3\2\2\2+v\3\2\2\2-x\3\2\2\2/z\3\2\2\2\61|\3" +
                    "\2\2\2\63\177\3\2\2\2\65\u0083\3\2\2\2\67\u008a\3\2\2\29:\7?\2\2:;\7?" +
                    "\2\2;\4\3\2\2\2<=\7#\2\2=>\7?\2\2>\6\3\2\2\2?@\7>\2\2@\b\3\2\2\2AB\7>" +
                    "\2\2BC\7?\2\2C\n\3\2\2\2DE\7@\2\2E\f\3\2\2\2FG\7@\2\2GH\7?\2\2H\16\3\2" +
                    "\2\2IJ\7,\2\2J\20\3\2\2\2KL\7\61\2\2L\22\3\2\2\2MN\7-\2\2N\24\3\2\2\2" +
                    "OP\7/\2\2P\26\3\2\2\2QR\7\'\2\2R\30\3\2\2\2ST\7c\2\2TU\7p\2\2UV\7f\2\2" +
                    "V\32\3\2\2\2WX\7q\2\2XY\7t\2\2Y\34\3\2\2\2Z[\7p\2\2[\\\7q\2\2\\]\7v\2" +
                    "\2]\36\3\2\2\2^_\7?\2\2_ \3\2\2\2`a\7=\2\2a\"\3\2\2\2bc\7r\2\2cd\7t\2" +
                    "\2de\7k\2\2ef\7p\2\2fg\7v\2\2g$\3\2\2\2hi\7k\2\2ij\7p\2\2jk\7r\2\2kl\7" +
                    "w\2\2lm\7v\2\2m&\3\2\2\2no\7k\2\2op\7h\2\2p(\3\2\2\2qr\7g\2\2rs\7n\2\2" +
                    "st\7u\2\2tu\7g\2\2u*\3\2\2\2vw\7*\2\2w,\3\2\2\2xy\7+\2\2y.\3\2\2\2z{\7" +
                    "}\2\2{\60\3\2\2\2|}\7\177\2\2}\62\3\2\2\2~\u0080\t\2\2\2\177~\3\2\2\2" +
                    "\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\64\3" +
                    "\2\2\2\u0083\u0087\t\3\2\2\u0084\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086" +
                    "\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\66\3\2\2" +
                    "\2\u0089\u0087\3\2\2\2\u008a\u008b\t\5\2\2\u008b\u008c\3\2\2\2\u008c\u008d" +
                    "\b\34\2\2\u008d8\3\2\2\2\5\2\u0081\u0087\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'+'",
            "'-'", "'%'", "'and'", "'or'", "'not'", "'='", "';'", "'print'", "'input'",
            "'if'", "'else'", "'('", "')'", "'{'", "'}'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "EQUALS", "NOT_EQUALS", "LT", "LE", "GT", "GE", "MULT", "DIV", "PLUS",
            "MINUS", "MOD", "AND", "OR", "NOT", "ASSIGN", "SEMICOLON", "PRINT", "INPUT",
            "IF", "ELSE", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "INT", "ID", "WS"
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
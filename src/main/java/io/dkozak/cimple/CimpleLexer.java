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
            MINUS = 10, MOD = 11, ASSIGN = 12, SEMICOLON = 13, PRINT = 14, IF = 15, ELSE = 16, LPAREN = 17,
            RPAREN = 18, LBRAC = 19, RBRAC = 20, INT = 21, ID = 22, WS = 23;
    public static final String[] ruleNames = {
            "EQUALS", "NOT_EQUALS", "LT", "LE", "GT", "GE", "MULT", "DIV", "PLUS",
            "MINUS", "MOD", "ASSIGN", "SEMICOLON", "PRINT", "IF", "ELSE", "LPAREN",
            "RPAREN", "LBRAC", "RBRAC", "INT", "ID", "WS"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31u\b\1\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3" +
                    "\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t" +
                    "\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17" +
                    "\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24" +
                    "\3\24\3\25\3\25\3\26\6\26g\n\26\r\26\16\26h\3\27\3\27\7\27m\n\27\f\27" +
                    "\16\27p\13\27\3\30\3\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t" +
                    "\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27" +
                    "-\30/\31\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\f\"\"\2v\2\3\3" +
                    "\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2" +
                    "\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3" +
                    "\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2" +
                    "%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61" +
                    "\3\2\2\2\5\64\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17" +
                    "A\3\2\2\2\21C\3\2\2\2\23E\3\2\2\2\25G\3\2\2\2\27I\3\2\2\2\31K\3\2\2\2" +
                    "\33M\3\2\2\2\35O\3\2\2\2\37U\3\2\2\2!X\3\2\2\2#]\3\2\2\2%_\3\2\2\2\'a" +
                    "\3\2\2\2)c\3\2\2\2+f\3\2\2\2-j\3\2\2\2/q\3\2\2\2\61\62\7?\2\2\62\63\7" +
                    "?\2\2\63\4\3\2\2\2\64\65\7#\2\2\65\66\7?\2\2\66\6\3\2\2\2\678\7>\2\28" +
                    "\b\3\2\2\29:\7>\2\2:;\7?\2\2;\n\3\2\2\2<=\7@\2\2=\f\3\2\2\2>?\7@\2\2?" +
                    "@\7?\2\2@\16\3\2\2\2AB\7,\2\2B\20\3\2\2\2CD\7\61\2\2D\22\3\2\2\2EF\7-" +
                    "\2\2F\24\3\2\2\2GH\7/\2\2H\26\3\2\2\2IJ\7\'\2\2J\30\3\2\2\2KL\7?\2\2L" +
                    "\32\3\2\2\2MN\7=\2\2N\34\3\2\2\2OP\7r\2\2PQ\7t\2\2QR\7k\2\2RS\7p\2\2S" +
                    "T\7v\2\2T\36\3\2\2\2UV\7k\2\2VW\7h\2\2W \3\2\2\2XY\7g\2\2YZ\7n\2\2Z[\7" +
                    "u\2\2[\\\7g\2\2\\\"\3\2\2\2]^\7*\2\2^$\3\2\2\2_`\7+\2\2`&\3\2\2\2ab\7" +
                    "}\2\2b(\3\2\2\2cd\7\177\2\2d*\3\2\2\2eg\t\2\2\2fe\3\2\2\2gh\3\2\2\2hf" +
                    "\3\2\2\2hi\3\2\2\2i,\3\2\2\2jn\t\3\2\2km\t\4\2\2lk\3\2\2\2mp\3\2\2\2n" +
                    "l\3\2\2\2no\3\2\2\2o.\3\2\2\2pn\3\2\2\2qr\t\5\2\2rs\3\2\2\2st\b\30\2\2" +
                    "t\60\3\2\2\2\5\2hn\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'+'",
            "'-'", "'%'", "'='", "';'", "'print'", "'if'", "'else'", "'('", "')'",
            "'{'", "'}'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "EQUALS", "NOT_EQUALS", "LT", "LE", "GT", "GE", "MULT", "DIV", "PLUS",
            "MINUS", "MOD", "ASSIGN", "SEMICOLON", "PRINT", "IF", "ELSE", "LPAREN",
            "RPAREN", "LBRAC", "RBRAC", "INT", "ID", "WS"
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
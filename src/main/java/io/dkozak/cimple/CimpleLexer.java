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
            IF = 18, ELSE = 19, LPAREN = 20, RPAREN = 21, LBRAC = 22, RBRAC = 23, INT = 24, ID = 25,
            WS = 26;
    public static final String[] ruleNames = {
            "EQUALS", "NOT_EQUALS", "LT", "LE", "GT", "GE", "MULT", "DIV", "PLUS",
            "MINUS", "MOD", "AND", "OR", "NOT", "ASSIGN", "SEMICOLON", "PRINT", "IF",
            "ELSE", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "INT", "ID", "WS"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0086\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5" +
                    "\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r" +
                    "\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3" +
                    "\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3" +
                    "\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\6\31x\n\31\r\31\16\31y\3\32\3\32" +
                    "\7\32~\n\32\f\32\16\32\u0081\13\32\3\33\3\33\3\33\3\33\2\2\34\3\3\5\4" +
                    "\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22" +
                    "#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\6\3\2\62;\5\2C\\a" +
                    "ac|\6\2\62;C\\aac|\4\2\13\f\"\"\2\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3" +
                    "\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2" +
                    "\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35" +
                    "\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)" +
                    "\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2" +
                    "\65\3\2\2\2\3\67\3\2\2\2\5:\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13B\3\2\2\2" +
                    "\rD\3\2\2\2\17G\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27O\3\2\2" +
                    "\2\31Q\3\2\2\2\33U\3\2\2\2\35X\3\2\2\2\37\\\3\2\2\2!^\3\2\2\2#`\3\2\2" +
                    "\2%f\3\2\2\2\'i\3\2\2\2)n\3\2\2\2+p\3\2\2\2-r\3\2\2\2/t\3\2\2\2\61w\3" +
                    "\2\2\2\63{\3\2\2\2\65\u0082\3\2\2\2\678\7?\2\289\7?\2\29\4\3\2\2\2:;\7" +
                    "#\2\2;<\7?\2\2<\6\3\2\2\2=>\7>\2\2>\b\3\2\2\2?@\7>\2\2@A\7?\2\2A\n\3\2" +
                    "\2\2BC\7@\2\2C\f\3\2\2\2DE\7@\2\2EF\7?\2\2F\16\3\2\2\2GH\7,\2\2H\20\3" +
                    "\2\2\2IJ\7\61\2\2J\22\3\2\2\2KL\7-\2\2L\24\3\2\2\2MN\7/\2\2N\26\3\2\2" +
                    "\2OP\7\'\2\2P\30\3\2\2\2QR\7c\2\2RS\7p\2\2ST\7f\2\2T\32\3\2\2\2UV\7q\2" +
                    "\2VW\7t\2\2W\34\3\2\2\2XY\7p\2\2YZ\7q\2\2Z[\7v\2\2[\36\3\2\2\2\\]\7?\2" +
                    "\2] \3\2\2\2^_\7=\2\2_\"\3\2\2\2`a\7r\2\2ab\7t\2\2bc\7k\2\2cd\7p\2\2d" +
                    "e\7v\2\2e$\3\2\2\2fg\7k\2\2gh\7h\2\2h&\3\2\2\2ij\7g\2\2jk\7n\2\2kl\7u" +
                    "\2\2lm\7g\2\2m(\3\2\2\2no\7*\2\2o*\3\2\2\2pq\7+\2\2q,\3\2\2\2rs\7}\2\2" +
                    "s.\3\2\2\2tu\7\177\2\2u\60\3\2\2\2vx\t\2\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2" +
                    "\2\2yz\3\2\2\2z\62\3\2\2\2{\177\t\3\2\2|~\t\4\2\2}|\3\2\2\2~\u0081\3\2" +
                    "\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\64\3\2\2\2\u0081\177\3\2\2\2" +
                    "\u0082\u0083\t\5\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\33\2\2\u0085\66" +
                    "\3\2\2\2\5\2y\177\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'+'",
            "'-'", "'%'", "'and'", "'or'", "'not'", "'='", "';'", "'print'", "'if'",
            "'else'", "'('", "')'", "'{'", "'}'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "EQUALS", "NOT_EQUALS", "LT", "LE", "GT", "GE", "MULT", "DIV", "PLUS",
            "MINUS", "MOD", "AND", "OR", "NOT", "ASSIGN", "SEMICOLON", "PRINT", "IF",
            "ELSE", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "INT", "ID", "WS"
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
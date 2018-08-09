// Generated from /home/dkozak/projects/cimple/src/main/kotlin/io/dkozak/cimple/Cimple.g4 by ANTLR 4.7
package io.dkozak.cimple;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CimpleParser extends Parser {
    public static final int
            EQUALS = 1, NOT_EQUALS = 2, LT = 3, LE = 4, GT = 5, GE = 6, MULT = 7, DIV = 8, PLUS = 9,
            MINUS = 10, MOD = 11, AND = 12, OR = 13, NOT = 14, ASSIGN = 15, SEMICOLON = 16, PRINT = 17,
            INPUT = 18, FN = 19, COLON = 20, FOR = 21, IF = 22, ELSE = 23, RETURN = 24, COMMA = 25,
            LPAREN = 26, RPAREN = 27, LBRAC = 28, RBRAC = 29, STRING = 30, DOUBLE = 31, INT = 32,
            ID = 33, WS = 34;
    public static final int
            RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_functionCall = 3,
            RULE_arguments = 4, RULE_forLoop = 5, RULE_variableAssignment = 6, RULE_variableDefinition = 7,
            RULE_printStatement = 8, RULE_inputStatement = 9, RULE_ifStatement = 10,
            RULE_functionDefinition = 11, RULE_parameters = 12, RULE_parameter = 13,
            RULE_returnStatement = 14, RULE_block = 15;
    public static final String[] ruleNames = {
            "program", "statement", "expression", "functionCall", "arguments", "forLoop",
            "variableAssignment", "variableDefinition", "printStatement", "inputStatement",
            "ifStatement", "functionDefinition", "parameters", "parameter", "returnStatement",
            "block"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00e4\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n" +
                    "\2\r\2\16\2%\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\3\4\3\4\5\4D\n\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\4\3\4\5\4Q\n\4\3\4\3\4\5\4U\n\4\3\4" +
                    "\3\4\5\4Y\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0082\n\4\f\4\16\4\u0085\13\4\3\5\3" +
                    "\5\3\5\5\5\u008a\n\5\3\5\3\5\3\6\3\6\3\6\7\6\u0091\n\6\f\6\16\6\u0094" +
                    "\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t" +
                    "\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3" +
                    "\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00be\n\f\3\r\3\r\3\r\3\r\5\r\u00c4" +
                    "\n\r\3\r\3\r\3\r\5\r\u00c9\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u00d0\n\16" +
                    "\f\16\16\16\u00d3\13\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\7\21\u00dd" +
                    "\n\21\f\21\16\21\u00e0\13\21\3\21\3\21\3\21\2\3\6\22\2\4\6\b\n\f\16\20" +
                    "\22\24\26\30\32\34\36 \2\2\2\u00fa\2#\3\2\2\2\4>\3\2\2\2\6X\3\2\2\2\b" +
                    "\u0086\3\2\2\2\n\u008d\3\2\2\2\f\u0095\3\2\2\2\16\u009f\3\2\2\2\20\u00a3" +
                    "\3\2\2\2\22\u00a8\3\2\2\2\24\u00ab\3\2\2\2\26\u00bd\3\2\2\2\30\u00bf\3" +
                    "\2\2\2\32\u00cc\3\2\2\2\34\u00d4\3\2\2\2\36\u00d7\3\2\2\2 \u00da\3\2\2" +
                    "\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7" +
                    "\2\2\3(\3\3\2\2\2)*\5\16\b\2*+\7\22\2\2+?\3\2\2\2,-\5\20\t\2-.\7\22\2" +
                    "\2.?\3\2\2\2/\60\5\24\13\2\60\61\7\22\2\2\61?\3\2\2\2\62\63\5\22\n\2\63" +
                    "\64\7\22\2\2\64?\3\2\2\2\65?\5\26\f\2\66?\5\f\7\2\678\5\b\5\289\7\22\2" +
                    "\29?\3\2\2\2:?\5\30\r\2;<\5\36\20\2<=\7\22\2\2=?\3\2\2\2>)\3\2\2\2>,\3" +
                    "\2\2\2>/\3\2\2\2>\62\3\2\2\2>\65\3\2\2\2>\66\3\2\2\2>\67\3\2\2\2>:\3\2" +
                    "\2\2>;\3\2\2\2?\5\3\2\2\2@A\b\4\1\2AY\5\b\5\2BD\7\f\2\2CB\3\2\2\2CD\3" +
                    "\2\2\2DE\3\2\2\2EF\7\34\2\2FG\5\6\4\2GH\7\35\2\2HY\3\2\2\2IJ\7\20\2\2" +
                    "JY\5\6\4\tKM\7\f\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NY\7\"\2\2OQ\7\f\2\2" +
                    "PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RY\7#\2\2SU\7\f\2\2TS\3\2\2\2TU\3\2\2\2" +
                    "UV\3\2\2\2VY\7!\2\2WY\7 \2\2X@\3\2\2\2XC\3\2\2\2XI\3\2\2\2XL\3\2\2\2X" +
                    "P\3\2\2\2XT\3\2\2\2XW\3\2\2\2Y\u0083\3\2\2\2Z[\f\24\2\2[\\\7\t\2\2\\\u0082" +
                    "\5\6\4\25]^\f\23\2\2^_\7\n\2\2_\u0082\5\6\4\24`a\f\22\2\2ab\7\r\2\2b\u0082" +
                    "\5\6\4\23cd\f\21\2\2de\7\13\2\2e\u0082\5\6\4\22fg\f\20\2\2gh\7\f\2\2h" +
                    "\u0082\5\6\4\21ij\f\17\2\2jk\7\3\2\2k\u0082\5\6\4\20lm\f\16\2\2mn\7\4" +
                    "\2\2n\u0082\5\6\4\17op\f\r\2\2pq\7\5\2\2q\u0082\5\6\4\16rs\f\f\2\2st\7" +
                    "\6\2\2t\u0082\5\6\4\ruv\f\13\2\2vw\7\7\2\2w\u0082\5\6\4\fxy\f\n\2\2yz" +
                    "\7\b\2\2z\u0082\5\6\4\13{|\f\b\2\2|}\7\16\2\2}\u0082\5\6\4\t~\177\f\7" +
                    "\2\2\177\u0080\7\17\2\2\u0080\u0082\5\6\4\b\u0081Z\3\2\2\2\u0081]\3\2" +
                    "\2\2\u0081`\3\2\2\2\u0081c\3\2\2\2\u0081f\3\2\2\2\u0081i\3\2\2\2\u0081" +
                    "l\3\2\2\2\u0081o\3\2\2\2\u0081r\3\2\2\2\u0081u\3\2\2\2\u0081x\3\2\2\2" +
                    "\u0081{\3\2\2\2\u0081~\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2" +
                    "\u0083\u0084\3\2\2\2\u0084\7\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7" +
                    "#\2\2\u0087\u0089\7\34\2\2\u0088\u008a\5\n\6\2\u0089\u0088\3\2\2\2\u0089" +
                    "\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\35\2\2\u008c\t\3\2\2" +
                    "\2\u008d\u0092\5\6\4\2\u008e\u008f\7\33\2\2\u008f\u0091\5\6\4\2\u0090" +
                    "\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2" +
                    "\2\2\u0093\13\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\27\2\2\u0096\u0097" +
                    "\7\34\2\2\u0097\u0098\5\20\t\2\u0098\u0099\7\22\2\2\u0099\u009a\5\6\4" +
                    "\2\u009a\u009b\7\22\2\2\u009b\u009c\5\16\b\2\u009c\u009d\7\35\2\2\u009d" +
                    "\u009e\5 \21\2\u009e\r\3\2\2\2\u009f\u00a0\7#\2\2\u00a0\u00a1\7\21\2\2" +
                    "\u00a1\u00a2\5\6\4\2\u00a2\17\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4\u00a5\7" +
                    "#\2\2\u00a5\u00a6\7\21\2\2\u00a6\u00a7\5\6\4\2\u00a7\21\3\2\2\2\u00a8" +
                    "\u00a9\7\23\2\2\u00a9\u00aa\5\6\4\2\u00aa\23\3\2\2\2\u00ab\u00ac\7\24" +
                    "\2\2\u00ac\u00ad\7#\2\2\u00ad\u00ae\7#\2\2\u00ae\25\3\2\2\2\u00af\u00b0" +
                    "\7\30\2\2\u00b0\u00b1\7\34\2\2\u00b1\u00b2\5\6\4\2\u00b2\u00b3\7\35\2" +
                    "\2\u00b3\u00b4\5 \21\2\u00b4\u00be\3\2\2\2\u00b5\u00b6\7\30\2\2\u00b6" +
                    "\u00b7\7\34\2\2\u00b7\u00b8\5\6\4\2\u00b8\u00b9\7\35\2\2\u00b9\u00ba\5" +
                    " \21\2\u00ba\u00bb\7\31\2\2\u00bb\u00bc\5 \21\2\u00bc\u00be\3\2\2\2\u00bd" +
                    "\u00af\3\2\2\2\u00bd\u00b5\3\2\2\2\u00be\27\3\2\2\2\u00bf\u00c0\7\25\2" +
                    "\2\u00c0\u00c1\7#\2\2\u00c1\u00c3\7\34\2\2\u00c2\u00c4\5\32\16\2\u00c3" +
                    "\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\7\35" +
                    "\2\2\u00c6\u00c7\7\26\2\2\u00c7\u00c9\7#\2\2\u00c8\u00c6\3\2\2\2\u00c8" +
                    "\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\5 \21\2\u00cb\31\3\2\2" +
                    "\2\u00cc\u00d1\5\34\17\2\u00cd\u00ce\7\33\2\2\u00ce\u00d0\5\34\17\2\u00cf" +
                    "\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2" +
                    "\2\2\u00d2\33\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6" +
                    "\7#\2\2\u00d6\35\3\2\2\2\u00d7\u00d8\7\32\2\2\u00d8\u00d9\5\6\4\2\u00d9" +
                    "\37\3\2\2\2\u00da\u00de\7\36\2\2\u00db\u00dd\5\4\3\2\u00dc\u00db\3\2\2" +
                    "\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1" +
                    "\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\37\2\2\u00e2!\3\2\2\2\22%>" +
                    "CLPTX\u0081\u0083\u0089\u0092\u00bd\u00c3\u00c8\u00d1\u00de";
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

    public CimpleParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public ATN getATN() {
        return _ATN;
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(33);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(32);
                            statement();
                        }
                    }
                    setState(35);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INPUT) | (1L << FN) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << ID))) != 0));
                setState(37);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_statement);
        try {
            setState(60);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(39);
                    variableAssignment();
                    setState(40);
                    match(SEMICOLON);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(42);
                    variableDefinition();
                    setState(43);
                    match(SEMICOLON);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(45);
                    inputStatement();
                    setState(46);
                    match(SEMICOLON);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(48);
                    printStatement();
                    setState(49);
                    match(SEMICOLON);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(51);
                    ifStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(52);
                    forLoop();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(53);
                    functionCall();
                    setState(54);
                    match(SEMICOLON);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(56);
                    functionDefinition();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(57);
                    returnStatement();
                    setState(58);
                    match(SEMICOLON);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpressionContext expression() throws RecognitionException {
        return expression(0);
    }

    private ExpressionContext expression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
        ExpressionContext _prevctx = _localctx;
        int _startState = 4;
        enterRecursionRule(_localctx, 4, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(86);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                    case 1: {
                        _localctx = new FunctionCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(63);
                        functionCall();
                    }
                    break;
                    case 2: {
                        _localctx = new BracketExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(65);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(64);
                                match(MINUS);
                            }
                        }

                        setState(67);
                        match(LPAREN);
                        setState(68);
                        expression(0);
                        setState(69);
                        match(RPAREN);
                    }
                    break;
                    case 3: {
                        _localctx = new NotExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(71);
                        match(NOT);
                        setState(72);
                        expression(7);
                    }
                    break;
                    case 4: {
                        _localctx = new IntConstantContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(74);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(73);
                                match(MINUS);
                            }
                        }

                        setState(76);
                        match(INT);
                    }
                    break;
                    case 5: {
                        _localctx = new VarExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(78);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(77);
                                match(MINUS);
                            }
                        }

                        setState(80);
                        match(ID);
                    }
                    break;
                    case 6: {
                        _localctx = new DoubleConstantContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(82);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(81);
                                match(MINUS);
                            }
                        }

                        setState(84);
                        match(DOUBLE);
                    }
                    break;
                    case 7: {
                        _localctx = new StringConstantContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(85);
                        match(STRING);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(129);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(127);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                                case 1: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(88);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(89);
                                    match(MULT);
                                    setState(90);
                                    expression(19);
                                }
                                break;
                                case 2: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(91);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(92);
                                    match(DIV);
                                    setState(93);
                                    expression(18);
                                }
                                break;
                                case 3: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(94);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(95);
                                    match(MOD);
                                    setState(96);
                                    expression(17);
                                }
                                break;
                                case 4: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(97);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(98);
                                    match(PLUS);
                                    setState(99);
                                    expression(16);
                                }
                                break;
                                case 5: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(100);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(101);
                                    match(MINUS);
                                    setState(102);
                                    expression(15);
                                }
                                break;
                                case 6: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(103);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(104);
                                    match(EQUALS);
                                    setState(105);
                                    expression(14);
                                }
                                break;
                                case 7: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(106);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(107);
                                    match(NOT_EQUALS);
                                    setState(108);
                                    expression(13);
                                }
                                break;
                                case 8: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(109);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(110);
                                    match(LT);
                                    setState(111);
                                    expression(12);
                                }
                                break;
                                case 9: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(112);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(113);
                                    match(LE);
                                    setState(114);
                                    expression(11);
                                }
                                break;
                                case 10: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(115);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(116);
                                    match(GT);
                                    setState(117);
                                    expression(10);
                                }
                                break;
                                case 11: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(118);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(119);
                                    match(GE);
                                    setState(120);
                                    expression(9);
                                }
                                break;
                                case 12: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(121);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(122);
                                    match(AND);
                                    setState(123);
                                    expression(7);
                                }
                                break;
                                case 13: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(124);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(125);
                                    match(OR);
                                    setState(126);
                                    expression(6);
                                }
                                break;
                            }
                        }
                    }
                    setState(131);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final FunctionCallContext functionCall() throws RecognitionException {
        FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_functionCall);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(132);
                match(ID);
                setState(133);
                match(LPAREN);
                setState(135);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << LPAREN) | (1L << STRING) | (1L << DOUBLE) | (1L << INT) | (1L << ID))) != 0)) {
                    {
                        setState(134);
                        arguments();
                    }
                }

                setState(137);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ArgumentsContext arguments() throws RecognitionException {
        ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_arguments);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(139);
                expression(0);
                setState(144);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(140);
                            match(COMMA);
                            setState(141);
                            expression(0);
                        }
                    }
                    setState(146);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ForLoopContext forLoop() throws RecognitionException {
        ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_forLoop);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(147);
                match(FOR);
                setState(148);
                match(LPAREN);
                setState(149);
                ((ForLoopContext) _localctx).setup = variableDefinition();
                setState(150);
                match(SEMICOLON);
                setState(151);
                expression(0);
                setState(152);
                match(SEMICOLON);
                setState(153);
                ((ForLoopContext) _localctx).increment = variableAssignment();
                setState(154);
                match(RPAREN);
                setState(155);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VariableAssignmentContext variableAssignment() throws RecognitionException {
        VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_variableAssignment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(157);
                match(ID);
                setState(158);
                match(ASSIGN);
                setState(159);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VariableDefinitionContext variableDefinition() throws RecognitionException {
        VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_variableDefinition);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(161);
                ((VariableDefinitionContext) _localctx).type = match(ID);
                setState(162);
                ((VariableDefinitionContext) _localctx).name = match(ID);
                setState(163);
                match(ASSIGN);
                setState(164);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PrintStatementContext printStatement() throws RecognitionException {
        PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_printStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(166);
                match(PRINT);
                setState(167);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final InputStatementContext inputStatement() throws RecognitionException {
        InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_inputStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(169);
                match(INPUT);
                setState(170);
                ((InputStatementContext) _localctx).type = match(ID);
                setState(171);
                ((InputStatementContext) _localctx).name = match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IfStatementContext ifStatement() throws RecognitionException {
        IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_ifStatement);
        try {
            setState(187);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                case 1:
                    _localctx = new IfContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(173);
                    match(IF);
                    setState(174);
                    match(LPAREN);
                    setState(175);
                    expression(0);
                    setState(176);
                    match(RPAREN);
                    setState(177);
                    block();
                }
                break;
                case 2:
                    _localctx = new IfElseContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(179);
                    match(IF);
                    setState(180);
                    match(LPAREN);
                    setState(181);
                    expression(0);
                    setState(182);
                    match(RPAREN);
                    setState(183);
                    block();
                    setState(184);
                    match(ELSE);
                    setState(185);
                    block();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
        FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_functionDefinition);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(189);
                match(FN);
                setState(190);
                ((FunctionDefinitionContext) _localctx).name = match(ID);
                setState(191);
                match(LPAREN);
                setState(193);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ID) {
                    {
                        setState(192);
                        parameters();
                    }
                }

                setState(195);
                match(RPAREN);
                setState(198);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == COLON) {
                    {
                        setState(196);
                        match(COLON);
                        setState(197);
                        ((FunctionDefinitionContext) _localctx).type = match(ID);
                    }
                }

                setState(200);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ParametersContext parameters() throws RecognitionException {
        ParametersContext _localctx = new ParametersContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_parameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(202);
                parameter();
                setState(207);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(203);
                            match(COMMA);
                            setState(204);
                            parameter();
                        }
                    }
                    setState(209);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ParameterContext parameter() throws RecognitionException {
        ParameterContext _localctx = new ParameterContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_parameter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(210);
                ((ParameterContext) _localctx).type = match(ID);
                setState(211);
                ((ParameterContext) _localctx).name = match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ReturnStatementContext returnStatement() throws RecognitionException {
        ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_returnStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(213);
                match(RETURN);
                setState(214);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(216);
                match(LBRAC);
                setState(220);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INPUT) | (1L << FN) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(217);
                            statement();
                        }
                    }
                    setState(222);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(223);
                match(RBRAC);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 2:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 18);
            case 1:
                return precpred(_ctx, 17);
            case 2:
                return precpred(_ctx, 16);
            case 3:
                return precpred(_ctx, 15);
            case 4:
                return precpred(_ctx, 14);
            case 5:
                return precpred(_ctx, 13);
            case 6:
                return precpred(_ctx, 12);
            case 7:
                return precpred(_ctx, 11);
            case 8:
                return precpred(_ctx, 10);
            case 9:
                return precpred(_ctx, 9);
            case 10:
                return precpred(_ctx, 8);
            case 11:
                return precpred(_ctx, 6);
            case 12:
                return precpred(_ctx, 5);
        }
        return true;
    }

    public static class ProgramContext extends ParserRuleContext {
        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode EOF() {
            return getToken(CimpleParser.EOF, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitProgram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitProgram(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {
        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public VariableAssignmentContext variableAssignment() {
            return getRuleContext(VariableAssignmentContext.class, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(CimpleParser.SEMICOLON, 0);
        }

        public VariableDefinitionContext variableDefinition() {
            return getRuleContext(VariableDefinitionContext.class, 0);
        }

        public InputStatementContext inputStatement() {
            return getRuleContext(InputStatementContext.class, 0);
        }

        public PrintStatementContext printStatement() {
            return getRuleContext(PrintStatementContext.class, 0);
        }

        public IfStatementContext ifStatement() {
            return getRuleContext(IfStatementContext.class, 0);
        }

        public ForLoopContext forLoop() {
            return getRuleContext(ForLoopContext.class, 0);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public FunctionDefinitionContext functionDefinition() {
            return getRuleContext(FunctionDefinitionContext.class, 0);
        }

        public ReturnStatementContext returnStatement() {
            return getRuleContext(ReturnStatementContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExpressionContext extends ParserRuleContext {
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        public void copyFrom(ExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class VarExprContext extends ExpressionContext {
        public VarExprContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(CimpleParser.ID, 0);
        }

        public TerminalNode MINUS() {
            return getToken(CimpleParser.MINUS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterVarExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitVarExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitVarExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BinExprContext extends ExpressionContext {
        public BinExprContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode MULT() {
            return getToken(CimpleParser.MULT, 0);
        }

        public TerminalNode DIV() {
            return getToken(CimpleParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(CimpleParser.MOD, 0);
        }

        public TerminalNode PLUS() {
            return getToken(CimpleParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(CimpleParser.MINUS, 0);
        }

        public TerminalNode EQUALS() {
            return getToken(CimpleParser.EQUALS, 0);
        }

        public TerminalNode NOT_EQUALS() {
            return getToken(CimpleParser.NOT_EQUALS, 0);
        }

        public TerminalNode LT() {
            return getToken(CimpleParser.LT, 0);
        }

        public TerminalNode LE() {
            return getToken(CimpleParser.LE, 0);
        }

        public TerminalNode GT() {
            return getToken(CimpleParser.GT, 0);
        }

        public TerminalNode GE() {
            return getToken(CimpleParser.GE, 0);
        }

        public TerminalNode AND() {
            return getToken(CimpleParser.AND, 0);
        }

        public TerminalNode OR() {
            return getToken(CimpleParser.OR, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterBinExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitBinExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitBinExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NotExprContext extends ExpressionContext {
        public NotExprContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode NOT() {
            return getToken(CimpleParser.NOT, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterNotExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitNotExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitNotExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IntConstantContext extends ExpressionContext {
        public IntConstantContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode INT() {
            return getToken(CimpleParser.INT, 0);
        }

        public TerminalNode MINUS() {
            return getToken(CimpleParser.MINUS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterIntConstant(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitIntConstant(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitIntConstant(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BracketExprContext extends ExpressionContext {
        public BracketExprContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode LPAREN() {
            return getToken(CimpleParser.LPAREN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(CimpleParser.RPAREN, 0);
        }

        public TerminalNode MINUS() {
            return getToken(CimpleParser.MINUS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterBracketExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitBracketExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitBracketExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StringConstantContext extends ExpressionContext {
        public StringConstantContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode STRING() {
            return getToken(CimpleParser.STRING, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterStringConstant(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitStringConstant(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor)
                return ((CimpleVisitor<? extends T>) visitor).visitStringConstant(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DoubleConstantContext extends ExpressionContext {
        public DoubleConstantContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode DOUBLE() {
            return getToken(CimpleParser.DOUBLE, 0);
        }

        public TerminalNode MINUS() {
            return getToken(CimpleParser.MINUS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterDoubleConstant(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitDoubleConstant(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor)
                return ((CimpleVisitor<? extends T>) visitor).visitDoubleConstant(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionCallExpressionContext extends ExpressionContext {
        public FunctionCallExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterFunctionCallExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitFunctionCallExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor)
                return ((CimpleVisitor<? extends T>) visitor).visitFunctionCallExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionCallContext extends ParserRuleContext {
        public FunctionCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(CimpleParser.ID, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(CimpleParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(CimpleParser.RPAREN, 0);
        }

        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ArgumentsContext extends ParserRuleContext {
        public ArgumentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(CimpleParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(CimpleParser.COMMA, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arguments;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterArguments(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitArguments(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitArguments(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ForLoopContext extends ParserRuleContext {
        public VariableDefinitionContext setup;
        public VariableAssignmentContext increment;

        public ForLoopContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FOR() {
            return getToken(CimpleParser.FOR, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(CimpleParser.LPAREN, 0);
        }

        public List<TerminalNode> SEMICOLON() {
            return getTokens(CimpleParser.SEMICOLON);
        }

        public TerminalNode SEMICOLON(int i) {
            return getToken(CimpleParser.SEMICOLON, i);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(CimpleParser.RPAREN, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public VariableDefinitionContext variableDefinition() {
            return getRuleContext(VariableDefinitionContext.class, 0);
        }

        public VariableAssignmentContext variableAssignment() {
            return getRuleContext(VariableAssignmentContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forLoop;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterForLoop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitForLoop(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitForLoop(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VariableAssignmentContext extends ParserRuleContext {
        public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(CimpleParser.ID, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(CimpleParser.ASSIGN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableAssignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterVariableAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitVariableAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor)
                return ((CimpleVisitor<? extends T>) visitor).visitVariableAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VariableDefinitionContext extends ParserRuleContext {
        public Token type;
        public Token name;

        public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ASSIGN() {
            return getToken(CimpleParser.ASSIGN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public List<TerminalNode> ID() {
            return getTokens(CimpleParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(CimpleParser.ID, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDefinition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterVariableDefinition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitVariableDefinition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor)
                return ((CimpleVisitor<? extends T>) visitor).visitVariableDefinition(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PrintStatementContext extends ParserRuleContext {
        public PrintStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode PRINT() {
            return getToken(CimpleParser.PRINT, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_printStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterPrintStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitPrintStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor)
                return ((CimpleVisitor<? extends T>) visitor).visitPrintStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InputStatementContext extends ParserRuleContext {
        public Token type;
        public Token name;

        public InputStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INPUT() {
            return getToken(CimpleParser.INPUT, 0);
        }

        public List<TerminalNode> ID() {
            return getTokens(CimpleParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(CimpleParser.ID, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_inputStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterInputStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitInputStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor)
                return ((CimpleVisitor<? extends T>) visitor).visitInputStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfStatementContext extends ParserRuleContext {
        public IfStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IfStatementContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifStatement;
        }

        public void copyFrom(IfStatementContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class IfContext extends IfStatementContext {
        public IfContext(IfStatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode IF() {
            return getToken(CimpleParser.IF, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(CimpleParser.LPAREN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(CimpleParser.RPAREN, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterIf(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitIf(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitIf(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfElseContext extends IfStatementContext {
        public IfElseContext(IfStatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode IF() {
            return getToken(CimpleParser.IF, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(CimpleParser.LPAREN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(CimpleParser.RPAREN, 0);
        }

        public List<BlockContext> block() {
            return getRuleContexts(BlockContext.class);
        }

        public BlockContext block(int i) {
            return getRuleContext(BlockContext.class, i);
        }

        public TerminalNode ELSE() {
            return getToken(CimpleParser.ELSE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterIfElse(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitIfElse(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitIfElse(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctionDefinitionContext extends ParserRuleContext {
        public Token name;
        public Token type;

        public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FN() {
            return getToken(CimpleParser.FN, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(CimpleParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(CimpleParser.RPAREN, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public List<TerminalNode> ID() {
            return getTokens(CimpleParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(CimpleParser.ID, i);
        }

        public ParametersContext parameters() {
            return getRuleContext(ParametersContext.class, 0);
        }

        public TerminalNode COLON() {
            return getToken(CimpleParser.COLON, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionDefinition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterFunctionDefinition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitFunctionDefinition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor)
                return ((CimpleVisitor<? extends T>) visitor).visitFunctionDefinition(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParametersContext extends ParserRuleContext {
        public ParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ParameterContext> parameter() {
            return getRuleContexts(ParameterContext.class);
        }

        public ParameterContext parameter(int i) {
            return getRuleContext(ParameterContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(CimpleParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(CimpleParser.COMMA, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameters;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterParameters(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitParameters(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitParameters(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParameterContext extends ParserRuleContext {
        public Token type;
        public Token name;

        public ParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> ID() {
            return getTokens(CimpleParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(CimpleParser.ID, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitParameter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitParameter(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ReturnStatementContext extends ParserRuleContext {
        public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode RETURN() {
            return getToken(CimpleParser.RETURN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_returnStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterReturnStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitReturnStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor)
                return ((CimpleVisitor<? extends T>) visitor).visitReturnStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode LBRAC() {
            return getToken(CimpleParser.LBRAC, 0);
        }

        public TerminalNode RBRAC() {
            return getToken(CimpleParser.RBRAC, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CimpleListener) ((CimpleListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CimpleVisitor) return ((CimpleVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }
}
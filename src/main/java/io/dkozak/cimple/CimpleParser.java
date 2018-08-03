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
            INPUT = 18, IF = 19, ELSE = 20, LPAREN = 21, RPAREN = 22, LBRAC = 23, RBRAC = 24, INT = 25,
            ID = 26, WS = 27;
    public static final int
            RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_variableAssignment = 3,
            RULE_printStatement = 4, RULE_inputStatement = 5, RULE_ifStatement = 6,
            RULE_block = 7;
    public static final String[] ruleNames = {
            "program", "statement", "expression", "variableAssignment", "printStatement",
            "inputStatement", "ifStatement", "block"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0086\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n" +
                    "\2\r\2\16\2\25\3\2\3\2\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\5\4\"\n\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4+\n\4\3\4\3\4\5\4/\n\4\3\4\5\4\62\n\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6" +
                    "\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3" +
                    "\b\3\b\5\b{\n\b\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082\13\t\3\t\3\t\3\t\2" +
                    "\3\6\n\2\4\6\b\n\f\16\20\2\2\2\u0096\2\23\3\2\2\2\4\35\3\2\2\2\6\61\3" +
                    "\2\2\2\b_\3\2\2\2\nd\3\2\2\2\fh\3\2\2\2\16z\3\2\2\2\20|\3\2\2\2\22\24" +
                    "\5\4\3\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\27" +
                    "\3\2\2\2\27\30\7\2\2\3\30\3\3\2\2\2\31\36\5\b\5\2\32\36\5\f\7\2\33\36" +
                    "\5\n\6\2\34\36\5\16\b\2\35\31\3\2\2\2\35\32\3\2\2\2\35\33\3\2\2\2\35\34" +
                    "\3\2\2\2\36\5\3\2\2\2\37!\b\4\1\2 \"\7\f\2\2! \3\2\2\2!\"\3\2\2\2\"#\3" +
                    "\2\2\2#$\7\27\2\2$%\5\6\4\2%&\7\30\2\2&\62\3\2\2\2\'(\7\20\2\2(\62\5\6" +
                    "\4\7)+\7\f\2\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,\62\7\33\2\2-/\7\f\2\2.-" +
                    "\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\62\7\34\2\2\61\37\3\2\2\2\61\'\3\2\2" +
                    "\2\61*\3\2\2\2\61.\3\2\2\2\62\\\3\2\2\2\63\64\f\22\2\2\64\65\7\t\2\2\65" +
                    "[\5\6\4\23\66\67\f\21\2\2\678\7\n\2\28[\5\6\4\229:\f\20\2\2:;\7\r\2\2" +
                    ";[\5\6\4\21<=\f\17\2\2=>\7\13\2\2>[\5\6\4\20?@\f\16\2\2@A\7\f\2\2A[\5" +
                    "\6\4\17BC\f\r\2\2CD\7\3\2\2D[\5\6\4\16EF\f\f\2\2FG\7\4\2\2G[\5\6\4\rH" +
                    "I\f\13\2\2IJ\7\5\2\2J[\5\6\4\fKL\f\n\2\2LM\7\6\2\2M[\5\6\4\13NO\f\t\2" +
                    "\2OP\7\7\2\2P[\5\6\4\nQR\f\b\2\2RS\7\b\2\2S[\5\6\4\tTU\f\6\2\2UV\7\16" +
                    "\2\2V[\5\6\4\7WX\f\5\2\2XY\7\17\2\2Y[\5\6\4\6Z\63\3\2\2\2Z\66\3\2\2\2" +
                    "Z9\3\2\2\2Z<\3\2\2\2Z?\3\2\2\2ZB\3\2\2\2ZE\3\2\2\2ZH\3\2\2\2ZK\3\2\2\2" +
                    "ZN\3\2\2\2ZQ\3\2\2\2ZT\3\2\2\2ZW\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2" +
                    "\2]\7\3\2\2\2^\\\3\2\2\2_`\7\34\2\2`a\7\21\2\2ab\5\6\4\2bc\7\22\2\2c\t" +
                    "\3\2\2\2de\7\23\2\2ef\5\6\4\2fg\7\22\2\2g\13\3\2\2\2hi\7\24\2\2ij\7\34" +
                    "\2\2jk\7\22\2\2k\r\3\2\2\2lm\7\25\2\2mn\7\27\2\2no\5\6\4\2op\7\30\2\2" +
                    "pq\5\20\t\2q{\3\2\2\2rs\7\25\2\2st\7\27\2\2tu\5\6\4\2uv\7\30\2\2vw\5\20" +
                    "\t\2wx\7\26\2\2xy\5\20\t\2y{\3\2\2\2zl\3\2\2\2zr\3\2\2\2{\17\3\2\2\2|" +
                    "\u0080\7\31\2\2}\177\5\4\3\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2" +
                    "\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084" +
                    "\7\32\2\2\u0084\21\3\2\2\2\f\25\35!*.\61Z\\z\u0080";
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
                setState(17);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(16);
                            statement();
                        }
                    }
                    setState(19);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INPUT) | (1L << IF) | (1L << ID))) != 0));
                setState(21);
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
            setState(27);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(23);
                    variableAssignment();
                }
                break;
                case INPUT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(24);
                    inputStatement();
                }
                break;
                case PRINT:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(25);
                    printStatement();
                }
                break;
                case IF:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(26);
                    ifStatement();
                }
                break;
                default:
                    throw new NoViableAltException(this);
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
                setState(47);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                    case 1: {
                        _localctx = new BracketExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(31);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(30);
                                match(MINUS);
                            }
                        }

                        setState(33);
                        match(LPAREN);
                        setState(34);
                        expression(0);
                        setState(35);
                        match(RPAREN);
                    }
                    break;
                    case 2: {
                        _localctx = new NotExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(37);
                        match(NOT);
                        setState(38);
                        expression(5);
                    }
                    break;
                    case 3: {
                        _localctx = new IntConstantContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(40);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(39);
                                match(MINUS);
                            }
                        }

                        setState(42);
                        match(INT);
                    }
                    break;
                    case 4: {
                        _localctx = new VarExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(44);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(43);
                                match(MINUS);
                            }
                        }

                        setState(46);
                        match(ID);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(90);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(88);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                                case 1: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(49);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(50);
                                    match(MULT);
                                    setState(51);
                                    expression(17);
                                }
                                break;
                                case 2: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(52);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(53);
                                    match(DIV);
                                    setState(54);
                                    expression(16);
                                }
                                break;
                                case 3: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(55);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(56);
                                    match(MOD);
                                    setState(57);
                                    expression(15);
                                }
                                break;
                                case 4: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(58);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(59);
                                    match(PLUS);
                                    setState(60);
                                    expression(14);
                                }
                                break;
                                case 5: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(61);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(62);
                                    match(MINUS);
                                    setState(63);
                                    expression(13);
                                }
                                break;
                                case 6: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(64);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(65);
                                    match(EQUALS);
                                    setState(66);
                                    expression(12);
                                }
                                break;
                                case 7: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(67);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(68);
                                    match(NOT_EQUALS);
                                    setState(69);
                                    expression(11);
                                }
                                break;
                                case 8: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(70);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(71);
                                    match(LT);
                                    setState(72);
                                    expression(10);
                                }
                                break;
                                case 9: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(73);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(74);
                                    match(LE);
                                    setState(75);
                                    expression(9);
                                }
                                break;
                                case 10: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(76);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(77);
                                    match(GT);
                                    setState(78);
                                    expression(8);
                                }
                                break;
                                case 11: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(79);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(80);
                                    match(GE);
                                    setState(81);
                                    expression(7);
                                }
                                break;
                                case 12: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(82);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(83);
                                    match(AND);
                                    setState(84);
                                    expression(5);
                                }
                                break;
                                case 13: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(85);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(86);
                                    match(OR);
                                    setState(87);
                                    expression(4);
                                }
                                break;
                            }
                        }
                    }
                    setState(92);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
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

    public final VariableAssignmentContext variableAssignment() throws RecognitionException {
        VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_variableAssignment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(93);
                match(ID);
                setState(94);
                match(ASSIGN);
                setState(95);
                expression(0);
                setState(96);
                match(SEMICOLON);
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
        enterRule(_localctx, 8, RULE_printStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(98);
                match(PRINT);
                setState(99);
                expression(0);
                setState(100);
                match(SEMICOLON);
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
        enterRule(_localctx, 10, RULE_inputStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(102);
                match(INPUT);
                setState(103);
                match(ID);
                setState(104);
                match(SEMICOLON);
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
        enterRule(_localctx, 12, RULE_ifStatement);
        try {
            setState(120);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                case 1:
                    _localctx = new IfContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(106);
                    match(IF);
                    setState(107);
                    match(LPAREN);
                    setState(108);
                    expression(0);
                    setState(109);
                    match(RPAREN);
                    setState(110);
                    block();
                }
                break;
                case 2:
                    _localctx = new IfElseContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(112);
                    match(IF);
                    setState(113);
                    match(LPAREN);
                    setState(114);
                    expression(0);
                    setState(115);
                    match(RPAREN);
                    setState(116);
                    block();
                    setState(117);
                    match(ELSE);
                    setState(118);
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

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(122);
                match(LBRAC);
                setState(126);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INPUT) | (1L << IF) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(123);
                            statement();
                        }
                    }
                    setState(128);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(129);
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
                return precpred(_ctx, 16);
            case 1:
                return precpred(_ctx, 15);
            case 2:
                return precpred(_ctx, 14);
            case 3:
                return precpred(_ctx, 13);
            case 4:
                return precpred(_ctx, 12);
            case 5:
                return precpred(_ctx, 11);
            case 6:
                return precpred(_ctx, 10);
            case 7:
                return precpred(_ctx, 9);
            case 8:
                return precpred(_ctx, 8);
            case 9:
                return precpred(_ctx, 7);
            case 10:
                return precpred(_ctx, 6);
            case 11:
                return precpred(_ctx, 4);
            case 12:
                return precpred(_ctx, 3);
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

        public InputStatementContext inputStatement() {
            return getRuleContext(InputStatementContext.class, 0);
        }

        public PrintStatementContext printStatement() {
            return getRuleContext(PrintStatementContext.class, 0);
        }

        public IfStatementContext ifStatement() {
            return getRuleContext(IfStatementContext.class, 0);
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

        public TerminalNode SEMICOLON() {
            return getToken(CimpleParser.SEMICOLON, 0);
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

        public TerminalNode SEMICOLON() {
            return getToken(CimpleParser.SEMICOLON, 0);
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
        public InputStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INPUT() {
            return getToken(CimpleParser.INPUT, 0);
        }

        public TerminalNode ID() {
            return getToken(CimpleParser.ID, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(CimpleParser.SEMICOLON, 0);
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
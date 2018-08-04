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
            INPUT = 18, FN = 19, FOR = 20, IF = 21, ELSE = 22, RETURN = 23, COMMA = 24, LPAREN = 25,
            RPAREN = 26, LBRAC = 27, RBRAC = 28, INT = 29, ID = 30, WS = 31;
    public static final int
            RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_functionCall = 3,
            RULE_arguments = 4, RULE_forLoop = 5, RULE_variableAssignment = 6, RULE_printStatement = 7,
            RULE_inputStatement = 8, RULE_ifStatement = 9, RULE_functionDefinition = 10,
            RULE_parameters = 11, RULE_returnStatement = 12, RULE_block = 13;
    public static final String[] ruleNames = {
            "program", "statement", "expression", "functionCall", "arguments", "forLoop",
            "variableAssignment", "printStatement", "inputStatement", "ifStatement",
            "functionDefinition", "parameters", "returnStatement", "block"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00cb\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\2\3\2" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\5\38\n\3\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4F\n\4" +
                    "\3\4\3\4\5\4J\n\4\3\4\5\4M\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4v\n\4\f\4\16\4y\13\4" +
                    "\3\5\3\5\3\5\5\5~\n\5\3\5\3\5\3\6\3\6\3\6\7\6\u0085\n\6\f\6\16\6\u0088" +
                    "\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t" +
                    "\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13" +
                    "\3\13\3\13\3\13\5\13\u00ac\n\13\3\f\3\f\3\f\3\f\5\f\u00b2\n\f\3\f\3\f" +
                    "\3\f\3\r\3\r\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd\13\r\3\16\3\16\3\16\3\17" +
                    "\3\17\7\17\u00c4\n\17\f\17\16\17\u00c7\13\17\3\17\3\17\3\17\2\3\6\20\2" +
                    "\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u00de\2\37\3\2\2\2\4\67\3\2\2" +
                    "\2\6L\3\2\2\2\bz\3\2\2\2\n\u0081\3\2\2\2\f\u0089\3\2\2\2\16\u0093\3\2" +
                    "\2\2\20\u0097\3\2\2\2\22\u009a\3\2\2\2\24\u00ab\3\2\2\2\26\u00ad\3\2\2" +
                    "\2\30\u00b6\3\2\2\2\32\u00be\3\2\2\2\34\u00c1\3\2\2\2\36 \5\4\3\2\37\36" +
                    "\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7\2\2\3$\3\3\2" +
                    "\2\2%&\5\16\b\2&\'\7\22\2\2\'8\3\2\2\2()\5\22\n\2)*\7\22\2\2*8\3\2\2\2" +
                    "+,\5\20\t\2,-\7\22\2\2-8\3\2\2\2.8\5\24\13\2/8\5\f\7\2\60\61\5\b\5\2\61" +
                    "\62\7\22\2\2\628\3\2\2\2\638\5\26\f\2\64\65\5\32\16\2\65\66\7\22\2\2\66" +
                    "8\3\2\2\2\67%\3\2\2\2\67(\3\2\2\2\67+\3\2\2\2\67.\3\2\2\2\67/\3\2\2\2" +
                    "\67\60\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\28\5\3\2\2\29:\b\4\1\2:M\5\b" +
                    "\5\2;=\7\f\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\33\2\2?@\5\6\4\2@A\7" +
                    "\34\2\2AM\3\2\2\2BC\7\20\2\2CM\5\6\4\7DF\7\f\2\2ED\3\2\2\2EF\3\2\2\2F" +
                    "G\3\2\2\2GM\7\37\2\2HJ\7\f\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KM\7 \2\2" +
                    "L9\3\2\2\2L<\3\2\2\2LB\3\2\2\2LE\3\2\2\2LI\3\2\2\2Mw\3\2\2\2NO\f\22\2" +
                    "\2OP\7\t\2\2Pv\5\6\4\23QR\f\21\2\2RS\7\n\2\2Sv\5\6\4\22TU\f\20\2\2UV\7" +
                    "\r\2\2Vv\5\6\4\21WX\f\17\2\2XY\7\13\2\2Yv\5\6\4\20Z[\f\16\2\2[\\\7\f\2" +
                    "\2\\v\5\6\4\17]^\f\r\2\2^_\7\3\2\2_v\5\6\4\16`a\f\f\2\2ab\7\4\2\2bv\5" +
                    "\6\4\rcd\f\13\2\2de\7\5\2\2ev\5\6\4\ffg\f\n\2\2gh\7\6\2\2hv\5\6\4\13i" +
                    "j\f\t\2\2jk\7\7\2\2kv\5\6\4\nlm\f\b\2\2mn\7\b\2\2nv\5\6\4\top\f\6\2\2" +
                    "pq\7\16\2\2qv\5\6\4\7rs\f\5\2\2st\7\17\2\2tv\5\6\4\6uN\3\2\2\2uQ\3\2\2" +
                    "\2uT\3\2\2\2uW\3\2\2\2uZ\3\2\2\2u]\3\2\2\2u`\3\2\2\2uc\3\2\2\2uf\3\2\2" +
                    "\2ui\3\2\2\2ul\3\2\2\2uo\3\2\2\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2" +
                    "\2x\7\3\2\2\2yw\3\2\2\2z{\7 \2\2{}\7\33\2\2|~\5\n\6\2}|\3\2\2\2}~\3\2" +
                    "\2\2~\177\3\2\2\2\177\u0080\7\34\2\2\u0080\t\3\2\2\2\u0081\u0086\5\6\4" +
                    "\2\u0082\u0083\7\32\2\2\u0083\u0085\5\6\4\2\u0084\u0082\3\2\2\2\u0085" +
                    "\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\13\3\2\2" +
                    "\2\u0088\u0086\3\2\2\2\u0089\u008a\7\26\2\2\u008a\u008b\7\33\2\2\u008b" +
                    "\u008c\5\16\b\2\u008c\u008d\7\22\2\2\u008d\u008e\5\6\4\2\u008e\u008f\7" +
                    "\22\2\2\u008f\u0090\5\16\b\2\u0090\u0091\7\34\2\2\u0091\u0092\5\34\17" +
                    "\2\u0092\r\3\2\2\2\u0093\u0094\7 \2\2\u0094\u0095\7\21\2\2\u0095\u0096" +
                    "\5\6\4\2\u0096\17\3\2\2\2\u0097\u0098\7\23\2\2\u0098\u0099\5\6\4\2\u0099" +
                    "\21\3\2\2\2\u009a\u009b\7\24\2\2\u009b\u009c\7 \2\2\u009c\23\3\2\2\2\u009d" +
                    "\u009e\7\27\2\2\u009e\u009f\7\33\2\2\u009f\u00a0\5\6\4\2\u00a0\u00a1\7" +
                    "\34\2\2\u00a1\u00a2\5\34\17\2\u00a2\u00ac\3\2\2\2\u00a3\u00a4\7\27\2\2" +
                    "\u00a4\u00a5\7\33\2\2\u00a5\u00a6\5\6\4\2\u00a6\u00a7\7\34\2\2\u00a7\u00a8" +
                    "\5\34\17\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa\5\34\17\2\u00aa\u00ac\3\2" +
                    "\2\2\u00ab\u009d\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ac\25\3\2\2\2\u00ad\u00ae" +
                    "\7\25\2\2\u00ae\u00af\7 \2\2\u00af\u00b1\7\33\2\2\u00b0\u00b2\5\30\r\2" +
                    "\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4" +
                    "\7\34\2\2\u00b4\u00b5\5\34\17\2\u00b5\27\3\2\2\2\u00b6\u00bb\7 \2\2\u00b7" +
                    "\u00b8\7\32\2\2\u00b8\u00ba\7 \2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2" +
                    "\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00bb" +
                    "\3\2\2\2\u00be\u00bf\7\31\2\2\u00bf\u00c0\5\6\4\2\u00c0\33\3\2\2\2\u00c1" +
                    "\u00c5\7\35\2\2\u00c2\u00c4\5\4\3\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3" +
                    "\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7" +
                    "\u00c5\3\2\2\2\u00c8\u00c9\7\36\2\2\u00c9\35\3\2\2\2\20!\67<EILuw}\u0086" +
                    "\u00ab\u00b1\u00bb\u00c5";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'+'",
            "'-'", "'%'", "'and'", "'or'", "'not'", "'='", "';'", "'print'", "'input'",
            "'fn'", "'for'", "'if'", "'else'", "'return'", "','", "'('", "')'", "'{'",
            "'}'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "EQUALS", "NOT_EQUALS", "LT", "LE", "GT", "GE", "MULT", "DIV", "PLUS",
            "MINUS", "MOD", "AND", "OR", "NOT", "ASSIGN", "SEMICOLON", "PRINT", "INPUT",
            "FN", "FOR", "IF", "ELSE", "RETURN", "COMMA", "LPAREN", "RPAREN", "LBRAC",
            "RBRAC", "INT", "ID", "WS"
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
                setState(29);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(28);
                            statement();
                        }
                    }
                    setState(31);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INPUT) | (1L << FN) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << ID))) != 0));
                setState(33);
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
            setState(53);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(35);
                    variableAssignment();
                    setState(36);
                    match(SEMICOLON);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(38);
                    inputStatement();
                    setState(39);
                    match(SEMICOLON);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(41);
                    printStatement();
                    setState(42);
                    match(SEMICOLON);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(44);
                    ifStatement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(45);
                    forLoop();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(46);
                    functionCall();
                    setState(47);
                    match(SEMICOLON);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(49);
                    functionDefinition();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(50);
                    returnStatement();
                    setState(51);
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
                setState(74);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                    case 1: {
                        _localctx = new FunctionCallExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(56);
                        functionCall();
                    }
                    break;
                    case 2: {
                        _localctx = new BracketExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(58);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(57);
                                match(MINUS);
                            }
                        }

                        setState(60);
                        match(LPAREN);
                        setState(61);
                        expression(0);
                        setState(62);
                        match(RPAREN);
                    }
                    break;
                    case 3: {
                        _localctx = new NotExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(64);
                        match(NOT);
                        setState(65);
                        expression(5);
                    }
                    break;
                    case 4: {
                        _localctx = new IntConstantContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(67);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(66);
                                match(MINUS);
                            }
                        }

                        setState(69);
                        match(INT);
                    }
                    break;
                    case 5: {
                        _localctx = new VarExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(71);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(70);
                                match(MINUS);
                            }
                        }

                        setState(73);
                        match(ID);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(117);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(115);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                                case 1: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(76);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(77);
                                    match(MULT);
                                    setState(78);
                                    expression(17);
                                }
                                break;
                                case 2: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(79);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(80);
                                    match(DIV);
                                    setState(81);
                                    expression(16);
                                }
                                break;
                                case 3: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(82);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(83);
                                    match(MOD);
                                    setState(84);
                                    expression(15);
                                }
                                break;
                                case 4: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(85);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(86);
                                    match(PLUS);
                                    setState(87);
                                    expression(14);
                                }
                                break;
                                case 5: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(88);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(89);
                                    match(MINUS);
                                    setState(90);
                                    expression(13);
                                }
                                break;
                                case 6: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(91);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(92);
                                    match(EQUALS);
                                    setState(93);
                                    expression(12);
                                }
                                break;
                                case 7: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(94);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(95);
                                    match(NOT_EQUALS);
                                    setState(96);
                                    expression(11);
                                }
                                break;
                                case 8: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(97);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(98);
                                    match(LT);
                                    setState(99);
                                    expression(10);
                                }
                                break;
                                case 9: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(100);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(101);
                                    match(LE);
                                    setState(102);
                                    expression(9);
                                }
                                break;
                                case 10: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(103);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(104);
                                    match(GT);
                                    setState(105);
                                    expression(8);
                                }
                                break;
                                case 11: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(106);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(107);
                                    match(GE);
                                    setState(108);
                                    expression(7);
                                }
                                break;
                                case 12: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(109);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(110);
                                    match(AND);
                                    setState(111);
                                    expression(5);
                                }
                                break;
                                case 13: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(112);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(113);
                                    match(OR);
                                    setState(114);
                                    expression(4);
                                }
                                break;
                            }
                        }
                    }
                    setState(119);
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

    public final FunctionCallContext functionCall() throws RecognitionException {
        FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_functionCall);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(120);
                match(ID);
                setState(121);
                match(LPAREN);
                setState(123);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << LPAREN) | (1L << INT) | (1L << ID))) != 0)) {
                    {
                        setState(122);
                        arguments();
                    }
                }

                setState(125);
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
                setState(127);
                expression(0);
                setState(132);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(128);
                            match(COMMA);
                            setState(129);
                            expression(0);
                        }
                    }
                    setState(134);
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
                setState(135);
                match(FOR);
                setState(136);
                match(LPAREN);
                setState(137);
                ((ForLoopContext) _localctx).setup = variableAssignment();
                setState(138);
                match(SEMICOLON);
                setState(139);
                expression(0);
                setState(140);
                match(SEMICOLON);
                setState(141);
                ((ForLoopContext) _localctx).increment = variableAssignment();
                setState(142);
                match(RPAREN);
                setState(143);
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
                setState(145);
                match(ID);
                setState(146);
                match(ASSIGN);
                setState(147);
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
        enterRule(_localctx, 14, RULE_printStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(149);
                match(PRINT);
                setState(150);
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
        enterRule(_localctx, 16, RULE_inputStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(152);
                match(INPUT);
                setState(153);
                match(ID);
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
        enterRule(_localctx, 18, RULE_ifStatement);
        try {
            setState(169);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                case 1:
                    _localctx = new IfContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(155);
                    match(IF);
                    setState(156);
                    match(LPAREN);
                    setState(157);
                    expression(0);
                    setState(158);
                    match(RPAREN);
                    setState(159);
                    block();
                }
                break;
                case 2:
                    _localctx = new IfElseContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(161);
                    match(IF);
                    setState(162);
                    match(LPAREN);
                    setState(163);
                    expression(0);
                    setState(164);
                    match(RPAREN);
                    setState(165);
                    block();
                    setState(166);
                    match(ELSE);
                    setState(167);
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
        enterRule(_localctx, 20, RULE_functionDefinition);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(171);
                match(FN);
                setState(172);
                match(ID);
                setState(173);
                match(LPAREN);
                setState(175);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ID) {
                    {
                        setState(174);
                        parameters();
                    }
                }

                setState(177);
                match(RPAREN);
                setState(178);
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
        enterRule(_localctx, 22, RULE_parameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(180);
                match(ID);
                setState(185);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(181);
                            match(COMMA);
                            setState(182);
                            match(ID);
                        }
                    }
                    setState(187);
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

    public final ReturnStatementContext returnStatement() throws RecognitionException {
        ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_returnStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(188);
                match(RETURN);
                setState(189);
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
        enterRule(_localctx, 26, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(191);
                match(LBRAC);
                setState(195);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INPUT) | (1L << FN) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(192);
                            statement();
                        }
                    }
                    setState(197);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(198);
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

        public TerminalNode SEMICOLON() {
            return getToken(CimpleParser.SEMICOLON, 0);
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
        public VariableAssignmentContext setup;
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

        public List<VariableAssignmentContext> variableAssignment() {
            return getRuleContexts(VariableAssignmentContext.class);
        }

        public VariableAssignmentContext variableAssignment(int i) {
            return getRuleContext(VariableAssignmentContext.class, i);
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
        public InputStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INPUT() {
            return getToken(CimpleParser.INPUT, 0);
        }

        public TerminalNode ID() {
            return getToken(CimpleParser.ID, 0);
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
        public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FN() {
            return getToken(CimpleParser.FN, 0);
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

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public ParametersContext parameters() {
            return getRuleContext(ParametersContext.class, 0);
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

        public List<TerminalNode> ID() {
            return getTokens(CimpleParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(CimpleParser.ID, i);
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
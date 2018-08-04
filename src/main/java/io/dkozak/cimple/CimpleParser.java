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
            RPAREN = 26, LBRAC = 27, RBRAC = 28, STRING = 29, DOUBLE = 30, INT = 31, ID = 32, WS = 33;
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00d0\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\2\3\2" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\5\38\n\3\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4F\n\4" +
                    "\3\4\3\4\5\4J\n\4\3\4\3\4\5\4N\n\4\3\4\3\4\5\4R\n\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7" +
                    "\4{\n\4\f\4\16\4~\13\4\3\5\3\5\3\5\5\5\u0083\n\5\3\5\3\5\3\6\3\6\3\6\7" +
                    "\6\u008a\n\6\f\6\16\6\u008d\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3" +
                    "\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3" +
                    "\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b1\n\13\3\f\3\f\3" +
                    "\f\3\f\5\f\u00b7\n\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00bf\n\r\f\r\16\r\u00c2" +
                    "\13\r\3\16\3\16\3\16\3\17\3\17\7\17\u00c9\n\17\f\17\16\17\u00cc\13\17" +
                    "\3\17\3\17\3\17\2\3\6\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u00e6" +
                    "\2\37\3\2\2\2\4\67\3\2\2\2\6Q\3\2\2\2\b\177\3\2\2\2\n\u0086\3\2\2\2\f" +
                    "\u008e\3\2\2\2\16\u0098\3\2\2\2\20\u009c\3\2\2\2\22\u009f\3\2\2\2\24\u00b0" +
                    "\3\2\2\2\26\u00b2\3\2\2\2\30\u00bb\3\2\2\2\32\u00c3\3\2\2\2\34\u00c6\3" +
                    "\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3" +
                    "\2\2\2#$\7\2\2\3$\3\3\2\2\2%&\5\16\b\2&\'\7\22\2\2\'8\3\2\2\2()\5\22\n" +
                    "\2)*\7\22\2\2*8\3\2\2\2+,\5\20\t\2,-\7\22\2\2-8\3\2\2\2.8\5\24\13\2/8" +
                    "\5\f\7\2\60\61\5\b\5\2\61\62\7\22\2\2\628\3\2\2\2\638\5\26\f\2\64\65\5" +
                    "\32\16\2\65\66\7\22\2\2\668\3\2\2\2\67%\3\2\2\2\67(\3\2\2\2\67+\3\2\2" +
                    "\2\67.\3\2\2\2\67/\3\2\2\2\67\60\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\28" +
                    "\5\3\2\2\29:\b\4\1\2:R\5\b\5\2;=\7\f\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2" +
                    ">?\7\33\2\2?@\5\6\4\2@A\7\34\2\2AR\3\2\2\2BC\7\20\2\2CR\5\6\4\tDF\7\f" +
                    "\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GR\7!\2\2HJ\7\f\2\2IH\3\2\2\2IJ\3\2" +
                    "\2\2JK\3\2\2\2KR\7\"\2\2LN\7\f\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OR\7 " +
                    "\2\2PR\7\37\2\2Q9\3\2\2\2Q<\3\2\2\2QB\3\2\2\2QE\3\2\2\2QI\3\2\2\2QM\3" +
                    "\2\2\2QP\3\2\2\2R|\3\2\2\2ST\f\24\2\2TU\7\t\2\2U{\5\6\4\25VW\f\23\2\2" +
                    "WX\7\n\2\2X{\5\6\4\24YZ\f\22\2\2Z[\7\r\2\2[{\5\6\4\23\\]\f\21\2\2]^\7" +
                    "\13\2\2^{\5\6\4\22_`\f\20\2\2`a\7\f\2\2a{\5\6\4\21bc\f\17\2\2cd\7\3\2" +
                    "\2d{\5\6\4\20ef\f\16\2\2fg\7\4\2\2g{\5\6\4\17hi\f\r\2\2ij\7\5\2\2j{\5" +
                    "\6\4\16kl\f\f\2\2lm\7\6\2\2m{\5\6\4\rno\f\13\2\2op\7\7\2\2p{\5\6\4\fq" +
                    "r\f\n\2\2rs\7\b\2\2s{\5\6\4\13tu\f\b\2\2uv\7\16\2\2v{\5\6\4\twx\f\7\2" +
                    "\2xy\7\17\2\2y{\5\6\4\bzS\3\2\2\2zV\3\2\2\2zY\3\2\2\2z\\\3\2\2\2z_\3\2" +
                    "\2\2zb\3\2\2\2ze\3\2\2\2zh\3\2\2\2zk\3\2\2\2zn\3\2\2\2zq\3\2\2\2zt\3\2" +
                    "\2\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\7\3\2\2\2~|\3\2\2\2\177" +
                    "\u0080\7\"\2\2\u0080\u0082\7\33\2\2\u0081\u0083\5\n\6\2\u0082\u0081\3" +
                    "\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\34\2\2\u0085" +
                    "\t\3\2\2\2\u0086\u008b\5\6\4\2\u0087\u0088\7\32\2\2\u0088\u008a\5\6\4" +
                    "\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c" +
                    "\3\2\2\2\u008c\13\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\26\2\2\u008f" +
                    "\u0090\7\33\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7\22\2\2\u0092\u0093" +
                    "\5\6\4\2\u0093\u0094\7\22\2\2\u0094\u0095\5\16\b\2\u0095\u0096\7\34\2" +
                    "\2\u0096\u0097\5\34\17\2\u0097\r\3\2\2\2\u0098\u0099\7\"\2\2\u0099\u009a" +
                    "\7\21\2\2\u009a\u009b\5\6\4\2\u009b\17\3\2\2\2\u009c\u009d\7\23\2\2\u009d" +
                    "\u009e\5\6\4\2\u009e\21\3\2\2\2\u009f\u00a0\7\24\2\2\u00a0\u00a1\7\"\2" +
                    "\2\u00a1\23\3\2\2\2\u00a2\u00a3\7\27\2\2\u00a3\u00a4\7\33\2\2\u00a4\u00a5" +
                    "\5\6\4\2\u00a5\u00a6\7\34\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00b1\3\2\2" +
                    "\2\u00a8\u00a9\7\27\2\2\u00a9\u00aa\7\33\2\2\u00aa\u00ab\5\6\4\2\u00ab" +
                    "\u00ac\7\34\2\2\u00ac\u00ad\5\34\17\2\u00ad\u00ae\7\30\2\2\u00ae\u00af" +
                    "\5\34\17\2\u00af\u00b1\3\2\2\2\u00b0\u00a2\3\2\2\2\u00b0\u00a8\3\2\2\2" +
                    "\u00b1\25\3\2\2\2\u00b2\u00b3\7\25\2\2\u00b3\u00b4\7\"\2\2\u00b4\u00b6" +
                    "\7\33\2\2\u00b5\u00b7\5\30\r\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2" +
                    "\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\34\2\2\u00b9\u00ba\5\34\17\2\u00ba" +
                    "\27\3\2\2\2\u00bb\u00c0\7\"\2\2\u00bc\u00bd\7\32\2\2\u00bd\u00bf\7\"\2" +
                    "\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1" +
                    "\3\2\2\2\u00c1\31\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\31\2\2\u00c4" +
                    "\u00c5\5\6\4\2\u00c5\33\3\2\2\2\u00c6\u00ca\7\35\2\2\u00c7\u00c9\5\4\3" +
                    "\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb" +
                    "\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\36\2\2" +
                    "\u00ce\35\3\2\2\2\21!\67<EIMQz|\u0082\u008b\u00b0\u00b6\u00c0\u00ca";
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
            "RBRAC", "STRING", "DOUBLE", "INT", "ID", "WS"
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
                setState(79);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
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
                        expression(7);
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
                    case 6: {
                        _localctx = new DoubleConstantContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(75);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == MINUS) {
                            {
                                setState(74);
                                match(MINUS);
                            }
                        }

                        setState(77);
                        match(DOUBLE);
                    }
                    break;
                    case 7: {
                        _localctx = new StringConstantContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(78);
                        match(STRING);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(122);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(120);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                                case 1: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(81);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(82);
                                    match(MULT);
                                    setState(83);
                                    expression(19);
                                }
                                break;
                                case 2: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(84);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(85);
                                    match(DIV);
                                    setState(86);
                                    expression(18);
                                }
                                break;
                                case 3: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(87);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(88);
                                    match(MOD);
                                    setState(89);
                                    expression(17);
                                }
                                break;
                                case 4: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(90);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(91);
                                    match(PLUS);
                                    setState(92);
                                    expression(16);
                                }
                                break;
                                case 5: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(93);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(94);
                                    match(MINUS);
                                    setState(95);
                                    expression(15);
                                }
                                break;
                                case 6: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(96);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(97);
                                    match(EQUALS);
                                    setState(98);
                                    expression(14);
                                }
                                break;
                                case 7: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(99);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(100);
                                    match(NOT_EQUALS);
                                    setState(101);
                                    expression(13);
                                }
                                break;
                                case 8: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(102);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(103);
                                    match(LT);
                                    setState(104);
                                    expression(12);
                                }
                                break;
                                case 9: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(105);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(106);
                                    match(LE);
                                    setState(107);
                                    expression(11);
                                }
                                break;
                                case 10: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(108);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(109);
                                    match(GT);
                                    setState(110);
                                    expression(10);
                                }
                                break;
                                case 11: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(111);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(112);
                                    match(GE);
                                    setState(113);
                                    expression(9);
                                }
                                break;
                                case 12: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(114);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(115);
                                    match(AND);
                                    setState(116);
                                    expression(7);
                                }
                                break;
                                case 13: {
                                    _localctx = new BinExprContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(117);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(118);
                                    match(OR);
                                    setState(119);
                                    expression(6);
                                }
                                break;
                            }
                        }
                    }
                    setState(124);
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
                setState(125);
                match(ID);
                setState(126);
                match(LPAREN);
                setState(128);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << LPAREN) | (1L << STRING) | (1L << DOUBLE) | (1L << INT) | (1L << ID))) != 0)) {
                    {
                        setState(127);
                        arguments();
                    }
                }

                setState(130);
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
                setState(132);
                expression(0);
                setState(137);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(133);
                            match(COMMA);
                            setState(134);
                            expression(0);
                        }
                    }
                    setState(139);
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
                setState(140);
                match(FOR);
                setState(141);
                match(LPAREN);
                setState(142);
                ((ForLoopContext) _localctx).setup = variableAssignment();
                setState(143);
                match(SEMICOLON);
                setState(144);
                expression(0);
                setState(145);
                match(SEMICOLON);
                setState(146);
                ((ForLoopContext) _localctx).increment = variableAssignment();
                setState(147);
                match(RPAREN);
                setState(148);
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
                setState(150);
                match(ID);
                setState(151);
                match(ASSIGN);
                setState(152);
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
                setState(154);
                match(PRINT);
                setState(155);
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
                setState(157);
                match(INPUT);
                setState(158);
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
            setState(174);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                case 1:
                    _localctx = new IfContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(160);
                    match(IF);
                    setState(161);
                    match(LPAREN);
                    setState(162);
                    expression(0);
                    setState(163);
                    match(RPAREN);
                    setState(164);
                    block();
                }
                break;
                case 2:
                    _localctx = new IfElseContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(166);
                    match(IF);
                    setState(167);
                    match(LPAREN);
                    setState(168);
                    expression(0);
                    setState(169);
                    match(RPAREN);
                    setState(170);
                    block();
                    setState(171);
                    match(ELSE);
                    setState(172);
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
                setState(176);
                match(FN);
                setState(177);
                match(ID);
                setState(178);
                match(LPAREN);
                setState(180);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ID) {
                    {
                        setState(179);
                        parameters();
                    }
                }

                setState(182);
                match(RPAREN);
                setState(183);
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
                setState(185);
                match(ID);
                setState(190);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(186);
                            match(COMMA);
                            setState(187);
                            match(ID);
                        }
                    }
                    setState(192);
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
                setState(193);
                match(RETURN);
                setState(194);
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
                setState(196);
                match(LBRAC);
                setState(200);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INPUT) | (1L << FN) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(197);
                            statement();
                        }
                    }
                    setState(202);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(203);
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
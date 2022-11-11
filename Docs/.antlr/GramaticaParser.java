// Generated from /home/fabiotakashinagamine/Documentos/Compilador_FInal/Docs/Gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, AP=5, FP=6, SC=7, OP=8, ID=9, ATTR=10, 
		NUMBER=11;
	public static final int
		RULE_prog = 0, RULE_cod = 1, RULE_blocoCod = 2, RULE_blocoCodLeitura = 3, 
		RULE_blocoCodEscrita = 4, RULE_blocoCodAtrib = 5, RULE_expr = 6, RULE_term = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "cod", "blocoCod", "blocoCodLeitura", "blocoCodEscrita", "blocoCodAtrib", 
			"expr", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'prog'", "'fimProg'", "'ler'", "'escreva'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "AP", "FP", "SC", "OP", "ID", "ATTR", "NUMBER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public CodContext cod() {
			return getRuleContext(CodContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(17);
			cod();
			setState(18);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodContext extends ParserRuleContext {
		public List<BlocoCodContext> blocoCod() {
			return getRuleContexts(BlocoCodContext.class);
		}
		public BlocoCodContext blocoCod(int i) {
			return getRuleContext(BlocoCodContext.class,i);
		}
		public CodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cod; }
	}

	public final CodContext cod() throws RecognitionException {
		CodContext _localctx = new CodContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				blocoCod();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoCodContext extends ParserRuleContext {
		public BlocoCodLeituraContext blocoCodLeitura() {
			return getRuleContext(BlocoCodLeituraContext.class,0);
		}
		public BlocoCodEscritaContext blocoCodEscrita() {
			return getRuleContext(BlocoCodEscritaContext.class,0);
		}
		public BlocoCodAtribContext blocoCodAtrib() {
			return getRuleContext(BlocoCodAtribContext.class,0);
		}
		public BlocoCodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoCod; }
	}

	public final BlocoCodContext blocoCod() throws RecognitionException {
		BlocoCodContext _localctx = new BlocoCodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blocoCod);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				blocoCodLeitura();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				blocoCodEscrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				blocoCodAtrib();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoCodLeituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode SC() { return getToken(GramaticaParser.SC, 0); }
		public BlocoCodLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoCodLeitura; }
	}

	public final BlocoCodLeituraContext blocoCodLeitura() throws RecognitionException {
		BlocoCodLeituraContext _localctx = new BlocoCodLeituraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blocoCodLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__2);
			setState(31);
			match(AP);
			setState(32);
			match(ID);
			setState(33);
			match(FP);
			setState(34);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoCodEscritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode SC() { return getToken(GramaticaParser.SC, 0); }
		public BlocoCodEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoCodEscrita; }
	}

	public final BlocoCodEscritaContext blocoCodEscrita() throws RecognitionException {
		BlocoCodEscritaContext _localctx = new BlocoCodEscritaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blocoCodEscrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__3);
			setState(37);
			match(AP);
			setState(38);
			match(ID);
			setState(39);
			match(FP);
			setState(40);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoCodAtribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(GramaticaParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(GramaticaParser.SC, 0); }
		public BlocoCodAtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoCodAtrib; }
	}

	public final BlocoCodAtribContext blocoCodAtrib() throws RecognitionException {
		BlocoCodAtribContext _localctx = new BlocoCodAtribContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blocoCodAtrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(ID);
			setState(43);
			match(ATTR);
			setState(44);
			expr();
			setState(45);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(GramaticaParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(GramaticaParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			term();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(48);
				match(OP);
				setState(49);
				term();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(GramaticaParser.NUMBER, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r<\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\3"+
		"\6\3\30\n\3\r\3\16\3\31\3\4\3\4\3\4\5\4\37\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b\65\n\b\f"+
		"\b\16\b8\13\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\4\2\13\13\r\r\2"+
		"\67\2\22\3\2\2\2\4\27\3\2\2\2\6\36\3\2\2\2\b \3\2\2\2\n&\3\2\2\2\f,\3"+
		"\2\2\2\16\61\3\2\2\2\209\3\2\2\2\22\23\7\3\2\2\23\24\5\4\3\2\24\25\7\4"+
		"\2\2\25\3\3\2\2\2\26\30\5\6\4\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2"+
		"\2\2\31\32\3\2\2\2\32\5\3\2\2\2\33\37\5\b\5\2\34\37\5\n\6\2\35\37\5\f"+
		"\7\2\36\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\7\3\2\2\2 !\7\5\2\2"+
		"!\"\7\7\2\2\"#\7\13\2\2#$\7\b\2\2$%\7\t\2\2%\t\3\2\2\2&\'\7\6\2\2\'(\7"+
		"\7\2\2()\7\13\2\2)*\7\b\2\2*+\7\t\2\2+\13\3\2\2\2,-\7\13\2\2-.\7\f\2\2"+
		"./\5\16\b\2/\60\7\t\2\2\60\r\3\2\2\2\61\66\5\20\t\2\62\63\7\n\2\2\63\65"+
		"\5\20\t\2\64\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\17"+
		"\3\2\2\28\66\3\2\2\29:\t\2\2\2:\21\3\2\2\2\5\31\36\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
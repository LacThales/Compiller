// Generated from atribuicao.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class atribuicaoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, ID=28, NUM=29, NUM_DECIMAL=30, Ws=31;
	public static final int
		RULE_comece = 0, RULE_comando = 1, RULE_read = 2, RULE_comando_print = 3, 
		RULE_aspas = 4, RULE_print = 5, RULE_l_par = 6, RULE_r_par = 7, RULE_l_keys = 8, 
		RULE_r_keys = 9, RULE_texto = 10, RULE_comando_matematico = 11, RULE_operador_matematico = 12, 
		RULE_comando_declaracao = 13, RULE_comando_atribuicao = 14, RULE_comando_input = 15, 
		RULE_input = 16, RULE_comando_op_logico = 17, RULE_comando_op_do = 18, 
		RULE_comando_op_logico_caso_nao = 19, RULE_condicional = 20, RULE_repeticao = 21, 
		RULE_tipo = 22, RULE_operador = 23, RULE_termine = 24, RULE_id = 25, RULE_num = 26, 
		RULE_num_decimal = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"comece", "comando", "read", "comando_print", "aspas", "print", "l_par", 
			"r_par", "l_keys", "r_keys", "texto", "comando_matematico", "operador_matematico", 
			"comando_declaracao", "comando_atribuicao", "comando_input", "input", 
			"comando_op_logico", "comando_op_do", "comando_op_logico_caso_nao", "condicional", 
			"repeticao", "tipo", "operador", "termine", "id", "num", "num_decimal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fazer_leitura'", "'\"'", "'joga_na_tela'", "'('", "')'", "'{'", 
			"'}'", "'+'", "'*'", "'/'", "'-'", "'escreva'", "'caso_sim'", "'caso_nao'", 
			"'caso_nao_e'", "'enquanto'", "'fa\\u00E7a'", "'numero_inteiro'", "'numero_quebrado'", 
			"'texto'", "'caracter'", "'booleano'", "'='", "'<'", "'>'", "'!='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "NUM", "NUM_DECIMAL", "Ws"
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
	public String getGrammarFileName() { return "atribuicao.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public atribuicaoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ComeceContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComeceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterComece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitComece(this);
		}
	}

	public final ComeceContext comece() throws RecognitionException {
		ComeceContext _localctx = new ComeceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << NUM) | (1L << NUM_DECIMAL))) != 0)) {
				{
				{
				setState(56);
				comando();
				}
				}
				setState(61);
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

	public static class ComandoContext extends ParserRuleContext {
		public Comando_declaracaoContext comando_declaracao() {
			return getRuleContext(Comando_declaracaoContext.class,0);
		}
		public Comando_atribuicaoContext comando_atribuicao() {
			return getRuleContext(Comando_atribuicaoContext.class,0);
		}
		public Comando_printContext comando_print() {
			return getRuleContext(Comando_printContext.class,0);
		}
		public Comando_op_logicoContext comando_op_logico() {
			return getRuleContext(Comando_op_logicoContext.class,0);
		}
		public Comando_matematicoContext comando_matematico() {
			return getRuleContext(Comando_matematicoContext.class,0);
		}
		public Comando_inputContext comando_input() {
			return getRuleContext(Comando_inputContext.class,0);
		}
		public Comando_op_doContext comando_op_do() {
			return getRuleContext(Comando_op_doContext.class,0);
		}
		public Comando_op_logico_caso_naoContext comando_op_logico_caso_nao() {
			return getRuleContext(Comando_op_logico_caso_naoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				comando_declaracao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				comando_atribuicao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				comando_print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				comando_op_logico();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				comando_matematico();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				comando_input();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				comando_op_do();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				comando_op_logico_caso_nao();
				}
				break;
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

	public static class ReadContext extends ParserRuleContext {
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__0);
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

	public static class Comando_printContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public L_parContext l_par() {
			return getRuleContext(L_parContext.class,0);
		}
		public R_parContext r_par() {
			return getRuleContext(R_parContext.class,0);
		}
		public TermineContext termine() {
			return getRuleContext(TermineContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Comando_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterComando_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitComando_print(this);
		}
	}

	public final Comando_printContext comando_print() throws RecognitionException {
		Comando_printContext _localctx = new Comando_printContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comando_print);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			print();
			setState(75);
			l_par();
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(76);
				id();
				}
				break;
			case T__1:
				{
				setState(77);
				texto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(80);
			r_par();
			setState(81);
			termine();
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					comando();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class AspasContext extends ParserRuleContext {
		public AspasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aspas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterAspas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitAspas(this);
		}
	}

	public final AspasContext aspas() throws RecognitionException {
		AspasContext _localctx = new AspasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aspas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__2);
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

	public static class L_parContext extends ParserRuleContext {
		public L_parContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterL_par(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitL_par(this);
		}
	}

	public final L_parContext l_par() throws RecognitionException {
		L_parContext _localctx = new L_parContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_l_par);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__3);
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

	public static class R_parContext extends ParserRuleContext {
		public R_parContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterR_par(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitR_par(this);
		}
	}

	public final R_parContext r_par() throws RecognitionException {
		R_parContext _localctx = new R_parContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_r_par);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__4);
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

	public static class L_keysContext extends ParserRuleContext {
		public L_keysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_keys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterL_keys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitL_keys(this);
		}
	}

	public final L_keysContext l_keys() throws RecognitionException {
		L_keysContext _localctx = new L_keysContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_l_keys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__5);
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

	public static class R_keysContext extends ParserRuleContext {
		public R_keysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_keys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterR_keys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitR_keys(this);
		}
	}

	public final R_keysContext r_keys() throws RecognitionException {
		R_keysContext _localctx = new R_keysContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_r_keys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__6);
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

	public static class TextoContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitTexto(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_texto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__1);
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				id();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(106);
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

	public static class Comando_matematicoContext extends ParserRuleContext {
		public List<Operador_matematicoContext> operador_matematico() {
			return getRuleContexts(Operador_matematicoContext.class);
		}
		public Operador_matematicoContext operador_matematico(int i) {
			return getRuleContext(Operador_matematicoContext.class,i);
		}
		public TermineContext termine() {
			return getRuleContext(TermineContext.class,0);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public List<Num_decimalContext> num_decimal() {
			return getRuleContexts(Num_decimalContext.class);
		}
		public Num_decimalContext num_decimal(int i) {
			return getRuleContext(Num_decimalContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Comando_matematicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_matematico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterComando_matematico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitComando_matematico(this);
		}
	}

	public final Comando_matematicoContext comando_matematico() throws RecognitionException {
		Comando_matematicoContext _localctx = new Comando_matematicoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comando_matematico);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(108);
				num();
				}
				break;
			case NUM_DECIMAL:
				{
				setState(109);
				num_decimal();
				}
				break;
			case ID:
				{
				setState(110);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(113);
			operador_matematico();
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(114);
				num();
				}
				break;
			case NUM_DECIMAL:
				{
				setState(115);
				num_decimal();
				}
				break;
			case ID:
				{
				setState(116);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				{
				setState(119);
				operador_matematico();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUM) | (1L << NUM_DECIMAL))) != 0)) {
				{
				setState(128);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM:
					{
					setState(125);
					num();
					}
					break;
				case NUM_DECIMAL:
					{
					setState(126);
					num_decimal();
					}
					break;
				case ID:
					{
					setState(127);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			termine();
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					comando();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Operador_matematicoContext extends ParserRuleContext {
		public Operador_matematicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_matematico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterOperador_matematico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitOperador_matematico(this);
		}
	}

	public final Operador_matematicoContext operador_matematico() throws RecognitionException {
		Operador_matematicoContext _localctx = new Operador_matematicoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operador_matematico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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

	public static class Comando_declaracaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Comando_atribuicaoContext comando_atribuicao() {
			return getRuleContext(Comando_atribuicaoContext.class,0);
		}
		public Comando_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterComando_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitComando_declaracao(this);
		}
	}

	public final Comando_declaracaoContext comando_declaracao() throws RecognitionException {
		Comando_declaracaoContext _localctx = new Comando_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comando_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			tipo();
			setState(143);
			comando_atribuicao();
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

	public static class Comando_atribuicaoContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public TermineContext termine() {
			return getRuleContext(TermineContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Num_decimalContext num_decimal() {
			return getRuleContext(Num_decimalContext.class,0);
		}
		public Comando_matematicoContext comando_matematico() {
			return getRuleContext(Comando_matematicoContext.class,0);
		}
		public Comando_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterComando_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitComando_atribuicao(this);
		}
	}

	public final Comando_atribuicaoContext comando_atribuicao() throws RecognitionException {
		Comando_atribuicaoContext _localctx = new Comando_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comando_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			id();
			setState(146);
			operador();
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(147);
				id();
				}
				break;
			case 2:
				{
				setState(148);
				num();
				}
				break;
			case 3:
				{
				setState(149);
				num_decimal();
				}
				break;
			case 4:
				{
				setState(150);
				comando_matematico();
				}
				break;
			}
			setState(153);
			termine();
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

	public static class Comando_inputContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public L_parContext l_par() {
			return getRuleContext(L_parContext.class,0);
		}
		public R_parContext r_par() {
			return getRuleContext(R_parContext.class,0);
		}
		public TermineContext termine() {
			return getRuleContext(TermineContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Comando_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterComando_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitComando_input(this);
		}
	}

	public final Comando_inputContext comando_input() throws RecognitionException {
		Comando_inputContext _localctx = new Comando_inputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comando_input);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			input();
			setState(156);
			l_par();
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(157);
				id();
				}
				break;
			case T__1:
				{
				setState(158);
				texto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(161);
			r_par();
			setState(162);
			termine();
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(163);
					comando();
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__11);
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

	public static class Comando_op_logicoContext extends ParserRuleContext {
		public L_parContext l_par() {
			return getRuleContext(L_parContext.class,0);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public R_parContext r_par() {
			return getRuleContext(R_parContext.class,0);
		}
		public L_keysContext l_keys() {
			return getRuleContext(L_keysContext.class,0);
		}
		public R_keysContext r_keys() {
			return getRuleContext(R_keysContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public List<Num_decimalContext> num_decimal() {
			return getRuleContexts(Num_decimalContext.class);
		}
		public Num_decimalContext num_decimal(int i) {
			return getRuleContext(Num_decimalContext.class,i);
		}
		public List<AspasContext> aspas() {
			return getRuleContexts(AspasContext.class);
		}
		public AspasContext aspas(int i) {
			return getRuleContext(AspasContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Comando_op_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_op_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterComando_op_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitComando_op_logico(this);
		}
	}

	public final Comando_op_logicoContext comando_op_logico() throws RecognitionException {
		Comando_op_logicoContext _localctx = new Comando_op_logicoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comando_op_logico);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
				{
				setState(171);
				repeticao();
				}
				break;
			case T__12:
			case T__13:
			case T__14:
				{
				setState(172);
				condicional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(175);
			l_par();
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(176);
				id();
				}
				break;
			case NUM:
				{
				setState(177);
				num();
				}
				break;
			case NUM_DECIMAL:
				{
				setState(178);
				num_decimal();
				}
				break;
			case T__1:
				{
				setState(179);
				aspas();
				setState(180);
				id();
				setState(181);
				aspas();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(185);
			operador();
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(186);
				id();
				}
				break;
			case NUM:
				{
				setState(187);
				num();
				}
				break;
			case NUM_DECIMAL:
				{
				setState(188);
				num_decimal();
				}
				break;
			case T__1:
				{
				setState(189);
				aspas();
				setState(190);
				id();
				setState(191);
				aspas();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(195);
			r_par();
			setState(196);
			l_keys();
			{
			setState(197);
			comando();
			}
			setState(198);
			r_keys();
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					comando();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Comando_op_doContext extends ParserRuleContext {
		public List<RepeticaoContext> repeticao() {
			return getRuleContexts(RepeticaoContext.class);
		}
		public RepeticaoContext repeticao(int i) {
			return getRuleContext(RepeticaoContext.class,i);
		}
		public L_keysContext l_keys() {
			return getRuleContext(L_keysContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public R_keysContext r_keys() {
			return getRuleContext(R_keysContext.class,0);
		}
		public L_parContext l_par() {
			return getRuleContext(L_parContext.class,0);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public R_parContext r_par() {
			return getRuleContext(R_parContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public List<Num_decimalContext> num_decimal() {
			return getRuleContexts(Num_decimalContext.class);
		}
		public Num_decimalContext num_decimal(int i) {
			return getRuleContext(Num_decimalContext.class,i);
		}
		public List<AspasContext> aspas() {
			return getRuleContexts(AspasContext.class);
		}
		public AspasContext aspas(int i) {
			return getRuleContext(AspasContext.class,i);
		}
		public List<TermineContext> termine() {
			return getRuleContexts(TermineContext.class);
		}
		public TermineContext termine(int i) {
			return getRuleContext(TermineContext.class,i);
		}
		public Comando_op_doContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_op_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterComando_op_do(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitComando_op_do(this);
		}
	}

	public final Comando_op_doContext comando_op_do() throws RecognitionException {
		Comando_op_doContext _localctx = new Comando_op_doContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comando_op_do);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			repeticao();
			setState(206);
			l_keys();
			setState(207);
			comando();
			setState(208);
			r_keys();
			setState(209);
			repeticao();
			setState(210);
			l_par();
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(211);
				id();
				}
				break;
			case NUM:
				{
				setState(212);
				num();
				}
				break;
			case NUM_DECIMAL:
				{
				setState(213);
				num_decimal();
				}
				break;
			case T__1:
				{
				setState(214);
				aspas();
				setState(215);
				id();
				setState(216);
				aspas();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(220);
			operador();
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(221);
				id();
				}
				break;
			case NUM:
				{
				setState(222);
				num();
				}
				break;
			case NUM_DECIMAL:
				{
				setState(223);
				num_decimal();
				}
				break;
			case T__1:
				{
				setState(224);
				aspas();
				setState(225);
				id();
				setState(226);
				aspas();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(230);
			r_par();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << NUM) | (1L << NUM_DECIMAL))) != 0)) {
				{
				{
				setState(231);
				comando();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(237);
					termine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(240); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Comando_op_logico_caso_naoContext extends ParserRuleContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public L_keysContext l_keys() {
			return getRuleContext(L_keysContext.class,0);
		}
		public R_keysContext r_keys() {
			return getRuleContext(R_keysContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Comando_op_logico_caso_naoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_op_logico_caso_nao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterComando_op_logico_caso_nao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitComando_op_logico_caso_nao(this);
		}
	}

	public final Comando_op_logico_caso_naoContext comando_op_logico_caso_nao() throws RecognitionException {
		Comando_op_logico_caso_naoContext _localctx = new Comando_op_logico_caso_naoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comando_op_logico_caso_nao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			condicional();
			setState(243);
			l_keys();
			{
			setState(244);
			comando();
			}
			setState(245);
			r_keys();
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(246);
					comando();
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class CondicionalContext extends ParserRuleContext {
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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

	public static class RepeticaoContext extends ParserRuleContext {
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_repeticao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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

	public static class OperadorContext extends ParserRuleContext {
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitOperador(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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

	public static class TermineContext extends ParserRuleContext {
		public TermineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterTermine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitTermine(this);
		}
	}

	public final TermineContext termine() throws RecognitionException {
		TermineContext _localctx = new TermineContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_termine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__26);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atribuicaoParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ID);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(atribuicaoParser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(NUM);
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

	public static class Num_decimalContext extends ParserRuleContext {
		public TerminalNode NUM_DECIMAL() { return getToken(atribuicaoParser.NUM_DECIMAL, 0); }
		public Num_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterNum_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitNum_decimal(this);
		}
	}

	public final Num_decimalContext num_decimal() throws RecognitionException {
		Num_decimalContext _localctx = new Num_decimalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_num_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(NUM_DECIMAL);
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
		"\u0004\u0001\u001f\u010d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0001\u0000\u0005\u0000:\b\u0000\n\u0000\f\u0000=\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001G\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003T\b\u0003\n\u0003\f\u0003W\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0004\ng\b\n\u000b\n\f\nh\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000bp\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000bv\b\u000b\u0001\u000b\u0005\u000by\b\u000b\n\u000b"+
		"\f\u000b|\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0081"+
		"\b\u000b\n\u000b\f\u000b\u0084\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0088\b\u000b\n\u000b\f\u000b\u008b\t\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0098\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a0\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00a5\b\u000f\n\u000f\f\u000f\u00a8"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00ae"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00b8\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00c2\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u00c9\b\u0011\n\u0011\f\u0011\u00cc\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00db\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00e5\b\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00e9\b\u0012\n\u0012"+
		"\f\u0012\u00ec\t\u0012\u0001\u0012\u0004\u0012\u00ef\b\u0012\u000b\u0012"+
		"\f\u0012\u00f0\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u00f8\b\u0013\n\u0013\f\u0013\u00fb\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0000\u0000\u001c\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.0246\u0000\u0005\u0001\u0000\b\u000b\u0001\u0000\r\u000f\u0001"+
		"\u0000\u0010\u0011\u0001\u0000\u0012\u0016\u0001\u0000\u0017\u001a\u011a"+
		"\u0000;\u0001\u0000\u0000\u0000\u0002F\u0001\u0000\u0000\u0000\u0004H"+
		"\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000\bX\u0001\u0000"+
		"\u0000\u0000\nZ\u0001\u0000\u0000\u0000\f\\\u0001\u0000\u0000\u0000\u000e"+
		"^\u0001\u0000\u0000\u0000\u0010`\u0001\u0000\u0000\u0000\u0012b\u0001"+
		"\u0000\u0000\u0000\u0014d\u0001\u0000\u0000\u0000\u0016o\u0001\u0000\u0000"+
		"\u0000\u0018\u008c\u0001\u0000\u0000\u0000\u001a\u008e\u0001\u0000\u0000"+
		"\u0000\u001c\u0091\u0001\u0000\u0000\u0000\u001e\u009b\u0001\u0000\u0000"+
		"\u0000 \u00a9\u0001\u0000\u0000\u0000\"\u00ad\u0001\u0000\u0000\u0000"+
		"$\u00cd\u0001\u0000\u0000\u0000&\u00f2\u0001\u0000\u0000\u0000(\u00fc"+
		"\u0001\u0000\u0000\u0000*\u00fe\u0001\u0000\u0000\u0000,\u0100\u0001\u0000"+
		"\u0000\u0000.\u0102\u0001\u0000\u0000\u00000\u0104\u0001\u0000\u0000\u0000"+
		"2\u0106\u0001\u0000\u0000\u00004\u0108\u0001\u0000\u0000\u00006\u010a"+
		"\u0001\u0000\u0000\u00008:\u0003\u0002\u0001\u000098\u0001\u0000\u0000"+
		"\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<\u0001\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		">G\u0003\u001a\r\u0000?G\u0003\u001c\u000e\u0000@G\u0003\u0006\u0003\u0000"+
		"AG\u0003\"\u0011\u0000BG\u0003\u0016\u000b\u0000CG\u0003\u001e\u000f\u0000"+
		"DG\u0003$\u0012\u0000EG\u0003&\u0013\u0000F>\u0001\u0000\u0000\u0000F"+
		"?\u0001\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000FA\u0001\u0000\u0000"+
		"\u0000FB\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000FE\u0001\u0000\u0000\u0000G\u0003\u0001\u0000\u0000\u0000"+
		"HI\u0005\u0001\u0000\u0000I\u0005\u0001\u0000\u0000\u0000JK\u0003\n\u0005"+
		"\u0000KN\u0003\f\u0006\u0000LO\u00032\u0019\u0000MO\u0003\u0014\n\u0000"+
		"NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PQ\u0003\u000e\u0007\u0000QU\u00030\u0018\u0000RT\u0003\u0002\u0001"+
		"\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0007\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000XY\u0005\u0002\u0000\u0000Y\t\u0001\u0000\u0000"+
		"\u0000Z[\u0005\u0003\u0000\u0000[\u000b\u0001\u0000\u0000\u0000\\]\u0005"+
		"\u0004\u0000\u0000]\r\u0001\u0000\u0000\u0000^_\u0005\u0005\u0000\u0000"+
		"_\u000f\u0001\u0000\u0000\u0000`a\u0005\u0006\u0000\u0000a\u0011\u0001"+
		"\u0000\u0000\u0000bc\u0005\u0007\u0000\u0000c\u0013\u0001\u0000\u0000"+
		"\u0000df\u0005\u0002\u0000\u0000eg\u00032\u0019\u0000fe\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005\u0002\u0000\u0000k\u0015"+
		"\u0001\u0000\u0000\u0000lp\u00034\u001a\u0000mp\u00036\u001b\u0000np\u0003"+
		"2\u0019\u0000ol\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000on\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qu\u0003\u0018\f\u0000rv\u0003"+
		"4\u001a\u0000sv\u00036\u001b\u0000tv\u00032\u0019\u0000ur\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vz\u0001"+
		"\u0000\u0000\u0000wy\u0003\u0018\f\u0000xw\u0001\u0000\u0000\u0000y|\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{\u0082\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}\u0081\u0003"+
		"4\u001a\u0000~\u0081\u00036\u001b\u0000\u007f\u0081\u00032\u0019\u0000"+
		"\u0080}\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0089"+
		"\u00030\u0018\u0000\u0086\u0088\u0003\u0002\u0001\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0017\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0007"+
		"\u0000\u0000\u0000\u008d\u0019\u0001\u0000\u0000\u0000\u008e\u008f\u0003"+
		",\u0016\u0000\u008f\u0090\u0003\u001c\u000e\u0000\u0090\u001b\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u00032\u0019\u0000\u0092\u0097\u0003.\u0017\u0000"+
		"\u0093\u0098\u00032\u0019\u0000\u0094\u0098\u00034\u001a\u0000\u0095\u0098"+
		"\u00036\u001b\u0000\u0096\u0098\u0003\u0016\u000b\u0000\u0097\u0093\u0001"+
		"\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u00030\u0018\u0000\u009a\u001d\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0003 \u0010\u0000\u009c\u009f\u0003\f\u0006"+
		"\u0000\u009d\u00a0\u00032\u0019\u0000\u009e\u00a0\u0003\u0014\n\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\u000e\u0007\u0000"+
		"\u00a2\u00a6\u00030\u0018\u0000\u00a3\u00a5\u0003\u0002\u0001\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u001f\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005\f\u0000\u0000\u00aa!\u0001\u0000\u0000\u0000\u00ab\u00ae"+
		"\u0003*\u0015\u0000\u00ac\u00ae\u0003(\u0014\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u00b7\u0003\f\u0006\u0000\u00b0\u00b8\u00032\u0019"+
		"\u0000\u00b1\u00b8\u00034\u001a\u0000\u00b2\u00b8\u00036\u001b\u0000\u00b3"+
		"\u00b4\u0003\b\u0004\u0000\u00b4\u00b5\u00032\u0019\u0000\u00b5\u00b6"+
		"\u0003\b\u0004\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b1\u0001\u0000\u0000\u0000\u00b7\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00c1\u0003.\u0017\u0000\u00ba\u00c2\u00032\u0019"+
		"\u0000\u00bb\u00c2\u00034\u001a\u0000\u00bc\u00c2\u00036\u001b\u0000\u00bd"+
		"\u00be\u0003\b\u0004\u0000\u00be\u00bf\u00032\u0019\u0000\u00bf\u00c0"+
		"\u0003\b\u0004\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00ba\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000\u0000\u0000\u00c1\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0003\u000e\u0007\u0000\u00c4\u00c5\u0003"+
		"\u0010\b\u0000\u00c5\u00c6\u0003\u0002\u0001\u0000\u00c6\u00ca\u0003\u0012"+
		"\t\u0000\u00c7\u00c9\u0003\u0002\u0001\u0000\u00c8\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb#\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003*\u0015\u0000\u00ce"+
		"\u00cf\u0003\u0010\b\u0000\u00cf\u00d0\u0003\u0002\u0001\u0000\u00d0\u00d1"+
		"\u0003\u0012\t\u0000\u00d1\u00d2\u0003*\u0015\u0000\u00d2\u00da\u0003"+
		"\f\u0006\u0000\u00d3\u00db\u00032\u0019\u0000\u00d4\u00db\u00034\u001a"+
		"\u0000\u00d5\u00db\u00036\u001b\u0000\u00d6\u00d7\u0003\b\u0004\u0000"+
		"\u00d7\u00d8\u00032\u0019\u0000\u00d8\u00d9\u0003\b\u0004\u0000\u00d9"+
		"\u00db\u0001\u0000\u0000\u0000\u00da\u00d3\u0001\u0000\u0000\u0000\u00da"+
		"\u00d4\u0001\u0000\u0000\u0000\u00da\u00d5\u0001\u0000\u0000\u0000\u00da"+
		"\u00d6\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00e4\u0003.\u0017\u0000\u00dd\u00e5\u00032\u0019\u0000\u00de\u00e5\u0003"+
		"4\u001a\u0000\u00df\u00e5\u00036\u001b\u0000\u00e0\u00e1\u0003\b\u0004"+
		"\u0000\u00e1\u00e2\u00032\u0019\u0000\u00e2\u00e3\u0003\b\u0004\u0000"+
		"\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e4\u00de\u0001\u0000\u0000\u0000\u00e4\u00df\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e0\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00ea\u0003\u000e\u0007\u0000\u00e7\u00e9\u0003\u0002\u0001\u0000"+
		"\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ef\u00030\u0018\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1%\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0003(\u0014\u0000\u00f3\u00f4\u0003\u0010\b\u0000\u00f4\u00f5\u0003"+
		"\u0002\u0001\u0000\u00f5\u00f9\u0003\u0012\t\u0000\u00f6\u00f8\u0003\u0002"+
		"\u0001\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fa\'\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0007\u0001\u0000\u0000\u00fd)\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0007\u0002\u0000\u0000\u00ff+\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0007\u0003\u0000\u0000\u0101-\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0007\u0004\u0000\u0000\u0103/\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"\u001b\u0000\u0000\u01051\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u001c"+
		"\u0000\u0000\u01073\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u001d\u0000"+
		"\u0000\u01095\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u001e\u0000\u0000"+
		"\u010b7\u0001\u0000\u0000\u0000\u0017;FNUhouz\u0080\u0082\u0089\u0097"+
		"\u009f\u00a6\u00ad\u00b7\u00c1\u00ca\u00da\u00e4\u00ea\u00f0\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
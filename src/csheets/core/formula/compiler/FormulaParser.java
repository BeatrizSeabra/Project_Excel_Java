// $ANTLR 3.5.2 ../src/csheets/core/formula/compiler/Formula.g 2014-04-29 14:32:36

package csheets.core.formula.compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class FormulaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS", "AMP", "CELL_REF", "COLON", 
		"COMMA", "DIGIT", "DIV", "EQ", "EXCL", "FUNCTION", "GT", "GTEQ", "LETTER", 
		"LPAR", "LT", "LTEQ", "MINUS", "MULTI", "NEQ", "NUMBER", "PERCENT", "PLUS", 
		"POWER", "QUOT", "RPAR", "SEMI", "STRING", "WS"
	};
	public static final int EOF=-1;
	public static final int ABS=4;
	public static final int AMP=5;
	public static final int CELL_REF=6;
	public static final int COLON=7;
	public static final int COMMA=8;
	public static final int DIGIT=9;
	public static final int DIV=10;
	public static final int EQ=11;
	public static final int EXCL=12;
	public static final int FUNCTION=13;
	public static final int GT=14;
	public static final int GTEQ=15;
	public static final int LETTER=16;
	public static final int LPAR=17;
	public static final int LT=18;
	public static final int LTEQ=19;
	public static final int MINUS=20;
	public static final int MULTI=21;
	public static final int NEQ=22;
	public static final int NUMBER=23;
	public static final int PERCENT=24;
	public static final int PLUS=25;
	public static final int POWER=26;
	public static final int QUOT=27;
	public static final int RPAR=28;
	public static final int SEMI=29;
	public static final int STRING=30;
	public static final int WS=31;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public FormulaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public FormulaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return FormulaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "../src/csheets/core/formula/compiler/Formula.g"; }


		protected void mismatch(IntStream input, int ttype, BitSet follow)
			throws RecognitionException 
		{
	    	throw new MismatchedTokenException(ttype, input);
		}

		public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow)
			throws RecognitionException 
		{
			throw e; 
		}
		
		@Override
	  	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
	    	throw new MismatchedTokenException(ttype, input);
	 	}


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// ../src/csheets/core/formula/compiler/Formula.g:45:1: expression : EQ ! comparison EOF !;
	public final FormulaParser.expression_return expression() throws RecognitionException {
		FormulaParser.expression_return retval = new FormulaParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ1=null;
		Token EOF3=null;
		ParserRuleReturnScope comparison2 =null;

		Object EQ1_tree=null;
		Object EOF3_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:46:2: ( EQ ! comparison EOF !)
			// ../src/csheets/core/formula/compiler/Formula.g:46:4: EQ ! comparison EOF !
			{
			root_0 = (Object)adaptor.nil();


			EQ1=(Token)match(input,EQ,FOLLOW_EQ_in_expression80); 
			pushFollow(FOLLOW_comparison_in_expression83);
			comparison2=comparison();
			state._fsp--;

			adaptor.addChild(root_0, comparison2.getTree());

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_expression85); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

			catch (RecognitionException e) {
				reportError(e);
				throw e; 
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class comparison_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison"
	// ../src/csheets/core/formula/compiler/Formula.g:49:1: comparison : concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )? ;
	public final FormulaParser.comparison_return comparison() throws RecognitionException {
		FormulaParser.comparison_return retval = new FormulaParser.comparison_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ5=null;
		Token NEQ6=null;
		Token GT7=null;
		Token LT8=null;
		Token LTEQ9=null;
		Token GTEQ10=null;
		ParserRuleReturnScope concatenation4 =null;
		ParserRuleReturnScope concatenation11 =null;

		Object EQ5_tree=null;
		Object NEQ6_tree=null;
		Object GT7_tree=null;
		Object LT8_tree=null;
		Object LTEQ9_tree=null;
		Object GTEQ10_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:50:2: ( concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )? )
			// ../src/csheets/core/formula/compiler/Formula.g:50:4: concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_concatenation_in_comparison98);
			concatenation4=concatenation();
			state._fsp--;

			adaptor.addChild(root_0, concatenation4.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:51:3: ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==EQ||(LA2_0 >= GT && LA2_0 <= GTEQ)||(LA2_0 >= LT && LA2_0 <= LTEQ)||LA2_0==NEQ) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:51:5: ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation
					{
					// ../src/csheets/core/formula/compiler/Formula.g:51:5: ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^)
					int alt1=6;
					switch ( input.LA(1) ) {
					case EQ:
						{
						alt1=1;
						}
						break;
					case NEQ:
						{
						alt1=2;
						}
						break;
					case GT:
						{
						alt1=3;
						}
						break;
					case LT:
						{
						alt1=4;
						}
						break;
					case LTEQ:
						{
						alt1=5;
						}
						break;
					case GTEQ:
						{
						alt1=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}
					switch (alt1) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:51:7: EQ ^
							{
							EQ5=(Token)match(input,EQ,FOLLOW_EQ_in_comparison106); 
							EQ5_tree = (Object)adaptor.create(EQ5);
							root_0 = (Object)adaptor.becomeRoot(EQ5_tree, root_0);

							}
							break;
						case 2 :
							// ../src/csheets/core/formula/compiler/Formula.g:51:13: NEQ ^
							{
							NEQ6=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparison111); 
							NEQ6_tree = (Object)adaptor.create(NEQ6);
							root_0 = (Object)adaptor.becomeRoot(NEQ6_tree, root_0);

							}
							break;
						case 3 :
							// ../src/csheets/core/formula/compiler/Formula.g:51:20: GT ^
							{
							GT7=(Token)match(input,GT,FOLLOW_GT_in_comparison116); 
							GT7_tree = (Object)adaptor.create(GT7);
							root_0 = (Object)adaptor.becomeRoot(GT7_tree, root_0);

							}
							break;
						case 4 :
							// ../src/csheets/core/formula/compiler/Formula.g:51:26: LT ^
							{
							LT8=(Token)match(input,LT,FOLLOW_LT_in_comparison121); 
							LT8_tree = (Object)adaptor.create(LT8);
							root_0 = (Object)adaptor.becomeRoot(LT8_tree, root_0);

							}
							break;
						case 5 :
							// ../src/csheets/core/formula/compiler/Formula.g:51:32: LTEQ ^
							{
							LTEQ9=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_comparison126); 
							LTEQ9_tree = (Object)adaptor.create(LTEQ9);
							root_0 = (Object)adaptor.becomeRoot(LTEQ9_tree, root_0);

							}
							break;
						case 6 :
							// ../src/csheets/core/formula/compiler/Formula.g:51:40: GTEQ ^
							{
							GTEQ10=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_comparison131); 
							GTEQ10_tree = (Object)adaptor.create(GTEQ10);
							root_0 = (Object)adaptor.becomeRoot(GTEQ10_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_concatenation_in_comparison136);
					concatenation11=concatenation();
					state._fsp--;

					adaptor.addChild(root_0, concatenation11.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

			catch (RecognitionException e) {
				reportError(e);
				throw e; 
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparison"


	public static class concatenation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "concatenation"
	// ../src/csheets/core/formula/compiler/Formula.g:54:1: concatenation : arithmetic_lowest ( AMP ^ arithmetic_lowest )* ;
	public final FormulaParser.concatenation_return concatenation() throws RecognitionException {
		FormulaParser.concatenation_return retval = new FormulaParser.concatenation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AMP13=null;
		ParserRuleReturnScope arithmetic_lowest12 =null;
		ParserRuleReturnScope arithmetic_lowest14 =null;

		Object AMP13_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:55:2: ( arithmetic_lowest ( AMP ^ arithmetic_lowest )* )
			// ../src/csheets/core/formula/compiler/Formula.g:55:4: arithmetic_lowest ( AMP ^ arithmetic_lowest )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_lowest_in_concatenation150);
			arithmetic_lowest12=arithmetic_lowest();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_lowest12.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:56:3: ( AMP ^ arithmetic_lowest )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==AMP) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:56:5: AMP ^ arithmetic_lowest
					{
					AMP13=(Token)match(input,AMP,FOLLOW_AMP_in_concatenation156); 
					AMP13_tree = (Object)adaptor.create(AMP13);
					root_0 = (Object)adaptor.becomeRoot(AMP13_tree, root_0);

					pushFollow(FOLLOW_arithmetic_lowest_in_concatenation159);
					arithmetic_lowest14=arithmetic_lowest();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_lowest14.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

			catch (RecognitionException e) {
				reportError(e);
				throw e; 
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "concatenation"


	public static class arithmetic_lowest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_lowest"
	// ../src/csheets/core/formula/compiler/Formula.g:59:1: arithmetic_lowest : arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )* ;
	public final FormulaParser.arithmetic_lowest_return arithmetic_lowest() throws RecognitionException {
		FormulaParser.arithmetic_lowest_return retval = new FormulaParser.arithmetic_lowest_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS16=null;
		Token MINUS17=null;
		ParserRuleReturnScope arithmetic_low15 =null;
		ParserRuleReturnScope arithmetic_low18 =null;

		Object PLUS16_tree=null;
		Object MINUS17_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:60:2: ( arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )* )
			// ../src/csheets/core/formula/compiler/Formula.g:60:4: arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_low_in_arithmetic_lowest173);
			arithmetic_low15=arithmetic_low();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_low15.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:61:3: ( ( PLUS ^| MINUS ^) arithmetic_low )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MINUS||LA5_0==PLUS) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:61:5: ( PLUS ^| MINUS ^) arithmetic_low
					{
					// ../src/csheets/core/formula/compiler/Formula.g:61:5: ( PLUS ^| MINUS ^)
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==PLUS) ) {
						alt4=1;
					}
					else if ( (LA4_0==MINUS) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:61:7: PLUS ^
							{
							PLUS16=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_lowest181); 
							PLUS16_tree = (Object)adaptor.create(PLUS16);
							root_0 = (Object)adaptor.becomeRoot(PLUS16_tree, root_0);

							}
							break;
						case 2 :
							// ../src/csheets/core/formula/compiler/Formula.g:61:15: MINUS ^
							{
							MINUS17=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_lowest186); 
							MINUS17_tree = (Object)adaptor.create(MINUS17);
							root_0 = (Object)adaptor.becomeRoot(MINUS17_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_low_in_arithmetic_lowest191);
					arithmetic_low18=arithmetic_low();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_low18.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

			catch (RecognitionException e) {
				reportError(e);
				throw e; 
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_lowest"


	public static class arithmetic_low_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_low"
	// ../src/csheets/core/formula/compiler/Formula.g:64:1: arithmetic_low : arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )* ;
	public final FormulaParser.arithmetic_low_return arithmetic_low() throws RecognitionException {
		FormulaParser.arithmetic_low_return retval = new FormulaParser.arithmetic_low_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULTI20=null;
		Token DIV21=null;
		ParserRuleReturnScope arithmetic_medium19 =null;
		ParserRuleReturnScope arithmetic_medium22 =null;

		Object MULTI20_tree=null;
		Object DIV21_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:65:2: ( arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )* )
			// ../src/csheets/core/formula/compiler/Formula.g:65:4: arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_medium_in_arithmetic_low205);
			arithmetic_medium19=arithmetic_medium();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_medium19.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:66:3: ( ( MULTI ^| DIV ^) arithmetic_medium )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==DIV||LA7_0==MULTI) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:66:5: ( MULTI ^| DIV ^) arithmetic_medium
					{
					// ../src/csheets/core/formula/compiler/Formula.g:66:5: ( MULTI ^| DIV ^)
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==MULTI) ) {
						alt6=1;
					}
					else if ( (LA6_0==DIV) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:66:7: MULTI ^
							{
							MULTI20=(Token)match(input,MULTI,FOLLOW_MULTI_in_arithmetic_low213); 
							MULTI20_tree = (Object)adaptor.create(MULTI20);
							root_0 = (Object)adaptor.becomeRoot(MULTI20_tree, root_0);

							}
							break;
						case 2 :
							// ../src/csheets/core/formula/compiler/Formula.g:66:16: DIV ^
							{
							DIV21=(Token)match(input,DIV,FOLLOW_DIV_in_arithmetic_low218); 
							DIV21_tree = (Object)adaptor.create(DIV21);
							root_0 = (Object)adaptor.becomeRoot(DIV21_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_medium_in_arithmetic_low223);
					arithmetic_medium22=arithmetic_medium();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_medium22.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

			catch (RecognitionException e) {
				reportError(e);
				throw e; 
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_low"


	public static class arithmetic_medium_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_medium"
	// ../src/csheets/core/formula/compiler/Formula.g:69:1: arithmetic_medium : arithmetic_high ( POWER ^ arithmetic_high )? ;
	public final FormulaParser.arithmetic_medium_return arithmetic_medium() throws RecognitionException {
		FormulaParser.arithmetic_medium_return retval = new FormulaParser.arithmetic_medium_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token POWER24=null;
		ParserRuleReturnScope arithmetic_high23 =null;
		ParserRuleReturnScope arithmetic_high25 =null;

		Object POWER24_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:70:2: ( arithmetic_high ( POWER ^ arithmetic_high )? )
			// ../src/csheets/core/formula/compiler/Formula.g:70:4: arithmetic_high ( POWER ^ arithmetic_high )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_high_in_arithmetic_medium237);
			arithmetic_high23=arithmetic_high();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_high23.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:71:3: ( POWER ^ arithmetic_high )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==POWER) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:71:5: POWER ^ arithmetic_high
					{
					POWER24=(Token)match(input,POWER,FOLLOW_POWER_in_arithmetic_medium243); 
					POWER24_tree = (Object)adaptor.create(POWER24);
					root_0 = (Object)adaptor.becomeRoot(POWER24_tree, root_0);

					pushFollow(FOLLOW_arithmetic_high_in_arithmetic_medium246);
					arithmetic_high25=arithmetic_high();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_high25.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

			catch (RecognitionException e) {
				reportError(e);
				throw e; 
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_medium"


	public static class arithmetic_high_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_high"
	// ../src/csheets/core/formula/compiler/Formula.g:74:1: arithmetic_high : arithmetic_highest ( PERCENT ^)? ;
	public final FormulaParser.arithmetic_high_return arithmetic_high() throws RecognitionException {
		FormulaParser.arithmetic_high_return retval = new FormulaParser.arithmetic_high_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERCENT27=null;
		ParserRuleReturnScope arithmetic_highest26 =null;

		Object PERCENT27_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:75:2: ( arithmetic_highest ( PERCENT ^)? )
			// ../src/csheets/core/formula/compiler/Formula.g:75:4: arithmetic_highest ( PERCENT ^)?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_highest_in_arithmetic_high260);
			arithmetic_highest26=arithmetic_highest();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_highest26.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:75:23: ( PERCENT ^)?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==PERCENT) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:75:25: PERCENT ^
					{
					PERCENT27=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_arithmetic_high264); 
					PERCENT27_tree = (Object)adaptor.create(PERCENT27);
					root_0 = (Object)adaptor.becomeRoot(PERCENT27_tree, root_0);

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

			catch (RecognitionException e) {
				reportError(e);
				throw e; 
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_high"


	public static class arithmetic_highest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_highest"
	// ../src/csheets/core/formula/compiler/Formula.g:78:1: arithmetic_highest : ( MINUS ^)? atom ;
	public final FormulaParser.arithmetic_highest_return arithmetic_highest() throws RecognitionException {
		FormulaParser.arithmetic_highest_return retval = new FormulaParser.arithmetic_highest_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS28=null;
		ParserRuleReturnScope atom29 =null;

		Object MINUS28_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:79:2: ( ( MINUS ^)? atom )
			// ../src/csheets/core/formula/compiler/Formula.g:79:4: ( MINUS ^)? atom
			{
			root_0 = (Object)adaptor.nil();


			// ../src/csheets/core/formula/compiler/Formula.g:79:4: ( MINUS ^)?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==MINUS) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:79:6: MINUS ^
					{
					MINUS28=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_highest281); 
					MINUS28_tree = (Object)adaptor.create(MINUS28);
					root_0 = (Object)adaptor.becomeRoot(MINUS28_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_atom_in_arithmetic_highest287);
			atom29=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom29.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

			catch (RecognitionException e) {
				reportError(e);
				throw e; 
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_highest"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// ../src/csheets/core/formula/compiler/Formula.g:82:1: atom : ( function_call | reference | literal | LPAR ! comparison RPAR !);
	public final FormulaParser.atom_return atom() throws RecognitionException {
		FormulaParser.atom_return retval = new FormulaParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAR33=null;
		Token RPAR35=null;
		ParserRuleReturnScope function_call30 =null;
		ParserRuleReturnScope reference31 =null;
		ParserRuleReturnScope literal32 =null;
		ParserRuleReturnScope comparison34 =null;

		Object LPAR33_tree=null;
		Object RPAR35_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:83:2: ( function_call | reference | literal | LPAR ! comparison RPAR !)
			int alt11=4;
			switch ( input.LA(1) ) {
			case FUNCTION:
				{
				alt11=1;
				}
				break;
			case CELL_REF:
				{
				alt11=2;
				}
				break;
			case NUMBER:
			case STRING:
				{
				alt11=3;
				}
				break;
			case LPAR:
				{
				alt11=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:83:4: function_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_call_in_atom298);
					function_call30=function_call();
					state._fsp--;

					adaptor.addChild(root_0, function_call30.getTree());

					}
					break;
				case 2 :
					// ../src/csheets/core/formula/compiler/Formula.g:84:4: reference
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_reference_in_atom303);
					reference31=reference();
					state._fsp--;

					adaptor.addChild(root_0, reference31.getTree());

					}
					break;
				case 3 :
					// ../src/csheets/core/formula/compiler/Formula.g:85:4: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_atom308);
					literal32=literal();
					state._fsp--;

					adaptor.addChild(root_0, literal32.getTree());

					}
					break;
				case 4 :
					// ../src/csheets/core/formula/compiler/Formula.g:86:4: LPAR ! comparison RPAR !
					{
					root_0 = (Object)adaptor.nil();


					LPAR33=(Token)match(input,LPAR,FOLLOW_LPAR_in_atom313); 
					pushFollow(FOLLOW_comparison_in_atom316);
					comparison34=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison34.getTree());

					RPAR35=(Token)match(input,RPAR,FOLLOW_RPAR_in_atom318); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

			catch (RecognitionException e) {
				reportError(e);
				throw e; 
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class function_call_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_call"
	// ../src/csheets/core/formula/compiler/Formula.g:89:1: function_call : FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !;
	public final FormulaParser.function_call_return function_call() throws RecognitionException {
		FormulaParser.function_call_return retval = new FormulaParser.function_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FUNCTION36=null;
		Token LPAR37=null;
		Token SEMI39=null;
		Token RPAR41=null;
		ParserRuleReturnScope comparison38 =null;
		ParserRuleReturnScope comparison40 =null;

		Object FUNCTION36_tree=null;
		Object LPAR37_tree=null;
		Object SEMI39_tree=null;
		Object RPAR41_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:90:2: ( FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !)
			// ../src/csheets/core/formula/compiler/Formula.g:90:4: FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !
			{
			root_0 = (Object)adaptor.nil();


			FUNCTION36=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_call330); 
			FUNCTION36_tree = (Object)adaptor.create(FUNCTION36);
			root_0 = (Object)adaptor.becomeRoot(FUNCTION36_tree, root_0);

			LPAR37=(Token)match(input,LPAR,FOLLOW_LPAR_in_function_call333); 
			// ../src/csheets/core/formula/compiler/Formula.g:91:3: ( comparison ( SEMI ! comparison )* )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==CELL_REF||LA13_0==FUNCTION||LA13_0==LPAR||LA13_0==MINUS||LA13_0==NUMBER||LA13_0==STRING) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:91:5: comparison ( SEMI ! comparison )*
					{
					pushFollow(FOLLOW_comparison_in_function_call341);
					comparison38=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison38.getTree());

					// ../src/csheets/core/formula/compiler/Formula.g:91:16: ( SEMI ! comparison )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==SEMI) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:91:18: SEMI ! comparison
							{
							SEMI39=(Token)match(input,SEMI,FOLLOW_SEMI_in_function_call345); 
							pushFollow(FOLLOW_comparison_in_function_call348);
							comparison40=comparison();
							state._fsp--;

							adaptor.addChild(root_0, comparison40.getTree());

							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}

			RPAR41=(Token)match(input,RPAR,FOLLOW_RPAR_in_function_call358); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

			catch (RecognitionException e) {
				reportError(e);
				throw e; 
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_call"


	public static class reference_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "reference"
	// ../src/csheets/core/formula/compiler/Formula.g:95:1: reference : CELL_REF ( ( COLON ^) CELL_REF )? ;
	public final FormulaParser.reference_return reference() throws RecognitionException {
		FormulaParser.reference_return retval = new FormulaParser.reference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CELL_REF42=null;
		Token COLON43=null;
		Token CELL_REF44=null;

		Object CELL_REF42_tree=null;
		Object COLON43_tree=null;
		Object CELL_REF44_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:96:2: ( CELL_REF ( ( COLON ^) CELL_REF )? )
			// ../src/csheets/core/formula/compiler/Formula.g:96:4: CELL_REF ( ( COLON ^) CELL_REF )?
			{
			root_0 = (Object)adaptor.nil();


			CELL_REF42=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_reference370); 
			CELL_REF42_tree = (Object)adaptor.create(CELL_REF42);
			adaptor.addChild(root_0, CELL_REF42_tree);

			// ../src/csheets/core/formula/compiler/Formula.g:97:3: ( ( COLON ^) CELL_REF )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==COLON) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:97:5: ( COLON ^) CELL_REF
					{
					// ../src/csheets/core/formula/compiler/Formula.g:97:5: ( COLON ^)
					// ../src/csheets/core/formula/compiler/Formula.g:97:7: COLON ^
					{
					COLON43=(Token)match(input,COLON,FOLLOW_COLON_in_reference378); 
					COLON43_tree = (Object)adaptor.create(COLON43);
					root_0 = (Object)adaptor.becomeRoot(COLON43_tree, root_0);

					}

					CELL_REF44=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_reference383); 
					CELL_REF44_tree = (Object)adaptor.create(CELL_REF44);
					adaptor.addChild(root_0, CELL_REF44_tree);

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

			catch (RecognitionException e) {
				reportError(e);
				throw e; 
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reference"


	public static class literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// ../src/csheets/core/formula/compiler/Formula.g:100:1: literal : ( NUMBER | STRING );
	public final FormulaParser.literal_return literal() throws RecognitionException {
		FormulaParser.literal_return retval = new FormulaParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set45=null;

		Object set45_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:101:2: ( NUMBER | STRING )
			// ../src/csheets/core/formula/compiler/Formula.g:
			{
			root_0 = (Object)adaptor.nil();


			set45=input.LT(1);
			if ( input.LA(1)==NUMBER||input.LA(1)==STRING ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set45));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

			catch (RecognitionException e) {
				reportError(e);
				throw e; 
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal"

	// Delegated rules



	public static final BitSet FOLLOW_EQ_in_expression80 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_comparison_in_expression83 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expression85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concatenation_in_comparison98 = new BitSet(new long[]{0x00000000004CC802L});
	public static final BitSet FOLLOW_EQ_in_comparison106 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_NEQ_in_comparison111 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_GT_in_comparison116 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_LT_in_comparison121 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_LTEQ_in_comparison126 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_GTEQ_in_comparison131 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_concatenation_in_comparison136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_lowest_in_concatenation150 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AMP_in_concatenation156 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_arithmetic_lowest_in_concatenation159 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_arithmetic_low_in_arithmetic_lowest173 = new BitSet(new long[]{0x0000000002100002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_lowest181 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_lowest186 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_arithmetic_low_in_arithmetic_lowest191 = new BitSet(new long[]{0x0000000002100002L});
	public static final BitSet FOLLOW_arithmetic_medium_in_arithmetic_low205 = new BitSet(new long[]{0x0000000000200402L});
	public static final BitSet FOLLOW_MULTI_in_arithmetic_low213 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_DIV_in_arithmetic_low218 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_arithmetic_medium_in_arithmetic_low223 = new BitSet(new long[]{0x0000000000200402L});
	public static final BitSet FOLLOW_arithmetic_high_in_arithmetic_medium237 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_POWER_in_arithmetic_medium243 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_arithmetic_high_in_arithmetic_medium246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_highest_in_arithmetic_high260 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_PERCENT_in_arithmetic_high264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_highest281 = new BitSet(new long[]{0x0000000040822040L});
	public static final BitSet FOLLOW_atom_in_arithmetic_highest287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_call_in_atom298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_in_atom303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_atom308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_atom313 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_comparison_in_atom316 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAR_in_atom318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_function_call330 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LPAR_in_function_call333 = new BitSet(new long[]{0x0000000050922040L});
	public static final BitSet FOLLOW_comparison_in_function_call341 = new BitSet(new long[]{0x0000000030000000L});
	public static final BitSet FOLLOW_SEMI_in_function_call345 = new BitSet(new long[]{0x0000000040922040L});
	public static final BitSet FOLLOW_comparison_in_function_call348 = new BitSet(new long[]{0x0000000030000000L});
	public static final BitSet FOLLOW_RPAR_in_function_call358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CELL_REF_in_reference370 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_COLON_in_reference378 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CELL_REF_in_reference383 = new BitSet(new long[]{0x0000000000000002L});
}

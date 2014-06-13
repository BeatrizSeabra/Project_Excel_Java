// $ANTLR 3.5.2 ../src/csheets/core/formula/compiler/Formula.g 2014-06-12 17:15:14

package csheets.core.formula.compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class FormulaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS", "AMP", "ATT", "CELL_REF", 
		"COLON", "COMMA", "DIGIT", "DIV", "EQ", "EXCL", "FUNCTION", "GT", "GTEQ", 
		"LBRA", "LETTER", "LPAR", "LT", "LTEQ", "MINUS", "MULTI", "NEQ", "NUMBER", 
		"PERCENT", "PLUS", "POWER", "QUOT", "RBRA", "RPAR", "SEMI", "STRING", 
		"TEMP", "WS"
	};
	public static final int EOF=-1;
	public static final int ABS=4;
	public static final int AMP=5;
	public static final int ATT=6;
	public static final int CELL_REF=7;
	public static final int COLON=8;
	public static final int COMMA=9;
	public static final int DIGIT=10;
	public static final int DIV=11;
	public static final int EQ=12;
	public static final int EXCL=13;
	public static final int FUNCTION=14;
	public static final int GT=15;
	public static final int GTEQ=16;
	public static final int LBRA=17;
	public static final int LETTER=18;
	public static final int LPAR=19;
	public static final int LT=20;
	public static final int LTEQ=21;
	public static final int MINUS=22;
	public static final int MULTI=23;
	public static final int NEQ=24;
	public static final int NUMBER=25;
	public static final int PERCENT=26;
	public static final int PLUS=27;
	public static final int POWER=28;
	public static final int QUOT=29;
	public static final int RBRA=30;
	public static final int RPAR=31;
	public static final int SEMI=32;
	public static final int STRING=33;
	public static final int TEMP=34;
	public static final int WS=35;

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
	// ../src/csheets/core/formula/compiler/Formula.g:45:1: expression : EQ ! ( LBRA !)? ( attribution | comparison ) ( SEMI ^ ( attribution | comparison ) )* ( RBRA !)? EOF !;
	public final FormulaParser.expression_return expression() throws RecognitionException {
		FormulaParser.expression_return retval = new FormulaParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ1=null;
		Token LBRA2=null;
		Token SEMI5=null;
		Token RBRA8=null;
		Token EOF9=null;
		ParserRuleReturnScope attribution3 =null;
		ParserRuleReturnScope comparison4 =null;
		ParserRuleReturnScope attribution6 =null;
		ParserRuleReturnScope comparison7 =null;

		Object EQ1_tree=null;
		Object LBRA2_tree=null;
		Object SEMI5_tree=null;
		Object RBRA8_tree=null;
		Object EOF9_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:46:2: ( EQ ! ( LBRA !)? ( attribution | comparison ) ( SEMI ^ ( attribution | comparison ) )* ( RBRA !)? EOF !)
			// ../src/csheets/core/formula/compiler/Formula.g:46:4: EQ ! ( LBRA !)? ( attribution | comparison ) ( SEMI ^ ( attribution | comparison ) )* ( RBRA !)? EOF !
			{
			root_0 = (Object)adaptor.nil();


			EQ1=(Token)match(input,EQ,FOLLOW_EQ_in_expression80); 
			// ../src/csheets/core/formula/compiler/Formula.g:46:8: ( LBRA !)?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==LBRA) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:46:9: LBRA !
					{
					LBRA2=(Token)match(input,LBRA,FOLLOW_LBRA_in_expression84); 
					}
					break;

			}

			// ../src/csheets/core/formula/compiler/Formula.g:46:17: ( attribution | comparison )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==CELL_REF) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==ATT) ) {
					alt2=1;
				}
				else if ( (LA2_1==EOF||LA2_1==AMP||LA2_1==COLON||(LA2_1 >= DIV && LA2_1 <= EQ)||(LA2_1 >= GT && LA2_1 <= GTEQ)||(LA2_1 >= LT && LA2_1 <= NEQ)||(LA2_1 >= PERCENT && LA2_1 <= POWER)||LA2_1==RBRA||LA2_1==SEMI) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA2_0==FUNCTION||LA2_0==LPAR||LA2_0==MINUS||LA2_0==NUMBER||LA2_0==STRING) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:46:19: attribution
					{
					pushFollow(FOLLOW_attribution_in_expression91);
					attribution3=attribution();
					state._fsp--;

					adaptor.addChild(root_0, attribution3.getTree());

					}
					break;
				case 2 :
					// ../src/csheets/core/formula/compiler/Formula.g:46:33: comparison
					{
					pushFollow(FOLLOW_comparison_in_expression95);
					comparison4=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison4.getTree());

					}
					break;

			}

			// ../src/csheets/core/formula/compiler/Formula.g:46:45: ( SEMI ^ ( attribution | comparison ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==SEMI) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:46:46: SEMI ^ ( attribution | comparison )
					{
					SEMI5=(Token)match(input,SEMI,FOLLOW_SEMI_in_expression99); 
					SEMI5_tree = (Object)adaptor.create(SEMI5);
					root_0 = (Object)adaptor.becomeRoot(SEMI5_tree, root_0);

					// ../src/csheets/core/formula/compiler/Formula.g:46:52: ( attribution | comparison )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==CELL_REF) ) {
						int LA3_1 = input.LA(2);
						if ( (LA3_1==ATT) ) {
							alt3=1;
						}
						else if ( (LA3_1==EOF||LA3_1==AMP||LA3_1==COLON||(LA3_1 >= DIV && LA3_1 <= EQ)||(LA3_1 >= GT && LA3_1 <= GTEQ)||(LA3_1 >= LT && LA3_1 <= NEQ)||(LA3_1 >= PERCENT && LA3_1 <= POWER)||LA3_1==RBRA||LA3_1==SEMI) ) {
							alt3=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 3, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA3_0==FUNCTION||LA3_0==LPAR||LA3_0==MINUS||LA3_0==NUMBER||LA3_0==STRING) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:46:53: attribution
							{
							pushFollow(FOLLOW_attribution_in_expression103);
							attribution6=attribution();
							state._fsp--;

							adaptor.addChild(root_0, attribution6.getTree());

							}
							break;
						case 2 :
							// ../src/csheets/core/formula/compiler/Formula.g:46:67: comparison
							{
							pushFollow(FOLLOW_comparison_in_expression107);
							comparison7=comparison();
							state._fsp--;

							adaptor.addChild(root_0, comparison7.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop4;
				}
			}

			// ../src/csheets/core/formula/compiler/Formula.g:46:81: ( RBRA !)?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==RBRA) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:46:82: RBRA !
					{
					RBRA8=(Token)match(input,RBRA,FOLLOW_RBRA_in_expression113); 
					}
					break;

			}

			EOF9=(Token)match(input,EOF,FOLLOW_EOF_in_expression118); 
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


	public static class attribution_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attribution"
	// ../src/csheets/core/formula/compiler/Formula.g:49:1: attribution : CELL_REF ATT ^ ( attribution | comparison ) ;
	public final FormulaParser.attribution_return attribution() throws RecognitionException {
		FormulaParser.attribution_return retval = new FormulaParser.attribution_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CELL_REF10=null;
		Token ATT11=null;
		ParserRuleReturnScope attribution12 =null;
		ParserRuleReturnScope comparison13 =null;

		Object CELL_REF10_tree=null;
		Object ATT11_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:50:9: ( CELL_REF ATT ^ ( attribution | comparison ) )
			// ../src/csheets/core/formula/compiler/Formula.g:50:11: CELL_REF ATT ^ ( attribution | comparison )
			{
			root_0 = (Object)adaptor.nil();


			CELL_REF10=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_attribution144); 
			CELL_REF10_tree = (Object)adaptor.create(CELL_REF10);
			adaptor.addChild(root_0, CELL_REF10_tree);

			ATT11=(Token)match(input,ATT,FOLLOW_ATT_in_attribution146); 
			ATT11_tree = (Object)adaptor.create(ATT11);
			root_0 = (Object)adaptor.becomeRoot(ATT11_tree, root_0);

			// ../src/csheets/core/formula/compiler/Formula.g:50:25: ( attribution | comparison )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==CELL_REF) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==ATT) ) {
					alt6=1;
				}
				else if ( (LA6_1==EOF||LA6_1==AMP||LA6_1==COLON||(LA6_1 >= DIV && LA6_1 <= EQ)||(LA6_1 >= GT && LA6_1 <= GTEQ)||(LA6_1 >= LT && LA6_1 <= NEQ)||(LA6_1 >= PERCENT && LA6_1 <= POWER)||LA6_1==RBRA||LA6_1==SEMI) ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA6_0==FUNCTION||LA6_0==LPAR||LA6_0==MINUS||LA6_0==NUMBER||LA6_0==STRING) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:50:26: attribution
					{
					pushFollow(FOLLOW_attribution_in_attribution150);
					attribution12=attribution();
					state._fsp--;

					adaptor.addChild(root_0, attribution12.getTree());

					}
					break;
				case 2 :
					// ../src/csheets/core/formula/compiler/Formula.g:50:40: comparison
					{
					pushFollow(FOLLOW_comparison_in_attribution154);
					comparison13=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison13.getTree());

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
	// $ANTLR end "attribution"


	public static class comparison_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison"
	// ../src/csheets/core/formula/compiler/Formula.g:53:1: comparison : concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )? ;
	public final FormulaParser.comparison_return comparison() throws RecognitionException {
		FormulaParser.comparison_return retval = new FormulaParser.comparison_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ15=null;
		Token NEQ16=null;
		Token GT17=null;
		Token LT18=null;
		Token LTEQ19=null;
		Token GTEQ20=null;
		ParserRuleReturnScope concatenation14 =null;
		ParserRuleReturnScope concatenation21 =null;

		Object EQ15_tree=null;
		Object NEQ16_tree=null;
		Object GT17_tree=null;
		Object LT18_tree=null;
		Object LTEQ19_tree=null;
		Object GTEQ20_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:54:2: ( concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )? )
			// ../src/csheets/core/formula/compiler/Formula.g:54:4: concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_concatenation_in_comparison173);
			concatenation14=concatenation();
			state._fsp--;

			adaptor.addChild(root_0, concatenation14.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:55:3: ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==EQ||(LA8_0 >= GT && LA8_0 <= GTEQ)||(LA8_0 >= LT && LA8_0 <= LTEQ)||LA8_0==NEQ) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:55:5: ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation
					{
					// ../src/csheets/core/formula/compiler/Formula.g:55:5: ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^)
					int alt7=6;
					switch ( input.LA(1) ) {
					case EQ:
						{
						alt7=1;
						}
						break;
					case NEQ:
						{
						alt7=2;
						}
						break;
					case GT:
						{
						alt7=3;
						}
						break;
					case LT:
						{
						alt7=4;
						}
						break;
					case LTEQ:
						{
						alt7=5;
						}
						break;
					case GTEQ:
						{
						alt7=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}
					switch (alt7) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:55:7: EQ ^
							{
							EQ15=(Token)match(input,EQ,FOLLOW_EQ_in_comparison181); 
							EQ15_tree = (Object)adaptor.create(EQ15);
							root_0 = (Object)adaptor.becomeRoot(EQ15_tree, root_0);

							}
							break;
						case 2 :
							// ../src/csheets/core/formula/compiler/Formula.g:55:13: NEQ ^
							{
							NEQ16=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparison186); 
							NEQ16_tree = (Object)adaptor.create(NEQ16);
							root_0 = (Object)adaptor.becomeRoot(NEQ16_tree, root_0);

							}
							break;
						case 3 :
							// ../src/csheets/core/formula/compiler/Formula.g:55:20: GT ^
							{
							GT17=(Token)match(input,GT,FOLLOW_GT_in_comparison191); 
							GT17_tree = (Object)adaptor.create(GT17);
							root_0 = (Object)adaptor.becomeRoot(GT17_tree, root_0);

							}
							break;
						case 4 :
							// ../src/csheets/core/formula/compiler/Formula.g:55:26: LT ^
							{
							LT18=(Token)match(input,LT,FOLLOW_LT_in_comparison196); 
							LT18_tree = (Object)adaptor.create(LT18);
							root_0 = (Object)adaptor.becomeRoot(LT18_tree, root_0);

							}
							break;
						case 5 :
							// ../src/csheets/core/formula/compiler/Formula.g:55:32: LTEQ ^
							{
							LTEQ19=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_comparison201); 
							LTEQ19_tree = (Object)adaptor.create(LTEQ19);
							root_0 = (Object)adaptor.becomeRoot(LTEQ19_tree, root_0);

							}
							break;
						case 6 :
							// ../src/csheets/core/formula/compiler/Formula.g:55:40: GTEQ ^
							{
							GTEQ20=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_comparison206); 
							GTEQ20_tree = (Object)adaptor.create(GTEQ20);
							root_0 = (Object)adaptor.becomeRoot(GTEQ20_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_concatenation_in_comparison211);
					concatenation21=concatenation();
					state._fsp--;

					adaptor.addChild(root_0, concatenation21.getTree());

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
	// ../src/csheets/core/formula/compiler/Formula.g:58:1: concatenation : arithmetic_lowest ( AMP ^ arithmetic_lowest )* ;
	public final FormulaParser.concatenation_return concatenation() throws RecognitionException {
		FormulaParser.concatenation_return retval = new FormulaParser.concatenation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AMP23=null;
		ParserRuleReturnScope arithmetic_lowest22 =null;
		ParserRuleReturnScope arithmetic_lowest24 =null;

		Object AMP23_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:59:2: ( arithmetic_lowest ( AMP ^ arithmetic_lowest )* )
			// ../src/csheets/core/formula/compiler/Formula.g:59:4: arithmetic_lowest ( AMP ^ arithmetic_lowest )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_lowest_in_concatenation225);
			arithmetic_lowest22=arithmetic_lowest();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_lowest22.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:60:3: ( AMP ^ arithmetic_lowest )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==AMP) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:60:5: AMP ^ arithmetic_lowest
					{
					AMP23=(Token)match(input,AMP,FOLLOW_AMP_in_concatenation231); 
					AMP23_tree = (Object)adaptor.create(AMP23);
					root_0 = (Object)adaptor.becomeRoot(AMP23_tree, root_0);

					pushFollow(FOLLOW_arithmetic_lowest_in_concatenation234);
					arithmetic_lowest24=arithmetic_lowest();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_lowest24.getTree());

					}
					break;

				default :
					break loop9;
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
	// ../src/csheets/core/formula/compiler/Formula.g:63:1: arithmetic_lowest : arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )* ;
	public final FormulaParser.arithmetic_lowest_return arithmetic_lowest() throws RecognitionException {
		FormulaParser.arithmetic_lowest_return retval = new FormulaParser.arithmetic_lowest_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS26=null;
		Token MINUS27=null;
		ParserRuleReturnScope arithmetic_low25 =null;
		ParserRuleReturnScope arithmetic_low28 =null;

		Object PLUS26_tree=null;
		Object MINUS27_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:64:2: ( arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )* )
			// ../src/csheets/core/formula/compiler/Formula.g:64:4: arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_low_in_arithmetic_lowest248);
			arithmetic_low25=arithmetic_low();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_low25.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:65:3: ( ( PLUS ^| MINUS ^) arithmetic_low )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==MINUS||LA11_0==PLUS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:65:5: ( PLUS ^| MINUS ^) arithmetic_low
					{
					// ../src/csheets/core/formula/compiler/Formula.g:65:5: ( PLUS ^| MINUS ^)
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==PLUS) ) {
						alt10=1;
					}
					else if ( (LA10_0==MINUS) ) {
						alt10=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:65:7: PLUS ^
							{
							PLUS26=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_lowest256); 
							PLUS26_tree = (Object)adaptor.create(PLUS26);
							root_0 = (Object)adaptor.becomeRoot(PLUS26_tree, root_0);

							}
							break;
						case 2 :
							// ../src/csheets/core/formula/compiler/Formula.g:65:15: MINUS ^
							{
							MINUS27=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_lowest261); 
							MINUS27_tree = (Object)adaptor.create(MINUS27);
							root_0 = (Object)adaptor.becomeRoot(MINUS27_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_low_in_arithmetic_lowest266);
					arithmetic_low28=arithmetic_low();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_low28.getTree());

					}
					break;

				default :
					break loop11;
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
	// ../src/csheets/core/formula/compiler/Formula.g:68:1: arithmetic_low : arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )* ;
	public final FormulaParser.arithmetic_low_return arithmetic_low() throws RecognitionException {
		FormulaParser.arithmetic_low_return retval = new FormulaParser.arithmetic_low_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULTI30=null;
		Token DIV31=null;
		ParserRuleReturnScope arithmetic_medium29 =null;
		ParserRuleReturnScope arithmetic_medium32 =null;

		Object MULTI30_tree=null;
		Object DIV31_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:69:2: ( arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )* )
			// ../src/csheets/core/formula/compiler/Formula.g:69:4: arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_medium_in_arithmetic_low280);
			arithmetic_medium29=arithmetic_medium();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_medium29.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:70:3: ( ( MULTI ^| DIV ^) arithmetic_medium )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DIV||LA13_0==MULTI) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:70:5: ( MULTI ^| DIV ^) arithmetic_medium
					{
					// ../src/csheets/core/formula/compiler/Formula.g:70:5: ( MULTI ^| DIV ^)
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==MULTI) ) {
						alt12=1;
					}
					else if ( (LA12_0==DIV) ) {
						alt12=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}

					switch (alt12) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:70:7: MULTI ^
							{
							MULTI30=(Token)match(input,MULTI,FOLLOW_MULTI_in_arithmetic_low288); 
							MULTI30_tree = (Object)adaptor.create(MULTI30);
							root_0 = (Object)adaptor.becomeRoot(MULTI30_tree, root_0);

							}
							break;
						case 2 :
							// ../src/csheets/core/formula/compiler/Formula.g:70:16: DIV ^
							{
							DIV31=(Token)match(input,DIV,FOLLOW_DIV_in_arithmetic_low293); 
							DIV31_tree = (Object)adaptor.create(DIV31);
							root_0 = (Object)adaptor.becomeRoot(DIV31_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_medium_in_arithmetic_low298);
					arithmetic_medium32=arithmetic_medium();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_medium32.getTree());

					}
					break;

				default :
					break loop13;
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
	// ../src/csheets/core/formula/compiler/Formula.g:73:1: arithmetic_medium : arithmetic_high ( POWER ^ arithmetic_high )? ;
	public final FormulaParser.arithmetic_medium_return arithmetic_medium() throws RecognitionException {
		FormulaParser.arithmetic_medium_return retval = new FormulaParser.arithmetic_medium_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token POWER34=null;
		ParserRuleReturnScope arithmetic_high33 =null;
		ParserRuleReturnScope arithmetic_high35 =null;

		Object POWER34_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:74:2: ( arithmetic_high ( POWER ^ arithmetic_high )? )
			// ../src/csheets/core/formula/compiler/Formula.g:74:4: arithmetic_high ( POWER ^ arithmetic_high )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_high_in_arithmetic_medium312);
			arithmetic_high33=arithmetic_high();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_high33.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:75:3: ( POWER ^ arithmetic_high )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==POWER) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:75:5: POWER ^ arithmetic_high
					{
					POWER34=(Token)match(input,POWER,FOLLOW_POWER_in_arithmetic_medium318); 
					POWER34_tree = (Object)adaptor.create(POWER34);
					root_0 = (Object)adaptor.becomeRoot(POWER34_tree, root_0);

					pushFollow(FOLLOW_arithmetic_high_in_arithmetic_medium321);
					arithmetic_high35=arithmetic_high();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_high35.getTree());

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
	// ../src/csheets/core/formula/compiler/Formula.g:78:1: arithmetic_high : arithmetic_highest ( PERCENT ^)? ;
	public final FormulaParser.arithmetic_high_return arithmetic_high() throws RecognitionException {
		FormulaParser.arithmetic_high_return retval = new FormulaParser.arithmetic_high_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERCENT37=null;
		ParserRuleReturnScope arithmetic_highest36 =null;

		Object PERCENT37_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:79:2: ( arithmetic_highest ( PERCENT ^)? )
			// ../src/csheets/core/formula/compiler/Formula.g:79:4: arithmetic_highest ( PERCENT ^)?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_highest_in_arithmetic_high335);
			arithmetic_highest36=arithmetic_highest();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_highest36.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:79:23: ( PERCENT ^)?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==PERCENT) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:79:25: PERCENT ^
					{
					PERCENT37=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_arithmetic_high339); 
					PERCENT37_tree = (Object)adaptor.create(PERCENT37);
					root_0 = (Object)adaptor.becomeRoot(PERCENT37_tree, root_0);

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
	// ../src/csheets/core/formula/compiler/Formula.g:82:1: arithmetic_highest : ( MINUS ^)? atom ;
	public final FormulaParser.arithmetic_highest_return arithmetic_highest() throws RecognitionException {
		FormulaParser.arithmetic_highest_return retval = new FormulaParser.arithmetic_highest_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS38=null;
		ParserRuleReturnScope atom39 =null;

		Object MINUS38_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:83:2: ( ( MINUS ^)? atom )
			// ../src/csheets/core/formula/compiler/Formula.g:83:4: ( MINUS ^)? atom
			{
			root_0 = (Object)adaptor.nil();


			// ../src/csheets/core/formula/compiler/Formula.g:83:4: ( MINUS ^)?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==MINUS) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:83:6: MINUS ^
					{
					MINUS38=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_highest356); 
					MINUS38_tree = (Object)adaptor.create(MINUS38);
					root_0 = (Object)adaptor.becomeRoot(MINUS38_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_atom_in_arithmetic_highest362);
			atom39=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom39.getTree());

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
	// ../src/csheets/core/formula/compiler/Formula.g:86:1: atom : ( function_call | reference | literal | LPAR ! comparison RPAR !);
	public final FormulaParser.atom_return atom() throws RecognitionException {
		FormulaParser.atom_return retval = new FormulaParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAR43=null;
		Token RPAR45=null;
		ParserRuleReturnScope function_call40 =null;
		ParserRuleReturnScope reference41 =null;
		ParserRuleReturnScope literal42 =null;
		ParserRuleReturnScope comparison44 =null;

		Object LPAR43_tree=null;
		Object RPAR45_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:87:2: ( function_call | reference | literal | LPAR ! comparison RPAR !)
			int alt17=4;
			switch ( input.LA(1) ) {
			case FUNCTION:
				{
				alt17=1;
				}
				break;
			case CELL_REF:
				{
				alt17=2;
				}
				break;
			case NUMBER:
			case STRING:
				{
				alt17=3;
				}
				break;
			case LPAR:
				{
				alt17=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:87:4: function_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_call_in_atom373);
					function_call40=function_call();
					state._fsp--;

					adaptor.addChild(root_0, function_call40.getTree());

					}
					break;
				case 2 :
					// ../src/csheets/core/formula/compiler/Formula.g:88:4: reference
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_reference_in_atom378);
					reference41=reference();
					state._fsp--;

					adaptor.addChild(root_0, reference41.getTree());

					}
					break;
				case 3 :
					// ../src/csheets/core/formula/compiler/Formula.g:89:4: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_atom383);
					literal42=literal();
					state._fsp--;

					adaptor.addChild(root_0, literal42.getTree());

					}
					break;
				case 4 :
					// ../src/csheets/core/formula/compiler/Formula.g:90:4: LPAR ! comparison RPAR !
					{
					root_0 = (Object)adaptor.nil();


					LPAR43=(Token)match(input,LPAR,FOLLOW_LPAR_in_atom388); 
					pushFollow(FOLLOW_comparison_in_atom391);
					comparison44=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison44.getTree());

					RPAR45=(Token)match(input,RPAR,FOLLOW_RPAR_in_atom393); 
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
	// ../src/csheets/core/formula/compiler/Formula.g:93:1: function_call : FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !;
	public final FormulaParser.function_call_return function_call() throws RecognitionException {
		FormulaParser.function_call_return retval = new FormulaParser.function_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FUNCTION46=null;
		Token LPAR47=null;
		Token SEMI49=null;
		Token RPAR51=null;
		ParserRuleReturnScope comparison48 =null;
		ParserRuleReturnScope comparison50 =null;

		Object FUNCTION46_tree=null;
		Object LPAR47_tree=null;
		Object SEMI49_tree=null;
		Object RPAR51_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:94:2: ( FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !)
			// ../src/csheets/core/formula/compiler/Formula.g:94:4: FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !
			{
			root_0 = (Object)adaptor.nil();


			FUNCTION46=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_call405); 
			FUNCTION46_tree = (Object)adaptor.create(FUNCTION46);
			root_0 = (Object)adaptor.becomeRoot(FUNCTION46_tree, root_0);

			LPAR47=(Token)match(input,LPAR,FOLLOW_LPAR_in_function_call408); 
			// ../src/csheets/core/formula/compiler/Formula.g:95:3: ( comparison ( SEMI ! comparison )* )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==CELL_REF||LA19_0==FUNCTION||LA19_0==LPAR||LA19_0==MINUS||LA19_0==NUMBER||LA19_0==STRING) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:95:5: comparison ( SEMI ! comparison )*
					{
					pushFollow(FOLLOW_comparison_in_function_call416);
					comparison48=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison48.getTree());

					// ../src/csheets/core/formula/compiler/Formula.g:95:16: ( SEMI ! comparison )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==SEMI) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:95:18: SEMI ! comparison
							{
							SEMI49=(Token)match(input,SEMI,FOLLOW_SEMI_in_function_call420); 
							pushFollow(FOLLOW_comparison_in_function_call423);
							comparison50=comparison();
							state._fsp--;

							adaptor.addChild(root_0, comparison50.getTree());

							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;

			}

			RPAR51=(Token)match(input,RPAR,FOLLOW_RPAR_in_function_call433); 
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
	// ../src/csheets/core/formula/compiler/Formula.g:99:1: reference : CELL_REF ( ( COLON ^) CELL_REF )? ;
	public final FormulaParser.reference_return reference() throws RecognitionException {
		FormulaParser.reference_return retval = new FormulaParser.reference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CELL_REF52=null;
		Token COLON53=null;
		Token CELL_REF54=null;

		Object CELL_REF52_tree=null;
		Object COLON53_tree=null;
		Object CELL_REF54_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:100:2: ( CELL_REF ( ( COLON ^) CELL_REF )? )
			// ../src/csheets/core/formula/compiler/Formula.g:100:4: CELL_REF ( ( COLON ^) CELL_REF )?
			{
			root_0 = (Object)adaptor.nil();


			CELL_REF52=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_reference445); 
			CELL_REF52_tree = (Object)adaptor.create(CELL_REF52);
			adaptor.addChild(root_0, CELL_REF52_tree);

			// ../src/csheets/core/formula/compiler/Formula.g:101:3: ( ( COLON ^) CELL_REF )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==COLON) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:101:5: ( COLON ^) CELL_REF
					{
					// ../src/csheets/core/formula/compiler/Formula.g:101:5: ( COLON ^)
					// ../src/csheets/core/formula/compiler/Formula.g:101:7: COLON ^
					{
					COLON53=(Token)match(input,COLON,FOLLOW_COLON_in_reference453); 
					COLON53_tree = (Object)adaptor.create(COLON53);
					root_0 = (Object)adaptor.becomeRoot(COLON53_tree, root_0);

					}

					CELL_REF54=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_reference458); 
					CELL_REF54_tree = (Object)adaptor.create(CELL_REF54);
					adaptor.addChild(root_0, CELL_REF54_tree);

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
	// ../src/csheets/core/formula/compiler/Formula.g:104:1: literal : ( NUMBER | STRING );
	public final FormulaParser.literal_return literal() throws RecognitionException {
		FormulaParser.literal_return retval = new FormulaParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set55=null;

		Object set55_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:105:2: ( NUMBER | STRING )
			// ../src/csheets/core/formula/compiler/Formula.g:
			{
			root_0 = (Object)adaptor.nil();


			set55=input.LT(1);
			if ( input.LA(1)==NUMBER||input.LA(1)==STRING ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set55));
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



	public static final BitSet FOLLOW_EQ_in_expression80 = new BitSet(new long[]{0x00000002024A4080L});
	public static final BitSet FOLLOW_LBRA_in_expression84 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_attribution_in_expression91 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_comparison_in_expression95 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_SEMI_in_expression99 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_attribution_in_expression103 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_comparison_in_expression107 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_RBRA_in_expression113 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expression118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CELL_REF_in_attribution144 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ATT_in_attribution146 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_attribution_in_attribution150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_attribution154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concatenation_in_comparison173 = new BitSet(new long[]{0x0000000001319002L});
	public static final BitSet FOLLOW_EQ_in_comparison181 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_NEQ_in_comparison186 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_GT_in_comparison191 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_LT_in_comparison196 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_LTEQ_in_comparison201 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_GTEQ_in_comparison206 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_concatenation_in_comparison211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_lowest_in_concatenation225 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AMP_in_concatenation231 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_arithmetic_lowest_in_concatenation234 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_arithmetic_low_in_arithmetic_lowest248 = new BitSet(new long[]{0x0000000008400002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_lowest256 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_lowest261 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_arithmetic_low_in_arithmetic_lowest266 = new BitSet(new long[]{0x0000000008400002L});
	public static final BitSet FOLLOW_arithmetic_medium_in_arithmetic_low280 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_MULTI_in_arithmetic_low288 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_DIV_in_arithmetic_low293 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_arithmetic_medium_in_arithmetic_low298 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_arithmetic_high_in_arithmetic_medium312 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_POWER_in_arithmetic_medium318 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_arithmetic_high_in_arithmetic_medium321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_highest_in_arithmetic_high335 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_PERCENT_in_arithmetic_high339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_highest356 = new BitSet(new long[]{0x0000000202084080L});
	public static final BitSet FOLLOW_atom_in_arithmetic_highest362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_call_in_atom373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_in_atom378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_atom383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_atom388 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_comparison_in_atom391 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAR_in_atom393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_function_call405 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LPAR_in_function_call408 = new BitSet(new long[]{0x0000000282484080L});
	public static final BitSet FOLLOW_comparison_in_function_call416 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_SEMI_in_function_call420 = new BitSet(new long[]{0x0000000202484080L});
	public static final BitSet FOLLOW_comparison_in_function_call423 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_RPAR_in_function_call433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CELL_REF_in_reference445 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COLON_in_reference453 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CELL_REF_in_reference458 = new BitSet(new long[]{0x0000000000000002L});
}

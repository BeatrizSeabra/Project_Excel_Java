// $ANTLR 3.5.2 ../src/csheets/core/formula/compiler/Formula.g 2014-06-06 16:52:40

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
		"LETTER", "LPAR", "LT", "LTEQ", "MINUS", "MULTI", "NEQ", "NUMBER", "PERCENT", 
		"PLUS", "POWER", "QUOT", "RPAR", "SEMI", "STRING", "WS"
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
	public static final int LETTER=17;
	public static final int LPAR=18;
	public static final int LT=19;
	public static final int LTEQ=20;
	public static final int MINUS=21;
	public static final int MULTI=22;
	public static final int NEQ=23;
	public static final int NUMBER=24;
	public static final int PERCENT=25;
	public static final int PLUS=26;
	public static final int POWER=27;
	public static final int QUOT=28;
	public static final int RPAR=29;
	public static final int SEMI=30;
	public static final int STRING=31;
	public static final int WS=32;

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
	// ../src/csheets/core/formula/compiler/Formula.g:45:1: expression : EQ ! ( attribution | comparison ) EOF !;
	public final FormulaParser.expression_return expression() throws RecognitionException {
		FormulaParser.expression_return retval = new FormulaParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ1=null;
		Token EOF4=null;
		ParserRuleReturnScope attribution2 =null;
		ParserRuleReturnScope comparison3 =null;

		Object EQ1_tree=null;
		Object EOF4_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:46:2: ( EQ ! ( attribution | comparison ) EOF !)
			// ../src/csheets/core/formula/compiler/Formula.g:46:4: EQ ! ( attribution | comparison ) EOF !
			{
			root_0 = (Object)adaptor.nil();


			EQ1=(Token)match(input,EQ,FOLLOW_EQ_in_expression80); 
			// ../src/csheets/core/formula/compiler/Formula.g:46:8: ( attribution | comparison )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CELL_REF) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==ATT) ) {
					alt1=1;
				}
				else if ( (LA1_1==EOF||LA1_1==AMP||LA1_1==COLON||(LA1_1 >= DIV && LA1_1 <= EQ)||(LA1_1 >= GT && LA1_1 <= GTEQ)||(LA1_1 >= LT && LA1_1 <= NEQ)||(LA1_1 >= PERCENT && LA1_1 <= POWER)) ) {
					alt1=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA1_0==FUNCTION||LA1_0==LPAR||LA1_0==MINUS||LA1_0==NUMBER||LA1_0==STRING) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:46:9: attribution
					{
					pushFollow(FOLLOW_attribution_in_expression84);
					attribution2=attribution();
					state._fsp--;

					adaptor.addChild(root_0, attribution2.getTree());

					}
					break;
				case 2 :
					// ../src/csheets/core/formula/compiler/Formula.g:46:23: comparison
					{
					pushFollow(FOLLOW_comparison_in_expression88);
					comparison3=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison3.getTree());

					}
					break;

			}

			EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_expression91); 
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

		Token CELL_REF5=null;
		Token ATT6=null;
		ParserRuleReturnScope attribution7 =null;
		ParserRuleReturnScope comparison8 =null;

		Object CELL_REF5_tree=null;
		Object ATT6_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:50:9: ( CELL_REF ATT ^ ( attribution | comparison ) )
			// ../src/csheets/core/formula/compiler/Formula.g:50:11: CELL_REF ATT ^ ( attribution | comparison )
			{
			root_0 = (Object)adaptor.nil();


			CELL_REF5=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_attribution117); 
			CELL_REF5_tree = (Object)adaptor.create(CELL_REF5);
			adaptor.addChild(root_0, CELL_REF5_tree);

			ATT6=(Token)match(input,ATT,FOLLOW_ATT_in_attribution119); 
			ATT6_tree = (Object)adaptor.create(ATT6);
			root_0 = (Object)adaptor.becomeRoot(ATT6_tree, root_0);

			// ../src/csheets/core/formula/compiler/Formula.g:50:25: ( attribution | comparison )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==CELL_REF) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==ATT) ) {
					alt2=1;
				}
				else if ( (LA2_1==EOF||LA2_1==AMP||LA2_1==COLON||(LA2_1 >= DIV && LA2_1 <= EQ)||(LA2_1 >= GT && LA2_1 <= GTEQ)||(LA2_1 >= LT && LA2_1 <= NEQ)||(LA2_1 >= PERCENT && LA2_1 <= POWER)) ) {
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
					// ../src/csheets/core/formula/compiler/Formula.g:50:26: attribution
					{
					pushFollow(FOLLOW_attribution_in_attribution123);
					attribution7=attribution();
					state._fsp--;

					adaptor.addChild(root_0, attribution7.getTree());

					}
					break;
				case 2 :
					// ../src/csheets/core/formula/compiler/Formula.g:50:40: comparison
					{
					pushFollow(FOLLOW_comparison_in_attribution127);
					comparison8=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison8.getTree());

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

		Token EQ10=null;
		Token NEQ11=null;
		Token GT12=null;
		Token LT13=null;
		Token LTEQ14=null;
		Token GTEQ15=null;
		ParserRuleReturnScope concatenation9 =null;
		ParserRuleReturnScope concatenation16 =null;

		Object EQ10_tree=null;
		Object NEQ11_tree=null;
		Object GT12_tree=null;
		Object LT13_tree=null;
		Object LTEQ14_tree=null;
		Object GTEQ15_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:54:2: ( concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )? )
			// ../src/csheets/core/formula/compiler/Formula.g:54:4: concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_concatenation_in_comparison146);
			concatenation9=concatenation();
			state._fsp--;

			adaptor.addChild(root_0, concatenation9.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:55:3: ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==EQ||(LA4_0 >= GT && LA4_0 <= GTEQ)||(LA4_0 >= LT && LA4_0 <= LTEQ)||LA4_0==NEQ) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:55:5: ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation
					{
					// ../src/csheets/core/formula/compiler/Formula.g:55:5: ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^)
					int alt3=6;
					switch ( input.LA(1) ) {
					case EQ:
						{
						alt3=1;
						}
						break;
					case NEQ:
						{
						alt3=2;
						}
						break;
					case GT:
						{
						alt3=3;
						}
						break;
					case LT:
						{
						alt3=4;
						}
						break;
					case LTEQ:
						{
						alt3=5;
						}
						break;
					case GTEQ:
						{
						alt3=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}
					switch (alt3) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:55:7: EQ ^
							{
							EQ10=(Token)match(input,EQ,FOLLOW_EQ_in_comparison154); 
							EQ10_tree = (Object)adaptor.create(EQ10);
							root_0 = (Object)adaptor.becomeRoot(EQ10_tree, root_0);

							}
							break;
						case 2 :
							// ../src/csheets/core/formula/compiler/Formula.g:55:13: NEQ ^
							{
							NEQ11=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparison159); 
							NEQ11_tree = (Object)adaptor.create(NEQ11);
							root_0 = (Object)adaptor.becomeRoot(NEQ11_tree, root_0);

							}
							break;
						case 3 :
							// ../src/csheets/core/formula/compiler/Formula.g:55:20: GT ^
							{
							GT12=(Token)match(input,GT,FOLLOW_GT_in_comparison164); 
							GT12_tree = (Object)adaptor.create(GT12);
							root_0 = (Object)adaptor.becomeRoot(GT12_tree, root_0);

							}
							break;
						case 4 :
							// ../src/csheets/core/formula/compiler/Formula.g:55:26: LT ^
							{
							LT13=(Token)match(input,LT,FOLLOW_LT_in_comparison169); 
							LT13_tree = (Object)adaptor.create(LT13);
							root_0 = (Object)adaptor.becomeRoot(LT13_tree, root_0);

							}
							break;
						case 5 :
							// ../src/csheets/core/formula/compiler/Formula.g:55:32: LTEQ ^
							{
							LTEQ14=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_comparison174); 
							LTEQ14_tree = (Object)adaptor.create(LTEQ14);
							root_0 = (Object)adaptor.becomeRoot(LTEQ14_tree, root_0);

							}
							break;
						case 6 :
							// ../src/csheets/core/formula/compiler/Formula.g:55:40: GTEQ ^
							{
							GTEQ15=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_comparison179); 
							GTEQ15_tree = (Object)adaptor.create(GTEQ15);
							root_0 = (Object)adaptor.becomeRoot(GTEQ15_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_concatenation_in_comparison184);
					concatenation16=concatenation();
					state._fsp--;

					adaptor.addChild(root_0, concatenation16.getTree());

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

		Token AMP18=null;
		ParserRuleReturnScope arithmetic_lowest17 =null;
		ParserRuleReturnScope arithmetic_lowest19 =null;

		Object AMP18_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:59:2: ( arithmetic_lowest ( AMP ^ arithmetic_lowest )* )
			// ../src/csheets/core/formula/compiler/Formula.g:59:4: arithmetic_lowest ( AMP ^ arithmetic_lowest )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_lowest_in_concatenation198);
			arithmetic_lowest17=arithmetic_lowest();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_lowest17.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:60:3: ( AMP ^ arithmetic_lowest )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==AMP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:60:5: AMP ^ arithmetic_lowest
					{
					AMP18=(Token)match(input,AMP,FOLLOW_AMP_in_concatenation204); 
					AMP18_tree = (Object)adaptor.create(AMP18);
					root_0 = (Object)adaptor.becomeRoot(AMP18_tree, root_0);

					pushFollow(FOLLOW_arithmetic_lowest_in_concatenation207);
					arithmetic_lowest19=arithmetic_lowest();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_lowest19.getTree());

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

		Token PLUS21=null;
		Token MINUS22=null;
		ParserRuleReturnScope arithmetic_low20 =null;
		ParserRuleReturnScope arithmetic_low23 =null;

		Object PLUS21_tree=null;
		Object MINUS22_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:64:2: ( arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )* )
			// ../src/csheets/core/formula/compiler/Formula.g:64:4: arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_low_in_arithmetic_lowest221);
			arithmetic_low20=arithmetic_low();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_low20.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:65:3: ( ( PLUS ^| MINUS ^) arithmetic_low )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==MINUS||LA7_0==PLUS) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:65:5: ( PLUS ^| MINUS ^) arithmetic_low
					{
					// ../src/csheets/core/formula/compiler/Formula.g:65:5: ( PLUS ^| MINUS ^)
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==PLUS) ) {
						alt6=1;
					}
					else if ( (LA6_0==MINUS) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:65:7: PLUS ^
							{
							PLUS21=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_lowest229); 
							PLUS21_tree = (Object)adaptor.create(PLUS21);
							root_0 = (Object)adaptor.becomeRoot(PLUS21_tree, root_0);

							}
							break;
						case 2 :
							// ../src/csheets/core/formula/compiler/Formula.g:65:15: MINUS ^
							{
							MINUS22=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_lowest234); 
							MINUS22_tree = (Object)adaptor.create(MINUS22);
							root_0 = (Object)adaptor.becomeRoot(MINUS22_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_low_in_arithmetic_lowest239);
					arithmetic_low23=arithmetic_low();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_low23.getTree());

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

		Token MULTI25=null;
		Token DIV26=null;
		ParserRuleReturnScope arithmetic_medium24 =null;
		ParserRuleReturnScope arithmetic_medium27 =null;

		Object MULTI25_tree=null;
		Object DIV26_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:69:2: ( arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )* )
			// ../src/csheets/core/formula/compiler/Formula.g:69:4: arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_medium_in_arithmetic_low253);
			arithmetic_medium24=arithmetic_medium();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_medium24.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:70:3: ( ( MULTI ^| DIV ^) arithmetic_medium )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==DIV||LA9_0==MULTI) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:70:5: ( MULTI ^| DIV ^) arithmetic_medium
					{
					// ../src/csheets/core/formula/compiler/Formula.g:70:5: ( MULTI ^| DIV ^)
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==MULTI) ) {
						alt8=1;
					}
					else if ( (LA8_0==DIV) ) {
						alt8=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:70:7: MULTI ^
							{
							MULTI25=(Token)match(input,MULTI,FOLLOW_MULTI_in_arithmetic_low261); 
							MULTI25_tree = (Object)adaptor.create(MULTI25);
							root_0 = (Object)adaptor.becomeRoot(MULTI25_tree, root_0);

							}
							break;
						case 2 :
							// ../src/csheets/core/formula/compiler/Formula.g:70:16: DIV ^
							{
							DIV26=(Token)match(input,DIV,FOLLOW_DIV_in_arithmetic_low266); 
							DIV26_tree = (Object)adaptor.create(DIV26);
							root_0 = (Object)adaptor.becomeRoot(DIV26_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_medium_in_arithmetic_low271);
					arithmetic_medium27=arithmetic_medium();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_medium27.getTree());

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

		Token POWER29=null;
		ParserRuleReturnScope arithmetic_high28 =null;
		ParserRuleReturnScope arithmetic_high30 =null;

		Object POWER29_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:74:2: ( arithmetic_high ( POWER ^ arithmetic_high )? )
			// ../src/csheets/core/formula/compiler/Formula.g:74:4: arithmetic_high ( POWER ^ arithmetic_high )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_high_in_arithmetic_medium285);
			arithmetic_high28=arithmetic_high();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_high28.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:75:3: ( POWER ^ arithmetic_high )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==POWER) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:75:5: POWER ^ arithmetic_high
					{
					POWER29=(Token)match(input,POWER,FOLLOW_POWER_in_arithmetic_medium291); 
					POWER29_tree = (Object)adaptor.create(POWER29);
					root_0 = (Object)adaptor.becomeRoot(POWER29_tree, root_0);

					pushFollow(FOLLOW_arithmetic_high_in_arithmetic_medium294);
					arithmetic_high30=arithmetic_high();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_high30.getTree());

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

		Token PERCENT32=null;
		ParserRuleReturnScope arithmetic_highest31 =null;

		Object PERCENT32_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:79:2: ( arithmetic_highest ( PERCENT ^)? )
			// ../src/csheets/core/formula/compiler/Formula.g:79:4: arithmetic_highest ( PERCENT ^)?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_highest_in_arithmetic_high308);
			arithmetic_highest31=arithmetic_highest();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_highest31.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:79:23: ( PERCENT ^)?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==PERCENT) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:79:25: PERCENT ^
					{
					PERCENT32=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_arithmetic_high312); 
					PERCENT32_tree = (Object)adaptor.create(PERCENT32);
					root_0 = (Object)adaptor.becomeRoot(PERCENT32_tree, root_0);

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

		Token MINUS33=null;
		ParserRuleReturnScope atom34 =null;

		Object MINUS33_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:83:2: ( ( MINUS ^)? atom )
			// ../src/csheets/core/formula/compiler/Formula.g:83:4: ( MINUS ^)? atom
			{
			root_0 = (Object)adaptor.nil();


			// ../src/csheets/core/formula/compiler/Formula.g:83:4: ( MINUS ^)?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==MINUS) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:83:6: MINUS ^
					{
					MINUS33=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_highest329); 
					MINUS33_tree = (Object)adaptor.create(MINUS33);
					root_0 = (Object)adaptor.becomeRoot(MINUS33_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_atom_in_arithmetic_highest335);
			atom34=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom34.getTree());

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

		Token LPAR38=null;
		Token RPAR40=null;
		ParserRuleReturnScope function_call35 =null;
		ParserRuleReturnScope reference36 =null;
		ParserRuleReturnScope literal37 =null;
		ParserRuleReturnScope comparison39 =null;

		Object LPAR38_tree=null;
		Object RPAR40_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:87:2: ( function_call | reference | literal | LPAR ! comparison RPAR !)
			int alt13=4;
			switch ( input.LA(1) ) {
			case FUNCTION:
				{
				alt13=1;
				}
				break;
			case CELL_REF:
				{
				alt13=2;
				}
				break;
			case NUMBER:
			case STRING:
				{
				alt13=3;
				}
				break;
			case LPAR:
				{
				alt13=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:87:4: function_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_call_in_atom346);
					function_call35=function_call();
					state._fsp--;

					adaptor.addChild(root_0, function_call35.getTree());

					}
					break;
				case 2 :
					// ../src/csheets/core/formula/compiler/Formula.g:88:4: reference
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_reference_in_atom351);
					reference36=reference();
					state._fsp--;

					adaptor.addChild(root_0, reference36.getTree());

					}
					break;
				case 3 :
					// ../src/csheets/core/formula/compiler/Formula.g:89:4: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_atom356);
					literal37=literal();
					state._fsp--;

					adaptor.addChild(root_0, literal37.getTree());

					}
					break;
				case 4 :
					// ../src/csheets/core/formula/compiler/Formula.g:90:4: LPAR ! comparison RPAR !
					{
					root_0 = (Object)adaptor.nil();


					LPAR38=(Token)match(input,LPAR,FOLLOW_LPAR_in_atom361); 
					pushFollow(FOLLOW_comparison_in_atom364);
					comparison39=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison39.getTree());

					RPAR40=(Token)match(input,RPAR,FOLLOW_RPAR_in_atom366); 
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

		Token FUNCTION41=null;
		Token LPAR42=null;
		Token SEMI44=null;
		Token RPAR46=null;
		ParserRuleReturnScope comparison43 =null;
		ParserRuleReturnScope comparison45 =null;

		Object FUNCTION41_tree=null;
		Object LPAR42_tree=null;
		Object SEMI44_tree=null;
		Object RPAR46_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:94:2: ( FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !)
			// ../src/csheets/core/formula/compiler/Formula.g:94:4: FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !
			{
			root_0 = (Object)adaptor.nil();


			FUNCTION41=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_call378); 
			FUNCTION41_tree = (Object)adaptor.create(FUNCTION41);
			root_0 = (Object)adaptor.becomeRoot(FUNCTION41_tree, root_0);

			LPAR42=(Token)match(input,LPAR,FOLLOW_LPAR_in_function_call381); 
			// ../src/csheets/core/formula/compiler/Formula.g:95:3: ( comparison ( SEMI ! comparison )* )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CELL_REF||LA15_0==FUNCTION||LA15_0==LPAR||LA15_0==MINUS||LA15_0==NUMBER||LA15_0==STRING) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:95:5: comparison ( SEMI ! comparison )*
					{
					pushFollow(FOLLOW_comparison_in_function_call389);
					comparison43=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison43.getTree());

					// ../src/csheets/core/formula/compiler/Formula.g:95:16: ( SEMI ! comparison )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==SEMI) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:95:18: SEMI ! comparison
							{
							SEMI44=(Token)match(input,SEMI,FOLLOW_SEMI_in_function_call393); 
							pushFollow(FOLLOW_comparison_in_function_call396);
							comparison45=comparison();
							state._fsp--;

							adaptor.addChild(root_0, comparison45.getTree());

							}
							break;

						default :
							break loop14;
						}
					}

					}
					break;

			}

			RPAR46=(Token)match(input,RPAR,FOLLOW_RPAR_in_function_call406); 
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

		Token CELL_REF47=null;
		Token COLON48=null;
		Token CELL_REF49=null;

		Object CELL_REF47_tree=null;
		Object COLON48_tree=null;
		Object CELL_REF49_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:100:2: ( CELL_REF ( ( COLON ^) CELL_REF )? )
			// ../src/csheets/core/formula/compiler/Formula.g:100:4: CELL_REF ( ( COLON ^) CELL_REF )?
			{
			root_0 = (Object)adaptor.nil();


			CELL_REF47=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_reference418); 
			CELL_REF47_tree = (Object)adaptor.create(CELL_REF47);
			adaptor.addChild(root_0, CELL_REF47_tree);

			// ../src/csheets/core/formula/compiler/Formula.g:101:3: ( ( COLON ^) CELL_REF )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==COLON) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:101:5: ( COLON ^) CELL_REF
					{
					// ../src/csheets/core/formula/compiler/Formula.g:101:5: ( COLON ^)
					// ../src/csheets/core/formula/compiler/Formula.g:101:7: COLON ^
					{
					COLON48=(Token)match(input,COLON,FOLLOW_COLON_in_reference426); 
					COLON48_tree = (Object)adaptor.create(COLON48);
					root_0 = (Object)adaptor.becomeRoot(COLON48_tree, root_0);

					}

					CELL_REF49=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_reference431); 
					CELL_REF49_tree = (Object)adaptor.create(CELL_REF49);
					adaptor.addChild(root_0, CELL_REF49_tree);

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

		Token set50=null;

		Object set50_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:105:2: ( NUMBER | STRING )
			// ../src/csheets/core/formula/compiler/Formula.g:
			{
			root_0 = (Object)adaptor.nil();


			set50=input.LT(1);
			if ( input.LA(1)==NUMBER||input.LA(1)==STRING ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set50));
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



	public static final BitSet FOLLOW_EQ_in_expression80 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_attribution_in_expression84 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_comparison_in_expression88 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expression91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CELL_REF_in_attribution117 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ATT_in_attribution119 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_attribution_in_attribution123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_attribution127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concatenation_in_comparison146 = new BitSet(new long[]{0x0000000000999002L});
	public static final BitSet FOLLOW_EQ_in_comparison154 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_NEQ_in_comparison159 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_GT_in_comparison164 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_LT_in_comparison169 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_LTEQ_in_comparison174 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_GTEQ_in_comparison179 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_concatenation_in_comparison184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_lowest_in_concatenation198 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AMP_in_concatenation204 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_arithmetic_lowest_in_concatenation207 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_arithmetic_low_in_arithmetic_lowest221 = new BitSet(new long[]{0x0000000004200002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_lowest229 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_lowest234 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_arithmetic_low_in_arithmetic_lowest239 = new BitSet(new long[]{0x0000000004200002L});
	public static final BitSet FOLLOW_arithmetic_medium_in_arithmetic_low253 = new BitSet(new long[]{0x0000000000400802L});
	public static final BitSet FOLLOW_MULTI_in_arithmetic_low261 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_DIV_in_arithmetic_low266 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_arithmetic_medium_in_arithmetic_low271 = new BitSet(new long[]{0x0000000000400802L});
	public static final BitSet FOLLOW_arithmetic_high_in_arithmetic_medium285 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_POWER_in_arithmetic_medium291 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_arithmetic_high_in_arithmetic_medium294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_highest_in_arithmetic_high308 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_PERCENT_in_arithmetic_high312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_highest329 = new BitSet(new long[]{0x0000000081044080L});
	public static final BitSet FOLLOW_atom_in_arithmetic_highest335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_call_in_atom346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_in_atom351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_atom356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_atom361 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_comparison_in_atom364 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_RPAR_in_atom366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_function_call378 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAR_in_function_call381 = new BitSet(new long[]{0x00000000A1244080L});
	public static final BitSet FOLLOW_comparison_in_function_call389 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_SEMI_in_function_call393 = new BitSet(new long[]{0x0000000081244080L});
	public static final BitSet FOLLOW_comparison_in_function_call396 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_RPAR_in_function_call406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CELL_REF_in_reference418 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COLON_in_reference426 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CELL_REF_in_reference431 = new BitSet(new long[]{0x0000000000000002L});
}

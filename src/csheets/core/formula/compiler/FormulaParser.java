// $ANTLR 3.5.2 ../src/csheets/core/formula/compiler/Formula.g 2014-06-17 16:11:17

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
		"VARNAME", "WS"
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
	public static final int VARNAME=34;
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
	// ../src/csheets/core/formula/compiler/Formula.g:45:1: expression : EQ ! sq EOF !;
	public final FormulaParser.expression_return expression() throws RecognitionException {
		FormulaParser.expression_return retval = new FormulaParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ1=null;
		Token EOF3=null;
		ParserRuleReturnScope sq2 =null;

		Object EQ1_tree=null;
		Object EOF3_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:46:2: ( EQ ! sq EOF !)
			// ../src/csheets/core/formula/compiler/Formula.g:46:4: EQ ! sq EOF !
			{
			root_0 = (Object)adaptor.nil();


			EQ1=(Token)match(input,EQ,FOLLOW_EQ_in_expression80); 
			pushFollow(FOLLOW_sq_in_expression83);
			sq2=sq();
			state._fsp--;

			adaptor.addChild(root_0, sq2.getTree());

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


	public static class sq_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sq"
	// ../src/csheets/core/formula/compiler/Formula.g:49:1: sq : ( attribution | comparison | sequencia );
	public final FormulaParser.sq_return sq() throws RecognitionException {
		FormulaParser.sq_return retval = new FormulaParser.sq_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope attribution4 =null;
		ParserRuleReturnScope comparison5 =null;
		ParserRuleReturnScope sequencia6 =null;


		try {
			// ../src/csheets/core/formula/compiler/Formula.g:50:9: ( attribution | comparison | sequencia )
			int alt1=3;
			switch ( input.LA(1) ) {
			case CELL_REF:
				{
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
				break;
			case VARNAME:
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2==ATT) ) {
					alt1=1;
				}
				else if ( (LA1_2==EOF||LA1_2==AMP||(LA1_2 >= DIV && LA1_2 <= EQ)||(LA1_2 >= GT && LA1_2 <= GTEQ)||(LA1_2 >= LT && LA1_2 <= NEQ)||(LA1_2 >= PERCENT && LA1_2 <= POWER)) ) {
					alt1=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FUNCTION:
			case LPAR:
			case MINUS:
			case STRING:
				{
				alt1=2;
				}
				break;
			case NUMBER:
				{
				switch ( input.LA(2) ) {
				case PERCENT:
					{
					int LA1_7 = input.LA(3);
					if ( (LA1_7==EOF||LA1_7==AMP||(LA1_7 >= DIV && LA1_7 <= EQ)||(LA1_7 >= GT && LA1_7 <= GTEQ)||(LA1_7 >= LT && LA1_7 <= NEQ)||(LA1_7 >= PLUS && LA1_7 <= POWER)) ) {
						alt1=2;
					}
					else if ( (LA1_7==LBRA) ) {
						alt1=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case POWER:
					{
					int LA1_8 = input.LA(3);
					if ( (LA1_8==CELL_REF||LA1_8==FUNCTION||LA1_8==LPAR||LA1_8==MINUS||LA1_8==NUMBER||(LA1_8 >= STRING && LA1_8 <= VARNAME)) ) {
						alt1=2;
					}
					else if ( (LA1_8==LBRA) ) {
						alt1=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case MULTI:
					{
					int LA1_9 = input.LA(3);
					if ( (LA1_9==CELL_REF||LA1_9==FUNCTION||LA1_9==LPAR||LA1_9==MINUS||LA1_9==NUMBER||(LA1_9 >= STRING && LA1_9 <= VARNAME)) ) {
						alt1=2;
					}
					else if ( (LA1_9==LBRA) ) {
						alt1=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case DIV:
					{
					int LA1_10 = input.LA(3);
					if ( (LA1_10==CELL_REF||LA1_10==FUNCTION||LA1_10==LPAR||LA1_10==MINUS||LA1_10==NUMBER||(LA1_10 >= STRING && LA1_10 <= VARNAME)) ) {
						alt1=2;
					}
					else if ( (LA1_10==LBRA) ) {
						alt1=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case PLUS:
					{
					int LA1_11 = input.LA(3);
					if ( (LA1_11==CELL_REF||LA1_11==FUNCTION||LA1_11==LPAR||LA1_11==MINUS||LA1_11==NUMBER||(LA1_11 >= STRING && LA1_11 <= VARNAME)) ) {
						alt1=2;
					}
					else if ( (LA1_11==LBRA) ) {
						alt1=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case MINUS:
					{
					int LA1_12 = input.LA(3);
					if ( (LA1_12==CELL_REF||LA1_12==FUNCTION||LA1_12==LPAR||LA1_12==MINUS||LA1_12==NUMBER||(LA1_12 >= STRING && LA1_12 <= VARNAME)) ) {
						alt1=2;
					}
					else if ( (LA1_12==LBRA) ) {
						alt1=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case EOF:
				case AMP:
				case EQ:
				case GT:
				case GTEQ:
				case LT:
				case LTEQ:
				case NEQ:
					{
					alt1=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LBRA:
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:50:11: attribution
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_attribution_in_sq111);
					attribution4=attribution();
					state._fsp--;

					adaptor.addChild(root_0, attribution4.getTree());

					}
					break;
				case 2 :
					// ../src/csheets/core/formula/compiler/Formula.g:50:25: comparison
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_comparison_in_sq115);
					comparison5=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison5.getTree());

					}
					break;
				case 3 :
					// ../src/csheets/core/formula/compiler/Formula.g:50:38: sequencia
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sequencia_in_sq119);
					sequencia6=sequencia();
					state._fsp--;

					adaptor.addChild(root_0, sequencia6.getTree());

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
	// $ANTLR end "sq"


	public static class sequencia_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sequencia"
	// ../src/csheets/core/formula/compiler/Formula.g:53:1: sequencia : ( ( NUMBER ) arithmetic ^)? block ( arithmetic ^ atom )? ;
	public final FormulaParser.sequencia_return sequencia() throws RecognitionException {
		FormulaParser.sequencia_return retval = new FormulaParser.sequencia_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER7=null;
		ParserRuleReturnScope arithmetic8 =null;
		ParserRuleReturnScope block9 =null;
		ParserRuleReturnScope arithmetic10 =null;
		ParserRuleReturnScope atom11 =null;

		Object NUMBER7_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:53:10: ( ( ( NUMBER ) arithmetic ^)? block ( arithmetic ^ atom )? )
			// ../src/csheets/core/formula/compiler/Formula.g:54:9: ( ( NUMBER ) arithmetic ^)? block ( arithmetic ^ atom )?
			{
			root_0 = (Object)adaptor.nil();


			// ../src/csheets/core/formula/compiler/Formula.g:54:9: ( ( NUMBER ) arithmetic ^)?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==NUMBER) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:54:10: ( NUMBER ) arithmetic ^
					{
					// ../src/csheets/core/formula/compiler/Formula.g:54:10: ( NUMBER )
					// ../src/csheets/core/formula/compiler/Formula.g:54:11: NUMBER
					{
					NUMBER7=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_sequencia145); 
					NUMBER7_tree = (Object)adaptor.create(NUMBER7);
					adaptor.addChild(root_0, NUMBER7_tree);

					}

					pushFollow(FOLLOW_arithmetic_in_sequencia148);
					arithmetic8=arithmetic();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(arithmetic8.getTree(), root_0);
					}
					break;

			}

			pushFollow(FOLLOW_block_in_sequencia153);
			block9=block();
			state._fsp--;

			adaptor.addChild(root_0, block9.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:54:39: ( arithmetic ^ atom )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==DIV||(LA3_0 >= MINUS && LA3_0 <= MULTI)||(LA3_0 >= PERCENT && LA3_0 <= POWER)) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:54:40: arithmetic ^ atom
					{
					pushFollow(FOLLOW_arithmetic_in_sequencia156);
					arithmetic10=arithmetic();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(arithmetic10.getTree(), root_0);
					pushFollow(FOLLOW_atom_in_sequencia159);
					atom11=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom11.getTree());

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
	// $ANTLR end "sequencia"


	public static class arithmetic_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic"
	// ../src/csheets/core/formula/compiler/Formula.g:57:1: arithmetic : ( PLUS | MINUS | MULTI | DIV | POWER | PERCENT );
	public final FormulaParser.arithmetic_return arithmetic() throws RecognitionException {
		FormulaParser.arithmetic_return retval = new FormulaParser.arithmetic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set12=null;

		Object set12_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:57:11: ( PLUS | MINUS | MULTI | DIV | POWER | PERCENT )
			// ../src/csheets/core/formula/compiler/Formula.g:
			{
			root_0 = (Object)adaptor.nil();


			set12=input.LT(1);
			if ( input.LA(1)==DIV||(input.LA(1) >= MINUS && input.LA(1) <= MULTI)||(input.LA(1) >= PERCENT && input.LA(1) <= POWER) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set12));
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
	// $ANTLR end "arithmetic"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// ../src/csheets/core/formula/compiler/Formula.g:61:1: block : LBRA ! ( attribution | comparison | block ) ( SEMI ^ ( attribution | comparison | block ) )* RBRA !;
	public final FormulaParser.block_return block() throws RecognitionException {
		FormulaParser.block_return retval = new FormulaParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRA13=null;
		Token SEMI17=null;
		Token RBRA21=null;
		ParserRuleReturnScope attribution14 =null;
		ParserRuleReturnScope comparison15 =null;
		ParserRuleReturnScope block16 =null;
		ParserRuleReturnScope attribution18 =null;
		ParserRuleReturnScope comparison19 =null;
		ParserRuleReturnScope block20 =null;

		Object LBRA13_tree=null;
		Object SEMI17_tree=null;
		Object RBRA21_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:61:6: ( LBRA ! ( attribution | comparison | block ) ( SEMI ^ ( attribution | comparison | block ) )* RBRA !)
			// ../src/csheets/core/formula/compiler/Formula.g:62:9: LBRA ! ( attribution | comparison | block ) ( SEMI ^ ( attribution | comparison | block ) )* RBRA !
			{
			root_0 = (Object)adaptor.nil();


			LBRA13=(Token)match(input,LBRA,FOLLOW_LBRA_in_block219); 
			// ../src/csheets/core/formula/compiler/Formula.g:62:15: ( attribution | comparison | block )
			int alt4=3;
			switch ( input.LA(1) ) {
			case CELL_REF:
				{
				int LA4_1 = input.LA(2);
				if ( (LA4_1==ATT) ) {
					alt4=1;
				}
				else if ( (LA4_1==AMP||LA4_1==COLON||(LA4_1 >= DIV && LA4_1 <= EQ)||(LA4_1 >= GT && LA4_1 <= GTEQ)||(LA4_1 >= LT && LA4_1 <= NEQ)||(LA4_1 >= PERCENT && LA4_1 <= POWER)||LA4_1==RBRA||LA4_1==SEMI) ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VARNAME:
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2==ATT) ) {
					alt4=1;
				}
				else if ( (LA4_2==AMP||(LA4_2 >= DIV && LA4_2 <= EQ)||(LA4_2 >= GT && LA4_2 <= GTEQ)||(LA4_2 >= LT && LA4_2 <= NEQ)||(LA4_2 >= PERCENT && LA4_2 <= POWER)||LA4_2==RBRA||LA4_2==SEMI) ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FUNCTION:
			case LPAR:
			case MINUS:
			case NUMBER:
			case STRING:
				{
				alt4=2;
				}
				break;
			case LBRA:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:62:16: attribution
					{
					pushFollow(FOLLOW_attribution_in_block223);
					attribution14=attribution();
					state._fsp--;

					adaptor.addChild(root_0, attribution14.getTree());

					}
					break;
				case 2 :
					// ../src/csheets/core/formula/compiler/Formula.g:62:30: comparison
					{
					pushFollow(FOLLOW_comparison_in_block227);
					comparison15=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison15.getTree());

					}
					break;
				case 3 :
					// ../src/csheets/core/formula/compiler/Formula.g:62:43: block
					{
					pushFollow(FOLLOW_block_in_block231);
					block16=block();
					state._fsp--;

					adaptor.addChild(root_0, block16.getTree());

					}
					break;

			}

			// ../src/csheets/core/formula/compiler/Formula.g:62:50: ( SEMI ^ ( attribution | comparison | block ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==SEMI) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:62:51: SEMI ^ ( attribution | comparison | block )
					{
					SEMI17=(Token)match(input,SEMI,FOLLOW_SEMI_in_block235); 
					SEMI17_tree = (Object)adaptor.create(SEMI17);
					root_0 = (Object)adaptor.becomeRoot(SEMI17_tree, root_0);

					// ../src/csheets/core/formula/compiler/Formula.g:62:57: ( attribution | comparison | block )
					int alt5=3;
					switch ( input.LA(1) ) {
					case CELL_REF:
						{
						int LA5_1 = input.LA(2);
						if ( (LA5_1==ATT) ) {
							alt5=1;
						}
						else if ( (LA5_1==AMP||LA5_1==COLON||(LA5_1 >= DIV && LA5_1 <= EQ)||(LA5_1 >= GT && LA5_1 <= GTEQ)||(LA5_1 >= LT && LA5_1 <= NEQ)||(LA5_1 >= PERCENT && LA5_1 <= POWER)||LA5_1==RBRA||LA5_1==SEMI) ) {
							alt5=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 5, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case VARNAME:
						{
						int LA5_2 = input.LA(2);
						if ( (LA5_2==ATT) ) {
							alt5=1;
						}
						else if ( (LA5_2==AMP||(LA5_2 >= DIV && LA5_2 <= EQ)||(LA5_2 >= GT && LA5_2 <= GTEQ)||(LA5_2 >= LT && LA5_2 <= NEQ)||(LA5_2 >= PERCENT && LA5_2 <= POWER)||LA5_2==RBRA||LA5_2==SEMI) ) {
							alt5=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 5, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case FUNCTION:
					case LPAR:
					case MINUS:
					case NUMBER:
					case STRING:
						{
						alt5=2;
						}
						break;
					case LBRA:
						{
						alt5=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}
					switch (alt5) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:62:58: attribution
							{
							pushFollow(FOLLOW_attribution_in_block239);
							attribution18=attribution();
							state._fsp--;

							adaptor.addChild(root_0, attribution18.getTree());

							}
							break;
						case 2 :
							// ../src/csheets/core/formula/compiler/Formula.g:62:72: comparison
							{
							pushFollow(FOLLOW_comparison_in_block243);
							comparison19=comparison();
							state._fsp--;

							adaptor.addChild(root_0, comparison19.getTree());

							}
							break;
						case 3 :
							// ../src/csheets/core/formula/compiler/Formula.g:62:85: block
							{
							pushFollow(FOLLOW_block_in_block247);
							block20=block();
							state._fsp--;

							adaptor.addChild(root_0, block20.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop6;
				}
			}

			RBRA21=(Token)match(input,RBRA,FOLLOW_RBRA_in_block252); 
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
	// $ANTLR end "block"


	public static class attribution_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attribution"
	// ../src/csheets/core/formula/compiler/Formula.g:65:1: attribution : ( CELL_REF | tempvar ) ATT ^ ( attribution | comparison ) ;
	public final FormulaParser.attribution_return attribution() throws RecognitionException {
		FormulaParser.attribution_return retval = new FormulaParser.attribution_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CELL_REF22=null;
		Token ATT24=null;
		ParserRuleReturnScope tempvar23 =null;
		ParserRuleReturnScope attribution25 =null;
		ParserRuleReturnScope comparison26 =null;

		Object CELL_REF22_tree=null;
		Object ATT24_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:66:9: ( ( CELL_REF | tempvar ) ATT ^ ( attribution | comparison ) )
			// ../src/csheets/core/formula/compiler/Formula.g:66:11: ( CELL_REF | tempvar ) ATT ^ ( attribution | comparison )
			{
			root_0 = (Object)adaptor.nil();


			// ../src/csheets/core/formula/compiler/Formula.g:66:11: ( CELL_REF | tempvar )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==CELL_REF) ) {
				alt7=1;
			}
			else if ( (LA7_0==VARNAME) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:66:13: CELL_REF
					{
					CELL_REF22=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_attribution280); 
					CELL_REF22_tree = (Object)adaptor.create(CELL_REF22);
					adaptor.addChild(root_0, CELL_REF22_tree);

					}
					break;
				case 2 :
					// ../src/csheets/core/formula/compiler/Formula.g:66:24: tempvar
					{
					pushFollow(FOLLOW_tempvar_in_attribution284);
					tempvar23=tempvar();
					state._fsp--;

					adaptor.addChild(root_0, tempvar23.getTree());

					}
					break;

			}

			ATT24=(Token)match(input,ATT,FOLLOW_ATT_in_attribution288); 
			ATT24_tree = (Object)adaptor.create(ATT24);
			root_0 = (Object)adaptor.becomeRoot(ATT24_tree, root_0);

			// ../src/csheets/core/formula/compiler/Formula.g:66:39: ( attribution | comparison )
			int alt8=2;
			switch ( input.LA(1) ) {
			case CELL_REF:
				{
				int LA8_1 = input.LA(2);
				if ( (LA8_1==ATT) ) {
					alt8=1;
				}
				else if ( (LA8_1==EOF||LA8_1==AMP||LA8_1==COLON||(LA8_1 >= DIV && LA8_1 <= EQ)||(LA8_1 >= GT && LA8_1 <= GTEQ)||(LA8_1 >= LT && LA8_1 <= NEQ)||(LA8_1 >= PERCENT && LA8_1 <= POWER)||LA8_1==RBRA||LA8_1==SEMI) ) {
					alt8=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VARNAME:
				{
				int LA8_2 = input.LA(2);
				if ( (LA8_2==ATT) ) {
					alt8=1;
				}
				else if ( (LA8_2==EOF||LA8_2==AMP||(LA8_2 >= DIV && LA8_2 <= EQ)||(LA8_2 >= GT && LA8_2 <= GTEQ)||(LA8_2 >= LT && LA8_2 <= NEQ)||(LA8_2 >= PERCENT && LA8_2 <= POWER)||LA8_2==RBRA||LA8_2==SEMI) ) {
					alt8=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FUNCTION:
			case LPAR:
			case MINUS:
			case NUMBER:
			case STRING:
				{
				alt8=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:66:40: attribution
					{
					pushFollow(FOLLOW_attribution_in_attribution292);
					attribution25=attribution();
					state._fsp--;

					adaptor.addChild(root_0, attribution25.getTree());

					}
					break;
				case 2 :
					// ../src/csheets/core/formula/compiler/Formula.g:66:54: comparison
					{
					pushFollow(FOLLOW_comparison_in_attribution296);
					comparison26=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison26.getTree());

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
	// ../src/csheets/core/formula/compiler/Formula.g:69:1: comparison : concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )? ;
	public final FormulaParser.comparison_return comparison() throws RecognitionException {
		FormulaParser.comparison_return retval = new FormulaParser.comparison_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ28=null;
		Token NEQ29=null;
		Token GT30=null;
		Token LT31=null;
		Token LTEQ32=null;
		Token GTEQ33=null;
		ParserRuleReturnScope concatenation27 =null;
		ParserRuleReturnScope concatenation34 =null;

		Object EQ28_tree=null;
		Object NEQ29_tree=null;
		Object GT30_tree=null;
		Object LT31_tree=null;
		Object LTEQ32_tree=null;
		Object GTEQ33_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:70:2: ( concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )? )
			// ../src/csheets/core/formula/compiler/Formula.g:70:4: concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_concatenation_in_comparison315);
			concatenation27=concatenation();
			state._fsp--;

			adaptor.addChild(root_0, concatenation27.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:71:3: ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==EQ||(LA10_0 >= GT && LA10_0 <= GTEQ)||(LA10_0 >= LT && LA10_0 <= LTEQ)||LA10_0==NEQ) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:71:5: ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation
					{
					// ../src/csheets/core/formula/compiler/Formula.g:71:5: ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^)
					int alt9=6;
					switch ( input.LA(1) ) {
					case EQ:
						{
						alt9=1;
						}
						break;
					case NEQ:
						{
						alt9=2;
						}
						break;
					case GT:
						{
						alt9=3;
						}
						break;
					case LT:
						{
						alt9=4;
						}
						break;
					case LTEQ:
						{
						alt9=5;
						}
						break;
					case GTEQ:
						{
						alt9=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}
					switch (alt9) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:71:7: EQ ^
							{
							EQ28=(Token)match(input,EQ,FOLLOW_EQ_in_comparison323); 
							EQ28_tree = (Object)adaptor.create(EQ28);
							root_0 = (Object)adaptor.becomeRoot(EQ28_tree, root_0);

							}
							break;
						case 2 :
							// ../src/csheets/core/formula/compiler/Formula.g:71:13: NEQ ^
							{
							NEQ29=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparison328); 
							NEQ29_tree = (Object)adaptor.create(NEQ29);
							root_0 = (Object)adaptor.becomeRoot(NEQ29_tree, root_0);

							}
							break;
						case 3 :
							// ../src/csheets/core/formula/compiler/Formula.g:71:20: GT ^
							{
							GT30=(Token)match(input,GT,FOLLOW_GT_in_comparison333); 
							GT30_tree = (Object)adaptor.create(GT30);
							root_0 = (Object)adaptor.becomeRoot(GT30_tree, root_0);

							}
							break;
						case 4 :
							// ../src/csheets/core/formula/compiler/Formula.g:71:26: LT ^
							{
							LT31=(Token)match(input,LT,FOLLOW_LT_in_comparison338); 
							LT31_tree = (Object)adaptor.create(LT31);
							root_0 = (Object)adaptor.becomeRoot(LT31_tree, root_0);

							}
							break;
						case 5 :
							// ../src/csheets/core/formula/compiler/Formula.g:71:32: LTEQ ^
							{
							LTEQ32=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_comparison343); 
							LTEQ32_tree = (Object)adaptor.create(LTEQ32);
							root_0 = (Object)adaptor.becomeRoot(LTEQ32_tree, root_0);

							}
							break;
						case 6 :
							// ../src/csheets/core/formula/compiler/Formula.g:71:40: GTEQ ^
							{
							GTEQ33=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_comparison348); 
							GTEQ33_tree = (Object)adaptor.create(GTEQ33);
							root_0 = (Object)adaptor.becomeRoot(GTEQ33_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_concatenation_in_comparison353);
					concatenation34=concatenation();
					state._fsp--;

					adaptor.addChild(root_0, concatenation34.getTree());

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
	// ../src/csheets/core/formula/compiler/Formula.g:74:1: concatenation : arithmetic_lowest ( AMP ^ arithmetic_lowest )* ;
	public final FormulaParser.concatenation_return concatenation() throws RecognitionException {
		FormulaParser.concatenation_return retval = new FormulaParser.concatenation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AMP36=null;
		ParserRuleReturnScope arithmetic_lowest35 =null;
		ParserRuleReturnScope arithmetic_lowest37 =null;

		Object AMP36_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:75:2: ( arithmetic_lowest ( AMP ^ arithmetic_lowest )* )
			// ../src/csheets/core/formula/compiler/Formula.g:75:4: arithmetic_lowest ( AMP ^ arithmetic_lowest )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_lowest_in_concatenation367);
			arithmetic_lowest35=arithmetic_lowest();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_lowest35.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:76:3: ( AMP ^ arithmetic_lowest )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==AMP) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:76:5: AMP ^ arithmetic_lowest
					{
					AMP36=(Token)match(input,AMP,FOLLOW_AMP_in_concatenation373); 
					AMP36_tree = (Object)adaptor.create(AMP36);
					root_0 = (Object)adaptor.becomeRoot(AMP36_tree, root_0);

					pushFollow(FOLLOW_arithmetic_lowest_in_concatenation376);
					arithmetic_lowest37=arithmetic_lowest();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_lowest37.getTree());

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
	// $ANTLR end "concatenation"


	public static class arithmetic_lowest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_lowest"
	// ../src/csheets/core/formula/compiler/Formula.g:79:1: arithmetic_lowest : arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )* ;
	public final FormulaParser.arithmetic_lowest_return arithmetic_lowest() throws RecognitionException {
		FormulaParser.arithmetic_lowest_return retval = new FormulaParser.arithmetic_lowest_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS39=null;
		Token MINUS40=null;
		ParserRuleReturnScope arithmetic_low38 =null;
		ParserRuleReturnScope arithmetic_low41 =null;

		Object PLUS39_tree=null;
		Object MINUS40_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:80:2: ( arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )* )
			// ../src/csheets/core/formula/compiler/Formula.g:80:4: arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_low_in_arithmetic_lowest390);
			arithmetic_low38=arithmetic_low();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_low38.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:81:3: ( ( PLUS ^| MINUS ^) arithmetic_low )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==MINUS||LA13_0==PLUS) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:81:5: ( PLUS ^| MINUS ^) arithmetic_low
					{
					// ../src/csheets/core/formula/compiler/Formula.g:81:5: ( PLUS ^| MINUS ^)
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==PLUS) ) {
						alt12=1;
					}
					else if ( (LA12_0==MINUS) ) {
						alt12=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}

					switch (alt12) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:81:7: PLUS ^
							{
							PLUS39=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_lowest398); 
							PLUS39_tree = (Object)adaptor.create(PLUS39);
							root_0 = (Object)adaptor.becomeRoot(PLUS39_tree, root_0);

							}
							break;
						case 2 :
							// ../src/csheets/core/formula/compiler/Formula.g:81:15: MINUS ^
							{
							MINUS40=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_lowest403); 
							MINUS40_tree = (Object)adaptor.create(MINUS40);
							root_0 = (Object)adaptor.becomeRoot(MINUS40_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_low_in_arithmetic_lowest408);
					arithmetic_low41=arithmetic_low();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_low41.getTree());

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
	// $ANTLR end "arithmetic_lowest"


	public static class arithmetic_low_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_low"
	// ../src/csheets/core/formula/compiler/Formula.g:84:1: arithmetic_low : arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )* ;
	public final FormulaParser.arithmetic_low_return arithmetic_low() throws RecognitionException {
		FormulaParser.arithmetic_low_return retval = new FormulaParser.arithmetic_low_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULTI43=null;
		Token DIV44=null;
		ParserRuleReturnScope arithmetic_medium42 =null;
		ParserRuleReturnScope arithmetic_medium45 =null;

		Object MULTI43_tree=null;
		Object DIV44_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:85:2: ( arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )* )
			// ../src/csheets/core/formula/compiler/Formula.g:85:4: arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_medium_in_arithmetic_low422);
			arithmetic_medium42=arithmetic_medium();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_medium42.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:86:3: ( ( MULTI ^| DIV ^) arithmetic_medium )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==DIV||LA15_0==MULTI) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:86:5: ( MULTI ^| DIV ^) arithmetic_medium
					{
					// ../src/csheets/core/formula/compiler/Formula.g:86:5: ( MULTI ^| DIV ^)
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==MULTI) ) {
						alt14=1;
					}
					else if ( (LA14_0==DIV) ) {
						alt14=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}

					switch (alt14) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:86:7: MULTI ^
							{
							MULTI43=(Token)match(input,MULTI,FOLLOW_MULTI_in_arithmetic_low430); 
							MULTI43_tree = (Object)adaptor.create(MULTI43);
							root_0 = (Object)adaptor.becomeRoot(MULTI43_tree, root_0);

							}
							break;
						case 2 :
							// ../src/csheets/core/formula/compiler/Formula.g:86:16: DIV ^
							{
							DIV44=(Token)match(input,DIV,FOLLOW_DIV_in_arithmetic_low435); 
							DIV44_tree = (Object)adaptor.create(DIV44);
							root_0 = (Object)adaptor.becomeRoot(DIV44_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_medium_in_arithmetic_low440);
					arithmetic_medium45=arithmetic_medium();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_medium45.getTree());

					}
					break;

				default :
					break loop15;
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
	// ../src/csheets/core/formula/compiler/Formula.g:89:1: arithmetic_medium : arithmetic_high ( POWER ^ arithmetic_high )? ;
	public final FormulaParser.arithmetic_medium_return arithmetic_medium() throws RecognitionException {
		FormulaParser.arithmetic_medium_return retval = new FormulaParser.arithmetic_medium_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token POWER47=null;
		ParserRuleReturnScope arithmetic_high46 =null;
		ParserRuleReturnScope arithmetic_high48 =null;

		Object POWER47_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:90:2: ( arithmetic_high ( POWER ^ arithmetic_high )? )
			// ../src/csheets/core/formula/compiler/Formula.g:90:4: arithmetic_high ( POWER ^ arithmetic_high )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_high_in_arithmetic_medium454);
			arithmetic_high46=arithmetic_high();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_high46.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:91:3: ( POWER ^ arithmetic_high )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==POWER) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:91:5: POWER ^ arithmetic_high
					{
					POWER47=(Token)match(input,POWER,FOLLOW_POWER_in_arithmetic_medium460); 
					POWER47_tree = (Object)adaptor.create(POWER47);
					root_0 = (Object)adaptor.becomeRoot(POWER47_tree, root_0);

					pushFollow(FOLLOW_arithmetic_high_in_arithmetic_medium463);
					arithmetic_high48=arithmetic_high();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_high48.getTree());

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
	// ../src/csheets/core/formula/compiler/Formula.g:94:1: arithmetic_high : arithmetic_highest ( PERCENT ^)? ;
	public final FormulaParser.arithmetic_high_return arithmetic_high() throws RecognitionException {
		FormulaParser.arithmetic_high_return retval = new FormulaParser.arithmetic_high_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERCENT50=null;
		ParserRuleReturnScope arithmetic_highest49 =null;

		Object PERCENT50_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:95:2: ( arithmetic_highest ( PERCENT ^)? )
			// ../src/csheets/core/formula/compiler/Formula.g:95:4: arithmetic_highest ( PERCENT ^)?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_highest_in_arithmetic_high477);
			arithmetic_highest49=arithmetic_highest();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_highest49.getTree());

			// ../src/csheets/core/formula/compiler/Formula.g:95:23: ( PERCENT ^)?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==PERCENT) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:95:25: PERCENT ^
					{
					PERCENT50=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_arithmetic_high481); 
					PERCENT50_tree = (Object)adaptor.create(PERCENT50);
					root_0 = (Object)adaptor.becomeRoot(PERCENT50_tree, root_0);

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
	// ../src/csheets/core/formula/compiler/Formula.g:98:1: arithmetic_highest : ( MINUS ^)? atom ;
	public final FormulaParser.arithmetic_highest_return arithmetic_highest() throws RecognitionException {
		FormulaParser.arithmetic_highest_return retval = new FormulaParser.arithmetic_highest_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS51=null;
		ParserRuleReturnScope atom52 =null;

		Object MINUS51_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:99:2: ( ( MINUS ^)? atom )
			// ../src/csheets/core/formula/compiler/Formula.g:99:4: ( MINUS ^)? atom
			{
			root_0 = (Object)adaptor.nil();


			// ../src/csheets/core/formula/compiler/Formula.g:99:4: ( MINUS ^)?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==MINUS) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:99:6: MINUS ^
					{
					MINUS51=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_highest498); 
					MINUS51_tree = (Object)adaptor.create(MINUS51);
					root_0 = (Object)adaptor.becomeRoot(MINUS51_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_atom_in_arithmetic_highest504);
			atom52=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom52.getTree());

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
	// ../src/csheets/core/formula/compiler/Formula.g:102:1: atom : ( function_call | reference | literal | tempvar | LPAR ! comparison RPAR !);
	public final FormulaParser.atom_return atom() throws RecognitionException {
		FormulaParser.atom_return retval = new FormulaParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAR57=null;
		Token RPAR59=null;
		ParserRuleReturnScope function_call53 =null;
		ParserRuleReturnScope reference54 =null;
		ParserRuleReturnScope literal55 =null;
		ParserRuleReturnScope tempvar56 =null;
		ParserRuleReturnScope comparison58 =null;

		Object LPAR57_tree=null;
		Object RPAR59_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:103:2: ( function_call | reference | literal | tempvar | LPAR ! comparison RPAR !)
			int alt19=5;
			switch ( input.LA(1) ) {
			case FUNCTION:
				{
				alt19=1;
				}
				break;
			case CELL_REF:
				{
				alt19=2;
				}
				break;
			case NUMBER:
			case STRING:
				{
				alt19=3;
				}
				break;
			case VARNAME:
				{
				alt19=4;
				}
				break;
			case LPAR:
				{
				alt19=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:103:4: function_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_call_in_atom515);
					function_call53=function_call();
					state._fsp--;

					adaptor.addChild(root_0, function_call53.getTree());

					}
					break;
				case 2 :
					// ../src/csheets/core/formula/compiler/Formula.g:104:4: reference
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_reference_in_atom520);
					reference54=reference();
					state._fsp--;

					adaptor.addChild(root_0, reference54.getTree());

					}
					break;
				case 3 :
					// ../src/csheets/core/formula/compiler/Formula.g:105:4: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_atom525);
					literal55=literal();
					state._fsp--;

					adaptor.addChild(root_0, literal55.getTree());

					}
					break;
				case 4 :
					// ../src/csheets/core/formula/compiler/Formula.g:106:4: tempvar
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tempvar_in_atom530);
					tempvar56=tempvar();
					state._fsp--;

					adaptor.addChild(root_0, tempvar56.getTree());

					}
					break;
				case 5 :
					// ../src/csheets/core/formula/compiler/Formula.g:107:4: LPAR ! comparison RPAR !
					{
					root_0 = (Object)adaptor.nil();


					LPAR57=(Token)match(input,LPAR,FOLLOW_LPAR_in_atom535); 
					pushFollow(FOLLOW_comparison_in_atom538);
					comparison58=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison58.getTree());

					RPAR59=(Token)match(input,RPAR,FOLLOW_RPAR_in_atom540); 
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
	// ../src/csheets/core/formula/compiler/Formula.g:110:1: function_call : FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !;
	public final FormulaParser.function_call_return function_call() throws RecognitionException {
		FormulaParser.function_call_return retval = new FormulaParser.function_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FUNCTION60=null;
		Token LPAR61=null;
		Token SEMI63=null;
		Token RPAR65=null;
		ParserRuleReturnScope comparison62 =null;
		ParserRuleReturnScope comparison64 =null;

		Object FUNCTION60_tree=null;
		Object LPAR61_tree=null;
		Object SEMI63_tree=null;
		Object RPAR65_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:111:2: ( FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !)
			// ../src/csheets/core/formula/compiler/Formula.g:111:4: FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !
			{
			root_0 = (Object)adaptor.nil();


			FUNCTION60=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_call552); 
			FUNCTION60_tree = (Object)adaptor.create(FUNCTION60);
			root_0 = (Object)adaptor.becomeRoot(FUNCTION60_tree, root_0);

			LPAR61=(Token)match(input,LPAR,FOLLOW_LPAR_in_function_call555); 
			// ../src/csheets/core/formula/compiler/Formula.g:112:3: ( comparison ( SEMI ! comparison )* )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==CELL_REF||LA21_0==FUNCTION||LA21_0==LPAR||LA21_0==MINUS||LA21_0==NUMBER||(LA21_0 >= STRING && LA21_0 <= VARNAME)) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:112:5: comparison ( SEMI ! comparison )*
					{
					pushFollow(FOLLOW_comparison_in_function_call563);
					comparison62=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison62.getTree());

					// ../src/csheets/core/formula/compiler/Formula.g:112:16: ( SEMI ! comparison )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==SEMI) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:112:18: SEMI ! comparison
							{
							SEMI63=(Token)match(input,SEMI,FOLLOW_SEMI_in_function_call567); 
							pushFollow(FOLLOW_comparison_in_function_call570);
							comparison64=comparison();
							state._fsp--;

							adaptor.addChild(root_0, comparison64.getTree());

							}
							break;

						default :
							break loop20;
						}
					}

					}
					break;

			}

			RPAR65=(Token)match(input,RPAR,FOLLOW_RPAR_in_function_call580); 
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
	// ../src/csheets/core/formula/compiler/Formula.g:116:1: reference : CELL_REF ( ( COLON ^) CELL_REF )? ;
	public final FormulaParser.reference_return reference() throws RecognitionException {
		FormulaParser.reference_return retval = new FormulaParser.reference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CELL_REF66=null;
		Token COLON67=null;
		Token CELL_REF68=null;

		Object CELL_REF66_tree=null;
		Object COLON67_tree=null;
		Object CELL_REF68_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:117:2: ( CELL_REF ( ( COLON ^) CELL_REF )? )
			// ../src/csheets/core/formula/compiler/Formula.g:117:4: CELL_REF ( ( COLON ^) CELL_REF )?
			{
			root_0 = (Object)adaptor.nil();


			CELL_REF66=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_reference592); 
			CELL_REF66_tree = (Object)adaptor.create(CELL_REF66);
			adaptor.addChild(root_0, CELL_REF66_tree);

			// ../src/csheets/core/formula/compiler/Formula.g:118:3: ( ( COLON ^) CELL_REF )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==COLON) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:118:5: ( COLON ^) CELL_REF
					{
					// ../src/csheets/core/formula/compiler/Formula.g:118:5: ( COLON ^)
					// ../src/csheets/core/formula/compiler/Formula.g:118:7: COLON ^
					{
					COLON67=(Token)match(input,COLON,FOLLOW_COLON_in_reference600); 
					COLON67_tree = (Object)adaptor.create(COLON67);
					root_0 = (Object)adaptor.becomeRoot(COLON67_tree, root_0);

					}

					CELL_REF68=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_reference605); 
					CELL_REF68_tree = (Object)adaptor.create(CELL_REF68);
					adaptor.addChild(root_0, CELL_REF68_tree);

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
	// ../src/csheets/core/formula/compiler/Formula.g:121:1: literal : ( NUMBER | STRING );
	public final FormulaParser.literal_return literal() throws RecognitionException {
		FormulaParser.literal_return retval = new FormulaParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set69=null;

		Object set69_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:122:2: ( NUMBER | STRING )
			// ../src/csheets/core/formula/compiler/Formula.g:
			{
			root_0 = (Object)adaptor.nil();


			set69=input.LT(1);
			if ( input.LA(1)==NUMBER||input.LA(1)==STRING ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set69));
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


	public static class tempvar_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tempvar"
	// ../src/csheets/core/formula/compiler/Formula.g:126:1: tempvar : VARNAME ;
	public final FormulaParser.tempvar_return tempvar() throws RecognitionException {
		FormulaParser.tempvar_return retval = new FormulaParser.tempvar_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARNAME70=null;

		Object VARNAME70_tree=null;

		try {
			// ../src/csheets/core/formula/compiler/Formula.g:126:9: ( VARNAME )
			// ../src/csheets/core/formula/compiler/Formula.g:126:11: VARNAME
			{
			root_0 = (Object)adaptor.nil();


			VARNAME70=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_tempvar635); 
			VARNAME70_tree = (Object)adaptor.create(VARNAME70);
			adaptor.addChild(root_0, VARNAME70_tree);

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
	// $ANTLR end "tempvar"

	// Delegated rules



	public static final BitSet FOLLOW_EQ_in_expression80 = new BitSet(new long[]{0x00000006024A4080L});
	public static final BitSet FOLLOW_sq_in_expression83 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expression85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribution_in_sq111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_sq115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequencia_in_sq119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_sequencia145 = new BitSet(new long[]{0x000000001CC00800L});
	public static final BitSet FOLLOW_arithmetic_in_sequencia148 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_block_in_sequencia153 = new BitSet(new long[]{0x000000001CC00802L});
	public static final BitSet FOLLOW_arithmetic_in_sequencia156 = new BitSet(new long[]{0x0000000602084080L});
	public static final BitSet FOLLOW_atom_in_sequencia159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRA_in_block219 = new BitSet(new long[]{0x00000006024A4080L});
	public static final BitSet FOLLOW_attribution_in_block223 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_comparison_in_block227 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_block_in_block231 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_SEMI_in_block235 = new BitSet(new long[]{0x00000006024A4080L});
	public static final BitSet FOLLOW_attribution_in_block239 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_comparison_in_block243 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_block_in_block247 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_RBRA_in_block252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CELL_REF_in_attribution280 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_tempvar_in_attribution284 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ATT_in_attribution288 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_attribution_in_attribution292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_attribution296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concatenation_in_comparison315 = new BitSet(new long[]{0x0000000001319002L});
	public static final BitSet FOLLOW_EQ_in_comparison323 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_NEQ_in_comparison328 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_GT_in_comparison333 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_LT_in_comparison338 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_LTEQ_in_comparison343 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_GTEQ_in_comparison348 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_concatenation_in_comparison353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_lowest_in_concatenation367 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AMP_in_concatenation373 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_arithmetic_lowest_in_concatenation376 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_arithmetic_low_in_arithmetic_lowest390 = new BitSet(new long[]{0x0000000008400002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_lowest398 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_lowest403 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_arithmetic_low_in_arithmetic_lowest408 = new BitSet(new long[]{0x0000000008400002L});
	public static final BitSet FOLLOW_arithmetic_medium_in_arithmetic_low422 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_MULTI_in_arithmetic_low430 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_DIV_in_arithmetic_low435 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_arithmetic_medium_in_arithmetic_low440 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_arithmetic_high_in_arithmetic_medium454 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_POWER_in_arithmetic_medium460 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_arithmetic_high_in_arithmetic_medium463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_highest_in_arithmetic_high477 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_PERCENT_in_arithmetic_high481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_highest498 = new BitSet(new long[]{0x0000000602084080L});
	public static final BitSet FOLLOW_atom_in_arithmetic_highest504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_call_in_atom515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_in_atom520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_atom525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tempvar_in_atom530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_atom535 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_comparison_in_atom538 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAR_in_atom540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_function_call552 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LPAR_in_function_call555 = new BitSet(new long[]{0x0000000682484080L});
	public static final BitSet FOLLOW_comparison_in_function_call563 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_SEMI_in_function_call567 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_comparison_in_function_call570 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_RPAR_in_function_call580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CELL_REF_in_reference592 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COLON_in_reference600 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CELL_REF_in_reference605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARNAME_in_tempvar635 = new BitSet(new long[]{0x0000000000000002L});
}

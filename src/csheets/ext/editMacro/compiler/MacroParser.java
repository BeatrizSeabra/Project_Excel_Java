// $ANTLR 3.5.1 C:\\Users\\i120388\\Desktop\\teste\\Macro.g 2014-06-19 14:12:27

package csheets.ext.editMacro.compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class MacroParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS", "AMP", "ATT", "CELL_REF", 
		"COLON", "COMMA", "DIGIT", "DIV", "EQ", "EXCL", "FUNCTION", "GT", "GTEQ", 
		"LBRA", "LETTER", "LPAR", "LT", "LTEQ", "MACRO", "MINUS", "MULTI", "NEQ", 
		"NUMBER", "PERCENT", "PLUS", "POWER", "QUOT", "RBRA", "RPAR", "SEMI", 
		"STRING", "VARNAME", "VARSIMBLE", "WS", "'\\n'"
	};
	public static final int EOF=-1;
	public static final int T__38=38;
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
	public static final int MACRO=22;
	public static final int MINUS=23;
	public static final int MULTI=24;
	public static final int NEQ=25;
	public static final int NUMBER=26;
	public static final int PERCENT=27;
	public static final int PLUS=28;
	public static final int POWER=29;
	public static final int QUOT=30;
	public static final int RBRA=31;
	public static final int RPAR=32;
	public static final int SEMI=33;
	public static final int STRING=34;
	public static final int VARNAME=35;
	public static final int VARSIMBLE=36;
	public static final int WS=37;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public MacroParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public MacroParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return MacroParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\i120388\\Desktop\\teste\\Macro.g"; }


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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:45:1: expression : macro EOF !;
	public final MacroParser.expression_return expression() throws RecognitionException {
		MacroParser.expression_return retval = new MacroParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope macro1 =null;

		Object EOF2_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:46:2: ( macro EOF !)
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:46:4: macro EOF !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_macro_in_expression80);
			macro1=macro();
			state._fsp--;

			adaptor.addChild(root_0, macro1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_expression82); 
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


	public static class macro_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "macro"
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:49:1: macro : MACRO STRING LBRA '\\n' line RBRA ;
	public final MacroParser.macro_return macro() throws RecognitionException {
		MacroParser.macro_return retval = new MacroParser.macro_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MACRO3=null;
		Token STRING4=null;
		Token LBRA5=null;
		Token char_literal6=null;
		Token RBRA8=null;
		ParserRuleReturnScope line7 =null;

		Object MACRO3_tree=null;
		Object STRING4_tree=null;
		Object LBRA5_tree=null;
		Object char_literal6_tree=null;
		Object RBRA8_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:50:9: ( MACRO STRING LBRA '\\n' line RBRA )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:50:11: MACRO STRING LBRA '\\n' line RBRA
			{
			root_0 = (Object)adaptor.nil();


			MACRO3=(Token)match(input,MACRO,FOLLOW_MACRO_in_macro108); 
			MACRO3_tree = (Object)adaptor.create(MACRO3);
			adaptor.addChild(root_0, MACRO3_tree);

			STRING4=(Token)match(input,STRING,FOLLOW_STRING_in_macro111); 
			STRING4_tree = (Object)adaptor.create(STRING4);
			adaptor.addChild(root_0, STRING4_tree);

			LBRA5=(Token)match(input,LBRA,FOLLOW_LBRA_in_macro114); 
			LBRA5_tree = (Object)adaptor.create(LBRA5);
			adaptor.addChild(root_0, LBRA5_tree);

			char_literal6=(Token)match(input,38,FOLLOW_38_in_macro117); 
			char_literal6_tree = (Object)adaptor.create(char_literal6);
			adaptor.addChild(root_0, char_literal6_tree);

			pushFollow(FOLLOW_line_in_macro119);
			line7=line();
			state._fsp--;

			adaptor.addChild(root_0, line7.getTree());

			RBRA8=(Token)match(input,RBRA,FOLLOW_RBRA_in_macro122); 
			RBRA8_tree = (Object)adaptor.create(RBRA8);
			adaptor.addChild(root_0, RBRA8_tree);

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
	// $ANTLR end "macro"


	public static class line_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "line"
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:53:1: line : ( sq '\\n' line |);
	public final MacroParser.line_return line() throws RecognitionException {
		MacroParser.line_return retval = new MacroParser.line_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal10=null;
		ParserRuleReturnScope sq9 =null;
		ParserRuleReturnScope line11 =null;

		Object char_literal10_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:54:9: ( sq '\\n' line |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CELL_REF||LA1_0==FUNCTION||LA1_0==LBRA||LA1_0==LPAR||LA1_0==MINUS||LA1_0==NUMBER||(LA1_0 >= STRING && LA1_0 <= VARNAME)) ) {
				alt1=1;
			}
			else if ( (LA1_0==RBRA) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:54:10: sq '\\n' line
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sq_in_line147);
					sq9=sq();
					state._fsp--;

					adaptor.addChild(root_0, sq9.getTree());

					char_literal10=(Token)match(input,38,FOLLOW_38_in_line149); 
					char_literal10_tree = (Object)adaptor.create(char_literal10);
					adaptor.addChild(root_0, char_literal10_tree);

					pushFollow(FOLLOW_line_in_line151);
					line11=line();
					state._fsp--;

					adaptor.addChild(root_0, line11.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:56:9: 
					{
					root_0 = (Object)adaptor.nil();


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
	// $ANTLR end "line"


	public static class sq_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sq"
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:58:1: sq : ( attribution | comparison | sequencia );
	public final MacroParser.sq_return sq() throws RecognitionException {
		MacroParser.sq_return retval = new MacroParser.sq_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope attribution12 =null;
		ParserRuleReturnScope comparison13 =null;
		ParserRuleReturnScope sequencia14 =null;


		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:59:9: ( attribution | comparison | sequencia )
			int alt2=3;
			switch ( input.LA(1) ) {
			case CELL_REF:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==ATT) ) {
					alt2=1;
				}
				else if ( (LA2_1==AMP||LA2_1==COLON||(LA2_1 >= DIV && LA2_1 <= EQ)||(LA2_1 >= GT && LA2_1 <= GTEQ)||(LA2_1 >= LT && LA2_1 <= LTEQ)||(LA2_1 >= MINUS && LA2_1 <= NEQ)||(LA2_1 >= PERCENT && LA2_1 <= POWER)||LA2_1==38) ) {
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
				break;
			case FUNCTION:
			case LPAR:
			case MINUS:
			case STRING:
				{
				alt2=2;
				}
				break;
			case VARNAME:
				{
				int LA2_3 = input.LA(2);
				if ( (LA2_3==ATT) ) {
					alt2=1;
				}
				else if ( (LA2_3==AMP||(LA2_3 >= DIV && LA2_3 <= EQ)||(LA2_3 >= GT && LA2_3 <= GTEQ)||(LA2_3 >= LT && LA2_3 <= LTEQ)||(LA2_3 >= MINUS && LA2_3 <= NEQ)||(LA2_3 >= PERCENT && LA2_3 <= POWER)||LA2_3==38) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NUMBER:
				{
				switch ( input.LA(2) ) {
				case PERCENT:
					{
					int LA2_7 = input.LA(3);
					if ( (LA2_7==AMP||(LA2_7 >= DIV && LA2_7 <= EQ)||(LA2_7 >= GT && LA2_7 <= GTEQ)||(LA2_7 >= LT && LA2_7 <= LTEQ)||(LA2_7 >= MINUS && LA2_7 <= NEQ)||(LA2_7 >= PLUS && LA2_7 <= POWER)||LA2_7==38) ) {
						alt2=2;
					}
					else if ( (LA2_7==LBRA) ) {
						alt2=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case POWER:
					{
					int LA2_8 = input.LA(3);
					if ( (LA2_8==CELL_REF||LA2_8==FUNCTION||LA2_8==LPAR||LA2_8==MINUS||LA2_8==NUMBER||(LA2_8 >= STRING && LA2_8 <= VARNAME)) ) {
						alt2=2;
					}
					else if ( (LA2_8==LBRA) ) {
						alt2=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case MULTI:
					{
					int LA2_9 = input.LA(3);
					if ( (LA2_9==CELL_REF||LA2_9==FUNCTION||LA2_9==LPAR||LA2_9==MINUS||LA2_9==NUMBER||(LA2_9 >= STRING && LA2_9 <= VARNAME)) ) {
						alt2=2;
					}
					else if ( (LA2_9==LBRA) ) {
						alt2=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case DIV:
					{
					int LA2_10 = input.LA(3);
					if ( (LA2_10==CELL_REF||LA2_10==FUNCTION||LA2_10==LPAR||LA2_10==MINUS||LA2_10==NUMBER||(LA2_10 >= STRING && LA2_10 <= VARNAME)) ) {
						alt2=2;
					}
					else if ( (LA2_10==LBRA) ) {
						alt2=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case PLUS:
					{
					int LA2_11 = input.LA(3);
					if ( (LA2_11==CELL_REF||LA2_11==FUNCTION||LA2_11==LPAR||LA2_11==MINUS||LA2_11==NUMBER||(LA2_11 >= STRING && LA2_11 <= VARNAME)) ) {
						alt2=2;
					}
					else if ( (LA2_11==LBRA) ) {
						alt2=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case MINUS:
					{
					int LA2_12 = input.LA(3);
					if ( (LA2_12==CELL_REF||LA2_12==FUNCTION||LA2_12==LPAR||LA2_12==MINUS||LA2_12==NUMBER||(LA2_12 >= STRING && LA2_12 <= VARNAME)) ) {
						alt2=2;
					}
					else if ( (LA2_12==LBRA) ) {
						alt2=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case AMP:
				case EQ:
				case GT:
				case GTEQ:
				case LT:
				case LTEQ:
				case NEQ:
				case 38:
					{
					alt2=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LBRA:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:59:11: attribution
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_attribution_in_sq186);
					attribution12=attribution();
					state._fsp--;

					adaptor.addChild(root_0, attribution12.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:59:25: comparison
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_comparison_in_sq190);
					comparison13=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison13.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:59:38: sequencia
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sequencia_in_sq194);
					sequencia14=sequencia();
					state._fsp--;

					adaptor.addChild(root_0, sequencia14.getTree());

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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:62:1: sequencia : ( ( NUMBER ) arithmetic ^)? block ( arithmetic ^ atom )? ;
	public final MacroParser.sequencia_return sequencia() throws RecognitionException {
		MacroParser.sequencia_return retval = new MacroParser.sequencia_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER15=null;
		ParserRuleReturnScope arithmetic16 =null;
		ParserRuleReturnScope block17 =null;
		ParserRuleReturnScope arithmetic18 =null;
		ParserRuleReturnScope atom19 =null;

		Object NUMBER15_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:62:10: ( ( ( NUMBER ) arithmetic ^)? block ( arithmetic ^ atom )? )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:63:9: ( ( NUMBER ) arithmetic ^)? block ( arithmetic ^ atom )?
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:63:9: ( ( NUMBER ) arithmetic ^)?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==NUMBER) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:63:10: ( NUMBER ) arithmetic ^
					{
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:63:10: ( NUMBER )
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:63:11: NUMBER
					{
					NUMBER15=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_sequencia220); 
					NUMBER15_tree = (Object)adaptor.create(NUMBER15);
					adaptor.addChild(root_0, NUMBER15_tree);

					}

					pushFollow(FOLLOW_arithmetic_in_sequencia223);
					arithmetic16=arithmetic();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(arithmetic16.getTree(), root_0);
					}
					break;

			}

			pushFollow(FOLLOW_block_in_sequencia228);
			block17=block();
			state._fsp--;

			adaptor.addChild(root_0, block17.getTree());

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:63:39: ( arithmetic ^ atom )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DIV||(LA4_0 >= MINUS && LA4_0 <= MULTI)||(LA4_0 >= PERCENT && LA4_0 <= POWER)) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:63:40: arithmetic ^ atom
					{
					pushFollow(FOLLOW_arithmetic_in_sequencia231);
					arithmetic18=arithmetic();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(arithmetic18.getTree(), root_0);
					pushFollow(FOLLOW_atom_in_sequencia234);
					atom19=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom19.getTree());

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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:66:1: arithmetic : ( PLUS | MINUS | MULTI | DIV | POWER | PERCENT );
	public final MacroParser.arithmetic_return arithmetic() throws RecognitionException {
		MacroParser.arithmetic_return retval = new MacroParser.arithmetic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set20=null;

		Object set20_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:66:11: ( PLUS | MINUS | MULTI | DIV | POWER | PERCENT )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:
			{
			root_0 = (Object)adaptor.nil();


			set20=input.LT(1);
			if ( input.LA(1)==DIV||(input.LA(1) >= MINUS && input.LA(1) <= MULTI)||(input.LA(1) >= PERCENT && input.LA(1) <= POWER) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set20));
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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:70:1: block : LBRA ! ( attribution | comparison | block ) ( SEMI ^ ( attribution | comparison | block ) )* RBRA !;
	public final MacroParser.block_return block() throws RecognitionException {
		MacroParser.block_return retval = new MacroParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRA21=null;
		Token SEMI25=null;
		Token RBRA29=null;
		ParserRuleReturnScope attribution22 =null;
		ParserRuleReturnScope comparison23 =null;
		ParserRuleReturnScope block24 =null;
		ParserRuleReturnScope attribution26 =null;
		ParserRuleReturnScope comparison27 =null;
		ParserRuleReturnScope block28 =null;

		Object LBRA21_tree=null;
		Object SEMI25_tree=null;
		Object RBRA29_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:70:6: ( LBRA ! ( attribution | comparison | block ) ( SEMI ^ ( attribution | comparison | block ) )* RBRA !)
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:71:9: LBRA ! ( attribution | comparison | block ) ( SEMI ^ ( attribution | comparison | block ) )* RBRA !
			{
			root_0 = (Object)adaptor.nil();


			LBRA21=(Token)match(input,LBRA,FOLLOW_LBRA_in_block294); 
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:71:15: ( attribution | comparison | block )
			int alt5=3;
			switch ( input.LA(1) ) {
			case CELL_REF:
				{
				int LA5_1 = input.LA(2);
				if ( (LA5_1==ATT) ) {
					alt5=1;
				}
				else if ( (LA5_1==AMP||LA5_1==COLON||(LA5_1 >= DIV && LA5_1 <= EQ)||(LA5_1 >= GT && LA5_1 <= GTEQ)||(LA5_1 >= LT && LA5_1 <= LTEQ)||(LA5_1 >= MINUS && LA5_1 <= NEQ)||(LA5_1 >= PERCENT && LA5_1 <= POWER)||LA5_1==RBRA||LA5_1==SEMI) ) {
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
			case FUNCTION:
			case LPAR:
			case MINUS:
			case NUMBER:
			case STRING:
				{
				alt5=2;
				}
				break;
			case VARNAME:
				{
				int LA5_3 = input.LA(2);
				if ( (LA5_3==ATT) ) {
					alt5=1;
				}
				else if ( (LA5_3==AMP||(LA5_3 >= DIV && LA5_3 <= EQ)||(LA5_3 >= GT && LA5_3 <= GTEQ)||(LA5_3 >= LT && LA5_3 <= LTEQ)||(LA5_3 >= MINUS && LA5_3 <= NEQ)||(LA5_3 >= PERCENT && LA5_3 <= POWER)||LA5_3==RBRA||LA5_3==SEMI) ) {
					alt5=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

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
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:71:16: attribution
					{
					pushFollow(FOLLOW_attribution_in_block298);
					attribution22=attribution();
					state._fsp--;

					adaptor.addChild(root_0, attribution22.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:71:30: comparison
					{
					pushFollow(FOLLOW_comparison_in_block302);
					comparison23=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison23.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:71:43: block
					{
					pushFollow(FOLLOW_block_in_block306);
					block24=block();
					state._fsp--;

					adaptor.addChild(root_0, block24.getTree());

					}
					break;

			}

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:71:50: ( SEMI ^ ( attribution | comparison | block ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==SEMI) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:71:51: SEMI ^ ( attribution | comparison | block )
					{
					SEMI25=(Token)match(input,SEMI,FOLLOW_SEMI_in_block310); 
					SEMI25_tree = (Object)adaptor.create(SEMI25);
					root_0 = (Object)adaptor.becomeRoot(SEMI25_tree, root_0);

					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:71:57: ( attribution | comparison | block )
					int alt6=3;
					switch ( input.LA(1) ) {
					case CELL_REF:
						{
						int LA6_1 = input.LA(2);
						if ( (LA6_1==ATT) ) {
							alt6=1;
						}
						else if ( (LA6_1==AMP||LA6_1==COLON||(LA6_1 >= DIV && LA6_1 <= EQ)||(LA6_1 >= GT && LA6_1 <= GTEQ)||(LA6_1 >= LT && LA6_1 <= LTEQ)||(LA6_1 >= MINUS && LA6_1 <= NEQ)||(LA6_1 >= PERCENT && LA6_1 <= POWER)||LA6_1==RBRA||LA6_1==SEMI) ) {
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
						break;
					case FUNCTION:
					case LPAR:
					case MINUS:
					case NUMBER:
					case STRING:
						{
						alt6=2;
						}
						break;
					case VARNAME:
						{
						int LA6_3 = input.LA(2);
						if ( (LA6_3==ATT) ) {
							alt6=1;
						}
						else if ( (LA6_3==AMP||(LA6_3 >= DIV && LA6_3 <= EQ)||(LA6_3 >= GT && LA6_3 <= GTEQ)||(LA6_3 >= LT && LA6_3 <= LTEQ)||(LA6_3 >= MINUS && LA6_3 <= NEQ)||(LA6_3 >= PERCENT && LA6_3 <= POWER)||LA6_3==RBRA||LA6_3==SEMI) ) {
							alt6=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 6, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case LBRA:
						{
						alt6=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:71:58: attribution
							{
							pushFollow(FOLLOW_attribution_in_block314);
							attribution26=attribution();
							state._fsp--;

							adaptor.addChild(root_0, attribution26.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:71:72: comparison
							{
							pushFollow(FOLLOW_comparison_in_block318);
							comparison27=comparison();
							state._fsp--;

							adaptor.addChild(root_0, comparison27.getTree());

							}
							break;
						case 3 :
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:71:85: block
							{
							pushFollow(FOLLOW_block_in_block322);
							block28=block();
							state._fsp--;

							adaptor.addChild(root_0, block28.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop7;
				}
			}

			RBRA29=(Token)match(input,RBRA,FOLLOW_RBRA_in_block327); 
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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:74:1: attribution : ( VARNAME | CELL_REF ) ATT ^ ( attribution | comparison ) ;
	public final MacroParser.attribution_return attribution() throws RecognitionException {
		MacroParser.attribution_return retval = new MacroParser.attribution_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set30=null;
		Token ATT31=null;
		ParserRuleReturnScope attribution32 =null;
		ParserRuleReturnScope comparison33 =null;

		Object set30_tree=null;
		Object ATT31_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:75:9: ( ( VARNAME | CELL_REF ) ATT ^ ( attribution | comparison ) )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:75:11: ( VARNAME | CELL_REF ) ATT ^ ( attribution | comparison )
			{
			root_0 = (Object)adaptor.nil();


			set30=input.LT(1);
			if ( input.LA(1)==CELL_REF||input.LA(1)==VARNAME ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set30));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			ATT31=(Token)match(input,ATT,FOLLOW_ATT_in_attribution363); 
			ATT31_tree = (Object)adaptor.create(ATT31);
			root_0 = (Object)adaptor.becomeRoot(ATT31_tree, root_0);

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:75:39: ( attribution | comparison )
			int alt8=2;
			switch ( input.LA(1) ) {
			case CELL_REF:
				{
				int LA8_1 = input.LA(2);
				if ( (LA8_1==ATT) ) {
					alt8=1;
				}
				else if ( (LA8_1==AMP||LA8_1==COLON||(LA8_1 >= DIV && LA8_1 <= EQ)||(LA8_1 >= GT && LA8_1 <= GTEQ)||(LA8_1 >= LT && LA8_1 <= LTEQ)||(LA8_1 >= MINUS && LA8_1 <= NEQ)||(LA8_1 >= PERCENT && LA8_1 <= POWER)||LA8_1==RBRA||LA8_1==SEMI||LA8_1==38) ) {
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
			case FUNCTION:
			case LPAR:
			case MINUS:
			case NUMBER:
			case STRING:
				{
				alt8=2;
				}
				break;
			case VARNAME:
				{
				int LA8_3 = input.LA(2);
				if ( (LA8_3==ATT) ) {
					alt8=1;
				}
				else if ( (LA8_3==AMP||(LA8_3 >= DIV && LA8_3 <= EQ)||(LA8_3 >= GT && LA8_3 <= GTEQ)||(LA8_3 >= LT && LA8_3 <= LTEQ)||(LA8_3 >= MINUS && LA8_3 <= NEQ)||(LA8_3 >= PERCENT && LA8_3 <= POWER)||LA8_3==RBRA||LA8_3==SEMI||LA8_3==38) ) {
					alt8=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:75:40: attribution
					{
					pushFollow(FOLLOW_attribution_in_attribution367);
					attribution32=attribution();
					state._fsp--;

					adaptor.addChild(root_0, attribution32.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:75:54: comparison
					{
					pushFollow(FOLLOW_comparison_in_attribution371);
					comparison33=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison33.getTree());

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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:78:1: comparison : concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )? ;
	public final MacroParser.comparison_return comparison() throws RecognitionException {
		MacroParser.comparison_return retval = new MacroParser.comparison_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ35=null;
		Token NEQ36=null;
		Token GT37=null;
		Token LT38=null;
		Token LTEQ39=null;
		Token GTEQ40=null;
		ParserRuleReturnScope concatenation34 =null;
		ParserRuleReturnScope concatenation41 =null;

		Object EQ35_tree=null;
		Object NEQ36_tree=null;
		Object GT37_tree=null;
		Object LT38_tree=null;
		Object LTEQ39_tree=null;
		Object GTEQ40_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:79:2: ( concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )? )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:79:4: concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_concatenation_in_comparison390);
			concatenation34=concatenation();
			state._fsp--;

			adaptor.addChild(root_0, concatenation34.getTree());

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:80:3: ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==EQ||(LA10_0 >= GT && LA10_0 <= GTEQ)||(LA10_0 >= LT && LA10_0 <= LTEQ)||LA10_0==NEQ) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:80:5: ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation
					{
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:80:5: ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^)
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
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:80:7: EQ ^
							{
							EQ35=(Token)match(input,EQ,FOLLOW_EQ_in_comparison398); 
							EQ35_tree = (Object)adaptor.create(EQ35);
							root_0 = (Object)adaptor.becomeRoot(EQ35_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:80:13: NEQ ^
							{
							NEQ36=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparison403); 
							NEQ36_tree = (Object)adaptor.create(NEQ36);
							root_0 = (Object)adaptor.becomeRoot(NEQ36_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:80:20: GT ^
							{
							GT37=(Token)match(input,GT,FOLLOW_GT_in_comparison408); 
							GT37_tree = (Object)adaptor.create(GT37);
							root_0 = (Object)adaptor.becomeRoot(GT37_tree, root_0);

							}
							break;
						case 4 :
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:80:26: LT ^
							{
							LT38=(Token)match(input,LT,FOLLOW_LT_in_comparison413); 
							LT38_tree = (Object)adaptor.create(LT38);
							root_0 = (Object)adaptor.becomeRoot(LT38_tree, root_0);

							}
							break;
						case 5 :
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:80:32: LTEQ ^
							{
							LTEQ39=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_comparison418); 
							LTEQ39_tree = (Object)adaptor.create(LTEQ39);
							root_0 = (Object)adaptor.becomeRoot(LTEQ39_tree, root_0);

							}
							break;
						case 6 :
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:80:40: GTEQ ^
							{
							GTEQ40=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_comparison423); 
							GTEQ40_tree = (Object)adaptor.create(GTEQ40);
							root_0 = (Object)adaptor.becomeRoot(GTEQ40_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_concatenation_in_comparison428);
					concatenation41=concatenation();
					state._fsp--;

					adaptor.addChild(root_0, concatenation41.getTree());

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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:83:1: concatenation : arithmetic_lowest ( AMP ^ arithmetic_lowest )* ;
	public final MacroParser.concatenation_return concatenation() throws RecognitionException {
		MacroParser.concatenation_return retval = new MacroParser.concatenation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AMP43=null;
		ParserRuleReturnScope arithmetic_lowest42 =null;
		ParserRuleReturnScope arithmetic_lowest44 =null;

		Object AMP43_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:84:2: ( arithmetic_lowest ( AMP ^ arithmetic_lowest )* )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:84:4: arithmetic_lowest ( AMP ^ arithmetic_lowest )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_lowest_in_concatenation442);
			arithmetic_lowest42=arithmetic_lowest();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_lowest42.getTree());

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:85:3: ( AMP ^ arithmetic_lowest )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==AMP) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:85:5: AMP ^ arithmetic_lowest
					{
					AMP43=(Token)match(input,AMP,FOLLOW_AMP_in_concatenation448); 
					AMP43_tree = (Object)adaptor.create(AMP43);
					root_0 = (Object)adaptor.becomeRoot(AMP43_tree, root_0);

					pushFollow(FOLLOW_arithmetic_lowest_in_concatenation451);
					arithmetic_lowest44=arithmetic_lowest();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_lowest44.getTree());

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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:88:1: arithmetic_lowest : arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )* ;
	public final MacroParser.arithmetic_lowest_return arithmetic_lowest() throws RecognitionException {
		MacroParser.arithmetic_lowest_return retval = new MacroParser.arithmetic_lowest_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS46=null;
		Token MINUS47=null;
		ParserRuleReturnScope arithmetic_low45 =null;
		ParserRuleReturnScope arithmetic_low48 =null;

		Object PLUS46_tree=null;
		Object MINUS47_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:89:2: ( arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )* )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:89:4: arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_low_in_arithmetic_lowest465);
			arithmetic_low45=arithmetic_low();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_low45.getTree());

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:90:3: ( ( PLUS ^| MINUS ^) arithmetic_low )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==MINUS||LA13_0==PLUS) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:90:5: ( PLUS ^| MINUS ^) arithmetic_low
					{
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:90:5: ( PLUS ^| MINUS ^)
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
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:90:7: PLUS ^
							{
							PLUS46=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_lowest473); 
							PLUS46_tree = (Object)adaptor.create(PLUS46);
							root_0 = (Object)adaptor.becomeRoot(PLUS46_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:90:15: MINUS ^
							{
							MINUS47=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_lowest478); 
							MINUS47_tree = (Object)adaptor.create(MINUS47);
							root_0 = (Object)adaptor.becomeRoot(MINUS47_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_low_in_arithmetic_lowest483);
					arithmetic_low48=arithmetic_low();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_low48.getTree());

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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:93:1: arithmetic_low : arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )* ;
	public final MacroParser.arithmetic_low_return arithmetic_low() throws RecognitionException {
		MacroParser.arithmetic_low_return retval = new MacroParser.arithmetic_low_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULTI50=null;
		Token DIV51=null;
		ParserRuleReturnScope arithmetic_medium49 =null;
		ParserRuleReturnScope arithmetic_medium52 =null;

		Object MULTI50_tree=null;
		Object DIV51_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:94:2: ( arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )* )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:94:4: arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_medium_in_arithmetic_low497);
			arithmetic_medium49=arithmetic_medium();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_medium49.getTree());

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:95:3: ( ( MULTI ^| DIV ^) arithmetic_medium )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==DIV||LA15_0==MULTI) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:95:5: ( MULTI ^| DIV ^) arithmetic_medium
					{
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:95:5: ( MULTI ^| DIV ^)
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
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:95:7: MULTI ^
							{
							MULTI50=(Token)match(input,MULTI,FOLLOW_MULTI_in_arithmetic_low505); 
							MULTI50_tree = (Object)adaptor.create(MULTI50);
							root_0 = (Object)adaptor.becomeRoot(MULTI50_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:95:16: DIV ^
							{
							DIV51=(Token)match(input,DIV,FOLLOW_DIV_in_arithmetic_low510); 
							DIV51_tree = (Object)adaptor.create(DIV51);
							root_0 = (Object)adaptor.becomeRoot(DIV51_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_medium_in_arithmetic_low515);
					arithmetic_medium52=arithmetic_medium();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_medium52.getTree());

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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:98:1: arithmetic_medium : arithmetic_high ( POWER ^ arithmetic_high )? ;
	public final MacroParser.arithmetic_medium_return arithmetic_medium() throws RecognitionException {
		MacroParser.arithmetic_medium_return retval = new MacroParser.arithmetic_medium_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token POWER54=null;
		ParserRuleReturnScope arithmetic_high53 =null;
		ParserRuleReturnScope arithmetic_high55 =null;

		Object POWER54_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:99:2: ( arithmetic_high ( POWER ^ arithmetic_high )? )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:99:4: arithmetic_high ( POWER ^ arithmetic_high )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_high_in_arithmetic_medium529);
			arithmetic_high53=arithmetic_high();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_high53.getTree());

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:100:3: ( POWER ^ arithmetic_high )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==POWER) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:100:5: POWER ^ arithmetic_high
					{
					POWER54=(Token)match(input,POWER,FOLLOW_POWER_in_arithmetic_medium535); 
					POWER54_tree = (Object)adaptor.create(POWER54);
					root_0 = (Object)adaptor.becomeRoot(POWER54_tree, root_0);

					pushFollow(FOLLOW_arithmetic_high_in_arithmetic_medium538);
					arithmetic_high55=arithmetic_high();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_high55.getTree());

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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:103:1: arithmetic_high : arithmetic_highest ( PERCENT ^)? ;
	public final MacroParser.arithmetic_high_return arithmetic_high() throws RecognitionException {
		MacroParser.arithmetic_high_return retval = new MacroParser.arithmetic_high_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERCENT57=null;
		ParserRuleReturnScope arithmetic_highest56 =null;

		Object PERCENT57_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:104:2: ( arithmetic_highest ( PERCENT ^)? )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:104:4: arithmetic_highest ( PERCENT ^)?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_highest_in_arithmetic_high552);
			arithmetic_highest56=arithmetic_highest();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_highest56.getTree());

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:104:23: ( PERCENT ^)?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==PERCENT) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:104:25: PERCENT ^
					{
					PERCENT57=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_arithmetic_high556); 
					PERCENT57_tree = (Object)adaptor.create(PERCENT57);
					root_0 = (Object)adaptor.becomeRoot(PERCENT57_tree, root_0);

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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:107:1: arithmetic_highest : ( MINUS ^)? atom ;
	public final MacroParser.arithmetic_highest_return arithmetic_highest() throws RecognitionException {
		MacroParser.arithmetic_highest_return retval = new MacroParser.arithmetic_highest_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS58=null;
		ParserRuleReturnScope atom59 =null;

		Object MINUS58_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:108:2: ( ( MINUS ^)? atom )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:108:4: ( MINUS ^)? atom
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:108:4: ( MINUS ^)?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==MINUS) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:108:6: MINUS ^
					{
					MINUS58=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_highest573); 
					MINUS58_tree = (Object)adaptor.create(MINUS58);
					root_0 = (Object)adaptor.becomeRoot(MINUS58_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_atom_in_arithmetic_highest579);
			atom59=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom59.getTree());

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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:111:1: atom : ( function_call | reference | literal | VARNAME | LPAR ! comparison RPAR !);
	public final MacroParser.atom_return atom() throws RecognitionException {
		MacroParser.atom_return retval = new MacroParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARNAME63=null;
		Token LPAR64=null;
		Token RPAR66=null;
		ParserRuleReturnScope function_call60 =null;
		ParserRuleReturnScope reference61 =null;
		ParserRuleReturnScope literal62 =null;
		ParserRuleReturnScope comparison65 =null;

		Object VARNAME63_tree=null;
		Object LPAR64_tree=null;
		Object RPAR66_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:112:2: ( function_call | reference | literal | VARNAME | LPAR ! comparison RPAR !)
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
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:112:4: function_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_call_in_atom590);
					function_call60=function_call();
					state._fsp--;

					adaptor.addChild(root_0, function_call60.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:113:4: reference
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_reference_in_atom595);
					reference61=reference();
					state._fsp--;

					adaptor.addChild(root_0, reference61.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:114:4: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_atom600);
					literal62=literal();
					state._fsp--;

					adaptor.addChild(root_0, literal62.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:115:17: VARNAME
					{
					root_0 = (Object)adaptor.nil();


					VARNAME63=(Token)match(input,VARNAME,FOLLOW_VARNAME_in_atom618); 
					VARNAME63_tree = (Object)adaptor.create(VARNAME63);
					adaptor.addChild(root_0, VARNAME63_tree);

					}
					break;
				case 5 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:116:4: LPAR ! comparison RPAR !
					{
					root_0 = (Object)adaptor.nil();


					LPAR64=(Token)match(input,LPAR,FOLLOW_LPAR_in_atom623); 
					pushFollow(FOLLOW_comparison_in_atom626);
					comparison65=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison65.getTree());

					RPAR66=(Token)match(input,RPAR,FOLLOW_RPAR_in_atom628); 
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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:119:1: function_call : FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !;
	public final MacroParser.function_call_return function_call() throws RecognitionException {
		MacroParser.function_call_return retval = new MacroParser.function_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FUNCTION67=null;
		Token LPAR68=null;
		Token SEMI70=null;
		Token RPAR72=null;
		ParserRuleReturnScope comparison69 =null;
		ParserRuleReturnScope comparison71 =null;

		Object FUNCTION67_tree=null;
		Object LPAR68_tree=null;
		Object SEMI70_tree=null;
		Object RPAR72_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:120:2: ( FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !)
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:120:4: FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !
			{
			root_0 = (Object)adaptor.nil();


			FUNCTION67=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_call640); 
			FUNCTION67_tree = (Object)adaptor.create(FUNCTION67);
			root_0 = (Object)adaptor.becomeRoot(FUNCTION67_tree, root_0);

			LPAR68=(Token)match(input,LPAR,FOLLOW_LPAR_in_function_call643); 
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:121:3: ( comparison ( SEMI ! comparison )* )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==CELL_REF||LA21_0==FUNCTION||LA21_0==LPAR||LA21_0==MINUS||LA21_0==NUMBER||(LA21_0 >= STRING && LA21_0 <= VARNAME)) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:121:5: comparison ( SEMI ! comparison )*
					{
					pushFollow(FOLLOW_comparison_in_function_call651);
					comparison69=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison69.getTree());

					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:121:16: ( SEMI ! comparison )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==SEMI) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:121:18: SEMI ! comparison
							{
							SEMI70=(Token)match(input,SEMI,FOLLOW_SEMI_in_function_call655); 
							pushFollow(FOLLOW_comparison_in_function_call658);
							comparison71=comparison();
							state._fsp--;

							adaptor.addChild(root_0, comparison71.getTree());

							}
							break;

						default :
							break loop20;
						}
					}

					}
					break;

			}

			RPAR72=(Token)match(input,RPAR,FOLLOW_RPAR_in_function_call668); 
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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:125:1: reference : CELL_REF ( ( COLON ^) CELL_REF )? ;
	public final MacroParser.reference_return reference() throws RecognitionException {
		MacroParser.reference_return retval = new MacroParser.reference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CELL_REF73=null;
		Token COLON74=null;
		Token CELL_REF75=null;

		Object CELL_REF73_tree=null;
		Object COLON74_tree=null;
		Object CELL_REF75_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:126:2: ( CELL_REF ( ( COLON ^) CELL_REF )? )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:126:4: CELL_REF ( ( COLON ^) CELL_REF )?
			{
			root_0 = (Object)adaptor.nil();


			CELL_REF73=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_reference680); 
			CELL_REF73_tree = (Object)adaptor.create(CELL_REF73);
			adaptor.addChild(root_0, CELL_REF73_tree);

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:127:3: ( ( COLON ^) CELL_REF )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==COLON) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:127:5: ( COLON ^) CELL_REF
					{
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:127:5: ( COLON ^)
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:127:7: COLON ^
					{
					COLON74=(Token)match(input,COLON,FOLLOW_COLON_in_reference688); 
					COLON74_tree = (Object)adaptor.create(COLON74);
					root_0 = (Object)adaptor.becomeRoot(COLON74_tree, root_0);

					}

					CELL_REF75=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_reference693); 
					CELL_REF75_tree = (Object)adaptor.create(CELL_REF75);
					adaptor.addChild(root_0, CELL_REF75_tree);

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
	// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:130:1: literal : ( NUMBER | STRING );
	public final MacroParser.literal_return literal() throws RecognitionException {
		MacroParser.literal_return retval = new MacroParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set76=null;

		Object set76_tree=null;

		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:131:2: ( NUMBER | STRING )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:
			{
			root_0 = (Object)adaptor.nil();


			set76=input.LT(1);
			if ( input.LA(1)==NUMBER||input.LA(1)==STRING ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set76));
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



	public static final BitSet FOLLOW_macro_in_expression80 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expression82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MACRO_in_macro108 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_STRING_in_macro111 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LBRA_in_macro114 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_macro117 = new BitSet(new long[]{0x0000000C848A4080L});
	public static final BitSet FOLLOW_line_in_macro119 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RBRA_in_macro122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sq_in_line147 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_line149 = new BitSet(new long[]{0x0000000C048A4080L});
	public static final BitSet FOLLOW_line_in_line151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribution_in_sq186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_sq190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequencia_in_sq194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_sequencia220 = new BitSet(new long[]{0x0000000039800800L});
	public static final BitSet FOLLOW_arithmetic_in_sequencia223 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_block_in_sequencia228 = new BitSet(new long[]{0x0000000039800802L});
	public static final BitSet FOLLOW_arithmetic_in_sequencia231 = new BitSet(new long[]{0x0000000C04084080L});
	public static final BitSet FOLLOW_atom_in_sequencia234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRA_in_block294 = new BitSet(new long[]{0x0000000C048A4080L});
	public static final BitSet FOLLOW_attribution_in_block298 = new BitSet(new long[]{0x0000000280000000L});
	public static final BitSet FOLLOW_comparison_in_block302 = new BitSet(new long[]{0x0000000280000000L});
	public static final BitSet FOLLOW_block_in_block306 = new BitSet(new long[]{0x0000000280000000L});
	public static final BitSet FOLLOW_SEMI_in_block310 = new BitSet(new long[]{0x0000000C048A4080L});
	public static final BitSet FOLLOW_attribution_in_block314 = new BitSet(new long[]{0x0000000280000000L});
	public static final BitSet FOLLOW_comparison_in_block318 = new BitSet(new long[]{0x0000000280000000L});
	public static final BitSet FOLLOW_block_in_block322 = new BitSet(new long[]{0x0000000280000000L});
	public static final BitSet FOLLOW_RBRA_in_block327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_attribution353 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ATT_in_attribution363 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_attribution_in_attribution367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_attribution371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concatenation_in_comparison390 = new BitSet(new long[]{0x0000000002319002L});
	public static final BitSet FOLLOW_EQ_in_comparison398 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_NEQ_in_comparison403 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_GT_in_comparison408 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_LT_in_comparison413 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_LTEQ_in_comparison418 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_GTEQ_in_comparison423 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_concatenation_in_comparison428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_lowest_in_concatenation442 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AMP_in_concatenation448 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_arithmetic_lowest_in_concatenation451 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_arithmetic_low_in_arithmetic_lowest465 = new BitSet(new long[]{0x0000000010800002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_lowest473 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_lowest478 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_arithmetic_low_in_arithmetic_lowest483 = new BitSet(new long[]{0x0000000010800002L});
	public static final BitSet FOLLOW_arithmetic_medium_in_arithmetic_low497 = new BitSet(new long[]{0x0000000001000802L});
	public static final BitSet FOLLOW_MULTI_in_arithmetic_low505 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_DIV_in_arithmetic_low510 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_arithmetic_medium_in_arithmetic_low515 = new BitSet(new long[]{0x0000000001000802L});
	public static final BitSet FOLLOW_arithmetic_high_in_arithmetic_medium529 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_POWER_in_arithmetic_medium535 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_arithmetic_high_in_arithmetic_medium538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_highest_in_arithmetic_high552 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_PERCENT_in_arithmetic_high556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_highest573 = new BitSet(new long[]{0x0000000C04084080L});
	public static final BitSet FOLLOW_atom_in_arithmetic_highest579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_call_in_atom590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_in_atom595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_atom600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARNAME_in_atom618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_atom623 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_comparison_in_atom626 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_RPAR_in_atom628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_function_call640 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LPAR_in_function_call643 = new BitSet(new long[]{0x0000000D04884080L});
	public static final BitSet FOLLOW_comparison_in_function_call651 = new BitSet(new long[]{0x0000000300000000L});
	public static final BitSet FOLLOW_SEMI_in_function_call655 = new BitSet(new long[]{0x0000000C04884080L});
	public static final BitSet FOLLOW_comparison_in_function_call658 = new BitSet(new long[]{0x0000000300000000L});
	public static final BitSet FOLLOW_RPAR_in_function_call668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CELL_REF_in_reference680 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COLON_in_reference688 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CELL_REF_in_reference693 = new BitSet(new long[]{0x0000000000000002L});
}

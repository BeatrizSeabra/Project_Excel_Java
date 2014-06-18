// $ANTLR 3.5.1 C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g 2014-06-18 16:24:05

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
		"LBRA", "LETTER", "LPAR", "LT", "LTEQ", "MINUS", "MULTI", "NEQ", "NUMBER", 
		"PERCENT", "PLUS", "POWER", "QUOT", "RBRA", "RPAR", "SEMI", "STRING", 
		"TEMPVAR", "VARNAME", "VARSIMBLE", "WS", "'\\n'", "'macro'"
	};
	public static final int EOF=-1;
	public static final int T__38=38;
	public static final int T__39=39;
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
	public static final int TEMPVAR=34;
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
	@Override public String getGrammarFileName() { return "C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g"; }


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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:45:1: expression : macro EOF !;
	public final MacroParser.expression_return expression() throws RecognitionException {
		MacroParser.expression_return retval = new MacroParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope macro1 =null;

		Object EOF2_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:46:2: ( macro EOF !)
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:46:4: macro EOF !
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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:49:1: macro : 'macro' STRING LBRA ( line )+ RBRA ;
	public final MacroParser.macro_return macro() throws RecognitionException {
		MacroParser.macro_return retval = new MacroParser.macro_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal3=null;
		Token STRING4=null;
		Token LBRA5=null;
		Token RBRA7=null;
		ParserRuleReturnScope line6 =null;

		Object string_literal3_tree=null;
		Object STRING4_tree=null;
		Object LBRA5_tree=null;
		Object RBRA7_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:50:9: ( 'macro' STRING LBRA ( line )+ RBRA )
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:50:11: 'macro' STRING LBRA ( line )+ RBRA
			{
			root_0 = (Object)adaptor.nil();


			string_literal3=(Token)match(input,39,FOLLOW_39_in_macro108); 
			string_literal3_tree = (Object)adaptor.create(string_literal3);
			adaptor.addChild(root_0, string_literal3_tree);

			STRING4=(Token)match(input,STRING,FOLLOW_STRING_in_macro111); 
			STRING4_tree = (Object)adaptor.create(STRING4);
			adaptor.addChild(root_0, STRING4_tree);

			LBRA5=(Token)match(input,LBRA,FOLLOW_LBRA_in_macro114); 
			LBRA5_tree = (Object)adaptor.create(LBRA5);
			adaptor.addChild(root_0, LBRA5_tree);

			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:50:34: ( line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==EQ) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:50:35: line
					{
					pushFollow(FOLLOW_line_in_macro118);
					line6=line();
					state._fsp--;

					adaptor.addChild(root_0, line6.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			RBRA7=(Token)match(input,RBRA,FOLLOW_RBRA_in_macro123); 
			RBRA7_tree = (Object)adaptor.create(RBRA7);
			adaptor.addChild(root_0, RBRA7_tree);

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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:53:1: line : EQ ! sq '\\n' ;
	public final MacroParser.line_return line() throws RecognitionException {
		MacroParser.line_return retval = new MacroParser.line_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ8=null;
		Token char_literal10=null;
		ParserRuleReturnScope sq9 =null;

		Object EQ8_tree=null;
		Object char_literal10_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:54:9: ( EQ ! sq '\\n' )
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:54:10: EQ ! sq '\\n'
			{
			root_0 = (Object)adaptor.nil();


			EQ8=(Token)match(input,EQ,FOLLOW_EQ_in_line148); 
			pushFollow(FOLLOW_sq_in_line151);
			sq9=sq();
			state._fsp--;

			adaptor.addChild(root_0, sq9.getTree());

			char_literal10=(Token)match(input,38,FOLLOW_38_in_line153); 
			char_literal10_tree = (Object)adaptor.create(char_literal10);
			adaptor.addChild(root_0, char_literal10_tree);

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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:57:1: sq : ( attribution | comparison | sequencia );
	public final MacroParser.sq_return sq() throws RecognitionException {
		MacroParser.sq_return retval = new MacroParser.sq_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope attribution11 =null;
		ParserRuleReturnScope comparison12 =null;
		ParserRuleReturnScope sequencia13 =null;


		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:58:9: ( attribution | comparison | sequencia )
			int alt2=3;
			switch ( input.LA(1) ) {
			case CELL_REF:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==ATT) ) {
					alt2=1;
				}
				else if ( (LA2_1==AMP||LA2_1==COLON||(LA2_1 >= DIV && LA2_1 <= EQ)||(LA2_1 >= GT && LA2_1 <= GTEQ)||(LA2_1 >= LT && LA2_1 <= NEQ)||(LA2_1 >= PERCENT && LA2_1 <= POWER)||LA2_1==38) ) {
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
			case TEMPVAR:
				{
				alt2=2;
				}
				break;
			case VARNAME:
				{
				alt2=1;
				}
				break;
			case NUMBER:
				{
				switch ( input.LA(2) ) {
				case PERCENT:
					{
					int LA2_6 = input.LA(3);
					if ( (LA2_6==AMP||(LA2_6 >= DIV && LA2_6 <= EQ)||(LA2_6 >= GT && LA2_6 <= GTEQ)||(LA2_6 >= LT && LA2_6 <= NEQ)||(LA2_6 >= PLUS && LA2_6 <= POWER)||LA2_6==38) ) {
						alt2=2;
					}
					else if ( (LA2_6==LBRA) ) {
						alt2=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case POWER:
					{
					int LA2_7 = input.LA(3);
					if ( (LA2_7==CELL_REF||LA2_7==FUNCTION||LA2_7==LPAR||LA2_7==MINUS||LA2_7==NUMBER||(LA2_7 >= STRING && LA2_7 <= TEMPVAR)) ) {
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
				case MULTI:
					{
					int LA2_8 = input.LA(3);
					if ( (LA2_8==CELL_REF||LA2_8==FUNCTION||LA2_8==LPAR||LA2_8==MINUS||LA2_8==NUMBER||(LA2_8 >= STRING && LA2_8 <= TEMPVAR)) ) {
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
				case DIV:
					{
					int LA2_9 = input.LA(3);
					if ( (LA2_9==CELL_REF||LA2_9==FUNCTION||LA2_9==LPAR||LA2_9==MINUS||LA2_9==NUMBER||(LA2_9 >= STRING && LA2_9 <= TEMPVAR)) ) {
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
				case PLUS:
					{
					int LA2_10 = input.LA(3);
					if ( (LA2_10==CELL_REF||LA2_10==FUNCTION||LA2_10==LPAR||LA2_10==MINUS||LA2_10==NUMBER||(LA2_10 >= STRING && LA2_10 <= TEMPVAR)) ) {
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
				case MINUS:
					{
					int LA2_11 = input.LA(3);
					if ( (LA2_11==CELL_REF||LA2_11==FUNCTION||LA2_11==LPAR||LA2_11==MINUS||LA2_11==NUMBER||(LA2_11 >= STRING && LA2_11 <= TEMPVAR)) ) {
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
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:58:11: attribution
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_attribution_in_sq178);
					attribution11=attribution();
					state._fsp--;

					adaptor.addChild(root_0, attribution11.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:58:25: comparison
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_comparison_in_sq182);
					comparison12=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison12.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:58:38: sequencia
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sequencia_in_sq186);
					sequencia13=sequencia();
					state._fsp--;

					adaptor.addChild(root_0, sequencia13.getTree());

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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:61:1: sequencia : ( ( NUMBER ) arithmetic ^)? block ( arithmetic ^ atom )? ;
	public final MacroParser.sequencia_return sequencia() throws RecognitionException {
		MacroParser.sequencia_return retval = new MacroParser.sequencia_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER14=null;
		ParserRuleReturnScope arithmetic15 =null;
		ParserRuleReturnScope block16 =null;
		ParserRuleReturnScope arithmetic17 =null;
		ParserRuleReturnScope atom18 =null;

		Object NUMBER14_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:61:10: ( ( ( NUMBER ) arithmetic ^)? block ( arithmetic ^ atom )? )
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:62:9: ( ( NUMBER ) arithmetic ^)? block ( arithmetic ^ atom )?
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:62:9: ( ( NUMBER ) arithmetic ^)?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==NUMBER) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:62:10: ( NUMBER ) arithmetic ^
					{
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:62:10: ( NUMBER )
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:62:11: NUMBER
					{
					NUMBER14=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_sequencia212); 
					NUMBER14_tree = (Object)adaptor.create(NUMBER14);
					adaptor.addChild(root_0, NUMBER14_tree);

					}

					pushFollow(FOLLOW_arithmetic_in_sequencia215);
					arithmetic15=arithmetic();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(arithmetic15.getTree(), root_0);
					}
					break;

			}

			pushFollow(FOLLOW_block_in_sequencia220);
			block16=block();
			state._fsp--;

			adaptor.addChild(root_0, block16.getTree());

			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:62:39: ( arithmetic ^ atom )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DIV||(LA4_0 >= MINUS && LA4_0 <= MULTI)||(LA4_0 >= PERCENT && LA4_0 <= POWER)) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:62:40: arithmetic ^ atom
					{
					pushFollow(FOLLOW_arithmetic_in_sequencia223);
					arithmetic17=arithmetic();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(arithmetic17.getTree(), root_0);
					pushFollow(FOLLOW_atom_in_sequencia226);
					atom18=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom18.getTree());

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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:65:1: arithmetic : ( PLUS | MINUS | MULTI | DIV | POWER | PERCENT );
	public final MacroParser.arithmetic_return arithmetic() throws RecognitionException {
		MacroParser.arithmetic_return retval = new MacroParser.arithmetic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set19=null;

		Object set19_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:65:11: ( PLUS | MINUS | MULTI | DIV | POWER | PERCENT )
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:
			{
			root_0 = (Object)adaptor.nil();


			set19=input.LT(1);
			if ( input.LA(1)==DIV||(input.LA(1) >= MINUS && input.LA(1) <= MULTI)||(input.LA(1) >= PERCENT && input.LA(1) <= POWER) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set19));
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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:69:1: block : LBRA ! ( attribution | comparison | block ) ( SEMI ^ ( attribution | comparison | block ) )* RBRA !;
	public final MacroParser.block_return block() throws RecognitionException {
		MacroParser.block_return retval = new MacroParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRA20=null;
		Token SEMI24=null;
		Token RBRA28=null;
		ParserRuleReturnScope attribution21 =null;
		ParserRuleReturnScope comparison22 =null;
		ParserRuleReturnScope block23 =null;
		ParserRuleReturnScope attribution25 =null;
		ParserRuleReturnScope comparison26 =null;
		ParserRuleReturnScope block27 =null;

		Object LBRA20_tree=null;
		Object SEMI24_tree=null;
		Object RBRA28_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:69:6: ( LBRA ! ( attribution | comparison | block ) ( SEMI ^ ( attribution | comparison | block ) )* RBRA !)
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:70:9: LBRA ! ( attribution | comparison | block ) ( SEMI ^ ( attribution | comparison | block ) )* RBRA !
			{
			root_0 = (Object)adaptor.nil();


			LBRA20=(Token)match(input,LBRA,FOLLOW_LBRA_in_block286); 
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:70:15: ( attribution | comparison | block )
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
			case FUNCTION:
			case LPAR:
			case MINUS:
			case NUMBER:
			case STRING:
			case TEMPVAR:
				{
				alt5=2;
				}
				break;
			case VARNAME:
				{
				alt5=1;
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
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:70:16: attribution
					{
					pushFollow(FOLLOW_attribution_in_block290);
					attribution21=attribution();
					state._fsp--;

					adaptor.addChild(root_0, attribution21.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:70:30: comparison
					{
					pushFollow(FOLLOW_comparison_in_block294);
					comparison22=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison22.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:70:43: block
					{
					pushFollow(FOLLOW_block_in_block298);
					block23=block();
					state._fsp--;

					adaptor.addChild(root_0, block23.getTree());

					}
					break;

			}

			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:70:50: ( SEMI ^ ( attribution | comparison | block ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==SEMI) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:70:51: SEMI ^ ( attribution | comparison | block )
					{
					SEMI24=(Token)match(input,SEMI,FOLLOW_SEMI_in_block302); 
					SEMI24_tree = (Object)adaptor.create(SEMI24);
					root_0 = (Object)adaptor.becomeRoot(SEMI24_tree, root_0);

					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:70:57: ( attribution | comparison | block )
					int alt6=3;
					switch ( input.LA(1) ) {
					case CELL_REF:
						{
						int LA6_1 = input.LA(2);
						if ( (LA6_1==ATT) ) {
							alt6=1;
						}
						else if ( (LA6_1==AMP||LA6_1==COLON||(LA6_1 >= DIV && LA6_1 <= EQ)||(LA6_1 >= GT && LA6_1 <= GTEQ)||(LA6_1 >= LT && LA6_1 <= NEQ)||(LA6_1 >= PERCENT && LA6_1 <= POWER)||LA6_1==RBRA||LA6_1==SEMI) ) {
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
					case TEMPVAR:
						{
						alt6=2;
						}
						break;
					case VARNAME:
						{
						alt6=1;
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
							// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:70:58: attribution
							{
							pushFollow(FOLLOW_attribution_in_block306);
							attribution25=attribution();
							state._fsp--;

							adaptor.addChild(root_0, attribution25.getTree());

							}
							break;
						case 2 :
							// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:70:72: comparison
							{
							pushFollow(FOLLOW_comparison_in_block310);
							comparison26=comparison();
							state._fsp--;

							adaptor.addChild(root_0, comparison26.getTree());

							}
							break;
						case 3 :
							// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:70:85: block
							{
							pushFollow(FOLLOW_block_in_block314);
							block27=block();
							state._fsp--;

							adaptor.addChild(root_0, block27.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop7;
				}
			}

			RBRA28=(Token)match(input,RBRA,FOLLOW_RBRA_in_block319); 
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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:73:1: attribution : ( VARNAME | CELL_REF ) ATT ^ ( attribution | comparison ) ;
	public final MacroParser.attribution_return attribution() throws RecognitionException {
		MacroParser.attribution_return retval = new MacroParser.attribution_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set29=null;
		Token ATT30=null;
		ParserRuleReturnScope attribution31 =null;
		ParserRuleReturnScope comparison32 =null;

		Object set29_tree=null;
		Object ATT30_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:74:9: ( ( VARNAME | CELL_REF ) ATT ^ ( attribution | comparison ) )
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:74:11: ( VARNAME | CELL_REF ) ATT ^ ( attribution | comparison )
			{
			root_0 = (Object)adaptor.nil();


			set29=input.LT(1);
			if ( input.LA(1)==CELL_REF||input.LA(1)==VARNAME ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set29));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			ATT30=(Token)match(input,ATT,FOLLOW_ATT_in_attribution355); 
			ATT30_tree = (Object)adaptor.create(ATT30);
			root_0 = (Object)adaptor.becomeRoot(ATT30_tree, root_0);

			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:74:39: ( attribution | comparison )
			int alt8=2;
			switch ( input.LA(1) ) {
			case CELL_REF:
				{
				int LA8_1 = input.LA(2);
				if ( (LA8_1==ATT) ) {
					alt8=1;
				}
				else if ( (LA8_1==AMP||LA8_1==COLON||(LA8_1 >= DIV && LA8_1 <= EQ)||(LA8_1 >= GT && LA8_1 <= GTEQ)||(LA8_1 >= LT && LA8_1 <= NEQ)||(LA8_1 >= PERCENT && LA8_1 <= POWER)||LA8_1==RBRA||LA8_1==SEMI||LA8_1==38) ) {
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
			case TEMPVAR:
				{
				alt8=2;
				}
				break;
			case VARNAME:
				{
				alt8=1;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:74:40: attribution
					{
					pushFollow(FOLLOW_attribution_in_attribution359);
					attribution31=attribution();
					state._fsp--;

					adaptor.addChild(root_0, attribution31.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:74:54: comparison
					{
					pushFollow(FOLLOW_comparison_in_attribution363);
					comparison32=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison32.getTree());

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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:77:1: comparison : concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )? ;
	public final MacroParser.comparison_return comparison() throws RecognitionException {
		MacroParser.comparison_return retval = new MacroParser.comparison_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ34=null;
		Token NEQ35=null;
		Token GT36=null;
		Token LT37=null;
		Token LTEQ38=null;
		Token GTEQ39=null;
		ParserRuleReturnScope concatenation33 =null;
		ParserRuleReturnScope concatenation40 =null;

		Object EQ34_tree=null;
		Object NEQ35_tree=null;
		Object GT36_tree=null;
		Object LT37_tree=null;
		Object LTEQ38_tree=null;
		Object GTEQ39_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:78:2: ( concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )? )
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:78:4: concatenation ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_concatenation_in_comparison382);
			concatenation33=concatenation();
			state._fsp--;

			adaptor.addChild(root_0, concatenation33.getTree());

			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:79:3: ( ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==EQ||(LA10_0 >= GT && LA10_0 <= GTEQ)||(LA10_0 >= LT && LA10_0 <= LTEQ)||LA10_0==NEQ) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:79:5: ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^) concatenation
					{
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:79:5: ( EQ ^| NEQ ^| GT ^| LT ^| LTEQ ^| GTEQ ^)
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
							// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:79:7: EQ ^
							{
							EQ34=(Token)match(input,EQ,FOLLOW_EQ_in_comparison390); 
							EQ34_tree = (Object)adaptor.create(EQ34);
							root_0 = (Object)adaptor.becomeRoot(EQ34_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:79:13: NEQ ^
							{
							NEQ35=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparison395); 
							NEQ35_tree = (Object)adaptor.create(NEQ35);
							root_0 = (Object)adaptor.becomeRoot(NEQ35_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:79:20: GT ^
							{
							GT36=(Token)match(input,GT,FOLLOW_GT_in_comparison400); 
							GT36_tree = (Object)adaptor.create(GT36);
							root_0 = (Object)adaptor.becomeRoot(GT36_tree, root_0);

							}
							break;
						case 4 :
							// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:79:26: LT ^
							{
							LT37=(Token)match(input,LT,FOLLOW_LT_in_comparison405); 
							LT37_tree = (Object)adaptor.create(LT37);
							root_0 = (Object)adaptor.becomeRoot(LT37_tree, root_0);

							}
							break;
						case 5 :
							// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:79:32: LTEQ ^
							{
							LTEQ38=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_comparison410); 
							LTEQ38_tree = (Object)adaptor.create(LTEQ38);
							root_0 = (Object)adaptor.becomeRoot(LTEQ38_tree, root_0);

							}
							break;
						case 6 :
							// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:79:40: GTEQ ^
							{
							GTEQ39=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_comparison415); 
							GTEQ39_tree = (Object)adaptor.create(GTEQ39);
							root_0 = (Object)adaptor.becomeRoot(GTEQ39_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_concatenation_in_comparison420);
					concatenation40=concatenation();
					state._fsp--;

					adaptor.addChild(root_0, concatenation40.getTree());

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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:82:1: concatenation : arithmetic_lowest ( AMP ^ arithmetic_lowest )* ;
	public final MacroParser.concatenation_return concatenation() throws RecognitionException {
		MacroParser.concatenation_return retval = new MacroParser.concatenation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AMP42=null;
		ParserRuleReturnScope arithmetic_lowest41 =null;
		ParserRuleReturnScope arithmetic_lowest43 =null;

		Object AMP42_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:83:2: ( arithmetic_lowest ( AMP ^ arithmetic_lowest )* )
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:83:4: arithmetic_lowest ( AMP ^ arithmetic_lowest )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_lowest_in_concatenation434);
			arithmetic_lowest41=arithmetic_lowest();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_lowest41.getTree());

			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:84:3: ( AMP ^ arithmetic_lowest )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==AMP) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:84:5: AMP ^ arithmetic_lowest
					{
					AMP42=(Token)match(input,AMP,FOLLOW_AMP_in_concatenation440); 
					AMP42_tree = (Object)adaptor.create(AMP42);
					root_0 = (Object)adaptor.becomeRoot(AMP42_tree, root_0);

					pushFollow(FOLLOW_arithmetic_lowest_in_concatenation443);
					arithmetic_lowest43=arithmetic_lowest();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_lowest43.getTree());

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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:87:1: arithmetic_lowest : arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )* ;
	public final MacroParser.arithmetic_lowest_return arithmetic_lowest() throws RecognitionException {
		MacroParser.arithmetic_lowest_return retval = new MacroParser.arithmetic_lowest_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS45=null;
		Token MINUS46=null;
		ParserRuleReturnScope arithmetic_low44 =null;
		ParserRuleReturnScope arithmetic_low47 =null;

		Object PLUS45_tree=null;
		Object MINUS46_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:88:2: ( arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )* )
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:88:4: arithmetic_low ( ( PLUS ^| MINUS ^) arithmetic_low )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_low_in_arithmetic_lowest457);
			arithmetic_low44=arithmetic_low();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_low44.getTree());

			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:89:3: ( ( PLUS ^| MINUS ^) arithmetic_low )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==MINUS||LA13_0==PLUS) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:89:5: ( PLUS ^| MINUS ^) arithmetic_low
					{
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:89:5: ( PLUS ^| MINUS ^)
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
							// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:89:7: PLUS ^
							{
							PLUS45=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithmetic_lowest465); 
							PLUS45_tree = (Object)adaptor.create(PLUS45);
							root_0 = (Object)adaptor.becomeRoot(PLUS45_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:89:15: MINUS ^
							{
							MINUS46=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_lowest470); 
							MINUS46_tree = (Object)adaptor.create(MINUS46);
							root_0 = (Object)adaptor.becomeRoot(MINUS46_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_low_in_arithmetic_lowest475);
					arithmetic_low47=arithmetic_low();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_low47.getTree());

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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:92:1: arithmetic_low : arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )* ;
	public final MacroParser.arithmetic_low_return arithmetic_low() throws RecognitionException {
		MacroParser.arithmetic_low_return retval = new MacroParser.arithmetic_low_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULTI49=null;
		Token DIV50=null;
		ParserRuleReturnScope arithmetic_medium48 =null;
		ParserRuleReturnScope arithmetic_medium51 =null;

		Object MULTI49_tree=null;
		Object DIV50_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:93:2: ( arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )* )
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:93:4: arithmetic_medium ( ( MULTI ^| DIV ^) arithmetic_medium )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_medium_in_arithmetic_low489);
			arithmetic_medium48=arithmetic_medium();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_medium48.getTree());

			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:94:3: ( ( MULTI ^| DIV ^) arithmetic_medium )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==DIV||LA15_0==MULTI) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:94:5: ( MULTI ^| DIV ^) arithmetic_medium
					{
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:94:5: ( MULTI ^| DIV ^)
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
							// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:94:7: MULTI ^
							{
							MULTI49=(Token)match(input,MULTI,FOLLOW_MULTI_in_arithmetic_low497); 
							MULTI49_tree = (Object)adaptor.create(MULTI49);
							root_0 = (Object)adaptor.becomeRoot(MULTI49_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:94:16: DIV ^
							{
							DIV50=(Token)match(input,DIV,FOLLOW_DIV_in_arithmetic_low502); 
							DIV50_tree = (Object)adaptor.create(DIV50);
							root_0 = (Object)adaptor.becomeRoot(DIV50_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmetic_medium_in_arithmetic_low507);
					arithmetic_medium51=arithmetic_medium();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_medium51.getTree());

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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:97:1: arithmetic_medium : arithmetic_high ( POWER ^ arithmetic_high )? ;
	public final MacroParser.arithmetic_medium_return arithmetic_medium() throws RecognitionException {
		MacroParser.arithmetic_medium_return retval = new MacroParser.arithmetic_medium_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token POWER53=null;
		ParserRuleReturnScope arithmetic_high52 =null;
		ParserRuleReturnScope arithmetic_high54 =null;

		Object POWER53_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:98:2: ( arithmetic_high ( POWER ^ arithmetic_high )? )
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:98:4: arithmetic_high ( POWER ^ arithmetic_high )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_high_in_arithmetic_medium521);
			arithmetic_high52=arithmetic_high();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_high52.getTree());

			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:99:3: ( POWER ^ arithmetic_high )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==POWER) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:99:5: POWER ^ arithmetic_high
					{
					POWER53=(Token)match(input,POWER,FOLLOW_POWER_in_arithmetic_medium527); 
					POWER53_tree = (Object)adaptor.create(POWER53);
					root_0 = (Object)adaptor.becomeRoot(POWER53_tree, root_0);

					pushFollow(FOLLOW_arithmetic_high_in_arithmetic_medium530);
					arithmetic_high54=arithmetic_high();
					state._fsp--;

					adaptor.addChild(root_0, arithmetic_high54.getTree());

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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:102:1: arithmetic_high : arithmetic_highest ( PERCENT ^)? ;
	public final MacroParser.arithmetic_high_return arithmetic_high() throws RecognitionException {
		MacroParser.arithmetic_high_return retval = new MacroParser.arithmetic_high_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERCENT56=null;
		ParserRuleReturnScope arithmetic_highest55 =null;

		Object PERCENT56_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:103:2: ( arithmetic_highest ( PERCENT ^)? )
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:103:4: arithmetic_highest ( PERCENT ^)?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmetic_highest_in_arithmetic_high544);
			arithmetic_highest55=arithmetic_highest();
			state._fsp--;

			adaptor.addChild(root_0, arithmetic_highest55.getTree());

			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:103:23: ( PERCENT ^)?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==PERCENT) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:103:25: PERCENT ^
					{
					PERCENT56=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_arithmetic_high548); 
					PERCENT56_tree = (Object)adaptor.create(PERCENT56);
					root_0 = (Object)adaptor.becomeRoot(PERCENT56_tree, root_0);

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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:106:1: arithmetic_highest : ( MINUS ^)? atom ;
	public final MacroParser.arithmetic_highest_return arithmetic_highest() throws RecognitionException {
		MacroParser.arithmetic_highest_return retval = new MacroParser.arithmetic_highest_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS57=null;
		ParserRuleReturnScope atom58 =null;

		Object MINUS57_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:107:2: ( ( MINUS ^)? atom )
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:107:4: ( MINUS ^)? atom
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:107:4: ( MINUS ^)?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==MINUS) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:107:6: MINUS ^
					{
					MINUS57=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithmetic_highest565); 
					MINUS57_tree = (Object)adaptor.create(MINUS57);
					root_0 = (Object)adaptor.becomeRoot(MINUS57_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_atom_in_arithmetic_highest571);
			atom58=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom58.getTree());

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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:110:1: atom : ( function_call | reference | literal | TEMPVAR | LPAR ! comparison RPAR !);
	public final MacroParser.atom_return atom() throws RecognitionException {
		MacroParser.atom_return retval = new MacroParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TEMPVAR62=null;
		Token LPAR63=null;
		Token RPAR65=null;
		ParserRuleReturnScope function_call59 =null;
		ParserRuleReturnScope reference60 =null;
		ParserRuleReturnScope literal61 =null;
		ParserRuleReturnScope comparison64 =null;

		Object TEMPVAR62_tree=null;
		Object LPAR63_tree=null;
		Object RPAR65_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:111:2: ( function_call | reference | literal | TEMPVAR | LPAR ! comparison RPAR !)
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
			case TEMPVAR:
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
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:111:4: function_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_call_in_atom582);
					function_call59=function_call();
					state._fsp--;

					adaptor.addChild(root_0, function_call59.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:112:4: reference
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_reference_in_atom587);
					reference60=reference();
					state._fsp--;

					adaptor.addChild(root_0, reference60.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:113:4: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_atom592);
					literal61=literal();
					state._fsp--;

					adaptor.addChild(root_0, literal61.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:114:17: TEMPVAR
					{
					root_0 = (Object)adaptor.nil();


					TEMPVAR62=(Token)match(input,TEMPVAR,FOLLOW_TEMPVAR_in_atom610); 
					TEMPVAR62_tree = (Object)adaptor.create(TEMPVAR62);
					adaptor.addChild(root_0, TEMPVAR62_tree);

					}
					break;
				case 5 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:115:4: LPAR ! comparison RPAR !
					{
					root_0 = (Object)adaptor.nil();


					LPAR63=(Token)match(input,LPAR,FOLLOW_LPAR_in_atom615); 
					pushFollow(FOLLOW_comparison_in_atom618);
					comparison64=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison64.getTree());

					RPAR65=(Token)match(input,RPAR,FOLLOW_RPAR_in_atom620); 
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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:118:1: function_call : FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !;
	public final MacroParser.function_call_return function_call() throws RecognitionException {
		MacroParser.function_call_return retval = new MacroParser.function_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FUNCTION66=null;
		Token LPAR67=null;
		Token SEMI69=null;
		Token RPAR71=null;
		ParserRuleReturnScope comparison68 =null;
		ParserRuleReturnScope comparison70 =null;

		Object FUNCTION66_tree=null;
		Object LPAR67_tree=null;
		Object SEMI69_tree=null;
		Object RPAR71_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:119:2: ( FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !)
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:119:4: FUNCTION ^ LPAR ! ( comparison ( SEMI ! comparison )* )? RPAR !
			{
			root_0 = (Object)adaptor.nil();


			FUNCTION66=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_call632); 
			FUNCTION66_tree = (Object)adaptor.create(FUNCTION66);
			root_0 = (Object)adaptor.becomeRoot(FUNCTION66_tree, root_0);

			LPAR67=(Token)match(input,LPAR,FOLLOW_LPAR_in_function_call635); 
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:120:3: ( comparison ( SEMI ! comparison )* )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==CELL_REF||LA21_0==FUNCTION||LA21_0==LPAR||LA21_0==MINUS||LA21_0==NUMBER||(LA21_0 >= STRING && LA21_0 <= TEMPVAR)) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:120:5: comparison ( SEMI ! comparison )*
					{
					pushFollow(FOLLOW_comparison_in_function_call643);
					comparison68=comparison();
					state._fsp--;

					adaptor.addChild(root_0, comparison68.getTree());

					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:120:16: ( SEMI ! comparison )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==SEMI) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:120:18: SEMI ! comparison
							{
							SEMI69=(Token)match(input,SEMI,FOLLOW_SEMI_in_function_call647); 
							pushFollow(FOLLOW_comparison_in_function_call650);
							comparison70=comparison();
							state._fsp--;

							adaptor.addChild(root_0, comparison70.getTree());

							}
							break;

						default :
							break loop20;
						}
					}

					}
					break;

			}

			RPAR71=(Token)match(input,RPAR,FOLLOW_RPAR_in_function_call660); 
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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:124:1: reference : CELL_REF ( ( COLON ^) CELL_REF )? ;
	public final MacroParser.reference_return reference() throws RecognitionException {
		MacroParser.reference_return retval = new MacroParser.reference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CELL_REF72=null;
		Token COLON73=null;
		Token CELL_REF74=null;

		Object CELL_REF72_tree=null;
		Object COLON73_tree=null;
		Object CELL_REF74_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:125:2: ( CELL_REF ( ( COLON ^) CELL_REF )? )
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:125:4: CELL_REF ( ( COLON ^) CELL_REF )?
			{
			root_0 = (Object)adaptor.nil();


			CELL_REF72=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_reference672); 
			CELL_REF72_tree = (Object)adaptor.create(CELL_REF72);
			adaptor.addChild(root_0, CELL_REF72_tree);

			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:126:3: ( ( COLON ^) CELL_REF )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==COLON) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:126:5: ( COLON ^) CELL_REF
					{
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:126:5: ( COLON ^)
					// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:126:7: COLON ^
					{
					COLON73=(Token)match(input,COLON,FOLLOW_COLON_in_reference680); 
					COLON73_tree = (Object)adaptor.create(COLON73);
					root_0 = (Object)adaptor.becomeRoot(COLON73_tree, root_0);

					}

					CELL_REF74=(Token)match(input,CELL_REF,FOLLOW_CELL_REF_in_reference685); 
					CELL_REF74_tree = (Object)adaptor.create(CELL_REF74);
					adaptor.addChild(root_0, CELL_REF74_tree);

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
	// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:129:1: literal : ( NUMBER | STRING );
	public final MacroParser.literal_return literal() throws RecognitionException {
		MacroParser.literal_return retval = new MacroParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set75=null;

		Object set75_tree=null;

		try {
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:130:2: ( NUMBER | STRING )
			// C:\\Users\\Diogo\\Desktop\\gramaticaTeste\\Macro.g:
			{
			root_0 = (Object)adaptor.nil();


			set75=input.LT(1);
			if ( input.LA(1)==NUMBER||input.LA(1)==STRING ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set75));
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
	public static final BitSet FOLLOW_39_in_macro108 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_STRING_in_macro111 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LBRA_in_macro114 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_line_in_macro118 = new BitSet(new long[]{0x0000000040001000L});
	public static final BitSet FOLLOW_RBRA_in_macro123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_line148 = new BitSet(new long[]{0x0000000E024A4080L});
	public static final BitSet FOLLOW_sq_in_line151 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_line153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribution_in_sq178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_sq182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequencia_in_sq186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_sequencia212 = new BitSet(new long[]{0x000000001CC00800L});
	public static final BitSet FOLLOW_arithmetic_in_sequencia215 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_block_in_sequencia220 = new BitSet(new long[]{0x000000001CC00802L});
	public static final BitSet FOLLOW_arithmetic_in_sequencia223 = new BitSet(new long[]{0x0000000602084080L});
	public static final BitSet FOLLOW_atom_in_sequencia226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRA_in_block286 = new BitSet(new long[]{0x0000000E024A4080L});
	public static final BitSet FOLLOW_attribution_in_block290 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_comparison_in_block294 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_block_in_block298 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_SEMI_in_block302 = new BitSet(new long[]{0x0000000E024A4080L});
	public static final BitSet FOLLOW_attribution_in_block306 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_comparison_in_block310 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_block_in_block314 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_RBRA_in_block319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_attribution345 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ATT_in_attribution355 = new BitSet(new long[]{0x0000000E02484080L});
	public static final BitSet FOLLOW_attribution_in_attribution359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_attribution363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concatenation_in_comparison382 = new BitSet(new long[]{0x0000000001319002L});
	public static final BitSet FOLLOW_EQ_in_comparison390 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_NEQ_in_comparison395 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_GT_in_comparison400 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_LT_in_comparison405 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_LTEQ_in_comparison410 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_GTEQ_in_comparison415 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_concatenation_in_comparison420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_lowest_in_concatenation434 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AMP_in_concatenation440 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_arithmetic_lowest_in_concatenation443 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_arithmetic_low_in_arithmetic_lowest457 = new BitSet(new long[]{0x0000000008400002L});
	public static final BitSet FOLLOW_PLUS_in_arithmetic_lowest465 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_lowest470 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_arithmetic_low_in_arithmetic_lowest475 = new BitSet(new long[]{0x0000000008400002L});
	public static final BitSet FOLLOW_arithmetic_medium_in_arithmetic_low489 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_MULTI_in_arithmetic_low497 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_DIV_in_arithmetic_low502 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_arithmetic_medium_in_arithmetic_low507 = new BitSet(new long[]{0x0000000000800802L});
	public static final BitSet FOLLOW_arithmetic_high_in_arithmetic_medium521 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_POWER_in_arithmetic_medium527 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_arithmetic_high_in_arithmetic_medium530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_highest_in_arithmetic_high544 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_PERCENT_in_arithmetic_high548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_arithmetic_highest565 = new BitSet(new long[]{0x0000000602084080L});
	public static final BitSet FOLLOW_atom_in_arithmetic_highest571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_call_in_atom582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_in_atom587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_atom592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEMPVAR_in_atom610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_atom615 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_comparison_in_atom618 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAR_in_atom620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_function_call632 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LPAR_in_function_call635 = new BitSet(new long[]{0x0000000682484080L});
	public static final BitSet FOLLOW_comparison_in_function_call643 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_SEMI_in_function_call647 = new BitSet(new long[]{0x0000000602484080L});
	public static final BitSet FOLLOW_comparison_in_function_call650 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_RPAR_in_function_call660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CELL_REF_in_reference672 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COLON_in_reference680 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CELL_REF_in_reference685 = new BitSet(new long[]{0x0000000000000002L});
}

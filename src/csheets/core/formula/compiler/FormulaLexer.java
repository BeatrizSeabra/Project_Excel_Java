// $ANTLR 3.5.2 ../src/csheets/core/formula/compiler/Formula.g 2014-06-12 17:15:15

package csheets.core.formula.compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class FormulaLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public FormulaLexer() {} 
	public FormulaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public FormulaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "../src/csheets/core/formula/compiler/Formula.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// ../src/csheets/core/formula/compiler/Formula.g:109:16: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// ../src/csheets/core/formula/compiler/Formula.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:111:10: ( ( LETTER )+ )
			// ../src/csheets/core/formula/compiler/Formula.g:112:4: ( LETTER )+
			{
			// ../src/csheets/core/formula/compiler/Formula.g:112:4: ( LETTER )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "CELL_REF"
	public final void mCELL_REF() throws RecognitionException {
		try {
			int _type = CELL_REF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:117:2: ( ( ABS )? LETTER ( LETTER )? ( ABS )? ( DIGIT )+ )
			// ../src/csheets/core/formula/compiler/Formula.g:118:3: ( ABS )? LETTER ( LETTER )? ( ABS )? ( DIGIT )+
			{
			// ../src/csheets/core/formula/compiler/Formula.g:118:3: ( ABS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='$') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:
					{
					if ( input.LA(1)=='$' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mLETTER(); 

			// ../src/csheets/core/formula/compiler/Formula.g:118:19: ( LETTER )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// ../src/csheets/core/formula/compiler/Formula.g:119:3: ( ABS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='$') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:
					{
					if ( input.LA(1)=='$' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// ../src/csheets/core/formula/compiler/Formula.g:119:12: ( DIGIT )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CELL_REF"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:124:8: ( QUOT ( options {greedy=false; } : . )* QUOT )
			// ../src/csheets/core/formula/compiler/Formula.g:124:10: QUOT ( options {greedy=false; } : . )* QUOT
			{
			mQUOT(); 

			// ../src/csheets/core/formula/compiler/Formula.g:125:3: ( options {greedy=false; } : . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\"') ) {
					alt6=2;
				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:125:28: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			mQUOT(); 

			 setText(getText().substring(1, getText().length()-1)); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "QUOT"
	public final void mQUOT() throws RecognitionException {
		try {
			int _type = QUOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:129:5: ( '\"' )
			// ../src/csheets/core/formula/compiler/Formula.g:129:7: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOT"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:133:7: ( ( DIGIT )+ ( COMMA ( DIGIT )+ )? )
			// ../src/csheets/core/formula/compiler/Formula.g:133:9: ( DIGIT )+ ( COMMA ( DIGIT )+ )?
			{
			// ../src/csheets/core/formula/compiler/Formula.g:133:9: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			// ../src/csheets/core/formula/compiler/Formula.g:133:20: ( COMMA ( DIGIT )+ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==',') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:133:22: COMMA ( DIGIT )+
					{
					mCOMMA(); 

					// ../src/csheets/core/formula/compiler/Formula.g:133:28: ( DIGIT )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// ../src/csheets/core/formula/compiler/Formula.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// ../src/csheets/core/formula/compiler/Formula.g:137:7: ( '0' .. '9' )
			// ../src/csheets/core/formula/compiler/Formula.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:139:5: ( '=' )
			// ../src/csheets/core/formula/compiler/Formula.g:139:7: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:140:6: ( '<>' )
			// ../src/csheets/core/formula/compiler/Formula.g:140:8: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "LTEQ"
	public final void mLTEQ() throws RecognitionException {
		try {
			int _type = LTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:141:6: ( '<=' )
			// ../src/csheets/core/formula/compiler/Formula.g:141:8: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTEQ"

	// $ANTLR start "GTEQ"
	public final void mGTEQ() throws RecognitionException {
		try {
			int _type = GTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:142:6: ( '>=' )
			// ../src/csheets/core/formula/compiler/Formula.g:142:8: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTEQ"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:143:5: ( '>' )
			// ../src/csheets/core/formula/compiler/Formula.g:143:7: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:144:5: ( '<' )
			// ../src/csheets/core/formula/compiler/Formula.g:144:7: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "AMP"
	public final void mAMP() throws RecognitionException {
		try {
			int _type = AMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:147:6: ( '&' )
			// ../src/csheets/core/formula/compiler/Formula.g:147:8: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMP"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:150:6: ( '+' )
			// ../src/csheets/core/formula/compiler/Formula.g:150:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:151:7: ( '-' )
			// ../src/csheets/core/formula/compiler/Formula.g:151:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MULTI"
	public final void mMULTI() throws RecognitionException {
		try {
			int _type = MULTI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:152:7: ( '*' )
			// ../src/csheets/core/formula/compiler/Formula.g:152:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTI"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:153:6: ( '/' )
			// ../src/csheets/core/formula/compiler/Formula.g:153:8: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "POWER"
	public final void mPOWER() throws RecognitionException {
		try {
			int _type = POWER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:154:7: ( '^' )
			// ../src/csheets/core/formula/compiler/Formula.g:154:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POWER"

	// $ANTLR start "PERCENT"
	public final void mPERCENT() throws RecognitionException {
		try {
			int _type = PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:155:9: ( '%' )
			// ../src/csheets/core/formula/compiler/Formula.g:155:11: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERCENT"

	// $ANTLR start "ABS"
	public final void mABS() throws RecognitionException {
		try {
			// ../src/csheets/core/formula/compiler/Formula.g:158:14: ( '$' )
			// ../src/csheets/core/formula/compiler/Formula.g:158:16: '$'
			{
			match('$'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ABS"

	// $ANTLR start "EXCL"
	public final void mEXCL() throws RecognitionException {
		try {
			// ../src/csheets/core/formula/compiler/Formula.g:159:14: ( '!' )
			// ../src/csheets/core/formula/compiler/Formula.g:159:17: '!'
			{
			match('!'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXCL"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:160:7: ( ':' )
			// ../src/csheets/core/formula/compiler/Formula.g:160:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "TEMP"
	public final void mTEMP() throws RecognitionException {
		try {
			int _type = TEMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:161:6: ( '@' )
			// ../src/csheets/core/formula/compiler/Formula.g:161:8: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEMP"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:165:7: ( ',' )
			// ../src/csheets/core/formula/compiler/Formula.g:165:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:166:6: ( ';' )
			// ../src/csheets/core/formula/compiler/Formula.g:166:8: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:167:6: ( '(' )
			// ../src/csheets/core/formula/compiler/Formula.g:167:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:168:6: ( ')' )
			// ../src/csheets/core/formula/compiler/Formula.g:168:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR"

	// $ANTLR start "LBRA"
	public final void mLBRA() throws RecognitionException {
		try {
			int _type = LBRA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:169:9: ( '{' )
			// ../src/csheets/core/formula/compiler/Formula.g:169:11: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRA"

	// $ANTLR start "RBRA"
	public final void mRBRA() throws RecognitionException {
		try {
			int _type = RBRA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:170:9: ( '}' )
			// ../src/csheets/core/formula/compiler/Formula.g:170:11: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRA"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:174:3: ( ( ' ' | '\\r' '\\n' | '\\n' | '\\t' ) )
			// ../src/csheets/core/formula/compiler/Formula.g:174:5: ( ' ' | '\\r' '\\n' | '\\n' | '\\t' )
			{
			// ../src/csheets/core/formula/compiler/Formula.g:174:5: ( ' ' | '\\r' '\\n' | '\\n' | '\\t' )
			int alt10=4;
			switch ( input.LA(1) ) {
			case ' ':
				{
				alt10=1;
				}
				break;
			case '\r':
				{
				alt10=2;
				}
				break;
			case '\n':
				{
				alt10=3;
				}
				break;
			case '\t':
				{
				alt10=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:174:7: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// ../src/csheets/core/formula/compiler/Formula.g:175:4: '\\r' '\\n'
					{
					match('\r'); 
					match('\n'); 
					}
					break;
				case 3 :
					// ../src/csheets/core/formula/compiler/Formula.g:176:4: '\\n'
					{
					match('\n'); 
					}
					break;
				case 4 :
					// ../src/csheets/core/formula/compiler/Formula.g:177:4: '\\t'
					{
					match('\t'); 
					}
					break;

			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ATT"
	public final void mATT() throws RecognitionException {
		try {
			int _type = ATT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:182:8: ( ':=' )
			// ../src/csheets/core/formula/compiler/Formula.g:182:10: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ATT"

	@Override
	public void mTokens() throws RecognitionException {
		// ../src/csheets/core/formula/compiler/Formula.g:1:8: ( FUNCTION | CELL_REF | STRING | QUOT | NUMBER | EQ | NEQ | LTEQ | GTEQ | GT | LT | AMP | PLUS | MINUS | MULTI | DIV | POWER | PERCENT | COLON | TEMP | COMMA | SEMI | LPAR | RPAR | LBRA | RBRA | WS | ATT )
		int alt11=28;
		switch ( input.LA(1) ) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			switch ( input.LA(2) ) {
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				{
				int LA11_25 = input.LA(3);
				if ( (LA11_25=='$'||(LA11_25 >= '0' && LA11_25 <= '9')) ) {
					alt11=2;
				}

				else {
					alt11=1;
				}

				}
				break;
			case '$':
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				{
				alt11=2;
				}
				break;
			default:
				alt11=1;
			}
			}
			break;
		case '$':
			{
			alt11=2;
			}
			break;
		case '\"':
			{
			int LA11_3 = input.LA(2);
			if ( ((LA11_3 >= '\u0000' && LA11_3 <= '\uFFFF')) ) {
				alt11=3;
			}

			else {
				alt11=4;
			}

			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt11=5;
			}
			break;
		case '=':
			{
			alt11=6;
			}
			break;
		case '<':
			{
			switch ( input.LA(2) ) {
			case '>':
				{
				alt11=7;
				}
				break;
			case '=':
				{
				alt11=8;
				}
				break;
			default:
				alt11=11;
			}
			}
			break;
		case '>':
			{
			int LA11_7 = input.LA(2);
			if ( (LA11_7=='=') ) {
				alt11=9;
			}

			else {
				alt11=10;
			}

			}
			break;
		case '&':
			{
			alt11=12;
			}
			break;
		case '+':
			{
			alt11=13;
			}
			break;
		case '-':
			{
			alt11=14;
			}
			break;
		case '*':
			{
			alt11=15;
			}
			break;
		case '/':
			{
			alt11=16;
			}
			break;
		case '^':
			{
			alt11=17;
			}
			break;
		case '%':
			{
			alt11=18;
			}
			break;
		case ':':
			{
			int LA11_15 = input.LA(2);
			if ( (LA11_15=='=') ) {
				alt11=28;
			}

			else {
				alt11=19;
			}

			}
			break;
		case '@':
			{
			alt11=20;
			}
			break;
		case ',':
			{
			alt11=21;
			}
			break;
		case ';':
			{
			alt11=22;
			}
			break;
		case '(':
			{
			alt11=23;
			}
			break;
		case ')':
			{
			alt11=24;
			}
			break;
		case '{':
			{
			alt11=25;
			}
			break;
		case '}':
			{
			alt11=26;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt11=27;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 11, 0, input);
			throw nvae;
		}
		switch (alt11) {
			case 1 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:10: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 2 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:19: CELL_REF
				{
				mCELL_REF(); 

				}
				break;
			case 3 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:28: STRING
				{
				mSTRING(); 

				}
				break;
			case 4 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:35: QUOT
				{
				mQUOT(); 

				}
				break;
			case 5 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:40: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 6 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:47: EQ
				{
				mEQ(); 

				}
				break;
			case 7 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:50: NEQ
				{
				mNEQ(); 

				}
				break;
			case 8 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:54: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 9 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:59: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 10 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:64: GT
				{
				mGT(); 

				}
				break;
			case 11 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:67: LT
				{
				mLT(); 

				}
				break;
			case 12 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:70: AMP
				{
				mAMP(); 

				}
				break;
			case 13 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:74: PLUS
				{
				mPLUS(); 

				}
				break;
			case 14 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:79: MINUS
				{
				mMINUS(); 

				}
				break;
			case 15 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:85: MULTI
				{
				mMULTI(); 

				}
				break;
			case 16 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:91: DIV
				{
				mDIV(); 

				}
				break;
			case 17 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:95: POWER
				{
				mPOWER(); 

				}
				break;
			case 18 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:101: PERCENT
				{
				mPERCENT(); 

				}
				break;
			case 19 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:109: COLON
				{
				mCOLON(); 

				}
				break;
			case 20 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:115: TEMP
				{
				mTEMP(); 

				}
				break;
			case 21 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:120: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 22 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:126: SEMI
				{
				mSEMI(); 

				}
				break;
			case 23 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:131: LPAR
				{
				mLPAR(); 

				}
				break;
			case 24 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:136: RPAR
				{
				mRPAR(); 

				}
				break;
			case 25 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:141: LBRA
				{
				mLBRA(); 

				}
				break;
			case 26 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:146: RBRA
				{
				mRBRA(); 

				}
				break;
			case 27 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:151: WS
				{
				mWS(); 

				}
				break;
			case 28 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:154: ATT
				{
				mATT(); 

				}
				break;

		}
	}



}

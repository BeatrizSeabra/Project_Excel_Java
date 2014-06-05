// $ANTLR 3.5.2 ../src/csheets/core/formula/compiler/Formula.g 2014-06-04 21:48:57

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
			// ../src/csheets/core/formula/compiler/Formula.g:106:16: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
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
			// ../src/csheets/core/formula/compiler/Formula.g:108:10: ( ( LETTER )+ )
			// ../src/csheets/core/formula/compiler/Formula.g:109:4: ( LETTER )+
			{
			// ../src/csheets/core/formula/compiler/Formula.g:109:4: ( LETTER )+
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
			// ../src/csheets/core/formula/compiler/Formula.g:114:2: ( ( ABS )? LETTER ( LETTER )? ( ABS )? ( DIGIT )+ )
			// ../src/csheets/core/formula/compiler/Formula.g:115:3: ( ABS )? LETTER ( LETTER )? ( ABS )? ( DIGIT )+
			{
			// ../src/csheets/core/formula/compiler/Formula.g:115:3: ( ABS )?
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

			// ../src/csheets/core/formula/compiler/Formula.g:115:19: ( LETTER )?
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

			// ../src/csheets/core/formula/compiler/Formula.g:116:3: ( ABS )?
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

			// ../src/csheets/core/formula/compiler/Formula.g:116:12: ( DIGIT )+
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
			// ../src/csheets/core/formula/compiler/Formula.g:121:8: ( QUOT ( options {greedy=false; } : . )* QUOT )
			// ../src/csheets/core/formula/compiler/Formula.g:121:10: QUOT ( options {greedy=false; } : . )* QUOT
			{
			mQUOT(); 

			// ../src/csheets/core/formula/compiler/Formula.g:122:3: ( options {greedy=false; } : . )*
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
					// ../src/csheets/core/formula/compiler/Formula.g:122:28: .
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
			// ../src/csheets/core/formula/compiler/Formula.g:126:5: ( '\"' )
			// ../src/csheets/core/formula/compiler/Formula.g:126:7: '\"'
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
			// ../src/csheets/core/formula/compiler/Formula.g:130:7: ( ( DIGIT )+ ( COMMA ( DIGIT )+ )? )
			// ../src/csheets/core/formula/compiler/Formula.g:130:9: ( DIGIT )+ ( COMMA ( DIGIT )+ )?
			{
			// ../src/csheets/core/formula/compiler/Formula.g:130:9: ( DIGIT )+
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

			// ../src/csheets/core/formula/compiler/Formula.g:130:20: ( COMMA ( DIGIT )+ )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==',') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// ../src/csheets/core/formula/compiler/Formula.g:130:22: COMMA ( DIGIT )+
					{
					mCOMMA(); 

					// ../src/csheets/core/formula/compiler/Formula.g:130:28: ( DIGIT )+
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
			// ../src/csheets/core/formula/compiler/Formula.g:134:7: ( '0' .. '9' )
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
			// ../src/csheets/core/formula/compiler/Formula.g:136:5: ( '=' )
			// ../src/csheets/core/formula/compiler/Formula.g:136:7: '='
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
			// ../src/csheets/core/formula/compiler/Formula.g:137:6: ( '<>' )
			// ../src/csheets/core/formula/compiler/Formula.g:137:8: '<>'
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
			// ../src/csheets/core/formula/compiler/Formula.g:138:6: ( '<=' )
			// ../src/csheets/core/formula/compiler/Formula.g:138:8: '<='
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
			// ../src/csheets/core/formula/compiler/Formula.g:139:6: ( '>=' )
			// ../src/csheets/core/formula/compiler/Formula.g:139:8: '>='
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
			// ../src/csheets/core/formula/compiler/Formula.g:140:5: ( '>' )
			// ../src/csheets/core/formula/compiler/Formula.g:140:7: '>'
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
			// ../src/csheets/core/formula/compiler/Formula.g:141:5: ( '<' )
			// ../src/csheets/core/formula/compiler/Formula.g:141:7: '<'
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
			// ../src/csheets/core/formula/compiler/Formula.g:144:6: ( '&' )
			// ../src/csheets/core/formula/compiler/Formula.g:144:8: '&'
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
			// ../src/csheets/core/formula/compiler/Formula.g:147:6: ( '+' )
			// ../src/csheets/core/formula/compiler/Formula.g:147:8: '+'
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
			// ../src/csheets/core/formula/compiler/Formula.g:148:7: ( '-' )
			// ../src/csheets/core/formula/compiler/Formula.g:148:9: '-'
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
			// ../src/csheets/core/formula/compiler/Formula.g:149:7: ( '*' )
			// ../src/csheets/core/formula/compiler/Formula.g:149:9: '*'
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
			// ../src/csheets/core/formula/compiler/Formula.g:150:6: ( '/' )
			// ../src/csheets/core/formula/compiler/Formula.g:150:8: '/'
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
			// ../src/csheets/core/formula/compiler/Formula.g:151:7: ( '^' )
			// ../src/csheets/core/formula/compiler/Formula.g:151:9: '^'
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
			// ../src/csheets/core/formula/compiler/Formula.g:152:9: ( '%' )
			// ../src/csheets/core/formula/compiler/Formula.g:152:11: '%'
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
			// ../src/csheets/core/formula/compiler/Formula.g:155:14: ( '$' )
			// ../src/csheets/core/formula/compiler/Formula.g:155:16: '$'
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
			// ../src/csheets/core/formula/compiler/Formula.g:156:14: ( '!' )
			// ../src/csheets/core/formula/compiler/Formula.g:156:17: '!'
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
			// ../src/csheets/core/formula/compiler/Formula.g:157:7: ( ':' )
			// ../src/csheets/core/formula/compiler/Formula.g:157:9: ':'
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

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:160:7: ( ',' )
			// ../src/csheets/core/formula/compiler/Formula.g:160:9: ','
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
			// ../src/csheets/core/formula/compiler/Formula.g:161:6: ( ';' )
			// ../src/csheets/core/formula/compiler/Formula.g:161:8: ';'
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
			// ../src/csheets/core/formula/compiler/Formula.g:162:6: ( '(' )
			// ../src/csheets/core/formula/compiler/Formula.g:162:8: '('
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
			// ../src/csheets/core/formula/compiler/Formula.g:163:6: ( ')' )
			// ../src/csheets/core/formula/compiler/Formula.g:163:8: ')'
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../src/csheets/core/formula/compiler/Formula.g:167:3: ( ( ' ' | '\\r' '\\n' | '\\n' | '\\t' ) )
			// ../src/csheets/core/formula/compiler/Formula.g:167:5: ( ' ' | '\\r' '\\n' | '\\n' | '\\t' )
			{
			// ../src/csheets/core/formula/compiler/Formula.g:167:5: ( ' ' | '\\r' '\\n' | '\\n' | '\\t' )
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
					// ../src/csheets/core/formula/compiler/Formula.g:167:7: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// ../src/csheets/core/formula/compiler/Formula.g:168:4: '\\r' '\\n'
					{
					match('\r'); 
					match('\n'); 
					}
					break;
				case 3 :
					// ../src/csheets/core/formula/compiler/Formula.g:169:4: '\\n'
					{
					match('\n'); 
					}
					break;
				case 4 :
					// ../src/csheets/core/formula/compiler/Formula.g:170:4: '\\t'
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

	@Override
	public void mTokens() throws RecognitionException {
		// ../src/csheets/core/formula/compiler/Formula.g:1:8: ( FUNCTION | CELL_REF | STRING | QUOT | NUMBER | EQ | NEQ | LTEQ | GTEQ | GT | LT | AMP | PLUS | MINUS | MULTI | DIV | POWER | PERCENT | COLON | COMMA | SEMI | LPAR | RPAR | WS )
		int alt11=24;
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
				int LA11_22 = input.LA(3);
				if ( (LA11_22=='$'||(LA11_22 >= '0' && LA11_22 <= '9')) ) {
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
			alt11=19;
			}
			break;
		case ',':
			{
			alt11=20;
			}
			break;
		case ';':
			{
			alt11=21;
			}
			break;
		case '(':
			{
			alt11=22;
			}
			break;
		case ')':
			{
			alt11=23;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt11=24;
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
				// ../src/csheets/core/formula/compiler/Formula.g:1:115: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 21 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:121: SEMI
				{
				mSEMI(); 

				}
				break;
			case 22 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:126: LPAR
				{
				mLPAR(); 

				}
				break;
			case 23 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:131: RPAR
				{
				mRPAR(); 

				}
				break;
			case 24 :
				// ../src/csheets/core/formula/compiler/Formula.g:1:136: WS
				{
				mWS(); 

				}
				break;

		}
	}



}

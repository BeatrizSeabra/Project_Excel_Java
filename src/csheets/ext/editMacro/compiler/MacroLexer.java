// $ANTLR 3.5.1 ../csheets/ext/editMacro/compiler/Macro.g 2014-06-18 14:43:19

package csheets.ext.editMacro.compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MacroLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__37=37;
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
	public static final int VARSIMBLE=35;
	public static final int WS=36;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public MacroLexer() {} 
	public MacroLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public MacroLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "../csheets/ext/editMacro/compiler/Macro.g"; }

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../csheets/ext/editMacro/compiler/Macro.g:11:7: ( '\\n' )
			// ../csheets/ext/editMacro/compiler/Macro.g:11:9: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../csheets/ext/editMacro/compiler/Macro.g:12:7: ( 'macro' )
			// ../csheets/ext/editMacro/compiler/Macro.g:12:9: 'macro'
			{
			match("macro"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// ../csheets/ext/editMacro/compiler/Macro.g:134:16: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// ../csheets/ext/editMacro/compiler/Macro.g:
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
			// ../csheets/ext/editMacro/compiler/Macro.g:136:10: ( ( LETTER )+ )
			// ../csheets/ext/editMacro/compiler/Macro.g:137:4: ( LETTER )+
			{
			// ../csheets/ext/editMacro/compiler/Macro.g:137:4: ( LETTER )+
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
					// ../csheets/ext/editMacro/compiler/Macro.g:
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
			// ../csheets/ext/editMacro/compiler/Macro.g:142:2: ( ( ABS )? LETTER ( LETTER )? ( ABS )? ( DIGIT )+ )
			// ../csheets/ext/editMacro/compiler/Macro.g:143:3: ( ABS )? LETTER ( LETTER )? ( ABS )? ( DIGIT )+
			{
			// ../csheets/ext/editMacro/compiler/Macro.g:143:3: ( ABS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='$') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// ../csheets/ext/editMacro/compiler/Macro.g:
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

			// ../csheets/ext/editMacro/compiler/Macro.g:143:19: ( LETTER )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// ../csheets/ext/editMacro/compiler/Macro.g:
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

			// ../csheets/ext/editMacro/compiler/Macro.g:144:3: ( ABS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='$') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// ../csheets/ext/editMacro/compiler/Macro.g:
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

			// ../csheets/ext/editMacro/compiler/Macro.g:144:12: ( DIGIT )+
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
					// ../csheets/ext/editMacro/compiler/Macro.g:
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
			// ../csheets/ext/editMacro/compiler/Macro.g:149:8: ( QUOT ( options {greedy=false; } : . )* QUOT )
			// ../csheets/ext/editMacro/compiler/Macro.g:149:10: QUOT ( options {greedy=false; } : . )* QUOT
			{
			mQUOT(); 

			// ../csheets/ext/editMacro/compiler/Macro.g:150:3: ( options {greedy=false; } : . )*
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
					// ../csheets/ext/editMacro/compiler/Macro.g:150:28: .
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

	// $ANTLR start "TEMPVAR"
	public final void mTEMPVAR() throws RecognitionException {
		try {
			int _type = TEMPVAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../csheets/ext/editMacro/compiler/Macro.g:156:9: ( VARSIMBLE ( LETTER )+ )
			// ../csheets/ext/editMacro/compiler/Macro.g:156:13: VARSIMBLE ( LETTER )+
			{
			mVARSIMBLE(); 

			// ../csheets/ext/editMacro/compiler/Macro.g:156:23: ( LETTER )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ../csheets/ext/editMacro/compiler/Macro.g:
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
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEMPVAR"

	// $ANTLR start "QUOT"
	public final void mQUOT() throws RecognitionException {
		try {
			int _type = QUOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../csheets/ext/editMacro/compiler/Macro.g:158:5: ( '\"' )
			// ../csheets/ext/editMacro/compiler/Macro.g:158:7: '\"'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:162:7: ( ( DIGIT )+ ( COMMA ( DIGIT )+ )? )
			// ../csheets/ext/editMacro/compiler/Macro.g:162:9: ( DIGIT )+ ( COMMA ( DIGIT )+ )?
			{
			// ../csheets/ext/editMacro/compiler/Macro.g:162:9: ( DIGIT )+
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
					// ../csheets/ext/editMacro/compiler/Macro.g:
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

			// ../csheets/ext/editMacro/compiler/Macro.g:162:20: ( COMMA ( DIGIT )+ )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==',') ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// ../csheets/ext/editMacro/compiler/Macro.g:162:22: COMMA ( DIGIT )+
					{
					mCOMMA(); 

					// ../csheets/ext/editMacro/compiler/Macro.g:162:28: ( DIGIT )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// ../csheets/ext/editMacro/compiler/Macro.g:
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
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
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
			// ../csheets/ext/editMacro/compiler/Macro.g:166:7: ( '0' .. '9' )
			// ../csheets/ext/editMacro/compiler/Macro.g:
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
			// ../csheets/ext/editMacro/compiler/Macro.g:168:5: ( '=' )
			// ../csheets/ext/editMacro/compiler/Macro.g:168:7: '='
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
			// ../csheets/ext/editMacro/compiler/Macro.g:169:6: ( '<>' )
			// ../csheets/ext/editMacro/compiler/Macro.g:169:8: '<>'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:170:6: ( '<=' )
			// ../csheets/ext/editMacro/compiler/Macro.g:170:8: '<='
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
			// ../csheets/ext/editMacro/compiler/Macro.g:171:6: ( '>=' )
			// ../csheets/ext/editMacro/compiler/Macro.g:171:8: '>='
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
			// ../csheets/ext/editMacro/compiler/Macro.g:172:5: ( '>' )
			// ../csheets/ext/editMacro/compiler/Macro.g:172:7: '>'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:173:5: ( '<' )
			// ../csheets/ext/editMacro/compiler/Macro.g:173:7: '<'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:176:6: ( '&' )
			// ../csheets/ext/editMacro/compiler/Macro.g:176:8: '&'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:179:6: ( '+' )
			// ../csheets/ext/editMacro/compiler/Macro.g:179:8: '+'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:180:7: ( '-' )
			// ../csheets/ext/editMacro/compiler/Macro.g:180:9: '-'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:181:7: ( '*' )
			// ../csheets/ext/editMacro/compiler/Macro.g:181:9: '*'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:182:6: ( '/' )
			// ../csheets/ext/editMacro/compiler/Macro.g:182:8: '/'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:183:7: ( '^' )
			// ../csheets/ext/editMacro/compiler/Macro.g:183:9: '^'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:184:9: ( '%' )
			// ../csheets/ext/editMacro/compiler/Macro.g:184:11: '%'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:187:14: ( '$' )
			// ../csheets/ext/editMacro/compiler/Macro.g:187:16: '$'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:188:14: ( '!' )
			// ../csheets/ext/editMacro/compiler/Macro.g:188:17: '!'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:189:7: ( ':' )
			// ../csheets/ext/editMacro/compiler/Macro.g:189:9: ':'
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

	// $ANTLR start "VARSIMBLE"
	public final void mVARSIMBLE() throws RecognitionException {
		try {
			int _type = VARSIMBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../csheets/ext/editMacro/compiler/Macro.g:190:11: ( '@' )
			// ../csheets/ext/editMacro/compiler/Macro.g:190:13: '@'
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
	// $ANTLR end "VARSIMBLE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../csheets/ext/editMacro/compiler/Macro.g:194:7: ( ',' )
			// ../csheets/ext/editMacro/compiler/Macro.g:194:9: ','
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
			// ../csheets/ext/editMacro/compiler/Macro.g:195:6: ( ';' )
			// ../csheets/ext/editMacro/compiler/Macro.g:195:8: ';'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:196:6: ( '(' )
			// ../csheets/ext/editMacro/compiler/Macro.g:196:8: '('
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
			// ../csheets/ext/editMacro/compiler/Macro.g:197:6: ( ')' )
			// ../csheets/ext/editMacro/compiler/Macro.g:197:8: ')'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:198:9: ( '{' )
			// ../csheets/ext/editMacro/compiler/Macro.g:198:11: '{'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:199:9: ( '}' )
			// ../csheets/ext/editMacro/compiler/Macro.g:199:11: '}'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:203:3: ( ( ' ' | '\\r' '\\n' | '\\n' | '\\t' ) )
			// ../csheets/ext/editMacro/compiler/Macro.g:203:5: ( ' ' | '\\r' '\\n' | '\\n' | '\\t' )
			{
			// ../csheets/ext/editMacro/compiler/Macro.g:203:5: ( ' ' | '\\r' '\\n' | '\\n' | '\\t' )
			int alt11=4;
			switch ( input.LA(1) ) {
			case ' ':
				{
				alt11=1;
				}
				break;
			case '\r':
				{
				alt11=2;
				}
				break;
			case '\n':
				{
				alt11=3;
				}
				break;
			case '\t':
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
					// ../csheets/ext/editMacro/compiler/Macro.g:203:7: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// ../csheets/ext/editMacro/compiler/Macro.g:204:4: '\\r' '\\n'
					{
					match('\r'); 
					match('\n'); 
					}
					break;
				case 3 :
					// ../csheets/ext/editMacro/compiler/Macro.g:205:4: '\\n'
					{
					match('\n'); 
					}
					break;
				case 4 :
					// ../csheets/ext/editMacro/compiler/Macro.g:206:4: '\\t'
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
			// ../csheets/ext/editMacro/compiler/Macro.g:211:8: ( ':=' )
			// ../csheets/ext/editMacro/compiler/Macro.g:211:10: ':='
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
		// ../csheets/ext/editMacro/compiler/Macro.g:1:8: ( T__37 | T__38 | FUNCTION | CELL_REF | STRING | TEMPVAR | QUOT | NUMBER | EQ | NEQ | LTEQ | GTEQ | GT | LT | AMP | PLUS | MINUS | MULTI | DIV | POWER | PERCENT | COLON | VARSIMBLE | COMMA | SEMI | LPAR | RPAR | LBRA | RBRA | WS | ATT )
		int alt12=31;
		switch ( input.LA(1) ) {
		case '\n':
			{
			alt12=1;
			}
			break;
		case 'm':
			{
			switch ( input.LA(2) ) {
			case 'a':
				{
				switch ( input.LA(3) ) {
				case 'c':
					{
					int LA12_41 = input.LA(4);
					if ( (LA12_41=='r') ) {
						int LA12_42 = input.LA(5);
						if ( (LA12_42=='o') ) {
							int LA12_43 = input.LA(6);
							if ( ((LA12_43 >= 'A' && LA12_43 <= 'Z')||(LA12_43 >= 'a' && LA12_43 <= 'z')) ) {
								alt12=3;
							}

							else {
								alt12=2;
							}

						}

						else {
							alt12=3;
						}

					}

					else {
						alt12=3;
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
					alt12=4;
					}
					break;
				default:
					alt12=3;
				}
				}
				break;
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
				int LA12_29 = input.LA(3);
				if ( (LA12_29=='$'||(LA12_29 >= '0' && LA12_29 <= '9')) ) {
					alt12=4;
				}

				else {
					alt12=3;
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
				alt12=4;
				}
				break;
			default:
				alt12=3;
			}
			}
			break;
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
				int LA12_29 = input.LA(3);
				if ( (LA12_29=='$'||(LA12_29 >= '0' && LA12_29 <= '9')) ) {
					alt12=4;
				}

				else {
					alt12=3;
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
				alt12=4;
				}
				break;
			default:
				alt12=3;
			}
			}
			break;
		case '$':
			{
			alt12=4;
			}
			break;
		case '\"':
			{
			int LA12_5 = input.LA(2);
			if ( ((LA12_5 >= '\u0000' && LA12_5 <= '\uFFFF')) ) {
				alt12=5;
			}

			else {
				alt12=7;
			}

			}
			break;
		case '@':
			{
			int LA12_6 = input.LA(2);
			if ( ((LA12_6 >= 'A' && LA12_6 <= 'Z')||(LA12_6 >= 'a' && LA12_6 <= 'z')) ) {
				alt12=6;
			}

			else {
				alt12=23;
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
			alt12=8;
			}
			break;
		case '=':
			{
			alt12=9;
			}
			break;
		case '<':
			{
			switch ( input.LA(2) ) {
			case '>':
				{
				alt12=10;
				}
				break;
			case '=':
				{
				alt12=11;
				}
				break;
			default:
				alt12=14;
			}
			}
			break;
		case '>':
			{
			int LA12_10 = input.LA(2);
			if ( (LA12_10=='=') ) {
				alt12=12;
			}

			else {
				alt12=13;
			}

			}
			break;
		case '&':
			{
			alt12=15;
			}
			break;
		case '+':
			{
			alt12=16;
			}
			break;
		case '-':
			{
			alt12=17;
			}
			break;
		case '*':
			{
			alt12=18;
			}
			break;
		case '/':
			{
			alt12=19;
			}
			break;
		case '^':
			{
			alt12=20;
			}
			break;
		case '%':
			{
			alt12=21;
			}
			break;
		case ':':
			{
			int LA12_18 = input.LA(2);
			if ( (LA12_18=='=') ) {
				alt12=31;
			}

			else {
				alt12=22;
			}

			}
			break;
		case ',':
			{
			alt12=24;
			}
			break;
		case ';':
			{
			alt12=25;
			}
			break;
		case '(':
			{
			alt12=26;
			}
			break;
		case ')':
			{
			alt12=27;
			}
			break;
		case '{':
			{
			alt12=28;
			}
			break;
		case '}':
			{
			alt12=29;
			}
			break;
		case '\t':
		case '\r':
		case ' ':
			{
			alt12=30;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 12, 0, input);
			throw nvae;
		}
		switch (alt12) {
			case 1 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:10: T__37
				{
				mT__37(); 

				}
				break;
			case 2 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:16: T__38
				{
				mT__38(); 

				}
				break;
			case 3 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:22: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 4 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:31: CELL_REF
				{
				mCELL_REF(); 

				}
				break;
			case 5 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:40: STRING
				{
				mSTRING(); 

				}
				break;
			case 6 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:47: TEMPVAR
				{
				mTEMPVAR(); 

				}
				break;
			case 7 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:55: QUOT
				{
				mQUOT(); 

				}
				break;
			case 8 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:60: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 9 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:67: EQ
				{
				mEQ(); 

				}
				break;
			case 10 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:70: NEQ
				{
				mNEQ(); 

				}
				break;
			case 11 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:74: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 12 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:79: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 13 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:84: GT
				{
				mGT(); 

				}
				break;
			case 14 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:87: LT
				{
				mLT(); 

				}
				break;
			case 15 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:90: AMP
				{
				mAMP(); 

				}
				break;
			case 16 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:94: PLUS
				{
				mPLUS(); 

				}
				break;
			case 17 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:99: MINUS
				{
				mMINUS(); 

				}
				break;
			case 18 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:105: MULTI
				{
				mMULTI(); 

				}
				break;
			case 19 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:111: DIV
				{
				mDIV(); 

				}
				break;
			case 20 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:115: POWER
				{
				mPOWER(); 

				}
				break;
			case 21 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:121: PERCENT
				{
				mPERCENT(); 

				}
				break;
			case 22 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:129: COLON
				{
				mCOLON(); 

				}
				break;
			case 23 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:135: VARSIMBLE
				{
				mVARSIMBLE(); 

				}
				break;
			case 24 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:145: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 25 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:151: SEMI
				{
				mSEMI(); 

				}
				break;
			case 26 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:156: LPAR
				{
				mLPAR(); 

				}
				break;
			case 27 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:161: RPAR
				{
				mRPAR(); 

				}
				break;
			case 28 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:166: LBRA
				{
				mLBRA(); 

				}
				break;
			case 29 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:171: RBRA
				{
				mRBRA(); 

				}
				break;
			case 30 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:176: WS
				{
				mWS(); 

				}
				break;
			case 31 :
				// ../csheets/ext/editMacro/compiler/Macro.g:1:179: ATT
				{
				mATT(); 

				}
				break;

		}
	}



}

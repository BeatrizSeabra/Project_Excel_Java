// $ANTLR 3.5.1 C:\\Users\\i120388\\Desktop\\teste\\Macro.g 2014-06-19 14:12:27

package csheets.ext.editMacro.compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MacroLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "C:\\Users\\i120388\\Desktop\\teste\\Macro.g"; }

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:11:7: ( '\\n' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:11:9: '\\n'
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
	// $ANTLR end "T__38"

	// $ANTLR start "MACRO"
	public final void mMACRO() throws RecognitionException {
		try {
			int _type = MACRO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:136:7: ( ( 'macro' | 'MACRO' ) )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:136:9: ( 'macro' | 'MACRO' )
			{
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:136:9: ( 'macro' | 'MACRO' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='m') ) {
				alt1=1;
			}
			else if ( (LA1_0=='M') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:136:10: 'macro'
					{
					match("macro"); 

					}
					break;
				case 2 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:137:7: 'MACRO'
					{
					match("MACRO"); 

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
	// $ANTLR end "MACRO"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:141:16: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:143:10: ( ( LETTER )+ )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:144:4: ( LETTER )+
			{
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:144:4: ( LETTER )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:149:2: ( ( ABS )? LETTER ( LETTER )? ( ABS )? ( DIGIT )+ )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:150:3: ( ABS )? LETTER ( LETTER )? ( ABS )? ( DIGIT )+
			{
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:150:3: ( ABS )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='$') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:
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

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:150:19: ( LETTER )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:
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

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:151:3: ( ABS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='$') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:
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

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:151:12: ( DIGIT )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:156:8: ( QUOT ( options {greedy=false; } : . )* QUOT )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:156:10: QUOT ( options {greedy=false; } : . )* QUOT
			{
			mQUOT(); 

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:157:3: ( options {greedy=false; } : . )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\"') ) {
					alt7=2;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:157:28: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop7;
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

	// $ANTLR start "VARNAME"
	public final void mVARNAME() throws RecognitionException {
		try {
			int _type = VARNAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:163:2: ( ( '@' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:163:4: ( '@' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:163:4: ( '@' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:163:5: '@'
			{
			match('@'); 
			}

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:163:9: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARNAME"

	// $ANTLR start "QUOT"
	public final void mQUOT() throws RecognitionException {
		try {
			int _type = QUOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:165:5: ( '\"' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:165:7: '\"'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:169:7: ( ( DIGIT )+ ( COMMA ( DIGIT )+ )? )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:169:9: ( DIGIT )+ ( COMMA ( DIGIT )+ )?
			{
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:169:9: ( DIGIT )+
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
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:
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

			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:169:20: ( COMMA ( DIGIT )+ )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==',') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:169:22: COMMA ( DIGIT )+
					{
					mCOMMA(); 

					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:169:28: ( DIGIT )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:
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
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:173:7: ( '0' .. '9' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:175:5: ( '=' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:175:7: '='
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:176:6: ( '<>' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:176:8: '<>'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:177:6: ( '<=' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:177:8: '<='
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:178:6: ( '>=' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:178:8: '>='
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:179:5: ( '>' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:179:7: '>'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:180:5: ( '<' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:180:7: '<'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:183:6: ( '&' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:183:8: '&'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:186:6: ( '+' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:186:8: '+'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:187:7: ( '-' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:187:9: '-'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:188:7: ( '*' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:188:9: '*'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:189:6: ( '/' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:189:8: '/'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:190:7: ( '^' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:190:9: '^'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:191:9: ( '%' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:191:11: '%'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:194:14: ( '$' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:194:16: '$'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:195:14: ( '!' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:195:17: '!'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:196:7: ( ':' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:196:9: ':'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:197:11: ( '@' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:197:13: '@'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:201:7: ( ',' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:201:9: ','
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:202:6: ( ';' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:202:8: ';'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:203:6: ( '(' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:203:8: '('
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:204:6: ( ')' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:204:8: ')'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:205:9: ( '{' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:205:11: '{'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:206:9: ( '}' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:206:11: '}'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:210:3: ( ( ' ' | '\\r' '\\n' | '\\n' | '\\t' ) )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:210:5: ( ' ' | '\\r' '\\n' | '\\n' | '\\t' )
			{
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:210:5: ( ' ' | '\\r' '\\n' | '\\n' | '\\t' )
			int alt12=4;
			switch ( input.LA(1) ) {
			case ' ':
				{
				alt12=1;
				}
				break;
			case '\r':
				{
				alt12=2;
				}
				break;
			case '\n':
				{
				alt12=3;
				}
				break;
			case '\t':
				{
				alt12=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:210:7: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:211:4: '\\r' '\\n'
					{
					match('\r'); 
					match('\n'); 
					}
					break;
				case 3 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:212:4: '\\n'
					{
					match('\n'); 
					}
					break;
				case 4 :
					// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:213:4: '\\t'
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
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:218:8: ( ':=' )
			// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:218:10: ':='
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
		// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:8: ( T__38 | MACRO | FUNCTION | CELL_REF | STRING | VARNAME | QUOT | NUMBER | EQ | NEQ | LTEQ | GTEQ | GT | LT | AMP | PLUS | MINUS | MULTI | DIV | POWER | PERCENT | COLON | VARSIMBLE | COMMA | SEMI | LPAR | RPAR | LBRA | RBRA | WS | ATT )
		int alt13=31;
		switch ( input.LA(1) ) {
		case '\n':
			{
			alt13=1;
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
					int LA13_43 = input.LA(4);
					if ( (LA13_43=='r') ) {
						int LA13_45 = input.LA(5);
						if ( (LA13_45=='o') ) {
							int LA13_47 = input.LA(6);
							if ( ((LA13_47 >= 'A' && LA13_47 <= 'Z')||(LA13_47 >= 'a' && LA13_47 <= 'z')) ) {
								alt13=3;
							}

							else {
								alt13=2;
							}

						}

						else {
							alt13=3;
						}

					}

					else {
						alt13=3;
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
					alt13=4;
					}
					break;
				default:
					alt13=3;
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
				int LA13_30 = input.LA(3);
				if ( (LA13_30=='$'||(LA13_30 >= '0' && LA13_30 <= '9')) ) {
					alt13=4;
				}

				else {
					alt13=3;
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
				alt13=4;
				}
				break;
			default:
				alt13=3;
			}
			}
			break;
		case 'M':
			{
			switch ( input.LA(2) ) {
			case 'A':
				{
				switch ( input.LA(3) ) {
				case 'C':
					{
					int LA13_44 = input.LA(4);
					if ( (LA13_44=='R') ) {
						int LA13_46 = input.LA(5);
						if ( (LA13_46=='O') ) {
							int LA13_48 = input.LA(6);
							if ( ((LA13_48 >= 'A' && LA13_48 <= 'Z')||(LA13_48 >= 'a' && LA13_48 <= 'z')) ) {
								alt13=3;
							}

							else {
								alt13=2;
							}

						}

						else {
							alt13=3;
						}

					}

					else {
						alt13=3;
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
					alt13=4;
					}
					break;
				default:
					alt13=3;
				}
				}
				break;
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
				int LA13_30 = input.LA(3);
				if ( (LA13_30=='$'||(LA13_30 >= '0' && LA13_30 <= '9')) ) {
					alt13=4;
				}

				else {
					alt13=3;
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
				alt13=4;
				}
				break;
			default:
				alt13=3;
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
				int LA13_30 = input.LA(3);
				if ( (LA13_30=='$'||(LA13_30 >= '0' && LA13_30 <= '9')) ) {
					alt13=4;
				}

				else {
					alt13=3;
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
				alt13=4;
				}
				break;
			default:
				alt13=3;
			}
			}
			break;
		case '$':
			{
			alt13=4;
			}
			break;
		case '\"':
			{
			int LA13_6 = input.LA(2);
			if ( ((LA13_6 >= '\u0000' && LA13_6 <= '\uFFFF')) ) {
				alt13=5;
			}

			else {
				alt13=7;
			}

			}
			break;
		case '@':
			{
			int LA13_7 = input.LA(2);
			if ( ((LA13_7 >= '0' && LA13_7 <= '9')||(LA13_7 >= 'A' && LA13_7 <= 'Z')||(LA13_7 >= 'a' && LA13_7 <= 'z')) ) {
				alt13=6;
			}

			else {
				alt13=23;
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
			alt13=8;
			}
			break;
		case '=':
			{
			alt13=9;
			}
			break;
		case '<':
			{
			switch ( input.LA(2) ) {
			case '>':
				{
				alt13=10;
				}
				break;
			case '=':
				{
				alt13=11;
				}
				break;
			default:
				alt13=14;
			}
			}
			break;
		case '>':
			{
			int LA13_11 = input.LA(2);
			if ( (LA13_11=='=') ) {
				alt13=12;
			}

			else {
				alt13=13;
			}

			}
			break;
		case '&':
			{
			alt13=15;
			}
			break;
		case '+':
			{
			alt13=16;
			}
			break;
		case '-':
			{
			alt13=17;
			}
			break;
		case '*':
			{
			alt13=18;
			}
			break;
		case '/':
			{
			alt13=19;
			}
			break;
		case '^':
			{
			alt13=20;
			}
			break;
		case '%':
			{
			alt13=21;
			}
			break;
		case ':':
			{
			int LA13_19 = input.LA(2);
			if ( (LA13_19=='=') ) {
				alt13=31;
			}

			else {
				alt13=22;
			}

			}
			break;
		case ',':
			{
			alt13=24;
			}
			break;
		case ';':
			{
			alt13=25;
			}
			break;
		case '(':
			{
			alt13=26;
			}
			break;
		case ')':
			{
			alt13=27;
			}
			break;
		case '{':
			{
			alt13=28;
			}
			break;
		case '}':
			{
			alt13=29;
			}
			break;
		case '\t':
		case '\r':
		case ' ':
			{
			alt13=30;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 13, 0, input);
			throw nvae;
		}
		switch (alt13) {
			case 1 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:10: T__38
				{
				mT__38(); 

				}
				break;
			case 2 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:16: MACRO
				{
				mMACRO(); 

				}
				break;
			case 3 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:22: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 4 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:31: CELL_REF
				{
				mCELL_REF(); 

				}
				break;
			case 5 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:40: STRING
				{
				mSTRING(); 

				}
				break;
			case 6 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:47: VARNAME
				{
				mVARNAME(); 

				}
				break;
			case 7 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:55: QUOT
				{
				mQUOT(); 

				}
				break;
			case 8 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:60: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 9 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:67: EQ
				{
				mEQ(); 

				}
				break;
			case 10 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:70: NEQ
				{
				mNEQ(); 

				}
				break;
			case 11 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:74: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 12 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:79: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 13 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:84: GT
				{
				mGT(); 

				}
				break;
			case 14 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:87: LT
				{
				mLT(); 

				}
				break;
			case 15 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:90: AMP
				{
				mAMP(); 

				}
				break;
			case 16 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:94: PLUS
				{
				mPLUS(); 

				}
				break;
			case 17 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:99: MINUS
				{
				mMINUS(); 

				}
				break;
			case 18 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:105: MULTI
				{
				mMULTI(); 

				}
				break;
			case 19 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:111: DIV
				{
				mDIV(); 

				}
				break;
			case 20 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:115: POWER
				{
				mPOWER(); 

				}
				break;
			case 21 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:121: PERCENT
				{
				mPERCENT(); 

				}
				break;
			case 22 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:129: COLON
				{
				mCOLON(); 

				}
				break;
			case 23 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:135: VARSIMBLE
				{
				mVARSIMBLE(); 

				}
				break;
			case 24 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:145: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 25 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:151: SEMI
				{
				mSEMI(); 

				}
				break;
			case 26 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:156: LPAR
				{
				mLPAR(); 

				}
				break;
			case 27 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:161: RPAR
				{
				mRPAR(); 

				}
				break;
			case 28 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:166: LBRA
				{
				mLBRA(); 

				}
				break;
			case 29 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:171: RBRA
				{
				mRBRA(); 

				}
				break;
			case 30 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:176: WS
				{
				mWS(); 

				}
				break;
			case 31 :
				// C:\\Users\\i120388\\Desktop\\teste\\Macro.g:1:179: ATT
				{
				mATT(); 

				}
				break;

		}
	}



}

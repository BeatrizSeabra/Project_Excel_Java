grammar Macro;

options {
	language=Java;
	output=AST;
}	
    
   
@parser::header {
package csheets.ext.editMacro.compiler;
}
 
@lexer::header {
package csheets.ext.editMacro.compiler;
}

// Alter code generation so catch-clauses get replace with 
// this action.
@rulecatch {
	catch (RecognitionException e) {
		reportError(e);
		throw e; 
	}
}

@members {
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
}
	         
expression
	: macro EOF!
       	;

macro
        : 'macro'  STRING  LBRA  (line)+  RBRA 
        ;

line
        :EQ! sq '\n'
        ;

sq
        : attribution | comparison | sequencia
        ;

sequencia:
        ((NUMBER) arithmetic^)? block (arithmetic^ atom)?
        ;

arithmetic:
        PLUS|MINUS|MULTI|DIV|POWER|PERCENT
        ;

block:
        LBRA! (attribution | comparison | block) (SEMI^ (attribution | comparison | block))* RBRA!
        ;

attribution
        : ( CELL_REF | TEMPVAR ) ATT^ (attribution | comparison)
        ;

comparison
	: concatenation
		( ( EQ^ | NEQ^ | GT^ | LT^ | LTEQ^ | GTEQ^ ) concatenation )?
	;

concatenation
	: arithmetic_lowest
		( AMP^ arithmetic_lowest )*
	;

arithmetic_lowest
	:	arithmetic_low
		( ( PLUS^ | MINUS^ ) arithmetic_low )*
	;

arithmetic_low
	:	arithmetic_medium
		( ( MULTI^ | DIV^ ) arithmetic_medium )*
	;

arithmetic_medium
	:	arithmetic_high
		( POWER^ arithmetic_high )?
	;

arithmetic_high
	:	arithmetic_highest ( PERCENT^ )?
	;

arithmetic_highest
	:	( MINUS^ )? atom
	;

atom
	:	function_call
	|	reference
	|	literal
        |       TEMPVAR
	|	LPAR! comparison RPAR!
	;

function_call
	:	FUNCTION^ LPAR! 
		( comparison ( SEMI! comparison )* )?
		RPAR!
	;

reference
	:	CELL_REF
		( ( COLON^ ) CELL_REF )?
	;

literal
	:	NUMBER
	|	STRING
	;
	
fragment LETTER: ('a'..'z'|'A'..'Z') ;
  
FUNCTION : 
	  ( LETTER )+ 
	;	
	 
 
CELL_REF
	:
		( ABS )? LETTER ( LETTER )?
		( ABS )? ( DIGIT )+
	;

/* String literals, i.e. anything inside the delimiters */

STRING	:	QUOT 
		(options {greedy=false;}:.)*
		QUOT  { setText(getText().substring(1, getText().length()-1)); }
	;  	

/*TEMPORARY VARIABLE*/

TEMPVAR :   VARSIMBLE LETTER+;

QUOT: '"' 
	;

/* Numeric literals */
NUMBER: ( DIGIT )+ ( COMMA ( DIGIT )+ )? ;

fragment 
DIGIT : '0'..'9' ;

/* Comparison operators */
EQ		: '=' ;
NEQ		: '<>' ;
LTEQ	: '<=' ;
GTEQ	: '>=' ;
GT		: '>' ;
LT		: '<' ;

/* Text operators */
AMP		: '&' ;

/* Arithmetic operators */
PLUS	: '+' ;
MINUS	: '-' ;
MULTI	: '*' ;
DIV		: '/' ;
POWER	: '^' ;
PERCENT : '%' ;

/* Reference operators */
fragment ABS : '$' ;
fragment EXCL:  '!'  ;
COLON	: ':' ;
VARSIMBLE : '@' ;

 
/* Miscellaneous operators */
COMMA	: ',' ;
SEMI	: ';' ;
LPAR	: '(' ;
RPAR	: ')' ;
LBRA    : '{' ;
RBRA    : '}' ; 


/* White-space (ignored) */
WS: ( ' '
	| '\r' '\n'
	| '\n'
	| '\t'
	) {$channel=HIDDEN;}
	;
	
/* Attribution*/
 ATT    : ':=' ;
package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones

%%
 
%public
%class Scanner
%char
%line
%column
%cup

%implements ScannerIF
%scanerror LexicalError

// incluir aqui, si es necesario otras directivas
%ignorecase
%notunix
%full
%state COMMENT

ALPHA								=	[A-Za-z]
DIGIT								=	[0-9]
SPACE								=	[\ \t\b\f\r\n]*
//COMMENT 							= 	--.*\r\n
COMMENT								=   --
NUMBER								= 	{DIGIT}+
STRING								=   [^\"]*
IDENTIFIER							=	{ALPHA} ({ALPHA} | {DIGIT} | "_" )*

%{
  LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
  private int commentCount = 0;
  
	Token createToken (int id){
		Token token = new Token (id);
    	token.setLine (yyline + 1);
    	token.setColumn (yycolumn + 1);
    	token.setLexema (yytext ());
    	return token;
   	}
  
%}  
  
%%

<YYINITIAL> 
{
   // incluir aqui el resto de las reglas patron - accion
           			       
  	//Palabras reservadas. Sección 2.1.4 documento especificación lenguaje HAda
// "and" --> No implementado por pertenecer a grupo A.  
//	"and"				{	return createToken (sym.AND);		}
	"array"				{	return createToken (sym.ARRAY);		}
	"begin"				{	return createToken (sym.BEGIN);		}
	"Boolean"			{	return createToken (sym.BOOLEAN);	}
	"constant"			{	return createToken (sym.CONSTANT);	}
	"else"				{	return createToken (sym.ELSE);		}
	"end"				{	return createToken (sym.END);		}
	"False"				{	return createToken (sym.FALSE);		}
	"for"				{	return createToken (sym.FOR);		}
	"function"			{	return createToken (sym.FUNCTION);	}
	"if"				{	return createToken (sym.IF);		}
	"in"				{	return createToken (sym.IN);		}
	"Integer"			{	return createToken (sym.INTEGER);	}
	"is"				{	return createToken (sym.IS);		}
	"loop"				{	return createToken (sym.LOOP);		}
	"of"				{	return createToken (sym.OF);		}
	"or"				{	return createToken (sym.OR);		}
// 	"out" No implementado por pertenecer a grupo A.
//	"out"				{	return createToken (sym.OUT);		}
	"procedure"			{	return createToken (sym.PROCEDURE);	}
	"Put_line"			{	return createToken (sym.PUTLINE);	}
	"record"			{	return createToken (sym.RECORD);	}
	"return"			{	return createToken (sym.RETURN);	}
	"then"				{	return createToken (sym.THEN);		}
	"True"				{	return createToken (sym.TRUE);		}
	"type"				{	return createToken (sym.TYPE);		}
// "while" --> No implementado por pertenecer a grupo A. 
//	"while"				{	return createToken (sym.WHILE);		}
	
	//Delimitadores. Sección 2.1.5 documento especificación lenguaje HAda
	
	"\\"					{	return createToken (sym.BACKSLASH);		}
	"("						{	return createToken (sym.LEFTBRACKET);		}
	")"						{	return createToken (sym.RIGHTBRACKET);		}
	".."					{	return createToken (sym.DOUBLEPOINT);		}
	","						{	return createToken (sym.COMMA);		}
	";"						{	return createToken (sym.SEMICOLON);		}
	":"						{	return createToken (sym.COLON);		}
		                         
	//Operadores. Sección 2.1.6 documento especificación lenguaje HAda
	"+"					{	return createToken (sym.PLUS);			}
// "-" --> No implementado por pertenecer a grupo A. 
//	"-"					{	return createToken (sym.MINUS);			}
// "<" --> No implementado por pertenecer a grupo A.
//	"<"					{	return createToken (sym.LESSTHAN);		}
	">"					{	return createToken (sym.GREATTHAN);		}
	"="					{	return createToken (sym.EQUAL);			}
// 	"/=" --> No implementado por pertenecer a grupo A.
//	"/="				{	return createToken (sym.NOTEQUAL);		}
	":="				{	return createToken (sym.ASSIGN);		}
	"."					{	return createToken (sym.ACCESS);		}
                               
 
 
    \"{STRING}\"					{	return createToken (sym.STRING);}   
    {IDENTIFIER}					{	return createToken (sym.IDENTIFIER);	}
    {NUMBER}						{	return createToken (sym.NUMBER);	}
 
    {COMMENT}						{ 	yybegin(COMMENT);				}
    {SPACE}							{	/*ignore*/ }
    
    
    // error en caso de coincidir con ningún patrón
	[^]     
                        {                                               
                           LexicalError error = new LexicalError ();
                           error.setLine (yyline + 1);
                           error.setColumn (yycolumn + 1);
                           error.setLexema (yytext ());
                           lexicalErrorManager.lexicalError (error);
                        }
    
}


	//Estado de JFlex para los comentarios. Según indica la práctica, el procesamiento de los comentarios no debe generar Tokens que se comuniquen
	//a fases posteriores del compilador
<COMMENT>
{
		
	.*\r\n				{	LexicalError error = new LexicalError();
							error.setLine (yyline + 2);
							error.setColumn (yycolumn - 1);
							error.setLexema (yytext());
							lexicalErrorManager.lexicalDebug("DEBUG - Comment, line = " + yyline + " , column = " + yycolumn + " Text=\"--" + yytext().substring(0,yytext().length() - 2)+ "\"");
							yybegin(YYINITIAL);
					}
		
	// Cualquier otro patrón
	[^]					{	}							
}
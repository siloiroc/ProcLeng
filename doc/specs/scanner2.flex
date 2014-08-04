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

%{
  LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
  private int commentCount = 0;
  
  Token createToken (int id) {
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
           			       
    "+"                	{	return createToken (PLUS);	}
    "-"           		{   return createToken (MINUS);	}
    
	"procedure"			{	return createToken (PROCEDURE); }                    
    "Integer"			{	return createToken (INTEGER);	}
    "begin"				{	return createToken (BEGIN);		}
    "end"				{	return createToken (END);		}
	"function"			{	return createToken (FUNCTION);	}
	"return"			{	return createToken (RETURN);	} 					
	"is"				{	return createToken (IS);		}
    					    					
	"--"				{ 	yybegin (COMMENT);
						}    					    					
	
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


<COMMENT>
{	
	"--"				{
							
						}
	[^]					{
						}						

}
                         



package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorEnd extends Translator {

	public TranslatorEnd() {
		super();
	}

	@Override
	public String translate(QuadrupleIF quadruple) {
		//Instrucci�n ENS2001: HALT -> Detiene la ejecuci�n de la m�quina
				//Formato:  HALT 
				//Comportamiento: Activa el biestable H de fin de programa y detiene el procesador virtual
		
		StringBuffer b = new StringBuffer();
		b.append("HALT	;Detenci�n de la ejecuci�n de la m�quina");
		
		return null;
	}

}

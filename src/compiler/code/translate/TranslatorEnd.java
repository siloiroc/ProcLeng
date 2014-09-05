package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorEnd extends Translator {

	public TranslatorEnd() {
		super();
	}

	@Override
	public String translate(QuadrupleIF quadruple) {
		//Instrucción ENS2001: HALT -> Detiene la ejecución de la máquina
				//Formato:  HALT 
				//Comportamiento: Activa el biestable H de fin de programa y detiene el procesador virtual
		
		StringBuffer b = new StringBuffer();
		b.append("HALT	;Detención de la ejecución de la máquina");
		
		return null;
	}

}

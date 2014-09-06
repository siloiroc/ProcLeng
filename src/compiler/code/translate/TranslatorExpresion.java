package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorExpresion extends Translator {

	public TranslatorExpresion() {
		super();
	}

	@Override
	public String translate(QuadrupleIF quadruple) {
		//Instrucción ENS2001: WRINT -> Escribe un entero
		//Formato:  WRINT op1 (op1 puede ser: inmediato, registro, memoria, indirecto, relativo)
		//Comportamiento: Escribe en la consola el valor del operando 1. El formato de escritura (decimal o hexadecimal)
		// 					dependerá de la configuración de visualización de números enteros. En cualquier caso,
		//					el formato decimal siempre se escribe con signo (-32768 a 32767);
			
		StringBuffer b = new StringBuffer();
		String strResult = quadruple.getResult().toString();
		b.append("WRINT " +  strResult + "\t\t\t;Instruccion Put_Line(expresión)");
		
		return b.toString();
	}

}

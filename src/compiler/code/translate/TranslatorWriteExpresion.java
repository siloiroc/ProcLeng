package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorWriteExpresion extends Translator {

	public TranslatorWriteExpresion() {
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
		String strResult = translate(quadruple.getResult()); 
		b.append("WRINT " +  strResult + "\t\t\t\t;Instruccion Put_Line(expresión)\n");
		b.append("WRCHAR #10\nWRCHAR #13");
		return b.toString();
	}

}
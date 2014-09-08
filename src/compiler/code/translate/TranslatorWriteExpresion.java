package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorWriteExpresion extends Translator {

	public TranslatorWriteExpresion() {
		super();
	}

	@Override
	public String translate(QuadrupleIF quadruple) {
		//Instrucci�n ENS2001: WRINT -> Escribe un entero
		//Formato:  WRINT op1 (op1 puede ser: inmediato, registro, memoria, indirecto, relativo)
		//Comportamiento: Escribe en la consola el valor del operando 1. El formato de escritura (decimal o hexadecimal)
		// 					depender� de la configuraci�n de visualizaci�n de n�meros enteros. En cualquier caso,
		//					el formato decimal siempre se escribe con signo (-32768 a 32767);
			
		StringBuffer b = new StringBuffer();
		String strResult = translate(quadruple.getResult()); 
		b.append("\t\t\t\tWRINT " +  strResult + "\t\t\t\t;Instruccion Put_Line(expresi�n)\n");
		b.append("\t\t\t\tWRCHAR #10\n\t\t\t\tWRCHAR #13");
		return b.toString();
	}

}
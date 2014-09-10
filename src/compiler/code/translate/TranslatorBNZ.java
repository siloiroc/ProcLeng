package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorBNZ extends Translator {

	
	@Override
	public String translate(QuadrupleIF quadruple) {
		//BNZ : Bifurcación si resultado distinto de cero (Branch Not Zero)
		//Formato: BN op1 
		//Comportamiento: Si el biestable Z está inactivo (Z=0), carga el contador de programa (PC) con el valor contenido del operando 1)
		StringBuffer b = new StringBuffer();
		String strResult = translate(quadruple.getResult());
				
		b.append("\t\t\t\tBNZ /" +  strResult + "\t\t\t\t; Si la comparacion no es igual, salta a " + strResult);
		return b.toString();
	}

}

package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorBZ extends Translator {

	@Override
	public String translate(QuadrupleIF quadruple) {
		//BZ : Bifurcación si resultado distinto de cero (BranchZero)
		//Formato: BZ op1 
		//Comportamiento: Si el biestable Z está activo (Z=1), carga el contador de programa (PC) con el valor contenido del operando 1)
		StringBuffer b = new StringBuffer();
		String strResult = translate(quadruple.getResult());
				
		b.append("\t\t\t\tBZ /" +  strResult + "\t\t\t\t; Si la comparacion es Igual, salta a " + strResult);
		return b.toString();
	}

}

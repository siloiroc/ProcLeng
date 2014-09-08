package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorBZ extends Translator {

	@Override
	public String translate(QuadrupleIF quadruple) {
		//BZ : Bifurcaci�n si resultado distinto de cero (BranchZero)
		//Formato: BZ op1 
		//Comportamiento: Si el biestable Z est� activo (Z=1), carga el contador de programa (PC) con el valor contenido del operando 1)
		StringBuffer b = new StringBuffer();
		System.out.println("El result en BZ es = " + quadruple.getResult());
		String strResult = translate(quadruple.getResult());
		System.out.println("El result en BZ es = " +strResult); 
		
				
		b.append("\t\t\t\tBZ /" +  strResult + "\t\t\t\t; Si la comparacion es Igual, salta a " + strResult);
		return b.toString();
	}

}

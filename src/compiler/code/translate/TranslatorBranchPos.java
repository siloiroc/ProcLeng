package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorBranchPos extends Translator {


	@Override
	public String translate(QuadrupleIF quadruple) {
		//Quadrupla --> ("BP", temporalExpr, labelTrue);
		StringBuffer b = new StringBuffer();	
		String strResult = translate(quadruple.getResult());
		String strOperand1 = translate(quadruple.getFirstOperand());
					
		b.append("\t\t\t\tCMP #1, " + strResult + "\n"); 		//Comparamos el valor del temporal que nos llega de la cuádrupla (será un temporal) con 1, para ver si son iguales	
		b.append("\t\t\t\tBZ /" + strOperand1);			//Si es 0 (registro Z=1), debemos saltar a la etiqueta indicada por el operando1 (etiqueta de True)
		return b.toString();
	}

}

package compiler.code.translate;

import compiler.intermediate.Label;
import compiler.intermediate.Temporal;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorBranchPos extends Translator {


	@Override
	public String translate(QuadrupleIF quadruple) {
		//Quadrupla --> ("BP", temporalExpr, labelTrue);
		StringBuffer b = new StringBuffer();	
		OperandIF operandResult = quadruple.getResult();
		String strResult = translate(quadruple.getResult());
		if (operandResult instanceof Label){
			
			b.append("\t\t\t\tBP /" + strResult);
		}
		else if (operandResult instanceof Temporal){
			
			String strOperand1 = translate(quadruple.getFirstOperand());
						
			b.append("\t\t\t\tCMP #1, " + strResult + "\n"); 		//Comparamos el valor del temporal que nos llega de la cuádrupla (será un temporal) con 1, para ver si son iguales	
			b.append("\t\t\t\tBZ /" + strOperand1);					//Si es 0 (registro Z=1), debemos saltar a la etiqueta indicada por el operando1 (etiqueta de True)
		}
		return b.toString();		
		
		
	}

}

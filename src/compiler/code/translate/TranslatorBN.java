package compiler.code.translate;

import compiler.intermediate.Label;
import compiler.intermediate.Temporal;

import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorBN extends Translator {


	@Override
	public String translate(QuadrupleIF quadruple) {
		//Quadrupla --> ("BN", temporalExpr, labelTrue);
		StringBuffer b = new StringBuffer();	
		OperandIF operandResult = quadruple.getResult();
		String strResult = translate(quadruple.getResult());
		
		b.append("\t\t\t\tBN /" + strResult);

		return b.toString();		
		
	}

}

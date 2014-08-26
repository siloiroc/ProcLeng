package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorAssign extends Translator {

	public TranslatorAssign() {
		super();
	}

	@Override
	public String translate(QuadrupleIF quadruple) {
		//ASSIGN expresion := valor
		StringBuffer b = new StringBuffer();
		OperandIF operand1 = quadruple.getFirstOperand();
		String strOper1 = translate(operand1);
		
		OperandIF result = quadruple.getResult();
		String strResult = translate(result);
		
		b.append("MOVE " +  strOper1 + ", " + strResult + " ;Instruccion Assign");
		
		return b.toString();
	}

}

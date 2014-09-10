package compiler.code.translate;

import compiler.intermediate.Value;
import compiler.intermediate.Variable;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorAssign extends Translator {

	public TranslatorAssign() {
		super();
	}

	@Override
	public String translate(QuadrupleIF quadruple) {
		//ASSIGN expresion := valor
		Variable var = (Variable)quadruple.getResult();
		System.out.println("*******************TranslateAssign, la variable es=" + var.getName() + ", con address=" + var.getAddress());
		System.out.println(var.getClass());
		
		
		StringBuffer b = new StringBuffer();
		OperandIF operand1 = quadruple.getFirstOperand();
		String strOper1 = translate(operand1);
		
		OperandIF result = quadruple.getResult();
		String strResult = translate(result);
		
		b.append("\t\t\t\tMOVE " +  strOper1 + ", " + strResult + "\t\t\t;Instruccion Assign");
		
		return b.toString();
	}

}

package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorMUL extends Translator {

	
	@Override
	public String translate(QuadrupleIF quadruple) {
		//MUL: Producto de números enteros
		//MUL op1, op2
		//Multiplica el contenido del operando 1 y el operando 2, y almacena
		//el resultado en el registro acumulador. Modifica los biestables de estado.
		StringBuffer b = new StringBuffer();
		
		String strOper1  = translate(quadruple.getFirstOperand());
		String strOper2  = translate(quadruple.getSecondOperand());
		String strResult = translate(quadruple.getResult());		
		
		
		b.append("\t\t\t\tMUL " + strOper1 + ", " + strOper2 + "\n");
		b.append("\t\t\t\tMOVE .A, " + strResult);

		return b.toString();
	}

}

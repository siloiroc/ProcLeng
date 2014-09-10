package compiler.code.translate;

import compiler.intermediate.Variable;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorMove extends Translator {

	public TranslatorMove() {
		super();
	}

	@Override
	public String translate(QuadrupleIF quadruple) {
		//MOVE : Copiar operando origen en operando destino
		//Formato: MOVE op1, op2
		//Lee el contenido del operando 1 (origen) y lo escribe en el operando 2 (destino).
		StringBuffer b = new StringBuffer();
		
		String strOper1  = translate(quadruple.getFirstOperand());
		String strResult = translate(quadruple.getResult());
			
		b.append("\t\t\t\tMOVE " +  strOper1 + ", " + strResult + "\t\t\t;Instruccion Move");
		return b.toString();
	}
}

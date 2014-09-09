package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorAdd extends Translator {

	public TranslatorAdd() {
		super();
	}

	@Override
	public String translate(QuadrupleIF quadruple) {
		StringBuffer b = new StringBuffer();
		
		String strOper1  = translate(quadruple.getFirstOperand());
		String strOper2  = translate(quadruple.getSecondOperand());
		String strResult = translate(quadruple.getResult());		
		b.append("\t\t\t\tADD " + strOper1 + ", " + strOper2 + "\n");
		b.append("\t\t\t\tMOVE .A, " + strResult);

		return b.toString();
	}
}

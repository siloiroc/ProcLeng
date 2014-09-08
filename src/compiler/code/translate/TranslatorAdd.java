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
		b.append("ADD " + strOper1 + ", " + strOper2 + "\n");
		b.append("MOVE .A, " + strResult);

		return b.toString();
	}
}

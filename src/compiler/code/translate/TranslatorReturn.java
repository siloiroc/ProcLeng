package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorReturn extends Translator {

	
	@Override
	public String translate(QuadrupleIF quadruple) {	
		StringBuffer b = new StringBuffer();	
		String strResult = translate(quadruple.getResult());
		
		b.append("\t\t\t\tMOVE #1[.IX], " + strResult);

		return b.toString();		
	}

}

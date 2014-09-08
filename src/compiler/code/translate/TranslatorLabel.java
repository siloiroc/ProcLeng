package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorLabel extends Translator {


	@Override
	public String translate(QuadrupleIF quadruple) {
		StringBuffer b = new StringBuffer();	
		String strResult = translate(quadruple.getResult());
					
		b.append(strResult + ":");
		return b.toString();
	}	
}

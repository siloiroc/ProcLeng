package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorRET extends Translator {


	@Override
	public String translate(QuadrupleIF quadruple) {
		StringBuffer b = new StringBuffer();
		b.append("\t\t\t\tRET");
		return b.toString();
	}

}

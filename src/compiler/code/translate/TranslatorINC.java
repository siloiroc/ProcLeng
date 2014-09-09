package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorINC extends Translator {


	@Override
	public String translate(QuadrupleIF quadruple) {
		//INC : Incremento unitario
		//Formato: INC op1 
		//Comportamiento: Incrementa el contenido del operando en una unidad. Modifica los biestables de estado.
				
		StringBuffer b = new StringBuffer();
		String strResult = translate(quadruple.getResult());
		
				
		b.append("\t\t\t\tINC " +  strResult + "\t\t\t\t; Incremento de " + strResult);
		return b.toString();
	}

}

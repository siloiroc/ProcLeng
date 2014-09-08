package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorCMP extends Translator {

	@Override
	public String translate(QuadrupleIF quadruple) {
		//CMP : Comparación
		//Formato: CMP op1, op2
		//Resta el contenido del operando 1 y el operando 2 (pero no almacena el resultado de la operación en ningún sitio).Modifica los biestables de estado.
		StringBuffer b = new StringBuffer();	
		String strOper1  = translate(quadruple.getFirstOperand());
		String strResult = translate(quadruple.getResult());
			
		b.append("\t\t\t\tCMP " +  strResult + ", " + strOper1 + "\t\t;Instruccion CMP");
		return b.toString();

	}

}

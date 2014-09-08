package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorBranch extends Translator {


	@Override
	public String translate(QuadrupleIF quadruple) {
		//BR : Bifurcación incondicional
		//Formato: BR op1 
		//Comportamiento: Carga el CP con el valor contenido del operando 1
		StringBuffer b = new StringBuffer();	
		String strResult = translate(quadruple.getResult());
					
		b.append("\t\t\t\tBR /" +  strResult + "\t\t\t\t;Instruccion BR, salto incondicional");
		return b.toString();
	}

}

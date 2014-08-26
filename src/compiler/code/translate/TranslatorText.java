package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorText extends Translator {

	public TranslatorText() {
		super();
	}

	@Override
	public String translate(QuadrupleIF quadruple) {
	 	String operation = quadruple.getOperation();
	 	StringBuffer b = new StringBuffer();
	 	if(operation.equals("INICIO"))
	 		b.append("; Inicio del programa");
	 	else if (operation.equals("FIN"))
	 		b.append("; Fin del programa");
	 	else if (operation.equals("DATA"))
	 	{	
	 		b.append("; Definición conjunto de datos en memoria\n");
	 		b.append(DataLabels.getDataLabels());
	 		
	 		String str = "\"hola\"";
			str = str.substring(1, str.length()-1);
			
	 		
	 	}
	 		

	 	return b.toString();
	}
}

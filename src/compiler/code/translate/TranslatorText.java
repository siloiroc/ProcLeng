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
//	 	if(operation.equals("INICIO")){
//	 		b.append("; Inicio del programa");
//	 	}
//	 	else 
	 		if (operation.equals("FIN")){
	 		//Instrucción ENS2001: HALT -> Detiene la ejecución de la máquina
			//Formato:  HALT 
			//Comportamiento: Activa el biestable H de fin de programa y detiene el procesador virtual
	 		b.append("\t\t\t\tHALT ; Fin del programa");
	 	}
	 		
	 	else if (operation.equals("DATA"))
	 	{	
	 		if (DataLabels.getSize() !=0){
	 			//Si existen etiquetas de datos (Cadenas) a mostrar, generamos las etiquetas
//		 		b.append("; Definición conjunto de datos en memoria\n");
		 		b.append("; Cadenas de texto\n");
		 		b.append(DataLabels.getDataLabels());	 			
	 		}
	 		
	 		//Marcamos final completo del código con pseudoinstrucción END
	 		//Ens2001: Macroinstrucción END
	 		//Marca el final del código. Después de la macroinstrucción END, el ensamblador da
	 		//por finalizado el proceso de traducción, ignorando cualquier instrucción posterior.
	 		b.append("END ;Macroinstrucción END. Ensamblador da por finalizado el código.");

	 	}
	 		

	 	return b.toString();
	}
}

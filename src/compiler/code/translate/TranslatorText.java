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
	 		//Instrucci�n ENS2001: HALT -> Detiene la ejecuci�n de la m�quina
			//Formato:  HALT 
			//Comportamiento: Activa el biestable H de fin de programa y detiene el procesador virtual
	 		b.append("\t\t\t\tHALT ; Fin del programa");
	 	}
	 		
	 	else if (operation.equals("DATA"))
	 	{	
	 		if (DataLabels.getSize() !=0){
	 			//Si existen etiquetas de datos (Cadenas) a mostrar, generamos las etiquetas
//		 		b.append("; Definici�n conjunto de datos en memoria\n");
		 		b.append("; Cadenas de texto\n");
		 		b.append(DataLabels.getDataLabels());	 			
	 		}
	 		
	 		//Marcamos final completo del c�digo con pseudoinstrucci�n END
	 		//Ens2001: Macroinstrucci�n END
	 		//Marca el final del c�digo. Despu�s de la macroinstrucci�n END, el ensamblador da
	 		//por finalizado el proceso de traducci�n, ignorando cualquier instrucci�n posterior.
	 		b.append("END ;Macroinstrucci�n END. Ensamblador da por finalizado el c�digo.");

	 	}
	 		

	 	return b.toString();
	}
}

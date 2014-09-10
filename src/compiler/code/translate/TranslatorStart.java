package compiler.code.translate;

import compiler.CompilerContext;
import compiler.intermediate.Value;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorStart extends Translator {

	public final int STACKADDRESS = 65535;	
		// La pila del programa comenzar� en la posici�n de memoria m�s alta 65535 y crece de forma ascendente, 
		// es decir crece hacia posiciones m�s bajas (en direcciones) de la memoria: 65535,65534,65533, etc... 

	public TranslatorStart() {
		super();
	}

	// El c�digo del programa y la memoria para las variables globales comienza en la posici�n 0 de memoria 
	// y va creciendo hasta 65000
	
	@Override
	public String translate(QuadrupleIF quadruple) {
		//Cuadrupla("INICIO", new Value(gAddress), scopeSizes.get(0));
		// OP = INICIO, 
		// Result=valor de la direcci�n de memoria siguiente a la �ltima variable global reservada
		// FirstOperand = tama�o del �mbito (variables y temporales)

	 	StringBuffer b = new StringBuffer();
	 	Value reservaMemGlobal = (Value) quadruple.getResult();
	 	Value tamScope = (Value) quadruple.getFirstOperand();
	 	int tamRA = (int) tamScope.getValue();
	 	
	 	b.append("; Inicio del programa\n");
	 	b.append("\t\t\t\tRES " +  reservaMemGlobal + "\n");		//Reservamos espacio en la memoria para las variables globales
	 	b.append("\t\t\t\tMOVE #" + (STACKADDRESS - tamRA) + ", .SP\n");			//Colocamos el puntero de Pila en la cima de la memoria (Necesario??? Parece que el simulador de ENS2001 ya lo hace)
	 	b.append("\t\t\t\tMOVE #" + (STACKADDRESS - tamRA) + ", .IX" );		//Apuntamos el registro IX al Registro de activaci�n del procedimiento principal   
		return b.toString(); 
	}

}

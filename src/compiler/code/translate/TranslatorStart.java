package compiler.code.translate;

import compiler.CompilerContext;
import compiler.intermediate.Value;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorStart extends Translator {

	public final int STACKADDRESS = 65535;	
		// La pila del programa comenzará en la posición de memoria más alta 65535 y crece de forma ascendente, 
		// es decir crece hacia posiciones más bajas (en direcciones) de la memoria: 65535,65534,65533, etc... 

	public TranslatorStart() {
		super();
	}

	// El código del programa y la memoria para las variables globales comienza en la posición 0 de memoria 
	// y va creciendo hasta 65000
	
	@Override
	public String translate(QuadrupleIF quadruple) {
		//Cuadrupla("INICIO", new Value(gAddress), scopeSizes.get(0));
		// OP = INICIO, 
		// Result=valor de la dirección de memoria siguiente a la última variable global reservada
		// FirstOperand = tamaño del ámbito (variables y temporales)
	 	CompilerContext.getSemanticErrorManager().semanticDebug("quadrupla Start, operacion=" + quadruple.getOperation() + ", result=" + quadruple.getResult() +
 				", first=" + quadruple.getFirstOperand());
		
		
	 	StringBuffer b = new StringBuffer();
	 	Value reservaMemGlobal = (Value) quadruple.getResult();
	 	Value tamScope = (Value) quadruple.getFirstOperand();
	 	int tamRA = (int) tamScope.getValue();

	 	
	 	CompilerContext.getSemanticErrorManager().semanticDebug("Tamaño de RA en translate Start=" + tamRA); 

	 	
	 	b.append("; Inicio del programa\n");
	 	b.append("RES " +  reservaMemGlobal + "\n");		//Reservamos espacio en la memoria para las variables globales
//	 	b.append("ORG #" +  reservaMemGlobal);	//Ensamblamos el código a partir de la dirección de memoria siguiente al espacio reservado para las variables globales
	 	b.append("MOVE #" + (STACKADDRESS - tamRA) + ", .SP\n");			//Colocamos el puntero de Pila en la cima de la memoria (Necesario??? Parece que el simulador de ENS2001 ya lo hace)
	 	b.append("MOVE #" + (STACKADDRESS - tamRA) + ", .IX" );		//Apuntamos el registro IX al Registro de activación del procedimiento principal   
		return b.toString(); 
	}

}

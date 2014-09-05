package compiler.code.translate;

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
	 	StringBuffer b = new StringBuffer();
	 	Value reservaMemGlobal = (Value) quadruple.getResult();
//	 	System.out.println("Valores en cuadrupla Inicio - Operando=" + quadruple.getOperation() + " , result=" + quadruple.getResult()
//	 			+ ", firstOperand=" + quadruple.getFirstOperand() + ", secondOperand=" + quadruple.getSecondOperand());
	 	
	 	b.append("; Inicio del programa\n");
	 	b.append("RES " +  reservaMemGlobal + "\n");		//Reservamos espacio en la memoria para las variables globales
//	 	b.append("ORG #" +  reservaMemGlobal);	//Ensamblamos el c�digo a partir de la direcci�n de memoria siguiente al espacio reservado para las variables globales
	 	b.append("MOVE #65535, .SP\n");		//Colocamos el puntero de Pila en la cima de la memoria (Necesario??? Parece que el simulador de ENS2001 ya lo hace
	 	
		return b.toString(); 
	}

}

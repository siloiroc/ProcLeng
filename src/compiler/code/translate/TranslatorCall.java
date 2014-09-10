package compiler.code.translate;

import compiler.intermediate.Procedure;

import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;



public class TranslatorCall extends Translator {
//    public static final String RA_VINCULOCONTROL   = "#-3[.IX]";
//	public static final String RA_VINCULOACCESO    = "#-2[.IX]";
//	public static final String RA_DIRECCIONRETORNO = "#-1[.IX]";
//	public static final String RA_VALORRETORNO     = "#0[.IX]";

	@Override
	public String translate(QuadrupleIF quadruple) {
		//Quadruple("CALL", proc);
	
		OperandIF subPrograma = quadruple.getResult();
		//OperandIF tamScope = quadruple.getFirstOperand();
		int memVarsTempsLocal=0;
		
//		if (tamScope instanceof Value){
//			Value tamMemoryVarsTempsLocal = (Value)tamScope;
//			memVarsTempsLocal = (int)tamMemoryVarsTempsLocal.getValue(); 
//		}
			
		Procedure subProc = (Procedure)subPrograma;
		
		//ScopeIF scopeSubProg = subProc.getScope();
		//int tamParameters = subProc.getParametersSize();
		
		
		 
		StringBuffer b = new StringBuffer();
	
		//Registro Activación
		// - Valor de retorno	- para el valor retornado por las funciones
		// - Dirección de retorno 
		// - Parámetros
		// - Vínculo de control
		// - Vínculo de acceso
		// - Variables locales
		// - Variables temporales
	
		b.append("\t\t\t\t; Registro de Activación - RA \n");	
		//b.append("MOVE .SP, .IY \n"); 		//Movemos el puntero de Pila al registro .IY (que usaremos como Vínculo de control)
		//b.append("MOVE .IY, .IX");			//El FramePointe (FP) (.IX) apunta al registro de activación actual
		//b.append("MOVE .SP, .IX");							//El FramePointer (FP) (.IX) apunta al registro de activación actual
		//b.append("SUB .IX, #" + memVarsTempsLocal);		//Movemos el puntero de Pila a la dirección del puntero  
		//b.append("MOVE .A, .SP");							//a la activación actual (FP) - el tamaño de variables y temporales.
		b.append("\t\t\t\tCALL /" + subProc.getCodeLabel() + "\n"); 		//LLamada al subprograma	
															//ENS 2001 almacena en la pila el valor del contador de programa y salta a la dirección de destino indicada por el operando 1.
		
		b.append("\t\t\t\t; Fin Registro Activación - RA");
		//b.append("ADD .SP, #" + memVarsTempsLocal);		//Movemos el puntero de pila a la dirección del RA del padre	
		//b.append("MOVE .A, .SP");		//El resultado va al SP
		//b.append("MOVE .SP, .IX");
		//b.append("\t\t\t\tRET");
		
		
		
		return b.toString();
	
		
		
		
		
	}
}
		
		

//					
//			getTranslation().append(";--Creacion RA--" + SALTO_LINEA);
//			//getTranslation().append("MOVE .IX, #" + scopeCount + "[.R0]	;1- Mover puntero de marco(IX) a Display[" + scopeCount + "]" + SALTO_LINEA);
//			this.createInstruction("MOVE .SP,.IY", "posiciono el puntero IY en la primera posicion libre de la pila");
//			//Avanzo el puntero una posición paara dejar espacio para el valor de retorno.
//			//Los parametros ya están insertados mediante instruciones PUSH, por lo cual el puntero de pila ya
//			// ha avanzado el nº de parámetros.
//			this.createInstruction("SUB .IY, #" + 1, 
//					"avanzo el puntero IY con - 1 espacio del valor de retorno(sentido decreciente)");
//			this.createInstruction("MOVE .A,.IY", "ahora IY apunta a la posición que va a contener vinculo de control del RA");
//			this.createInstruction("MOVE .IX,[.R0]", "Se guarda la direccion del RA anterior en el display");
//			this.createInstruction("INC .R0", "incremento el display a la siguiente posición libre");
//			this.createInstruction("MOVE .IY,.IX", "Ahora el puntero de marco (FP) apunta al RA actual");
//			this.createInstruction("SUB .IX, #" + (espacioVaryTemp + 2), "Muevo el putero de pila a la primera posición libre, contando las variables y temporales.");
//			this.createInstruction("MOVE .A,.SP");
//			this.createInstruction("CALL /" + sub.getCodeLabel(), "Salto al código del procedimiento, agregando la direccion de retorno al RA");
//			getTranslation().append(";--Fin Creacion RA--" + SALTO_LINEA);
//			//Espacio del RA: tamaño parámetros (size)
//			// +1 (valor de retorno)
//			// +1 (vínculo de control)
//			// tamaño de variables y temporales (espacioVaryTemp)
//			// El RA también contiene la dirección de retorno en la posición mas baja del registro
//			// de activación, pero al devolver la llamada (instrucción RET) se hace POP del puntero de pila
//			// y se adelanta el puntero .SP una posición, por lo que ahora no hay que sumarla.
//			this.createInstruction("ADD .SP, #" + (size + espacioVaryTemp + 2), "Devuelvo el puntero de pila a la dirección inicial del RA padre");
//			this.createInstruction("MOVE .A,.SP");
//			this.createInstruction("DEC .R0", "decremento el display para que apunte al ambito padre ");
//			this.createInstruction("MOVE [.R0],.IX");
//	}



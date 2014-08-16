package compiler.semantic.util;

import compiler.CompilerContext;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolTableIF;
import es.uned.lsi.compiler.semantic.type.TypeTableIF;



public class Util {

	public Util() {
	}	
		
	public static void debugTablesToString(ScopeIF scope){
		//Obtiene el �mbito actual y pinta (muestra debugs sem�nticos) el �mbito, la tabla de tipos y tabla de s�mbolos (to String de cada una).
		
		SymbolTableIF tablaSimbolos = scope.getSymbolTable();
		TypeTableIF tablaTipos = scope.getTypeTable();
		
		CompilerContext.getSemanticErrorManager().semanticDebug("**** Debug Scope & Tables ****");
		CompilerContext.getSemanticErrorManager().semanticDebug("ToString de �mbito: " + scope.toString());
		CompilerContext.getSemanticErrorManager().semanticDebug("ToString de Tabla de Simbolos " + tablaSimbolos.toString());
		CompilerContext.getSemanticErrorManager().semanticDebug("ToString de Tabla de Tipos " + tablaTipos.toString());
		CompilerContext.getSemanticErrorManager().semanticDebug("END **** Debug Scope & Tables ****");
	}
	

}

package compiler.semantic.util;

import compiler.CompilerContext;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;
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
	
	
	/**
	 * Verifica si existe un s�mbolo en la Tabla de S�mbolos del �mbito
	 * @param scope	�mbito en el que vamos a comprobar la tabla de s�mbolos
	 * @param symbol S�mbolo que vamos a verificar si existe en la tabla de s�mbolos del �mbito 
	 * @return
	 */
	public static boolean checkSymbolTableScope(ScopeIF scope, String name){
		//Obtenemos la tabla de s�mbolos del �mbito actual pasado como par�metro
		SymbolTableIF tablaSimbolos = scope.getSymbolTable();
		if(tablaSimbolos.containsSymbol(name))
			return true;
		else 
			return false;
	}
	
	public static void addToSymbolTable(ScopeIF scope, SymbolIF symbol){
		SymbolTableIF tablaSimbolos = scope.getSymbolTable();
		tablaSimbolos.addSymbol(symbol);
	}
	
	
}

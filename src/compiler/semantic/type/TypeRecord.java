package compiler.semantic.type;


import java.util.ArrayList;

import compiler.semantic.symbol.SymbolVariable;
import compiler.syntax.nonTerminal.BloqueCamposRegistro;
import compiler.syntax.nonTerminal.DeclaracionVariable;
import compiler.syntax.nonTerminal.ListaIdentificadores;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for TypeRecord.
 */

// TODO: Student work
//       Include properties to characterize records

public class TypeRecord extends TypeBase        
{   
	//private BloqueCamposRegistro bloqueCamposReg = new BloqueCamposRegistro();
	private ArrayList<SymbolVariable> listaCamposVar = new ArrayList<SymbolVariable>();
    /**
     * Constructor for TypeRecord.
     * @param scope The declaration scope.
     */
    public TypeRecord (ScopeIF scope)
    {
        super (scope);
    }

    /**
     * Constructor for TypeRecord.
     * @param scope The declaration scope.
     * @param name The name of the type.
     */
    public TypeRecord (ScopeIF scope, String name)
    {   
        super (scope, name);
    }
   
    /**
     * Constructor for TypeRecord.
     * @param record The record to copy.
     */
    public TypeRecord (TypeRecord record)
    {
        super (record.getScope (), record.getName ());
    } 
    
    public void addCampoRegistro(SymbolVariable symbolVar)
    {
    	this.listaCamposVar.add(symbolVar);
    }
    
    public boolean containsField(String field){
    	
    	boolean found = false;
    	for(int i=0; i < this.listaCamposVar.size(); i++)
    	{
    		if (this.listaCamposVar.get(i).getName().equals(field))
    			found = true;
    	}
    	return found;
    }
    
	public int getMemorySize(){
		return this.listaCamposVar.size();
//		int memSize = 0;
//		for(int i = 0; i< this.listaCamposVar.size(); i++){
//			memSize += this.listaCamposVar.get(i).getOffset();
//		}
//		return memSize;
	}    
	
	public TypeIF getTypeField(String field){
		TypeIF tipo = null;
		for(int i = 0; i< this.listaCamposVar.size(); i++){
			if (this.listaCamposVar.get(i).getName().equals(field))
				tipo = this.listaCamposVar.get(i).getType();
		}
		return tipo;

	}
	public int getOffset(String field){
		int offset = 0;
		for(int i = 0; i< this.listaCamposVar.size(); i++){
			if (this.listaCamposVar.get(i).getName().equals(field))
				offset = this.listaCamposVar.get(i).getOffset();
		}
		return offset;

	}

	
//    public TypeRecord (ScopeIF scope, String name, BloqueCamposRegistro bcr){
//    	super(scope, name);
//    	this.bloqueCamposReg = bcr;
//    }
//    
//	/**
//	 * @return the size
//	 */
//	public int getSize() {
//		return this.bloqueCamposReg.getSize();
//	}
//	
//	public int getMemorySize(){
//		return this.bloqueCamposReg.getMemorySize();
//	}


//
//	/**
//	 * @return the bloqueCampos
//	 */
//	public BloqueCamposRegistro getBloqueCampos() {
//		return bloqueCamposReg;
//	}
//
//	/**
//	 * @param bloquecampos the bloqueCampos to set
//	 */
//	public void setBloquecampos(BloqueCamposRegistro bloquecampos) {
//		this.bloqueCamposReg = bloquecampos;
//	}
    
    
    /**
     * Comprueba si un nombre es un campo de un registro
     * @param field
     * @return
     */
//    public boolean containsField(String field){
//    	
//    	return this.bloqueCamposReg.containsField(field);
//    }
    
//    public TypeIF getTypeField(String field){
//    	return this.getBloqueCampos().getTypeCampoRegistro(field);
//    }
    
//
//    public int getOffset(String campo){
//    	return this.bloqueCamposReg.getOffset(campo);
//    }
//    
//    public void addCampoRegistro(String nombreCampo, TypeIF tipoCampo){
//     	this.bloqueCamposReg.addCampoRegistro(new DeclaracionVariable (tipoCampo, new ListaIdentificadores(nombreCampo)));
//    }
}

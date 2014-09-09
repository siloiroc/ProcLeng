package compiler.semantic.type;


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
	private BloqueCamposRegistro bloqueCamposReg = new BloqueCamposRegistro();
	
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
    
    public TypeRecord (ScopeIF scope, String name, BloqueCamposRegistro bcr){
    	super(scope, name);
    	this.bloqueCamposReg = bcr;
    }
    
	/**
	 * @return the size
	 */
	public int getSize() {
		System.out.println("Estoy en TypeRecord y el bloqueCamposReg.getSize() ES = " + this.bloqueCamposReg.getSize());
		return this.bloqueCamposReg.getSize();
	}
	
	public int getMemorySize(){
		return this.bloqueCamposReg.getMemorySize();
	}



	/**
	 * @return the bloqueCampos
	 */
	public BloqueCamposRegistro getBloqueCampos() {
		return bloqueCamposReg;
	}

	/**
	 * @param bloquecampos the bloqueCampos to set
	 */
	public void setBloquecampos(BloqueCamposRegistro bloquecampos) {
		this.bloqueCamposReg = bloquecampos;
	}
    
    
    /**
     * Comprueba si un nombre es un campo de un registro
     * @param field
     * @return
     */
    public boolean containsField(String field){
//    	System.out.println("En Type Record, buscando contiene campo=" + field);
//    	System.out.println("Campos de bloqueCamposRegistro");
    	
    	return this.bloqueCamposReg.containsField(field);
    }
    
    public TypeIF getTypeField(String field){
    	return this.getBloqueCampos().getTypeCampoRegistro(field);
    }
    

    public int getOffset(String campo){
    	System.out.println("En typeRecord el offset del campo" + campo + " es=" + this.bloqueCamposReg.getOffset(campo));
    	return this.bloqueCamposReg.getOffset(campo);
    }
    
    public void addCampoRegistro(String nombreCampo, TypeIF tipoCampo){
     	this.bloqueCamposReg.addCampoRegistro(new DeclaracionVariable (tipoCampo, new ListaIdentificadores(nombreCampo)));
    }
}

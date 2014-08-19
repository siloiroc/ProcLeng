package compiler.semantic.type;


import compiler.syntax.nonTerminal.BloqueCamposRegistro;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

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
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize ()
    {
        // TODO: Student work
    	// Tamaño del tipo registro: Número de campos??? 
    	return this.bloqueCamposReg.getListaCamposRegistro().size();
    }
    
    
    /**
     * Comprueba si un nombre es un campo de un registro
     * @param field
     * @return
     */
    public boolean containsField(String field){
    	//System.out.println("En Type Record, buscando contiene campo" + field);
    	//System.out.println("Campos de bloqueCamposRegistro");
    	
    	return this.bloqueCamposReg.containsField(field);
    }


}

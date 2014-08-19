package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;
	
/**
 * Class for SymbolConstant.
 */

// TODO: Student work
//       Include properties to characterize constants

public class SymbolConstant
    extends SymbolBase
{
	private String value; //Atributo valor de constante
	
    /**
     * Constructor for SymbolConstant.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolConstant (ScopeIF scope,
                           String name,
                           TypeIF type)
    {
        super (scope, name, type);
    }

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	} 
}

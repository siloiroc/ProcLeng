package compiler.semantic.symbol;

import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolProcedure.
 */

// TODO: Student work
//       Include properties to characterize procedure calls

public class SymbolProcedure
    extends SymbolBase
{
	private ArrayList<SymbolParameter> lSymbolParameter = new ArrayList<SymbolParameter>();
	
    /**
     * Constructor for SymbolProcedure.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolProcedure (ScopeIF scope, 
                            String name,
                            TypeIF type)
    {
        super (scope, name, type);
    }
    
    /**
     * Constructor for SymbolProcedure.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolProcedure (ScopeIF scope, 
                            String name,
                            TypeIF type, ArrayList<SymbolParameter> lSymParam)
    {
        super (scope, name, type);
        this.lSymbolParameter = lSymParam;
    }
    
    public void addSymbolParameter(SymbolParameter sp){
    	this.lSymbolParameter.add(sp);
    }

	/**
	 * @return the lSymbolParameter
	 */
	public ArrayList<SymbolParameter> getlSymbolParameter() {
		return lSymbolParameter;
	}

	/**
	 * @param lSymbolParameter the lSymbolParameter to set
	 */
	public void setlSymbolParameter(ArrayList<SymbolParameter> lSymbolParameter) {
		this.lSymbolParameter = lSymbolParameter;
	} 
}

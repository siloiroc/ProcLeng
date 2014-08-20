package compiler.semantic.type;

import java.util.ArrayList;

import compiler.syntax.nonTerminal.ParametrosActuales;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for TypeProcedure.
 */

// TODO: Student work
//       Include properties to characterize procedure declarations

public class TypeProcedure extends TypeBase
{   
	
	private ArrayList<TypeIF> parameterTypes = new ArrayList<TypeIF>();
		
   /**
     * Constructor for TypeProcedure.
     * @param scope The declaration scope.
     */
    public TypeProcedure (ScopeIF scope)
    {
        super (scope);
    }

    /**
     * Constructor for TypeProcedure.
     * @param scope The declaration scope
     * @param name The name of the procedure.
     */
    public TypeProcedure (ScopeIF scope, String name)
    {
        super (scope, name);
    }
    
    public TypeProcedure (ScopeIF scope, String name, ArrayList<TypeIF> lParamTypes){
    	super(scope,name);
    	this.parameterTypes = lParamTypes;
    }
    
    public void addType(TypeIF type)
    {
    	this.parameterTypes.add(type);
    }
        
    
    /**
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize ()
    {
        // TODO: Student work
        //return 1;
    	return this.parameterTypes.size();
    }

	/**
	 * @return the parameterTypes
	 */
	public ArrayList<TypeIF> getParameterTypes() {
		return parameterTypes;
	}

	/**
	 * @param parameterTypes the parameterTypes to set
	 */
	public void setParameterTypes(ArrayList<TypeIF> parameterTypes) {
		this.parameterTypes = parameterTypes;
	}

	
	public boolean comparaTiposParametros(ParametrosActuales paramActuales){
		//Comparamos los parámetros (no comparamos scope, scope de parametros del subprograma tendrá nivel más alto, mientras que el scope de los parámetros actuales tendrá nivel más bajo) 
		boolean iguales = true;
		
		for(int i=0; i < this.parameterTypes.size(); i++)
		{
			if(!parameterTypes.get(i).getName().equals(paramActuales.getListaParamActuales().get(i).getType().getName()))
				iguales = false;
		}
		
		return iguales; 
	}


	
	
}

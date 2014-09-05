package compiler.intermediate;

import es.uned.lsi.compiler.intermediate.TemporalIF;
import es.uned.lsi.compiler.semantic.ScopeIF;

/**
 * Class for temporal variables within the intermediate code.
 */

public class Temporal
    implements TemporalIF 
{
    private String  name    = null;
    private ScopeIF scope   = null;
    private int     address = 0;
    private int 	size 	= 0;	//Tama�o del Temporal
           
    /**
     * Constructor for Temporal.
     * @param name The name.
     * @param scope The creation scope.
     */
    public Temporal (String name, 
                     ScopeIF scope)
    {
        super ();
        this.name = name;
        this.scope = scope;
        this.size = 1; 	// Inicializaci�n del tama�o del temporal. En ENS2001 todos los tipos simples pesan 1 palabra en memoria

    }
    
    
    /**
     * Constructor for Temporal.
     * @param name The name.
     * @param scope The creation scope.
     * @param address The address.
     */
    public Temporal (String name, 
                     ScopeIF scope,
                     int address)
    {
        this (name, scope);
        this.address = address;
    }

    /**
     * Returns the name.
     * @return Returns the name.
     */
    @Override
    public final String getName ()
    {
        return name;
    }

    /**
     * Returns the creation scope.
     * @return Returns a scope.
     */
    @Override
    public final ScopeIF getScope ()
    {
        return scope;
    }

    /**
     * Returns the address.
     * @return Returns the address.
     */
    @Override
    public final int getAddress ()
    {
        return address;
    }

    /**
     * Sets The address.
     * @param address The address to set.
     */
    @Override
    public final void setAddress (int address)
    {
        this.address = address;
    }

    /**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}


	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}


	/**
     * Compares this object with another one.
     * @param other the other object.
     * @return true if both objects has the same properties.
     */
    @Override
    public final boolean equals (Object other)
    {
        if (other == null) 
        {
            return false;
        }
        if (this == other)
        {
            return true;
        }
        if (!(other instanceof Variable))
        {
            return false;
        }
        
        final Temporal aTemporal = (Temporal) other;
        return ((scope == null) ? (aTemporal.scope == null) : (aTemporal.scope.equals (scope))) && 
               ((name  == null) ? (aTemporal.name  == null) : (aTemporal.name.equals (name)));
    }

    /**
     * Returns a hash code for the object.
     */
    @Override
    public final int hashCode ()
    {
        return 31 * scope.hashCode() +
                  ((name == null)? 0 : name.hashCode ());
    } 

    /**
     * Return a string representing the object.
     * @return a string representing the object.
     */
    @Override
    public final String toString ()
    {        
        return name;
    }
}

package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ExpresionLogica extends Expresion {
	
	private TypeIF type;
	private boolean value; 	//Atributo valor booleano, de la Expresión Lógica
	
	public ExpresionLogica() {
		super();
	}
	
	public ExpresionLogica(Expresion e1, Expresion e2, TypeIF type)
	{
		super();
		this.type = type;
	}

	public ExpresionLogica(TypeIF type)
	{
		super();
		this.type = type;
	}
	/**
	 * @return the value
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(boolean value) {
		this.value = value;
	}

	/**
	 * @return the type
	 */
	public TypeIF getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(TypeIF type) {
		this.type = type;
	}

	
}

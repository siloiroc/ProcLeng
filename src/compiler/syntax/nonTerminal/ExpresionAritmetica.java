package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ExpresionAritmetica extends Expresion {

	private TypeIF type;
	private int value; 
	
	public ExpresionAritmetica() {
		super();
	}

	public ExpresionAritmetica(Expresion e1, Expresion e2, TypeIF type){
		super();
		this.type = type;
	}
	
	public ExpresionAritmetica(TypeIF type, int value)
	{
		super();
		this.type = type;
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

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
}

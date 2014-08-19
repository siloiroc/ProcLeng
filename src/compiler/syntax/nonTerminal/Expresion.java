package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Expresion extends NonTerminal {

	private TypeIF type;
	private int value;
	
	public Expresion() {
		super();
	}
	
	public Expresion(Expresion e1, Expresion e2){
		
	}
	
	public Expresion(TypeIF type){
		super();
		this.type = type;
	}
	
	public Expresion(TypeIF type, int value){
		super();
		this.type = type;
		this.setValue(value);
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

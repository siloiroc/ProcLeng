package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ValorConstante extends NonTerminal {
	private String value;		//Atributo: value (puede ser True, False, Número)
	private TypeIF type;

	public ValorConstante() {
		super();
	}
	
	public ValorConstante(String val){
		super();
		this.value = val;
	}
	
	public ValorConstante(String valueConst, TypeIF type){
		super();
		this.type = type;
		this.value = valueConst;
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



package compiler.syntax.nonTerminal;

public class TipoPrimitivo extends NonTerminal {
	private String value;	//Atributo valor del tipo primitivo
	
	public TipoPrimitivo() {
		super();
	}

	public TipoPrimitivo(String value){
		super();
		this.value = value;
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

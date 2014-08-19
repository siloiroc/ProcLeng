package compiler.syntax.nonTerminal;

public class ValorConstante extends NonTerminal {
	private String value;		//Atributo: value (puede ser True, False, Número)

	public ValorConstante() {
		super();
	}
	
	public ValorConstante(String val){
		super();
		this.value = val;
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



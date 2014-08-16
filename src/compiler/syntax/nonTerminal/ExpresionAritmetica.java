package compiler.syntax.nonTerminal;

public class ExpresionAritmetica extends NonTerminal {
	
	private int value; //Atributo valor, de la expresión aritmética.
	
	public ExpresionAritmetica() {
		super();
	}

	public ExpresionAritmetica(Expresion e1, Expresion e2){
		super();
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

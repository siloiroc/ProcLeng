package compiler.syntax.nonTerminal;

public class ExpresionAritmetica extends Expresion {
	
	private int value; //Atributo valor, de la expresi�n aritm�tica.
	
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

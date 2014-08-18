package compiler.syntax.nonTerminal;

public class ExpresionLogica extends Expresion {
	
	private boolean value; 	//Atributo valor booleano, de la Expresión Lógica
	
	public ExpresionLogica() {
		super();
	}
	
	public ExpresionLogica(Expresion e1, Expresion e2)
	{
		super();
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

	
}

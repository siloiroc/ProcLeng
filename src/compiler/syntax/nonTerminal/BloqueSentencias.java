package compiler.syntax.nonTerminal;

public class BloqueSentencias extends NonTerminal {

	private boolean existeReturn; 
	
	public BloqueSentencias() {
		super();
	}

	/**
	 * @return the existeReturn
	 */
	public boolean isExisteReturn() {
		return existeReturn;
	}

	/**
	 * @param existeReturn the existeReturn to set
	 */
	public void setExisteReturn(boolean existeReturn) {
		this.existeReturn = existeReturn;
	}


}

package compiler.syntax.nonTerminal;

public class TipoRegistro extends NonTerminal {

	private BloqueCamposRegistro bloqueCamposReg = new BloqueCamposRegistro();
	
	public TipoRegistro() {
		super();
	}
	
	public TipoRegistro(BloqueCamposRegistro bloquecampos){
		this.bloqueCamposReg = bloquecampos;
	}

	/**
	 * @return the bloqueCamposReg
	 */
	public BloqueCamposRegistro getBloqueCamposReg() {
		return bloqueCamposReg;
	}

	/**
	 * @param bloqueCamposReg the bloqueCamposReg to set
	 */
	public void setBloqueCamposReg(BloqueCamposRegistro bloqueCamposReg) {
		this.bloqueCamposReg = bloqueCamposReg;
	}

}

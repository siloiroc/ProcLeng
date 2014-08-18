package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ExpresionAccesoRegistro extends NonTerminal {
	private String referencia;

	public ExpresionAccesoRegistro() {
		super();
	}

	public ExpresionAccesoRegistro(TypeIF type){
		super();
		
	}
	
	/**
	 * @return the referencia
	 */
	public String getReferencia() {
		return referencia;
	}

	/**
	 * @param referencia the referencia to set
	 */
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


}

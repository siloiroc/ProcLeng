package compiler.syntax.nonTerminal;

import compiler.semantic.type.TypeRecord;

public class DeclaracionTipo extends NonTerminal {

	private TypeRecord tipoRecord;
	
	public DeclaracionTipo() {
		super();
	}

	public DeclaracionTipo(TypeRecord tipoRecord){
		super();
		this.tipoRecord = tipoRecord;
	}
	
	/**
	 * @return the tipoRecord
	 */
	public TypeRecord getTipoRecord() {
		return tipoRecord;
	}

	/**
	 * @param tipoRecord the tipoRecord to set
	 */
	public void setTipoRecord(TypeRecord tipoRecord) {
		this.tipoRecord = tipoRecord;
	}

}

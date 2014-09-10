package compiler.syntax.nonTerminal;

import compiler.semantic.symbol.SymbolVariable;

import es.uned.lsi.compiler.intermediate.TemporalIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Referencia extends NonTerminal {

	private TypeIF type; 	
	private String name;
	private int value;
	private int size;
	
    private TemporalIF temporal;
    private int index; 
    private int offset;
    private TemporalIF temporalIndex, temporalOffset;
    
    private SymbolVariable varRecord;	//Utilizamos estas dos variables SymbolVariable para almacenar qué variable de tipo Record es
    private SymbolVariable campoRecord;		// y que campo del registro de dicha variable
	
	/**
	 * @return the varRecord
	 */
	public SymbolVariable getVarRecord() {
		return varRecord;
	}

	/**
	 * @param varRecord the varRecord to set
	 */
	public void setVarRecord(SymbolVariable varRecord) {
		this.varRecord = varRecord;
	}

	/**
	 * @return the campoRecord
	 */
	public SymbolVariable getCampoRecord() {
		return campoRecord;
	}

	/**
	 * @param campoRecord the campoRecord to set
	 */
	public void setCampoRecord(SymbolVariable campoRecord) {
		this.campoRecord = campoRecord;
	}

	/**
	 * @return the temporalOffset
	 */
	public TemporalIF getTemporalOffset() {
		return temporalOffset;
	}

	/**
	 * @param temporalOffset the temporalOffset to set
	 */
	public void setTemporalOffset(TemporalIF temporalOffset) {
		this.temporalOffset = temporalOffset;
	}

	public Referencia() {
		super();
	}

	public Referencia(TypeIF type, String name){
		this.type = type;
		this.name = name;
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

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * @param offset the offset to set
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * @return the temporal
	 */
	public TemporalIF getTemporal() {
		return temporal;
	}

	/**
	 * @param temporal the temporal to set
	 */
	public void setTemporal(TemporalIF temporal) {
		this.temporal = temporal;
	}

	/**
	 * @return the temporalIndex
	 */
	public TemporalIF getTemporalIndex() {
		return temporalIndex;
	}

	/**
	 * @param temporalIndex the temporalIndex to set
	 */
	public void setTemporalIndex(TemporalIF temporalIndex) {
		this.temporalIndex = temporalIndex;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}


}

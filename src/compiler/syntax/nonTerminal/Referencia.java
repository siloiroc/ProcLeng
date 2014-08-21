package compiler.syntax.nonTerminal;

import java.util.List;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;
import es.uned.lsi.compiler.intermediate.TemporalIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Referencia extends NonTerminal {

	private TypeIF type; 	
	private String name;
	private int value;
	
	private List<QuadrupleIF> intermediateCode;
    private TemporalIF temporal;
    private TemporalIF temporalIndex, temporalOffset;
	
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
	 * @return the intermediateCode
	 */
	public List<QuadrupleIF> getIntermediateCode() {
		return intermediateCode;
	}

	/**
	 * @param intermediateCode the intermediateCode to set
	 */
	public void setIntermediateCode(List<QuadrupleIF> intermediateCode) {
		this.intermediateCode = intermediateCode;
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


}

package compiler.syntax.nonTerminal;

import java.util.List;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;
import es.uned.lsi.compiler.intermediate.TemporalIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Expresion extends NonTerminal {

	private TypeIF type;
	private int value;
    private List<QuadrupleIF> intermediateCode;
    private TemporalIF temporal;
	
	public Expresion() {
		super();
	}
	
	public Expresion(LlamadaProcedimiento llamSubprog){
		super();
	}
	
	
	public Expresion(Expresion e1, Expresion e2){
		
	}
	
	public Expresion(TypeIF type){
		super();
		this.type = type;
	}
	
	public Expresion(TypeIF type, int value){
		super();
		this.type = type;
		this.setValue(value);
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

	

}

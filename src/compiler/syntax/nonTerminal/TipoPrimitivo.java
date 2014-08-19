package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class TipoPrimitivo extends NonTerminal {
	private String value;	//Atributo valor del tipo primitivo
	private TypeIF type;
	
	public TipoPrimitivo() {
		super();
	}

	public TipoPrimitivo(String value){
		super();
		this.value = value;
	} 
	
	public TipoPrimitivo(TypeIF type, String value){
		super();
		this.type = type;
		this.value = value;
	}
	
	public TipoPrimitivo(TypeIF type){
		super();
		this.type = type;
	}
	
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		TipoPrimitivo objType = (TipoPrimitivo)obj;
		return this.getValue().equalsIgnoreCase(objType.getValue());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		return 255 * this.getValue().hashCode(); 
				
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

}

package compiler.syntax.nonTerminal;

public class TipoPrimitivo extends NonTerminal {
	private String value;	//Atributo valor del tipo primitivo
	
	public TipoPrimitivo() {
		super();
	}

	public TipoPrimitivo(String value){
		super();
		this.value = value;
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

}

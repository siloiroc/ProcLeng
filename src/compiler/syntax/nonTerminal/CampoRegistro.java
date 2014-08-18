package compiler.syntax.nonTerminal;

public class CampoRegistro extends NonTerminal {
	


	private String name; 			//Atributo: nombre del campo del registro;
	private TipoPrimitivo tipo; 	//Atributo: Tipo del campo del registro;
		
	public CampoRegistro() {
		super();
	}
	
	
	public CampoRegistro(String name, TipoPrimitivo tipo){
		super();
		this.name = name;
		this.tipo = tipo; 
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
	 * @return the tipo
	 */
	public TipoPrimitivo getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoPrimitivo tipo) {
		this.tipo = tipo;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		CampoRegistro crObj = (CampoRegistro)obj;
		return this.getName().equalsIgnoreCase(crObj.getName()) && this.getTipo().equals(crObj.getTipo());
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		return 255 * this.getName().hashCode() + this.tipo.hashCode(); 
	}


	

}

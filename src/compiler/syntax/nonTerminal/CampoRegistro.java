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

}

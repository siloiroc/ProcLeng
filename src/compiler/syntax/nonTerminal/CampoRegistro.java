package compiler.syntax.nonTerminal;

public class CampoRegistro extends NonTerminal {
	
	private String name; //Atributo nombre del campo del registro;
		
	public CampoRegistro() {
		super();
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

}

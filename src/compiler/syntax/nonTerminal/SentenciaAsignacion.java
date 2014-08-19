package compiler.syntax.nonTerminal;

public class SentenciaAsignacion extends Sentencia {

	private String name;
	
	public SentenciaAsignacion() {
		super();
	}

	public SentenciaAsignacion(String name){
		super();
		this.name = name;
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

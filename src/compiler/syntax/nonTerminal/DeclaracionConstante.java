package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class DeclaracionConstante extends NonTerminal {

	private TypeIF type;
	private ListaIdentificadores idlist;
	
	public DeclaracionConstante() {
		super();
	}
	
	
	public DeclaracionConstante(TypeIF type, ListaIdentificadores idlist)
	{
		this.type = type;
		this.idlist = idlist;
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
	 * @return the idlist
	 */
	public ListaIdentificadores getIdlist() {
		return idlist;
	}

	/**
	 * @param idlist the idlist to set
	 */
	public void setIdlist(ListaIdentificadores idlist) {
		this.idlist = idlist;
	}
	
	public boolean containsDecConstante(String constant){
		return idlist.containsIdentifier(constant);
	}
}

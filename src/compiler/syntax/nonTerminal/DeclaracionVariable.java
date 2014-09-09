package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class DeclaracionVariable extends NonTerminal {

	private TypeIF type;
	private ListaIdentificadores idlist;
//	private int size; 	//El número de identificadores en la línea de declaracion de variables
	
	public DeclaracionVariable() {
		super();
	}
	
	public DeclaracionVariable(TypeIF type, ListaIdentificadores idlist)
	{
		this.type = type;
		this.idlist = idlist;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return this.idlist.getSize();
	}
	
	public int getMemorySize(){
		return this.idlist.getSize()* this.type.getSize();
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

	public boolean containsDecVariable(String var){
		System.out.println("En DeclaracionVariable, buscando contiene campo:" + var);
		System.out.println("DeclaracionVariable devuelve encontrado=" + idlist.containsIdentifier(var));
		return this.idlist.containsIdentifier(var);
	}
	
	public String getIdentifiersListItem(int item){
		return this.idlist.getIdentifiersListItem(item);
	}

	public int getOffset(String campo){
		return this.idlist.getIdentifierId(campo);
	}
	
}
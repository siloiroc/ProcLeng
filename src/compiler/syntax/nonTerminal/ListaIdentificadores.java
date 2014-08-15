package compiler.syntax.nonTerminal;

import java.util.ArrayList;

/**
 * @author agilrod
 *
 */
public class ListaIdentificadores extends NonTerminal {
	
	private ArrayList<String> identifiersList = new ArrayList<String>();
	/**
	 * 
	 */
	public ListaIdentificadores() {
		super();
	}
	/**
	 * @return the identifiersList
	 */
	public ArrayList<String> getIdentifiersList() {
		return identifiersList;
	}
	/**
	 * @param identifiersList the identifiersList to set
	 */
	public void setIdentifiersList(ArrayList<String> identifiersList) {
		this.identifiersList = identifiersList;
	}
	
	/**
	 * 
	 * @param token Añade un nuevo token de identificador a la lista de tokens interna
	 */
	public void addIdentifier(String id){
		this.identifiersList.add(id);
	}
	
	public int getSize(){
		return this.identifiersList.size();
	}

}

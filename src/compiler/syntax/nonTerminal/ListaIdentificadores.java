package compiler.syntax.nonTerminal;

import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.symbol.SymbolIF;

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
	
	public ListaIdentificadores(String name){
		super();
		this.identifiersList.add(name);
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
	
	public String getIdentifiersListItem(int item){
		return this.identifiersList.get(item);
	}
	

	public void addIdentifier(String id){
		this.identifiersList.add(id);
	}
	
	public int getSize(){
		return this.identifiersList.size();
	}

}

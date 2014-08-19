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

	public boolean containsIdentifier(String id){
		boolean found = false;
		for(int i=0; i < identifiersList.size(); i++)
		{
			
			//System.out.println("ListaIdentificadores, recorriendo lista de ids. Id(" + i + ")");
			
			//System.out.println(this.identifiersList.get(i));
			if (this.identifiersList.get(i).equals(id))
			{
				found = true;
				//System.out.println("Encontrado" + id + " es lista ids=" + i);				
			}
		}
		return found;
		//System.out.println("En Lista Identificadores, buscando contiene campo" + id);
		//return identifiersList.contains(id);
	}
}

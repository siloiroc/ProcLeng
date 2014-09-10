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
	
	public ListaIdentificadores(String name){
		super();
		this.identifiersList.add(name);
	}
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return this.identifiersList.size();
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
	
	public boolean containsIdentifier(String id){
		boolean found = false;
		
		for(int i=0; i < this.identifiersList.size(); i++)
		{				
			if (this.identifiersList.get(i).equals(id))
			{
				found = true;			
			}
		}
		return found;
	}
	
	public int getIdentifierId(String name){
		int identifierId = -1; 
		for(int i=0; i < identifiersList.size(); i++)
		{
			if (this.identifiersList.get(i).equals(name))
			{
				identifierId = i;				
			}
		}
		return identifierId;

	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.identifiersList.toString();
		
		
	}	
	
	
}

package compiler.syntax.nonTerminal;

import java.util.ArrayList;

import compiler.lexical.Token;

/**
 * @author agilrod
 *
 */
public class ListaIdentificadores extends NonTerminal {
	
	private ArrayList<Token> identifiersList = new ArrayList<Token>();
	/**
	 * 
	 */
	public ListaIdentificadores() {
		super();
	}
	/**
	 * @return the identifiersList
	 */
	public ArrayList<Token> getIdentifiersList() {
		return identifiersList;
	}
	/**
	 * @param identifiersList the identifiersList to set
	 */
	public void setIdentifiersList(ArrayList<Token> identifiersList) {
		this.identifiersList = identifiersList;
	}
	
	/**
	 * 
	 * @param token Añade un nuevo token de identificador a la lista de tokens interna
	 */
	public void addIdentifier(Token token){
		this.identifiersList.add(token);
	}
	
	public int getSize(){
		return this.identifiersList.size();
	}

}

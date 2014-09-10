package compiler.syntax.nonTerminal;

import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.type.TypeIF;


public class BloqueCamposRegistro extends NonTerminal {

	private ArrayList<DeclaracionVariable> listaCamposRegistro = new ArrayList<DeclaracionVariable>();	//Atributo: Lista de los campos del registro
//	private int size; 	//Atributo: número de campos del registro
	
	public BloqueCamposRegistro() { 
		super();	
	}

	public BloqueCamposRegistro(DeclaracionVariable decvar){
		super();
		this.listaCamposRegistro.add(decvar);
	}
	
	public void addCampoRegistro(DeclaracionVariable decvar){
		//Añade objeto CampoRegistro a lista de campos
		this.listaCamposRegistro.add(decvar);
	}

	public DeclaracionVariable getDeclaracionVariableId(int i){
		return this.listaCamposRegistro.get(i);
	}

	public boolean containsField(String field){

		//Otra opción sería utilizar ArrayList.contains; contains utiliza la función equals para comparar si existe un objeto en la lista.
		boolean found = false;  
		for(int i=0; i < this.listaCamposRegistro.size(); i++)
		{
			DeclaracionVariable decvar = this.listaCamposRegistro.get(i);
			if (decvar.containsDecVariable(field))
				found = true;
		}
		return found;
	}
	
	public TypeIF getTypeCampoRegistro(String field){
		TypeIF tipoCampo = null;
		for(int i=0; i<this.listaCamposRegistro.size(); i++)
		{
			DeclaracionVariable decvar = this.listaCamposRegistro.get(i);
			if (decvar.containsDecVariable(field))
				tipoCampo = decvar.getType();
		}
		return tipoCampo;
			 
	}

	/**
	 * @return the listaCamposRegistro
	 */
	public ArrayList<DeclaracionVariable> getListaCamposRegistro() {
		return listaCamposRegistro;
	}

	/**
	 * @param listaCamposRegistro the listaCamposRegistro to set
	 */
	public void setListaCamposRegistro(
			ArrayList<DeclaracionVariable> listaCamposRegistro) {
		this.listaCamposRegistro = listaCamposRegistro;
	}
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return this.listaCamposRegistro.size();
	}

	public int getMemorySize(){
		int memSize = 0;
		for(int i = 0; i< this.listaCamposRegistro.size(); i++){
			memSize += this.listaCamposRegistro.get(i).getMemorySize();
		}
		return memSize;
	}


	public int getOffset(String campo){
		int sumaOffset = 0; 
		for (int i=0; i< this.listaCamposRegistro.size(); i++){
			ArrayList<String> listaIds = this.listaCamposRegistro.get(i).getIdlist().getIdentifiersList();
		}
		
		
		for(int i=0; i < this.listaCamposRegistro.size(); i++){
			if(this.listaCamposRegistro.get(i).containsDecVariable(campo))
			{
				sumaOffset += this.listaCamposRegistro.get(i).getOffset(campo);
				if (i>0){
					sumaOffset += this.listaCamposRegistro.get(i).getMemorySize(); 
				}
			}
		}
		return sumaOffset;
	}
}

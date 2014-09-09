package compiler.syntax.nonTerminal;

import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.type.TypeIF;


public class BloqueCamposRegistro extends NonTerminal {

	private ArrayList<DeclaracionVariable> listaCamposRegistro = new ArrayList<DeclaracionVariable>();	//Atributo: Lista de los campos del registro
//	private int size; 	//Atributo: n�mero de campos del registro
	
	public BloqueCamposRegistro() { 
		super();	
	}

	public BloqueCamposRegistro(DeclaracionVariable decvar){
		super();
		this.listaCamposRegistro.add(decvar);
	}
	
	public void addCampoRegistro(DeclaracionVariable decvar){
		//A�ade objeto CampoRegistro a lista de campos
		this.listaCamposRegistro.add(decvar);
	}

	public DeclaracionVariable getDeclaracionVariableId(int i){
		return this.listaCamposRegistro.get(i);
	}

	public boolean containsField(String field){
//		if (this.listaCamposRegistro.contains(new DeclaracionVariable()) 
//			|| this.listaCamposRegistro.contains(new DeclaracionVariable())
//			|| this.listaCamposRegistro.contains(new DeclaracionVariable()))	
//			return true;
//		else
//			return false;
		
		//System.out.println("En BloqueCamposRegistro, buscando en su lista de campos si contiene campo: " + field);
		//Otra opci�n ser�a utilizar ArrayList.contains; contains utiliza la funci�n equals para comparar si existe un objeto en la lista.
		boolean found = false;  
		System.out.println("Numero de elementos en listaCamposRegistro=" + this.listaCamposRegistro.size());
		for(int i=0; i < this.listaCamposRegistro.size(); i++)
		{
			System.out.println("BloqueCamposRegistro-containsFied, recorriendo lista de campos. Campo:" + i + ", lista campos, es=" + listaCamposRegistro.get(i).getIdentifiersListItem(i));
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
		for(int i=0; i< this.listaCamposRegistro.size(); i++){
			if(this.listaCamposRegistro.get(i).containsDecVariable(campo))
			{
				//System.out.println("En BloqueCamposRegistro.getOffset, i=" + i + " , sumaOffset=" + sumaOffset);
				sumaOffset += i;
				//System.out.println("En BloqueCamposRegistro.getOffset, i=" + i + " , sumaOffset=" + sumaOffset);
			}
//			else{
//				System.out.println("En BloqueCamposRegistro.getOffset, i=" + i + " , sumaOffset=" + sumaOffset);
//				sumaOffset += this.listaCamposRegistro.get(i).getMemorySize();
//				System.out.println("En BloqueCamposRegistro.getOffset, i=" + i + " , sumaOffset=" + sumaOffset);
//			}
			return sumaOffset;				
		}
		return sumaOffset;
	}
}

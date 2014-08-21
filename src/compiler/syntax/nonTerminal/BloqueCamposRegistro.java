package compiler.syntax.nonTerminal;

import java.util.ArrayList;


public class BloqueCamposRegistro extends NonTerminal {

	private ArrayList<DeclaracionVariable> listaCamposRegistro = new ArrayList<DeclaracionVariable>();	//Atributo: Lista de los campos del registro
	
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


	public boolean containsField(String field){
//		if (this.listaCamposRegistro.contains(new DeclaracionVariable()) 
//			|| this.listaCamposRegistro.contains(new DeclaracionVariable())
//			|| this.listaCamposRegistro.contains(new DeclaracionVariable()))	
//			return true;
//		else
//			return false;
		//System.out.println("En BloqueCamposRegistro, buscando en su lista de campos si contiene campo: " + field);
		//Otra opción sería utilizar ArrayList.contains; contains utiliza la función equals para comparar si existe un objeto en la lista.
		boolean found = true;  
		for(int i=0; i<listaCamposRegistro.size(); i++)
		{
			//System.out.println("BloqueCamposRegistro-containsFied, recorriendo lista de campos. Campo:" + i + ", lista campos");
			DeclaracionVariable decvar = this.listaCamposRegistro.get(i);
			if (decvar.containsDecVariable(field))
				found = true;
		}
		return found;
		//return listaCamposRegistro.contains(field);
		
		
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
	
	public int getOffset(String campo){
		//this.listaCamposRegistro.getOffset(campo);
		return 1;
	}
}

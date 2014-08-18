package compiler.syntax.nonTerminal;

import java.util.ArrayList;


public class BloqueCamposRegistro extends NonTerminal {

	private ArrayList<CampoRegistro> listaCamposRegistro = new ArrayList<CampoRegistro>();	//Atributo: Lista de los campos del registro
	
	public BloqueCamposRegistro() { 
		super();
	}

	/**
	 * @return the listaCamposRegistro
	 */
	public ArrayList<CampoRegistro> getListacamposregistro() {
		return listaCamposRegistro;
	}

	

	public void addCampoRegistro(CampoRegistro campo){
		//Añade objeto CampoRegistro a lista de campos
		this.listaCamposRegistro.add(campo);
	}

	/**
	 * @return the listaCamposRegistro
	 */
	public ArrayList<CampoRegistro> getListaCamposRegistro() {
		return listaCamposRegistro;
	}

	/**
	 * @param listaCamposRegistro the listaCamposRegistro to set
	 */
	public void setListaCamposRegistro(ArrayList<CampoRegistro> listaCamposRegistro) {
		this.listaCamposRegistro = listaCamposRegistro;
	}
	
	public boolean containsField(String field){
		if (this.listaCamposRegistro.contains(new CampoRegistro(field,new TipoPrimitivo("INTEGER"))) 
			|| this.listaCamposRegistro.contains(new CampoRegistro(field, new TipoPrimitivo("BOOLEAN")))
			|| this.listaCamposRegistro.contains(new CampoRegistro(field, new TipoPrimitivo("IDENTIFIER"))))
			return true;
		else
			return false;
	}
}

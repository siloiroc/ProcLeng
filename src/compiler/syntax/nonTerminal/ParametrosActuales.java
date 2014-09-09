package compiler.syntax.nonTerminal;

import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ParametrosActuales extends NonTerminal {

	private ArrayList<Expresion> listaParamActuales = new ArrayList<Expresion>();
	private int numParameters = 0;
	
	public ParametrosActuales() {
		super();
	}
	
	public ParametrosActuales(Expresion exp) {
		super();
		this.listaParamActuales.add(exp);
		this.numParameters++;
	}

	public void addParametroActual(Expresion exp){
		this.listaParamActuales.add(exp);
		this.numParameters++;
	}
	
	
	/**
	 * @return the listaParamActuales
	 */
	public ArrayList<Expresion> getListaParamActuales() {
		return listaParamActuales;
	}

	/**
	 * @param listaParamActuales the listaParamActuales to set
	 */
	public void setListaParamActuales(ArrayList<Expresion> listaParamActuales) {
		this.listaParamActuales = listaParamActuales;
	}

	
	/**
	 * @return ArrayList de TypeIF con los tipos de los parámetros
	 */
	public ArrayList<TypeIF> getParameterTypes(){
		ArrayList<TypeIF> lTypes = new ArrayList<TypeIF>();
		
		for (Expresion e : listaParamActuales){
			lTypes.add(e.getType());
		}
		return lTypes;
	}

	/**
	 * @return the numParameters
	 */
	public int getNumParameters() {
		return numParameters;
	}

	/**
	 * @param numParameters the numParameters to set
	 */
	public void setNumParameters(int numParameters) {
		this.numParameters = numParameters;
	}
	
	//paramActuales.getParameterTypes();
	
}

package compiler.syntax.nonTerminal;

import java.util.ArrayList;

import compiler.semantic.symbol.SymbolParameter;

public class ListaParametrosFormales extends NonTerminal {

	private ArrayList<SymbolParameter> parameters = new ArrayList<SymbolParameter>();
	
	public ListaParametrosFormales() {
		super();
	}
	
	public ListaParametrosFormales(ArrayList<SymbolParameter> parameters)
	{
		super();
		this.parameters = parameters;
	}
	
	public void addAllParameters(ArrayList<SymbolParameter> lParamAdd)
	{
		this.parameters.addAll(lParamAdd);
	}

	/**
	 * @return the parameters
	 */
	public ArrayList<SymbolParameter> getParameters() {
		return parameters;
	}

	/**
	 * @param parameters the parameters to set
	 */
	public void setParameters(ArrayList<SymbolParameter> parameters) {
		this.parameters = parameters;
	}

	
	
}


//List<SymbolParameter> listaParametros = lParamForm.getParameters();
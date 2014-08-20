package compiler.syntax.nonTerminal;

import java.util.ArrayList;

import compiler.semantic.symbol.SymbolParameter;
import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ParametrosFormales extends NonTerminal {

	private ArrayList<SymbolParameter> listaParametros = new ArrayList<SymbolParameter>();
	private ArrayList<TypeIF> listaTiposParametros = new ArrayList<TypeIF>();

		
	public ParametrosFormales() {
		super();
	}
	
	public ParametrosFormales(ArrayList<SymbolParameter> listaParametros)
	{
		super();
		this.listaParametros = listaParametros;
		for (SymbolParameter sp : listaParametros)
		{
			listaTiposParametros.add(sp.getType());
		}
	}


	/**
	 * @return the listaParametros
	 */
	public ArrayList<SymbolParameter> getListaParametros() {
		return listaParametros;
	}


	/**
	 * @param listaParametros the listaParametros to set
	 */
	public void setListaParametros(ArrayList<SymbolParameter> listaParametros) {
		this.listaParametros = listaParametros;
		for (SymbolParameter sp : listaParametros)
		{
			listaTiposParametros.add(sp.getType());
		}
	}

	/**
	 * @return the listaTiposParametros
	 */
	public ArrayList<TypeIF> getListaTiposParametros() {
		return listaTiposParametros;
	}

	/**
	 * @param listaTiposParametros the listaTiposParametros to set
	 */
	public void setListaTiposParametros(ArrayList<TypeIF> listaTiposParametros) {
		this.listaTiposParametros = listaTiposParametros;
	}

	
	
}

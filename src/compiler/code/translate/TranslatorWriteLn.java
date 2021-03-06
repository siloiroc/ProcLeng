package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorWriteLn extends Translator {

	public TranslatorWriteLn() {
		super();
	}

	
	@Override
	public String translate(QuadrupleIF quadruple) {
		//Instrucci�n ENS2001: WRSTR -> Escribe una cadena
		//Formato:  WRSTR op1 (op1 puede ser: memoria, indirecto, relativo)
		//Comportamiento: Escribe en la consola una cadena de caracteres, que estar�
		//					almacenada en memoria a partir de la direcci�n indicada por el
		//					operando 1. Se escribir�n caracteres hasta que se llegue al
		//					car�cter �\0�. Por tanto, puede ocurrir que durante este proceso se
		//					genere una excepci�n si no se encuentra el car�cter de fin de
		//					cadena antes de llegar al l�mite superior de la memoria.
			
		StringBuffer b = new StringBuffer();
		
		OperandIF operando = quadruple.getResult();
		
		
		String strResult = quadruple.getResult().toString();
		//String strOper1  = quadruple.getFirstOperand().toString();
		String label = DataLabels.generateLabel();
		b.append("\t\t\t\tWRSTR /" +  label + "\t\t\t\t;Instruccion Put_Line\n");
		b.append("\t\t\t\tWRCHAR #10\n\t\t\t\tWRCHAR #13");	//A�adimos LF y CR
		
		//DataLabels.addlabelData(label + ":\t\t\t DATA " + strResult + "\n");
		DataLabels.addlabelData(label + ":\t\tDATA " + "\"" + strResult + "\"");
		
		
		
		//StringBuffer b = new StringBuffer();
		//String strResult = translate(quadruple.getResult());
		//b.append(quadruple.getResult().toString());
		//b.append("WRSTR " +  strResult + " ;Instruccion Put_Line");
		return b.toString();
	}

}

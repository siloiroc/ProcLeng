package compiler.code.translate;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public class TranslatorExprLogica extends Translator {

	public TranslatorExprLogica() {
		super();
	}

	@Override
	public String translate(QuadrupleIF quadruple) {
		String operation = quadruple.getOperation();
		StringBuffer b = new StringBuffer();
		
		if (operation.equals("OR")){
			String strOper1  = translate(quadruple.getFirstOperand());
			String strOper2  = translate(quadruple.getSecondOperand());
			String strResult = translate(quadruple.getResult());		
			b.append("OR " + strOper1 + ", " + strOper2 + "\n");
			b.append("MOVE .A, " + strResult);
		}
		else if (operation.equals("EQ")){
			String strOper1  = translate(quadruple.getFirstOperand());
			String strOper2  = translate(quadruple.getSecondOperand());
			String strResult = translate(quadruple.getResult());		
			b.append("\t\t\tCMP " + strOper1 + ", " + strOper2 + "\n");		//Comparamos los operandos (restamos uno de otro, realmente)
			//Creamos dos etiquetas (labels) para gestionar el salto si la comparación es true o false, y para salir de la comparación
			String labelTrue = DataLabels.generateLabel();
			String labelSalida  = DataLabels.generateLabel();
			b.append("\t\t\tBZ /" + labelTrue + "\n");	//Si son iguales saltamos a la etiqueta de True
			b.append("\t\t\tMOVE #0, " + strResult + "\n");	//No son iguales, por lo que ponemos un valor de 0 en el Resultado
			b.append("\t\t\tBR /" + labelSalida + "\n");
			b.append(labelTrue + ": \t");
			b.append("MOVE #1, " + strResult + "\n");	//Son iguales, por lo que ponemos un valor 1 en el resultado
			b.append(labelSalida + ":\t");
		}
		else if (operation.equals("GRT")){
			//TO-DO
		}
			
		return b.toString();
	}

}

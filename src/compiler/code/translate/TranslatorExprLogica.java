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
			System.out.println("traducción de OR");
			String strOper1  = translate(quadruple.getFirstOperand());
			String strOper2  = translate(quadruple.getSecondOperand());
			String strResult = translate(quadruple.getResult());		
			b.append("OR " + strOper1 + ", " + strOper2 + "\n");
			b.append("MOVE .A, " + strResult);
		}
		else if (operation.equals("EQ")){
			System.out.println("traducción de equal");
			String strOper1  = translate(quadruple.getFirstOperand());
			String strOper2  = translate(quadruple.getSecondOperand());
			String strResult = translate(quadruple.getResult());		
			b.append("CMP " + strOper1 + ", " + strOper2 + "\n");		//Comparamos los operandos (restamos uno de otro, realmente)
			//Creamos dos etiquetas (labels) para gestionar el salto si la comparación es true o false, y para salir de la comparación
			String labelTrue = DataLabels.generateLabel();
			String labelSalida  = DataLabels.generateLabel();
			b.append("BZ /" + labelTrue);	//Si son iguales saltamos a la etiqueta de True
			b.append("MOVE #0, " + strResult + "\n");	//No son iguales, por lo que ponemos un valor de 0 en el Resultado
			b.append("BR / " + labelSalida);
			b.append(labelTrue + " : \n");
			b.append("MOVE #1, " + strResult + "\n");	//Son iguales, por lo que ponemos un valor 1 en el resultado
			b.append(labelSalida + " : \n");
			
			
			
			
//            cb.addQuadruple ("CMP", exp1.getResultado(), exp2.getResultado()); 
//            cb.addQuadruple ("BZ", LTRUE); 
//            cb.addQuadruple ("ASIG", temporal, falso);
//            cb.addQuadruple ("BR", LFIN);
//            cb.addQuadruple ("ETIQUETA", LTRUE);
//            cb.addQuadruple ("ASIG", temporal, verdad);
//            cb.addQuadruple ("ETIQUETA", LFIN);
//			
//			getTranslation().append("CMP " + translate(q.getFirstOperand())+ 
//					", " + translate(q.getSecondOperand()) + SALTO_LINEA);
//			String label = LabelManager.getLabelText();
//			String label2 = LabelManager.getLabelText();
//			getTranslation().append("BNZ /" + label + SALTO_LINEA);
//			getTranslation().append("MOVE #1, " + translate(q.getResult()) + SALTO_LINEA);
//			getTranslation().append("BR /" + label2 + SALTO_LINEA);
//			getTranslation().append(label + " : " + SALTO_LINEA);
//			getTranslation().append("MOVE #0, " + translate(q.getResult()) + SALTO_LINEA);
//			getTranslation().append(label2 + " : " + SALTO_LINEA);
//			
			
			
		}
		else if (operation.equals("GRT")){
			System.out.println("traducción de Mayor que");
		}
			
		
		String strOper1  = translate(quadruple.getFirstOperand());
		String strOper2  = translate(quadruple.getSecondOperand());
		String strResult = translate(quadruple.getResult());		
		b.append("ADD " + strOper1 + ", " + strOper2 + "\n");
		b.append("MOVE .A, " + strResult);

		return b.toString();
	}

}

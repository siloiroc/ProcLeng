package compiler.code.translate;

import compiler.intermediate.Label;
import compiler.intermediate.Temporal;
import compiler.intermediate.Value;
import compiler.intermediate.Variable;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

public abstract class Translator implements TranslatorIF {

	//private String finalCodeTranslation; 
	
	public Translator() {
		
	}

	@Override
	public abstract String translate(QuadrupleIF quadruple);

	protected String translate(OperandIF operand){
		String translation ="";
		if (operand instanceof Label){
			Label lab = (Label) operand;
			translation = lab.toString();
		}
		else if (operand instanceof Value){
			Value val = (Value) operand;
			//Comprobamos si el operando es un valor booleano
			if (val.getValue().equals("TRUE"))
				translation = "#1";
			else if (val.getValue().equals("FALSE"))
				translation = "#0";
			else
			translation = "#" + val.getValue().toString();
		}
		else if(operand instanceof Variable)
		{
			Variable var = (Variable)operand;
			if (var.isGlobal()){ //Si variable es global, direccionamiento directo a memoria
				translation =  "/" + var.getAddress();
			}
			else{
				translation = "#-" + var.getAddress() + "[.IX]";
			}
		}
		else if (operand instanceof Temporal)
		{	//Si operando es Temporal => Direccionamiento relativo a Registro
			Temporal temp = (Temporal)operand;
			translation = "#-" + temp.getAddress() + "[.IX]";
		}
		else{	//Si no, direccionamiento inmediato
			translation = ".R1"; 


		}
		
		return translation;
			
	}
}

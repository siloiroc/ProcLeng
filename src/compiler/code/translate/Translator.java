package compiler.code.translate;

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
		if (operand instanceof Value){
			System.out.println("Operando: " + operand.toString() + " es de tipo valor= " + operand.toString());
			Value val = (Value) operand;
			translation = "#" + val.getValue();
		}
		else if(operand instanceof Variable)
		{
			Variable var = (Variable)operand;
			if (var.isGlobal()){ //Si variable es global, direccionamiento directo a memoria
				System.out.println("Operando: " + operand.toString() + " es de tipo variable y global =" + operand.toString());
				translation =  "/" + var.getAddress();
				System.out.println("translation = " + translation);
			}
			else{
				System.out.println("Operando: " + operand.toString() + " es de tipo variable y otra");
				translation = "#-" + var.getAddress() + "[.IX]";
			}
		}
		else if (operand instanceof Temporal)
		{	//Si operando es Temporal => Direccionamiento relativo a Registro
			Temporal temp = (Temporal)operand;
			System.out.println("Operando " + operand.toString() + " es de tipo Temporal");
			translation = "#" + temp.getAddress() + "[.IX]";
			System.out.println("translation = " + translation);
		}
		else{	//Si no, direccionamiento inmediato
			System.out.println("No es ni de tipo Value ni Variable, el operando es=" + operand.toString() + operand.getClass());
			translation = ".R1"; 


		}
		
		return translation;
			
	}
}

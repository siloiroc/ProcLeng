package compiler.code;

import java.util.Arrays;
import java.util.List;

import compiler.CompilerContext;
import compiler.code.translate.*;
import compiler.intermediate.Variable;
import compiler.semantic.type.TypeSimple;
import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.code.MemoryDescriptorIF;
import es.uned.lsi.compiler.code.RegisterDescriptorIF;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

/**
 * Class for the ENS2001 Execution environment.
 */

	




public class ExecutionEnvironmentEns2001 
    implements ExecutionEnvironmentIF
{    
    private final static int      MAX_ADDRESS = 65535; 
    private final static String[] REGISTERS   = {
       ".PC", ".SP", ".SR", ".IX", ".IY", ".A", 
       ".R0", ".R1", ".R2", ".R3", ".R4", 
       ".R5", ".R6", ".R7", ".R8", ".R9"
    };
    
    private RegisterDescriptorIF registerDescriptor;
    private MemoryDescriptorIF   memoryDescriptor;
    
  //Registro Activación (RA)
  		// - Valor de retorno
  		// - Dirección de retorno
  		// - Vínculo de control
  		// - Vínculo de acceso    
    public static final String RA_VINCULOCONTROL   = "#-3[.IX]";
	public static final String RA_VINCULOACCESO    = "#-2[.IX]";
	public static final String RA_DIRECCIONRETORNO = "#-1[.IX]";
	public static final String RA_VALORRETORNO     = "#0[.IX]";
    
    
    /**
     * Constructor for ENS2001Environment.
     */
    public ExecutionEnvironmentEns2001 ()
    {       
        super ();
    }
    
    /**
     * Returns the size of the type within the architecture.
     * @return the size of the type within the architecture.
     */
    @Override
    public final int getTypeSize (TypeSimple type)
    {      
        return 1;  
    }
    
    /**
     * Returns the registers.
     * @return the registers.
     */
    @Override
    public final List<String> getRegisters ()
    {
        return Arrays.asList (REGISTERS);
    }
    
    /**
     * Returns the memory size.
     * @return the memory size.
     */
    @Override
    public final int getMemorySize ()
    {
        return MAX_ADDRESS;
    }
           
    /**
     * Returns the registerDescriptor.
     * @return Returns the registerDescriptor.
     */
    @Override
    public final RegisterDescriptorIF getRegisterDescriptor ()
    {
        return registerDescriptor;
    }

    /**
     * Returns the memoryDescriptor.
     * @return Returns the memoryDescriptor.
     */
    @Override
    public final MemoryDescriptorIF getMemoryDescriptor ()
    {
        return memoryDescriptor;
    }

    /**
     * Translate a quadruple into a set of final code instructions. 
     * @param cuadruple The quadruple to be translated.
     * @return a quadruple into a set of final code instructions. 
     */
    @Override
    public final String translate (QuadrupleIF quadruple)
    {        	
    	//TODO: Student work
    	String translation = ""; 
    	
    	StringBuffer buffer = new StringBuffer();
    	String operation = quadruple.getOperation();
    	if(operation.equals("INICIO")){
    		TranslatorStart tr = new TranslatorStart();
    		translation = tr.translate(quadruple);
    	}
    	if(operation.equals("FIN")){
    		TranslatorText tr = new TranslatorText();
    		translation = tr.translate(quadruple);
    	}
    	if(operation.equals("DATA")){
    		TranslatorText tr = new TranslatorText();
    		translation = tr.translate(quadruple);
    	}    	
    	if(operation.equals("MV")){
    		TranslatorMove tr = new TranslatorMove();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("WRITELN")){
    		TranslatorWriteLn tr = new TranslatorWriteLn();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("WRITEEXP")){
    		TranslatorWriteExpresion trWrtExp = new TranslatorWriteExpresion();
    		translation = trWrtExp.translate(quadruple);
    	}
    	if (operation.equals("ADD")){
    		TranslatorAdd tr = new TranslatorAdd();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("MUL")){
    		TranslatorMUL tr = new TranslatorMUL();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("ASSIGN")){
    		TranslatorAssign tr = new TranslatorAssign();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("CMP")){
    		TranslatorCMP tr = new TranslatorCMP();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("BZ")){
    		TranslatorBZ tr = new TranslatorBZ();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("BNZ")){
    		TranslatorBNZ tr = new TranslatorBNZ();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("BR")){
    		TranslatorBranch tr = new TranslatorBranch();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("BP")){
    		TranslatorBranchPos tr = new TranslatorBranchPos();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("BN")){
    		TranslatorBN tr = new TranslatorBN();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("INC")){
    		TranslatorINC tr = new TranslatorINC();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("CALL")){
    		TranslatorCall tr = new TranslatorCall();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("LABEL")){
    		TranslatorLabel tr = new TranslatorLabel();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("OR")){
    		CompilerContext.getSemanticErrorManager().semanticDebug("or");
    		TranslatorExprLogica tr= new TranslatorExprLogica();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("EQ")){
    		TranslatorExprLogica tr = new TranslatorExprLogica();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("RETORNO")){
    		TranslatorRET tr = new TranslatorRET();
    		translation = tr.translate(quadruple);
    	}
 	    	
    	return translation;
    }
}

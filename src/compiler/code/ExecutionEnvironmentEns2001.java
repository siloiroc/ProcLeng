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
//    		System.out.println("En ExecutionEnvironmentEns2001 INICIO PROGRAMA");
    		TranslatorStart tr = new TranslatorStart();
    		translation = tr.translate(quadruple);
    	}
    	if(operation.equals("FIN")){
//    		System.out.println("En ExecutionEnvironmentEns2001 FIN PROGRAMA");
    		TranslatorText tr = new TranslatorText();
    		translation = tr.translate(quadruple);
    	}
    	if(operation.equals("DATA")){
//    		System.out.println("En ExecutionEnvironmentEns2001 DATA");
    		TranslatorText tr = new TranslatorText();
    		translation = tr.translate(quadruple);
    	}
    	
    	if(operation.equals("MV")){
    		//System.out.println("En ExecutionEnvironmentEns2001 MOVE");
    		TranslatorMove tr = new TranslatorMove();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("WRITELN")){
    		//CompilerContext.getSemanticErrorManager().semanticDebug("Writeln");
    		TranslatorWriteLn tr = new TranslatorWriteLn();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("WRITEEXP")){
    		//CompilerContext.getSemanticErrorManager().semanticDebug("WriteExpresion");
    		TranslatorWriteExpresion trWrtExp = new TranslatorWriteExpresion();
    		translation = trWrtExp.translate(quadruple);
    	}
    	if (operation.equals("ADD")){
    		CompilerContext.getSemanticErrorManager().semanticDebug("add");
    		TranslatorAdd tr = new TranslatorAdd();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("ASSIGN")){
//    		CompilerContext.getSemanticErrorManager().semanticDebug("assign");
    		TranslatorAssign tr = new TranslatorAssign();
    		translation = tr.translate(quadruple);
    	}
    	
    	if (operation.equals("MVP")){
    		CompilerContext.getSemanticErrorManager().semanticDebug("mvp");
//    		buffer.append("LD " + ".A " + "\n");
    	}
    	if (operation.equals("CMP")){
    		TranslatorCMP tr = new TranslatorCMP();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("BZ")){
    		TranslatorBZ tr = new TranslatorBZ();
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
    	if (operation.equals("LABEL")){
    		TranslatorLabel tr = new TranslatorLabel();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("OR")){
    		CompilerContext.getSemanticErrorManager().semanticDebug("or");
    		TranslatorExprLogica tr= new TranslatorExprLogica();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("GR")){
    		CompilerContext.getSemanticErrorManager().semanticDebug("gr");
//    		buffer.append("LD " + ".A " + "\n");
    	}
    	if (operation.equals("EQ")){
    		//CompilerContext.getSemanticErrorManager().semanticDebug("eq");
    		TranslatorExprLogica tr = new TranslatorExprLogica();
    		translation = tr.translate(quadruple);
    	}
    	if (operation.equals("MOVEADDR")){
    		CompilerContext.getSemanticErrorManager().semanticDebug("moveaddr");
//    		buffer.append("LD " + ".A " + "\n");
    	}    	
    	
    	return translation;
		
        //return quadruple.toString();        
    }
}

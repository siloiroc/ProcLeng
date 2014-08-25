package compiler.code;

import java.util.Arrays;
import java.util.List;

import compiler.CompilerContext;
import compiler.semantic.type.TypeSimple;
import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.code.MemoryDescriptorIF;
import es.uned.lsi.compiler.code.RegisterDescriptorIF;
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
    	//System.out.println("En ExecutionEnvironmentEns2001 translate");
    	
//    	
//    	//TODO: Student work
//    	StringBuffer buffer = new StringBuffer();
//    	if( quadruple.getOperation().equals("MOVENUM")){
//    		CompilerContext.getSemanticErrorManager().semanticDebug("test");
//    		buffer.append("LD " + ".A " + "\n");
//    	}
//    	
//    	if (quadruple.getOperation().equals("ADD")){
//    		//String operand1 = translate(quadruple.getFirstOperand());
////    		String operand2 = translate(quadruple.getSecondOperand());
////    		String result   = translate(quadruple.getResult());
//    		//buffer.append("LD " + ".A " + operand1 + "\n");
//    		CompilerContext.getSemanticErrorManager().semanticDebug("test");
//    		buffer.append("LD " + ".A " + "\n");
////    		buffer.append("ADD " + result + " " + operand2);
//    	}
//    	if (quadruple.getOperation().equals("ASSIGN")){
//    		CompilerContext.getSemanticErrorManager().semanticDebug("test");
//    		buffer.append("LD " + ".A " + "\n");
//    	}
//    	
//    	if (quadruple.getOperation().equals("MVP")){
//    		CompilerContext.getSemanticErrorManager().semanticDebug("test");
//    		buffer.append("LD " + ".A " + "\n");
//    	}
//    	if (quadruple.getOperation().equals("OR")){
//    		CompilerContext.getSemanticErrorManager().semanticDebug("test");
//    		buffer.append("LD " + ".A " + "\n");
//    	}
//    	if (quadruple.getOperation().equals("GR")){
//    		CompilerContext.getSemanticErrorManager().semanticDebug("test");
//    		buffer.append("LD " + ".A " + "\n");
//    	}
//    	if (quadruple.getOperation().equals("EQ")){
//    		CompilerContext.getSemanticErrorManager().semanticDebug("test");
//    		buffer.append("LD " + ".A " + "\n");
//    	}
//    	if (quadruple.getOperation().equals("MV")){
//    		CompilerContext.getSemanticErrorManager().semanticDebug("test");
//    		buffer.append("LD " + ".A " + "\n");
//    	}
//    	if (quadruple.getOperation().equals("MOVEADDR")){
//    		CompilerContext.getSemanticErrorManager().semanticDebug("test");
//    		buffer.append("LD " + ".A " + "\n");
//    	}    	
    	
    	
    	//return buffer.toString();    		
        //return quadruple.toString();
    	return("test\n");
        
    }
    
//    private String translate(OperandIF operand){
//    	if (operand instanceof Variable){
//    		Variable var = (Variable) operand;
//    		if(var.isGlobal())
//    			//return "/" + operand.getAddress();
//    	}
//    	//return "#" + operand.getAddress() + "[.IX]";
//    	}
//    }
}

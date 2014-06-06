/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.core.formula.lang;

import csheets.core.Address;
import csheets.core.Cell;
import csheets.core.Spreadsheet;
import csheets.core.Value;
import csheets.core.Workbook;
import csheets.core.formula.Expression;
import csheets.core.formula.Formula;
import csheets.core.formula.FunctionParameter;
import csheets.core.formula.Literal;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JSilva314 - 1040314 - João Paulo Silva
 */
public class EvalTest {
    
    public EvalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getIdentifier method, of class Eval.
     */
    @Test
    public void testGetIdentifier() {
        System.out.println("getIdentifier");
        Eval instance = new Eval();
        String expResult = "EVAL";
        String result = instance.getIdentifier();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of applyTo method, of class Eval.
     * @throws java.lang.Exception
     */
       public void testApplyTo() throws Exception {
       System.out.println("applyTo");

       // Fetches a cell
       Workbook workbook = new Workbook(1);
       Spreadsheet sheet = workbook.getSpreadsheet(0);
       Cell cell = sheet.getCell(new Address(0, 0));
       String txt = "2+3"; 
       Expression expTest = new Formula(cell, new Literal(new Value(txt)));
       Expression[] expArr = new Expression[1];
       expArr[0] = expTest;
       Eval instance = new Eval();

       Value expResult = new Value(5);
       Value result = instance.applyTo(expArr);
       System.out.println("result: "+ result.toString());
       System.out.println("expResult: "+ expResult.toString());
       assertEquals(expResult.toString(), result.toString());

    }

    /**
     * Test of getParameters method, of class Eval.
     */
    @Test
    public void testGetParameters() {
        System.out.println("getParameters");
        Eval instance = new Eval();
        FunctionParameter[] expResult = null;
        FunctionParameter[] result = instance.getParameters();
        assertArrayEquals(expResult, result);
       
    }

    /**
     * Test of isVarArg method, of class Eval.
     */
    @Test
    public void testIsVarArg() {
        System.out.println("isVarArg");
        Eval instance = new Eval();
        boolean expResult = false;
        boolean result = instance.isVarArg();
        assertEquals(expResult, result);
        
    }
}
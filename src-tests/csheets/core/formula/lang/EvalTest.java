/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.core.formula.lang;

import csheets.core.Value;
import csheets.core.formula.Expression;
import csheets.core.formula.FunctionParameter;
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of applyTo method, of class Eval.
     */
    @Test
    public void testApplyTo() throws Exception {
        System.out.println("applyTo");
        Expression[] arguments = null;
        Eval instance = new Eval();
        Value expResult = null;
        Value result = instance.applyTo(arguments);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
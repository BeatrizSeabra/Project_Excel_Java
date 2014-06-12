/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.core.formula.lang;

import csheets.core.Value;
import csheets.core.formula.Expression;
import csheets.core.formula.FunctionParameter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stefan Parker
 */
public class EvsetTest {
    
    public EvsetTest() {
    }
    
    public static final FunctionParameter[] expResultF= new FunctionParameter[]{
        new FunctionParameter(Value.Type.UNDEFINED, "Event", false, "The event that pretend to assign the function")
    };
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdentifier method, of class Evset.
     */
    @Test
    public void testGetIdentifier() {
        System.out.println("getIdentifier");
        Evset instance = new Evset();
        String expResult = "EVSET";
        String result = instance.getIdentifier();
        assertEquals(expResult, result);

    }

    /**
     * Test of applyTo method, of class Evset.
     */
    @Test
    public void testApplyTo() throws Exception {
        System.out.println("applyTo");
        Expression[] arguments = null;
        Evset instance = new Evset();
        Value expResult = null;
        Value result = instance.applyTo(arguments);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParameters method, of class Evset.
     */
    @Test
    public void testGetParameters() {
        System.out.println("getParameters");
        Evset instance = new Evset();
        FunctionParameter[] result = instance.getParameters();
        assertArrayEquals(expResultF, result);
    }

    /**
     * Test of isVarArg method, of class Evset.
     */
    @Test
    public void testIsVarArg() {
        System.out.println("isVarArg");
        Evset instance = new Evset();
        boolean expResult = true;
        boolean result = instance.isVarArg();
        assertEquals(expResult, result);
    }
    
    
    
}

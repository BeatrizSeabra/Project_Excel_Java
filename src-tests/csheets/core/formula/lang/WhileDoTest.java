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
 * @author Miguel
 */
public class WhileDoTest {

    public WhileDoTest() {
    }

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
     * Test of getIdentifier method, of class WhileDo.
     */
    @Test
    public void testGetIdentifier() {
        System.out.println("getIdentifier");
        WhileDo instance = new WhileDo();
        String expResult = "WhileDo";
        String result = instance.getIdentifier();
        assertEquals(expResult, result);
    }

    /**
     * Test of getParameters method, of class WhileDo.
     */
    @Test
    public void testGetParameters() {
        System.out.println("getParameters");
        WhileDo instance = new WhileDo();
        FunctionParameter[] expResult = new FunctionParameter[]{
            new FunctionParameter(Value.Type.BOOLEAN, "Condition", false,
            "A condition to evaluate before proceeding"),
            new FunctionParameter(Value.Type.UNDEFINED, "Loop", false,
            "A value to return if the condition was met"),};

        Value.Type result = instance.getParameters()[0].getValueType();
        assertEquals(expResult[0].getValueType(), result);
    }

    /**
     * Test of isVarArg method, of class WhileDo.
     */
    @Test
    public void testIsVarArg() {
        System.out.println("isVarArg");
        WhileDo instance = new WhileDo();
        boolean expResult = false;
        boolean result = instance.isVarArg();
        assertEquals(expResult, result);
    }

}

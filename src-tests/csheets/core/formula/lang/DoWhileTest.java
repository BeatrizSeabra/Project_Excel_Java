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
public class DoWhileTest {

    public DoWhileTest() {
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
     * Test of getIdentifier method, of class DoWhile.
     */
    @Test
    public void testGetIdentifier() {
        System.out.println("getIdentifier");
        DoWhile instance = new DoWhile();
        String expResult = "DoWhile";
        String result = instance.getIdentifier();
        assertEquals(expResult, result);
    }


    /**
     * Test of getParameters method, of class DoWhile.
     */
    @Test
    public void testGetParameters() {
        System.out.println("getParameters");
        DoWhile instance = new DoWhile();
        FunctionParameter[] expResult = new FunctionParameter[]{
            new FunctionParameter(Value.Type.UNDEFINED, "Loop", false,
            "A condition to evaluate before proceeding"),
            new FunctionParameter(Value.Type.BOOLEAN, "Condition", false,
            "A value to return if the condition was met"),};

        Value.Type result = instance.getParameters()[0].getValueType();
        assertEquals(expResult[0].getValueType(), result);
    }

    /**
     * Test of isVarArg method, of class DoWhile.
     */
    @Test
    public void testIsVarArg() {
        System.out.println("isVarArg");
        DoWhile instance = new DoWhile();
        boolean expResult = false;
        boolean result = instance.isVarArg();
        assertEquals(expResult, result);
    }

}

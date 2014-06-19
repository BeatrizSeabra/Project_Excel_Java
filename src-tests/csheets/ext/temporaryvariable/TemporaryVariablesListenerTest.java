/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.temporaryvariable;

import csheets.core.formula.TemporaryVariable;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogo
 */
public class TemporaryVariablesListenerTest {
    
    public TemporaryVariablesListenerTest() {
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
     * Test of variableCreatedOrUpdated method, of class TemporaryVariablesListener.
     */
    @Test
    public void testVariableCreatedOrUpdated() {
        System.out.println("variableCreatedOrUpdated");
        ArrayList<TemporaryVariable> temporaryVariable = null;
        TemporaryVariablesListener instance = new TemporaryVariablesListenerImpl();
        instance.variableCreatedOrUpdated(temporaryVariable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TemporaryVariablesListenerImpl implements TemporaryVariablesListener {

        public void variableCreatedOrUpdated(ArrayList<TemporaryVariable> temporaryVariable) {
        }
    }
    
}

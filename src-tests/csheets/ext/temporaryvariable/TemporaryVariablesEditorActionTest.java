/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.temporaryvariable;

import java.awt.event.ActionEvent;
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
public class TemporaryVariablesEditorActionTest {
    
    public TemporaryVariablesEditorActionTest() {
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
     * Test of getName method, of class TemporaryVariablesEditorAction.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        TemporaryVariablesEditorAction instance = new TemporaryVariablesEditorAction(null);
        String expResult = "Activate Side Bar";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
}

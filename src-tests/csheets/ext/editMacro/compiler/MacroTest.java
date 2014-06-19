/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.editMacro.compiler;

import csheets.core.formula.compiler.FormulaCompilationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i120388
 */
public class MacroTest {
    
    public MacroTest() {
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
     * Test of getName method, of class Macro.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String macro="macro \"TESTE\"{\n"
                    + "2+2\n"
                    + "2*5\n"
                    + "}";
        Macro instance=null;
        try {
            instance = new Macro(null, macro);
        } catch (FormulaCompilationException ex) {
            Logger.getLogger(MacroTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        String expResult = "TESTE";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of results method, of class Macro.
     */
    @Test
    public void testResults() throws Exception {
        System.out.println("results");
        String macro="macro \"TESTE\"{\n"
                    + "2+2\n"
                    + "2*5\n"
                    + "}";
        
        Macro instance = new Macro(null, macro);
        
        String expResult = "2+2 = 4\n" +
                            "2*5 = 10\n";
        String result = instance.results();
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testResults2() throws Exception {
        System.out.println("results");
        String macro="macro \"TESTE\"{\n"
                    + "2+2\n"
                    + "2*5+3\n"
                    + "}";
        
        Macro instance = new Macro(null, macro);
        
        String expResult = "2+2 = 4\n" +
                            "2*5+3 = 13\n";
        String result = instance.results();
        System.out.println(result);
        assertEquals(expResult, result);
    }
}

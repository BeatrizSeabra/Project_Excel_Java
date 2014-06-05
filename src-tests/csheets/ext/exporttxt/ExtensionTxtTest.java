/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.exporttxt;

import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tiba
 */
public class ExtensionTxtTest {
    
    public ExtensionTxtTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getUIExtension method, of class ExtensionTxt.
     */
    @Test
    public void testGetUIExtension() {
        System.out.println("getUIExtension");
        UIController uiController = null;
        ExtensionTxt instance = new ExtensionTxt();
        UIExtension expResult = null;
        UIExtension result = instance.getUIExtension(uiController);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

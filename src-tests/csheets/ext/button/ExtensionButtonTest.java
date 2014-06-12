/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.button;

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
public class ExtensionButtonTest {

    public ExtensionButtonTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getUIExtension method, of class ExtensionButton.
     */
    @Test
    public void testGetUIExtension() {
        System.out.println("getUIExtension");
        UIController uiController = null;
        ExtensionButton instance = new ExtensionButton();
        UIExtension expResult = null;
        UIExtension result = instance.getUIExtension(uiController);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Testa o metodo searchFiles da classe SearchFilesController.
     */
    @Test
    public void testButton() {
        System.out.println("Button");

    }

}

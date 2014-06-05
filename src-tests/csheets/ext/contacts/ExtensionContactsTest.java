/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.contacts;

import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis
 */
public class ExtensionContactsTest {
    
    public ExtensionContactsTest() {
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
     * Test of getUIExtension method, of class ExtensionContacts.
     */
    @Test
    public void testGetUIExtension() {
        System.out.println("getUIExtension");
        UIController uiController = null;
        ExtensionContacts instance = new ExtensionContacts();
        UIExtension expResult = null;
        UIExtension result = instance.getUIExtension(uiController);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of importOccupations method, of class ExtensionContacts.
     */
    @Test
    public void testImportOccupations() throws Exception {
        System.out.println("importOccupations");
        ExtensionContacts instance = new ExtensionContacts();
        String expResult = "";
        String result = instance.importOccupations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

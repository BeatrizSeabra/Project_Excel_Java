/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.temporaryvariable.ui;

import csheets.core.formula.TemporaryVariable;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JComponent;
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
public class UIExtensionTempVarSideBarTest {
    
    public UIExtensionTempVarSideBarTest() {
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
     * Test of getIcon method, of class UIExtensionTempVarSideBar.
     */
    @Test
    public void testGetIcon() {
        System.out.println("getIcon");
        UIExtensionTempVarSideBar instance = null;
        Icon expResult = null;
        Icon result = instance.getIcon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSideBar method, of class UIExtensionTempVarSideBar.
     */
    @Test
    public void testGetSideBar() {
        System.out.println("getSideBar");
        UIExtensionTempVarSideBar instance = null;
        JComponent expResult = null;
        JComponent result = instance.getSideBar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of variableCreatedOrUpdated method, of class UIExtensionTempVarSideBar.
     */
    @Test
    public void testVariableCreatedOrUpdated() {
        System.out.println("variableCreatedOrUpdated");
        ArrayList<TemporaryVariable> variableList = null;
        UIExtensionTempVarSideBar instance = null;
        instance.variableCreatedOrUpdated(variableList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

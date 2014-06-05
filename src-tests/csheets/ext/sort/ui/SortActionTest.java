/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.sort.ui;

import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
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
public class SortActionTest {
    
    public SortActionTest() {
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
     * Test of getName method, of class SortAction.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        UIController uiController=null;
        SortActionZA instance = new SortActionZA(uiController);
        String expResult = "Sort Cell from Z-A";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of defineProperties method, of class SortAction.
     */
    @Test
    public void testDefineProperties() {
        System.out.println("defineProperties");
        UIController uiController=null;
        SortActionZA instance = new SortActionZA(uiController);
        instance.defineProperties();
    }

    /**
     * Test of actionPerformed method, of class SortAction.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent event = null;
        UIController uiController=null;
        SortActionZA instance = new SortActionZA(uiController);
        instance.actionPerformed(event);
    }

    /**
     * Test of sortAZ method, of class SortAction.
     */
    @Test
    public void testSortAZ() throws Exception {
        System.out.println("sortAZ");
        int maxrows = 0;
        int collumn = 0;
        SortAction instance = null;
        instance.sortAZ(maxrows, collumn);
        
    }
    
}

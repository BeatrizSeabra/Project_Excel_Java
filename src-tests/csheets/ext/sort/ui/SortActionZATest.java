/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.sort.ui;

import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
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
public class SortActionZATest {

    public SortActionZATest() {
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
     * Test of getName method, of class SortActionZA.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        UIController uiController = null;
        SortActionZA instance = new SortActionZA(uiController);
        String expResult = "Sort Cell from Z-A";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of defineProperties method, of class SortActionZA.
     */
    @Test
    public void testDefineProperties() {
        System.out.println("defineProperties");
        UIController uiController = null;
        SortActionZA instance = new SortActionZA(uiController);
        instance.defineProperties();

    }

    /**
     * Test of actionPerformed method, of class SortActionZA.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent event = null;
        UIController uiController = null;
        SortActionZA instance = new SortActionZA(uiController);
        instance.actionPerformed(event);
        fail("The test case is a prototype.");

    }

    /**
     * Test of sortZA method, of class SortActionZA.
     */
    @Test
    public void testSortZA() throws Exception {
        System.out.println("sortZA");
        int maxrows = 4;
        int collumn = 0;
        UIController uiController = null;
        SortActionZA instance = new SortActionZA(uiController);
        instance.sortZA(maxrows, collumn);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToLists method, of class SortActionZA.
     */
    @Test
    public void testAddToLists() throws Exception {
        System.out.println("addToLists");
        int maxrows = 4;
        int collumn = 0;
        UIController uiController = null;
        SortActionZA instance = new SortActionZA(uiController);
        instance.addToLists(maxrows, collumn);
        //Ver aqui se o tamanho dos dois arrays são iguais
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkListEmpty method, of class SortActionZA.
     */
    @Test
    public void testCheckListEmpty() {
        System.out.println("checkListEmpty");
        UIController uiController=null;
        SortActionZA instance = new SortActionZA(uiController);
        instance.checkListEmpty();
        int expected=0;
        int result=instance.conteudos.size();
        assertEquals(expected,result);
        
    }

    /**
     * Test of setContentCells method, of class SortActionZA.
     */
    @Test
    public void testSetContentCells() throws Exception {
        System.out.println("setContentCells");
        int collumn = 0;
        SortActionZA instance = null;
        instance.setContentCells(collumn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of orderContents method, of class SortActionZA.
     */
    @Test
    public void testOrderContents() {
        System.out.println("orderContents");
        SortActionZA instance = null;
        instance.conteudos.set(0, "a");
        instance.conteudos.set(1, "b");
        instance.conteudos.set(2, "c");
        instance.conteudos.set(3, "d");
        instance.orderContents();
        ArrayList test = new ArrayList();
        test.add("d");
        test.add("c");
        test.add("b");
        test.add("a");
        assertEquals(instance.conteudos,test);
        fail("The test case is a prototype.");
    }

}

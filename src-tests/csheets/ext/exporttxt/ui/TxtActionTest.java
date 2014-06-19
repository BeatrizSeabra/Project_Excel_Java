/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.exporttxt.ui;

import csheets.CleanSheets;
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
public class TxtActionTest {
    
    public TxtActionTest() {
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
     * Test of getName method, of class TxtAction.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        CleanSheets app = new CleanSheets();
        UIController ui=new UIController(app);
        TxtAction instance = new TxtAction(ui);
        String expResult = "TXT";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of defineProperties method, of class TxtAction.
     */
    @Test
    public void testDefineProperties() {
        System.out.println("defineProperties");
        CleanSheets app = new CleanSheets();
        UIController ui=new UIController(app);
        TxtAction instance = new TxtAction(ui);
        instance.defineProperties();
    }

    /**
     * Test of actionPerformed method, of class TxtAction.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent event = null;
        TxtAction instance = null;
        instance.actionPerformed(event);

    }

    /**
     * Test of addListeners method, of class TxtAction.
     */
    @Test
    public void testAddListeners() {
        System.out.println("addListeners");
        //Não é possivel ir buscar o UIController do programa pelo que não funciona correctamente o teste unitário
        TxtAction instance = null;
        instance.addListeners();

    }
    
}

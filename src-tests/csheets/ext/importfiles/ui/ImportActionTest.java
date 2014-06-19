/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.importfiles.ui;

import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nélson
 */
public class ImportActionTest {
    
    public ImportActionTest() {
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
     * Test of getName method, of class ImportAction.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        UIController ui = null;
        ImportAction instance = new ImportAction(ui, null);
        String expResult = "TXT ";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of defineProperties method, of class ImportAction.
     */
    @Test
    public void testDefineProperties() {
        System.out.println("defineProperties");
        UIController ui = null;
        ImportAction instance = new ImportAction(ui, null);
        instance.defineProperties();
    }

    /**
     * Test of actionPerformed method, of class ImportAction.
     */
    @Test
    public void testActionPerformed() {
        //É necessario o uiController do programa, nao um criado agora a null
        System.out.println("actionPerformed");
        ActionEvent event = null;
        UIController ui = null;
        ImportAction instance = new ImportAction(ui, null);
        instance.actionPerformed(event);
    }

    /**
     * Test of getFile method, of class ImportAction.
     */
    @Test
    public void testGetFile() {
        System.out.println("getFile");
        UIController ui = null;
        ImportAction instance = new ImportAction(ui, null);
        File expResult = null; //Este teste não tem um resultado esperado, depende da escolha do utilizador no FileChooser
        File result = instance.getFile();
        assertEquals(expResult, result);
    }
    
}

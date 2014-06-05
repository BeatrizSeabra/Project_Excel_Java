/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.exportXML.ui;

import csheets.CleanSheets;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
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
public class XMLActionTest {
    
    public XMLActionTest() {
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
     * Test of actionPerformed method, of class XMLAction.
     */
    @Test
    public void testActionPerformed(){
        System.out.println("actionPerformed");
        CleanSheets sheet=new CleanSheets();
        File file=new File("/src-tests/csheets/ext/exportXML/ui/teste_unitario.cls");
        
        try{
            sheet.load(file);
        }catch(IOException err){
             Logger.getLogger(XMLActionTest.class.getName()).log(Level.SEVERE, null, err);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XMLActionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
             
       
        UIController uicontroller=new UIController(sheet);
        
        XMLAction action = new XMLAction(uicontroller);
        
        ActionEvent e = null;
        
        action.actionPerformed(e);
        
        assertEquals(true, action.unit);
         // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

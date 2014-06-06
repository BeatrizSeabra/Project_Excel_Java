/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.findworkbooksfiles;

import java.io.File;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1090675 - Tiago Pereira
 */
public class FindWorkbooksFilesTest {
    
    public FindWorkbooksFilesTest() {
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
     * Test of findWorkbooksFiles method, of class FindWorkbooksFiles.     
     */
    @Test
    public void testFindWorkbooksFiles() {
        System.out.println("findWorkbooksFiles");
        File startingDirectory = new File("C:\\SuperTeste");
        String pattern = ".*\\.cls";
        FindWorkbooksFiles instance = new FindWorkbooksFiles();
        List<File> expResult = instance.findWorkbooksFiles(startingDirectory, pattern);
        List<File> result = instance.findWorkbooksFiles(startingDirectory, pattern);
        assertEquals(expResult, result);
    }
    
}

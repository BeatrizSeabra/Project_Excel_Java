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
     * The test checks the number of occurrences of the search on "C:\\SuperTeste"
     * directory, the number of workbooks files in this directory are 15 (expResult=15).
     * Compares the number of elements returning in "findWorkbooksFiles" method,
     * and the size of the list, must be equal to the variable expResult.
     */
    @Test
    public void testFindWorkbooksFiles() {
        System.out.println("findWorkbooksFiles");
        long expResult = 15;
        File startingDirectory = new File("C:\\SuperTeste");        
        String pattern = ".*\\.cls";
        FindWorkbooksFiles instance = new FindWorkbooksFiles();
        List<File> result = instance.findWorkbooksFiles(startingDirectory, pattern);
        System.out.println("Expected Value: "+expResult+" founded workbooks files");
        System.out.println("Result: "+result.size()+" founded workbooks files");
        assertEquals(expResult, (long)result.size());
    }
    
}

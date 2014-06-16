/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.residenceimportcleansheets;

import csheets.PersistenceJPA.ContactsRepository;
import csheets.PersistenceJPA.ResidenceRepository;
import csheets.ext.contacts.Contact;
import csheets.ext.contacts.Residence;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test of importContactsResidenceToCleansheets method, of class ResidenceImport.
 * @author 1090675 - Tiago Pereira
 */
public class ResidenceImportTest {
           
    public ResidenceImportTest() {
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
     * Test of importContactsResidenceToCleansheets method, of class ResidenceImport.
     * test if the method can load the data of the tables contacts and residence,
     * and if the size of the list with the loading data from the table is greater 
     * than zero, it is considered that the database fields was imported correctly.
     */
    @Test
    public void testImportContactsResidenceToCleansheets() {
        System.out.println("importContactsResidenceToCleansheets");
        List<Contact> listContact = ContactsRepository.getAll();
        List<Residence> listResidence = ResidenceRepository.getAll();
        if ((listContact.size() > 0) && (listResidence.size() > 0))
        {
            System.out.println("It was possible to import data from database");
            System.out.println("Number of data contacts on database: "+listContact.size());
            System.out.println("Number of data residence on database: "+listResidence.size());
        }
        else
        {
            fail("Unable to import data from database");
        }
    }
        
}
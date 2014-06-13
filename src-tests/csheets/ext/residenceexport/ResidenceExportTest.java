/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.residenceexport;

import csheets.CleanSheets;
import csheets.PersistenceJPA.ContactsRepository;
import csheets.PersistenceJPA.ResidenceRepository;
import csheets.ext.contacts.Contact;
import csheets.ext.contacts.Residence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test of exportContactsResidenceToDatabase method, of class ResidenceExport.
 * @author 1090675 - Tiago Pereira
 */
public class ResidenceExportTest {
    
    CleanSheets app = new CleanSheets();
    
    public ResidenceExportTest() {
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
     * Test of exportContactsResidenceToDatabase method, of class ResidenceExport.
     * test if can be insert or not a new contact and residence on the two tables that
     * have a relationship between then, on the database of the cleansheets application.
     */
    @Test
    public void testExportContactsResidenceToDatabase() {
        System.out.println("exportContactsResidenceToDatabase");
        Residence residence = new Residence();
        residence.setStreet("Rua Santa Catarina");
        residence.setLocality("Santo Ildefonso");
        residence.setPostal_code(4000441);
        residence.setCity("Porto");
        residence.setCountry("Portugal");
        Contact contact = new Contact("Maria", "Monteiro", 1, 0);
        ResidenceRepository.insert(residence);
        ContactsRepository.add(contact);
    }
    
}
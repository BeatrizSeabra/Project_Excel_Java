/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.residenceimportcleansheets;

import csheets.PersistenceJPA.ContactsRepository;
import csheets.PersistenceJPA.ResidenceRepository;
import csheets.core.formula.compiler.FormulaCompilationException;
import csheets.ext.contacts.Contact;
import csheets.ext.contacts.Residence;
import csheets.ext.residenceimportcleansheets.ui.ResidenceImportAction;
import csheets.ui.ctrl.UIController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Class that consult the information of the tables Contacts and Residence, and
 * then load the read information of database, for display to the user of the 
 * cleansheets, the contact information with the respective residences, that can
 * be only the main residence as well, can be the secundary residence. This will
 * be shown, on the cells of cleansheets workspace.
 * @author 1090675 - Tiago Pereira
 */
public class ResidenceImport {
    
    /**
     * Method that received by parameter the uiController that allow to set the
     * information present on the tabels of Contacts and Residence (and their relationship)
     * of the database of application, to write in the cells of the cleansheets, 
     * listing the contact information, with the association between the contact
     * and the residence(s) of that contact, to show this to the user of the application.
     * @param uiController
     */
    public void importContactsResidenceToCleansheets(UIController uiController)
    {
        List<Residence> listResidence = ResidenceRepository.getAll();
        List<Contact> listContact = ContactsRepository.getAll();
        int size = listContact.size();
        int i = 0;
        if (size > 0)
        {
            for (int j = 0; j < size; j++)
            {
                try 
                {
                    uiController.getActiveSpreadsheet().getCell(0, i).setContent(listContact.get(j).getFirstName()+" "+listContact.get(j).getLastName());                    
                    int index = listContact.get(j).getId_residenceFK();
                    int index2 = listContact.get(j).getId_residenceFK2();
                    if (index > 0)
                    {
                        for (Residence r:listResidence)
                        {
                            if (index == r.getId_residence())
                            {
                                uiController.getActiveSpreadsheet().getCell(0, i+1).setContent(r.getStreet());
                                uiController.getActiveSpreadsheet().getCell(1, i+1).setContent(r.getLocality());
                                String postal_code = Integer.toString(r.getPostal_code());
                                String scode = postal_code.substring(4);
                                String spostal = postal_code.substring(0,4);
                                uiController.getActiveSpreadsheet().getCell(2, i+1).setContent(spostal+" - "+scode);
                                uiController.getActiveSpreadsheet().getCell(3, i+1).setContent(r.getCity());
                                uiController.getActiveSpreadsheet().getCell(4, i+1).setContent(r.getCountry());
                                uiController.getActiveSpreadsheet().getCell(5, i+1).setContent("Principal Residence");
                            }
                        }
                        i+=2;
                    }
                    if (index2 > 0)
                    {
                        for (Residence r:listResidence)
                        {
                            if (index2 == r.getId_residence())
                            {
                                uiController.getActiveSpreadsheet().getCell(0, i).setContent(r.getStreet());
                                uiController.getActiveSpreadsheet().getCell(1, i).setContent(r.getLocality());
                                String postal_code = Integer.toString(r.getPostal_code());
                                String scode = postal_code.substring(4);
                                String spostal = postal_code.substring(0,4);
                                uiController.getActiveSpreadsheet().getCell(2, i).setContent(spostal+" - "+scode);
                                uiController.getActiveSpreadsheet().getCell(3, i).setContent(r.getCity());
                                uiController.getActiveSpreadsheet().getCell(4, i).setContent(r.getCountry());
                                uiController.getActiveSpreadsheet().getCell(5, i).setContent("Secondary Residence");
                            }
                        }   
                        i++;
                    }
                } 
                catch (FormulaCompilationException ex) 
                {
                    Logger.getLogger(ResidenceImportAction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "The database is empty, there is no information to display!","Empty Database",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.residenceexport;

import csheets.PersistenceJPA.ContactsRepository;
import csheets.PersistenceJPA.ResidenceRepository;
import csheets.ext.contacts.Contact;
import csheets.ext.contacts.Residence;
import csheets.ui.ctrl.UIController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Class that reads the data written on the cells of cleansheets workspace, 
 * to export this data, to the table of Contacts and Residence on the database, 
 * including a relationship between contacts and residences.
 * @author 1090675 - Tiago Pereira
 */
public class ResidenceExport {
    
    /**
     * Method that received by parameter the uiController that allow to get the
     * information present on the workspace of cleansheets cells, and then
     * export that fields to the table Contacts and Residence on the database,
     * including a relationship between contacts and residences, to insert into
     * the database of the application.
     * @param uiController
     * @throws NullPointerException
     * @throws IndexOutOfBoundsException
     */
    public void exportContactsResidenceToDatabase(UIController uiController) throws NullPointerException, IndexOutOfBoundsException
    {
        try
        {
            int i = 0;
            int lastIndexElement;
            String postal_code;
            List<Residence> listResidence;
            if (uiController.getActiveSpreadsheet().getCell(0, i).getContent().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Don´t have any fields to export to database");
            } 
            else 
            {
               while(!uiController.getActiveSpreadsheet().getCell(0, i).getContent().isEmpty() &&
                    !uiController.getActiveSpreadsheet().getCell(1, i).getContent().isEmpty())
                {    
                    Residence residencePrincipal = new Residence();
                    Contact contact = new Contact();
                    String name = uiController.getActiveSpreadsheet().getCell(0, i).getContent();        
                    String[] str = name.split(" ");
                    contact.setFirstName(str[0]);
                    contact.setLastName(str[1]);
                    residencePrincipal.setStreet(uiController.getActiveSpreadsheet().getCell(1, i).getContent());
                    residencePrincipal.setLocality(uiController.getActiveSpreadsheet().getCell(2, i).getContent());                
                    postal_code = uiController.getActiveSpreadsheet().getCell(3, i).getContent();
                    residencePrincipal.setPostal_code(Integer.parseInt(postal_code.replaceAll("-", "")));
                    residencePrincipal.setCity(uiController.getActiveSpreadsheet().getCell(4, i).getContent());
                    residencePrincipal.setCountry(uiController.getActiveSpreadsheet().getCell(5, i).getContent());
                    ResidenceRepository.insert(residencePrincipal);
                    listResidence = ResidenceRepository.getAll();
                    lastIndexElement = listResidence.get(listResidence.size()-1).getId_residence();
                    contact.setId_residenceFK(lastIndexElement);
                    if (uiController.getActiveSpreadsheet().getCell(0, i+1).getContent().isEmpty() &&
                                !uiController.getActiveSpreadsheet().getCell(1, i+1).getContent().isEmpty())
                    { // if exist a principal and a secondary residence in contact
                        i++;
                        Residence residenceSecondary = new Residence();
                        residenceSecondary.setStreet(uiController.getActiveSpreadsheet().getCell(1, i).getContent());
                        residenceSecondary.setLocality(uiController.getActiveSpreadsheet().getCell(2, i).getContent());                
                        postal_code = uiController.getActiveSpreadsheet().getCell(3, i).getContent();
                        residenceSecondary.setPostal_code(Integer.parseInt(postal_code.replaceAll("-", "")));
                        residenceSecondary.setCity(uiController.getActiveSpreadsheet().getCell(4, i).getContent());
                        residenceSecondary.setCountry(uiController.getActiveSpreadsheet().getCell(5, i).getContent());
                        ResidenceRepository.insert(residenceSecondary);
                        listResidence = ResidenceRepository.getAll();
                        lastIndexElement = listResidence.get(listResidence.size()-1).getId_residence();
                        contact.setId_residenceFK2(lastIndexElement);                
                        i++;
                    }
                    else // if only exist a principal residence in contact
                    {
                        contact.setId_residenceFK2(0);
                        i++;
                    }
                    ContactsRepository.add(contact);
                } 
            }
            JOptionPane.showMessageDialog(null, "Export to database successfully!","Export to database",JOptionPane.INFORMATION_MESSAGE);
        }
        catch (NullPointerException | IndexOutOfBoundsException ex) 
        {
            JOptionPane.showMessageDialog(null, "Data entered incorrectly for the implementation of this option!", "ERROR",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ResidenceExport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
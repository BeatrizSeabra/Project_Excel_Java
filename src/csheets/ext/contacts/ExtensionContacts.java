/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.contacts;

import csheets.ext.Extension;
import csheets.ext.contacts.ui.UIExtensionContacts;
import csheets.ext.simple.ui.UIExtensionExample;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 *
 * @author PedroRosário
 */
public class ExtensionContacts extends Extension {
    
    public static final String NAME = "Contacts";

    public ExtensionContacts() {
        super(NAME);
    }
    
    public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionContacts(this, uiController);
    }
    
    /**
     *  Author: Luís Abreu 1120546
     * @return Returns an Occupation List from a pre-configured CSV file.
     * @throws FileNotFoundException
     */
    public String importOccupations() throws FileNotFoundException{
        
        String occupations = "";
        try (Scanner scanner = new Scanner(new File("src-resources\\csheets\\ext\\contacts\\occupations.csv"))) {
            scanner.useDelimiter("\n");
            while(scanner.hasNext()){
                occupations+=scanner.next()+"\n";
            }
        }
        return occupations;
    }


}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.edMenu;

import csheets.ext.Extension;
import csheets.ext.edMenu.ui.EdMenuUIExtension;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 *
 * @author Pedro
 */

public class EdMenuExtension extends Extension {
    
    /** The name of the extension */
	public static final String NAME = "Add Menu";
    
    /**
    * Creates a new EdMenu extension.
    */
        public EdMenuExtension() {
		super(NAME);
	}
            
    /**
	 * Returns a user interface extension for EdMenu.
	 * @param uiController the user interface controller
	 * @return a user interface extension for EdMenu
	 */
	public UIExtension getUIExtension(UIController uiController) {
		return new EdMenuUIExtension(this, uiController);  
	}   
        

}      
        
        
        
        
        
        
        
        
        
        
        
//}

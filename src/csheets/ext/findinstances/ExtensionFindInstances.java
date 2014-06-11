/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.findinstances;

import csheets.ext.Extension;
import csheets.ext.findinstances.ui.UIExtensionFindInstances;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
/**
 *
 * @author RafaelChaves
 */
public class ExtensionFindInstances extends Extension {

	/** The name of the extension */
	public static final String NAME = "FindInstances";


	/**
	 * Creates a new Example extension.
	 */
	public ExtensionFindInstances() {
		super(NAME);
                
	}
	
	/**
	 * Returns the user interface extension of this extension (an instance of the class {@link  csheets.ext.simple.ui.UIExtensionExample}). <br/>
	 * In this extension example we are only extending the user interface.
	 * @param uiController the user interface controller
	 * @return a user interface extension, or null if none is provided
	 */
	public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionFindInstances(this, uiController);
	}
        
       
}
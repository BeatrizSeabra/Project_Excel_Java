/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.loadextension;

import csheets.ext.Extension;
import csheets.ext.loadextension.ui.UIExtensionLoadExtension;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
/**
 *
 * @author RafaelChaves
 */
public class ExtensionLoadExtension extends Extension {

	/** The name of the extension */
	public static final String NAME = "Load Extension";


	/**
	 * Creates a new Example extension.
	 */
	public ExtensionLoadExtension() {
		super(NAME);
                
	}
	
	/**
	 * Returns the user interface extension of this extension (an instance of the class {@link  csheets.ext.findinstances.ui.UIExtensionFindInstances}). <br/>
	 * In this extension example we are only extending the user interface.
	 * @param uiController the user interface controller
	 * @return a user interface extension, or null if none is provided
	 */
	public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionLoadExtension(this, uiController);
	}
        
       
}
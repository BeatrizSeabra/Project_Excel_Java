/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.extensionsmanager;

import csheets.ext.Extension;
import csheets.ext.extensionsmanager.ui.UIExtensionsManager;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 *
 * @author Oleg
 */
public class ExtensionsManager extends Extension {
    
    /** The name of the extension */
	public static final String NAME = "Extensions Manager";

	/**
	 * Creates a new Example extension.
	 */
	public ExtensionsManager() {
		super(NAME);
	}
	
	/**
	 * Returns the user interface extension of this extension (an instance of the class {@link  csheets.ext.simple.ui.UIExtensionExample}). <br/>
	 * In this extension example we are only extending the user interface.
	 * @param uiController the user interface controller
	 * @return a user interface extension, or null if none is provided
	 */
	public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionsManager(this, uiController);
	}
    
}

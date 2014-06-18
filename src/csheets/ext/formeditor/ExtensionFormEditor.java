/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.formeditor;

import csheets.ext.Extension;
import csheets.ext.formeditor.ui.UIExtensionFormEditor;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 *
 * @author Oleg and Rui 1110506
 */
public class ExtensionFormEditor extends Extension {
    
    /** The name of the extension */
	public static final String NAME = "Form Editor";

	/**
	 * Creates a new Example extension.
	 */
	public ExtensionFormEditor() {
		super(NAME);
	}
	
	/**
	 * Returns the user interface extension of this extension (an instance of the class {@link  csheets.ext.simple.ui.UIExtensionExample}). <br/>
	 * In this extension example we are only extending the user interface.
	 * @param uiController the user interface controller
	 * @return a user interface extension, or null if none is provided
	 */
	public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionFormEditor(this, uiController);
	}
   
}

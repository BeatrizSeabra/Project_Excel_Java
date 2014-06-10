/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.residenceimport;

import csheets.ext.Extension;
import csheets.ext.residenceimport.ui.UIExtensionResidenceImport;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 * A simple extension just to show how the extension mechanism works.
 * An extension must extend the Extension abstract class.
 * The class that implements the Extension is the "bootstrap" of the extension.
 * @see Extension
 * @author Alexandre Braganca
 */
public class ExtensionResidenceImport extends Extension {

	/** The name of the extension */
	public static final String NAME = "Residence";

	/**
	 * Creates a new Example extension.
	 */
	public ExtensionResidenceImport() {
            super(NAME);
	}
	
	/**
	 * Returns the user interface extension of this extension (an instance of the class {@link  csheets.ext.simple.ui.UIExtensionExample}). <br/>
	 * In this extension example we are only extending the user interface.
	 * @param uiController the user interface controller
	 * @return a user interface extension, or null if none is provided
	 */
        @Override
	public UIExtension getUIExtension(UIController uiController) {
            return new UIExtensionResidenceImport(this, uiController);
	}
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.image;

import csheets.ext.Extension;
import csheets.ext.image.ui.UIExtensionImage;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 *
 * @author Nélson
 */
public class ExtensionImage extends Extension {
    public static final String NAME = "Image";

	/**
	 * Creates a new Example extension.
	 */
	public ExtensionImage() {
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
		return new UIExtensionImage(this, uiController);
	}
}

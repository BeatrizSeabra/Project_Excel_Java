package csheets.ext.findworkbooksfiles;

import csheets.ext.Extension;
import csheets.ext.simple.ui.UIExtensionExample;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 * A simple extension just to show how the extension mechanism works.
 * An extension must extend the Extension abstract class.
 * The class that implements the Extension is the "bootstrap" of the extension.
 * @see Extension
 * @author 1090675
 */
public class ExtensionFindWorkbooksFiles extends Extension {

	/** The name of the extension */
	public static final String NAME = "Find Workbooks Files";

	/**
	 * Creates a new Example extension.
	 */
	public ExtensionFindWorkbooksFiles() {
		super(NAME);
	}
	
	/**
	 * Returns the user interface extension of this extension (an instance of the class {@link  csheets.ext.simple.ui.UIExtensionExample}). <br/>
	 * In this extension example we are only extending the user interface.
	 * @param uiController the user interface controller
	 * @return a user interface extension, or null if none is provided
	 */
	public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionExample(this, uiController);
	}
}

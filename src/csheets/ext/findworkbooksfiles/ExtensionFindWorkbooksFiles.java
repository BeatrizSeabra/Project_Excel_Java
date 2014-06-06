package csheets.ext.findworkbooksfiles;

import csheets.ext.Extension;
import csheets.ext.findworkbooksfiles.ui.UIExtensionFindWorkbooksFiles;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 * A simple extension just to show how the extension mechanism works.
 * An extension must extend the Extension abstract class.
 * The class that implements the Extension is the "bootstrap" of the extension.
 * @see Extension
 * @author 1090675 - Tiago Pereira
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
	 * Returns the user interface extension of this extension (an instance of the class {@link  csheets.ext.findworkbooksfiles.ui.UIExtensionFindWorkbooksFiles}). <br/>	
	 * @param uiController the user interface controller
	 * @return a user interface extension, or null if none is provided
	 */
        @Override
	public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionFindWorkbooksFiles(this, uiController);
	}
}

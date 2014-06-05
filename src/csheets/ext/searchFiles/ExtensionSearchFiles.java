package csheets.ext.searchFiles;

import csheets.ext.Extension;
import csheets.ext.searchFiles.ui.UIExtensionSearchFiles;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 * @author 1120564MarcoEsteves
 */
public class ExtensionSearchFiles extends Extension {

	/** The name of the extension */
	public static final String NAME = "Search Files";

	/**
	 * Creates a new Example extension.
	 */
	public ExtensionSearchFiles() {
		super(NAME);
	}
	
	/**
	 * @return a user interface extension, or null if none is provided
	 */
	public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionSearchFiles(this, uiController);
	}
}

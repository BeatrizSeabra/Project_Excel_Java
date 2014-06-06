package csheets.ext.searchFiles;

import csheets.ext.Extension;
import csheets.ext.searchFiles.ui.UIExtensionSearchFiles;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 * @author 1120564MarcoEsteves
 */
public class ExtensionSearchFiles extends Extension {

	/** Nome da Extensao */
	public static final String NAME = "Search Files";

	/**
	 * Cria uma nova Extensao SearchFiles.
	 */
	public ExtensionSearchFiles() {
		super(NAME);
	}
	
	/**
	 * @return Uma interface para o Utilizador.
	 */
	public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionSearchFiles(this, uiController);
	}
}

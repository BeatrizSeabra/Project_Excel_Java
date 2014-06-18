package csheets.ext.editMacro;

import csheets.ext.Extension;
import csheets.ext.editMacro.ui.UIExtensionEditMacro;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 * Representa o extensao Run Macro.
 *
 * @author 1120564MarcoEsteves
 */
public class ExtensionEditMacro extends Extension {
    
    /** Nome da Extensao */
	public static final String NAME = "Run Macro";

	/**
	 * Cria uma nova Extensao RunMacro.
	 */
	public ExtensionEditMacro() {
		super(NAME);
	}
	
	/**
	 * @return Uma interface para o Utilizador.
	 */
	public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionEditMacro(this, uiController);
	}
}

package csheets.ext.runMacro;

import csheets.ext.Extension;
import csheets.ext.runMacro.ui.UIExtensionRunMacro;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 * Representa o extensao Run Macro.
 *
 * @author 1120564MarcoEsteves
 */
public class ExtensionRunMacro extends Extension {
    
    /** Nome da Extensao */
	public static final String NAME = "Run Macro";

	/**
	 * Cria uma nova Extensao RunMacro.
	 */
	public ExtensionRunMacro() {
		super(NAME);
	}
	
	/**
	 * @return Uma interface para o Utilizador.
	 */
	public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionRunMacro(this, uiController);
	}
}

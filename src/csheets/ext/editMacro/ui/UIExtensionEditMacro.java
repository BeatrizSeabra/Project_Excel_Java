package csheets.ext.editMacro.ui;

import csheets.ext.Extension;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import javax.swing.Icon;
import javax.swing.JMenu;
/**
 * Representa o criacçao do menu Edit Macro.
 * 
 * @author 1120388
 */
public class UIExtensionEditMacro extends UIExtension {

	/** Icon mostrado com o nome da Extensao. */
	private Icon icon;

	/** Menu da extensao */
	private editMacroMenu menu;

	public UIExtensionEditMacro(Extension extension, UIController uiController) {
		super(extension, uiController);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Retorna o Icon mostrado com o nome da Extensao
	 */
	public Icon getIcon() {
		return null;
	}

	/**
	 * Retorna a instancia da classe que cria o JMenu.
	 * @see editMacroMenu
	 * @return Um componente JMenu.
	 */
	public JMenu getMenu() {
		if (menu == null)
			menu = new editMacroMenu(uiController);
		return menu;
	}
}

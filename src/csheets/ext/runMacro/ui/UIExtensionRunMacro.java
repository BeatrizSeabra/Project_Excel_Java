package csheets.ext.runMacro.ui;

import csheets.ext.Extension;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
/**
 * Representa o criacçao do menu Run Macro.
 * 
 * @author 1120564MarcoEsteves
 */
public class UIExtensionRunMacro extends UIExtension {

	/** Icon mostrado com o nome da Extensao. */
	private Icon icon;

	/** Menu da extensao */
	private runMacroMenu menu;

	public UIExtensionRunMacro(Extension extension, UIController uiController) {
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
	 * @see runMacroMenu
	 * @return Um componente JMenu.
	 */
	public JMenu getMenu() {
		if (menu == null)
			menu = new runMacroMenu(uiController);
		return menu;
	}
}

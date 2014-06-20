/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.macrotomenuitem.ui;
import csheets.ext.macrotomenuitem.ExtensionMacroToMenuItem;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import javax.swing.JMenu;
import javax.swing.JToolBar;

/**
 *
 * @author 1090675 - Tiago Pereira
 */
public class UIExtensionMacroToMenuItem extends UIExtension {

	/** A menu that provides editing of Menu */
	private MacroToMenuItemMenu menu;


	/**
	 * Creates a new user interface extension for Menu Editor.
	 * @param extension the extension for which components are provided
	 * @param uiController the user interface controller
	 */
	public UIExtensionMacroToMenuItem(ExtensionMacroToMenuItem extension, UIController uiController) {
		super(extension, uiController);
	}

	/**
	 * Returns a menu that provides editing of Menu.
	 * @return a JMenu component
	 */
	public JMenu getMenu() {
		if (menu == null)
			menu = new MacroToMenuItemMenu(uiController);
		return menu;
	}

	/**
	 * Returns a toolbar that provides editing of Menu.
	 * @return a JToolBar component
	 */
	public JToolBar getToolBar() {
		return null;
	}
        
}
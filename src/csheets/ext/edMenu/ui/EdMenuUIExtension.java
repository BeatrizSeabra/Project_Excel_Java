/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.edMenu.ui;

import csheets.ext.edMenu.EdMenuExtension;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import javax.swing.JMenu;
import javax.swing.JToolBar;

/**
 *
 * @author Pedro
 */
public class EdMenuUIExtension extends UIExtension {

	/** A menu that provides editing of Menu */
	private EdMenuMenu menu;


	/**
	 * Creates a new user interface extension for Menu Editor.
	 * @param extension the extension for which components are provided
	 * @param uiController the user interface controller
	 */
	public EdMenuUIExtension(EdMenuExtension extension, UIController uiController) {
		super(extension, uiController);
	}

	/**
	 * Returns a menu that provides editing of style.
	 * @return a JMenu component
	 */
	public JMenu getMenu() {
		if (menu == null)
			menu = new EdMenuMenu(uiController);
		return menu;
	}

	/**
	 * Returns a toolbar that provides editing of style.
	 * @return a JToolBar component
	 */
	public JToolBar getToolBar() {
		return null;
	}
}

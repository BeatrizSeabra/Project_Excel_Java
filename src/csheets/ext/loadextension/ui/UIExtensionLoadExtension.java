/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.loadextension.ui;

/**
 *
 * @author RafaelChaves
 */

import javax.swing.Icon;
import javax.swing.JMenu;

import csheets.ext.Extension;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 * This class implements the UI interface extension for the simple extension.
 * A UI interface extension must extend the UIExtension abstract class.
 * @see UIExtension
 * @author RafaelChaves
 */
public class UIExtensionLoadExtension extends UIExtension {

	/** The icon to display with the extension's name */
	private Icon icon;

	/** The menu of the extension */
	private LoadExtensionMenu menu;

	public UIExtensionLoadExtension(Extension extension, UIController uiController) {
		super(extension, uiController);
	}
	
	/**
	 * Returns an icon to display with the extension's name.
	 * @return an icon with style
	 */
	public Icon getIcon() {
		return null;
	}


	/**
	 * Returns an instance of a class that implements JMenu.
	 * In this simple case this class only supplies one menu option.
	 * @see FinsIntancesMenu
	 * @return a JMenu component
	 */
	public JMenu getMenu() {
		if (menu == null)
			menu = new LoadExtensionMenu(uiController);
		return menu;
	}
	
}
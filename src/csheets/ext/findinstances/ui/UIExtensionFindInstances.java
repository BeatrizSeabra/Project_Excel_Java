/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.findinstances.ui;

/**
 *
 * @author RafaelChaves
 */

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JToolBar;

import csheets.ext.Extension;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.CellDecorator;
import csheets.ui.ext.TableDecorator;
import csheets.ui.ext.UIExtension;
import java.util.ArrayList;

/**
 * This class implements the UI interface extension for the simple extension.
 * A UI interface extension must extend the UIExtension abstract class.
 * @see UIExtension
 * @author RafaelChaves
 */
public class UIExtensionFindInstances extends UIExtension {

	/** The icon to display with the extension's name */
	private Icon icon;

	/** The menu of the extension */
	private FindInstancesMenu menu;

	public UIExtensionFindInstances(Extension extension, UIController uiController) {
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
			menu = new FindInstancesMenu(uiController);
		return menu;
	}
	
}

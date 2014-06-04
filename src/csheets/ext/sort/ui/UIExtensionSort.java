/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.sort.ui;

/**
 *
 * @author Stefan Parker
 */
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JToolBar;

import csheets.ext.Extension;
import csheets.ext.sort.SortExtension;
import csheets.ext.style.StyleExtension;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.CellDecorator;
import csheets.ui.ext.TableDecorator;
import csheets.ui.ext.UIExtension;
import javax.swing.ImageIcon;

/**
 * This class implements the UI interface extension for the simple extension.
 * A UI interface extension must extend the UIExtension abstract class.
 * @see UIExtension
 * @author Alexandre Braganca
 */
public class UIExtensionSort extends UIExtension {

	/** The icon to display with the extension's name */
	private Icon icon;

	/** The menu of the extension */
	private SortMenu menu;

	public UIExtensionSort(Extension extension, UIController uiController) {
		super(extension, uiController);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Returns an icon to display with the extension's name.
	 * @return an icon with style
	 */
	public Icon getIcon() {
//		if (icon == null)
//			icon = new ImageIcon(
//				SortExtension.class.getResource("res/img/logo.gif"));
//		return icon;
            return null;
            
	}

	/**
	 * Returns an instance of a class that implements JMenu.
	 * In this simple case this class only supplies one menu option.
	 * @see InvokeFunctionMenu
	 * @return a JMenu component
	 */
	public JMenu getMenu() {
		if (menu == null)
                    menu=new SortMenu(uiController);
		return menu;
	}
	
	/**
	 * Returns a cell decorator that visualizes the data added by the extension.
	 * @return a cell decorator, or null if the extension does not provide one
	 */
	public CellDecorator getCellDecorator() {
		return null;
	}

	/**
	 * Returns a table decorator that visualizes the data added by the extension.
	 * @return a table decorator, or null if the extension does not provide one
	 */
		
	
	/**
	 * Returns a toolbar that gives access to extension-specific
	 * functionality.
	 * @return a JToolBar component, or null if the extension does not provide one
	 */
	public JToolBar getToolBar() {
		return null;
	}

	/**
	 * Returns a side bar that gives access to extension-specific
	 * functionality.
	 * @return a component, or null if the extension does not provide one
	 */
	
}

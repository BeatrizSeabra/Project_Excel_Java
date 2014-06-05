package csheets.ext.searchFiles.ui;

import csheets.ext.simple.ui.*;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JToolBar;

import csheets.ext.Extension;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.CellDecorator;
import csheets.ui.ext.TableDecorator;
import csheets.ui.ext.UIExtension;

/**
 * This class implements the UI interface extension for the simple extension.
 * A UI interface extension must extend the UIExtension abstract class.
 * @see UIExtension
 * @author 1120564MarcoEsteves
 */
public class UIExtensionSearchFiles extends UIExtension {

	/** The icon to display with the extension's name */
	private Icon icon;

	/** The menu of the extension */
	private searchFilesMenu menu;

	public UIExtensionSearchFiles(Extension extension, UIController uiController) {
		super(extension, uiController);
		// TODO Auto-generated constructor stub
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
	 * @see searchFilesMenu
	 * @return a JMenu component
	 */
	public JMenu getMenu() {
		if (menu == null)
			menu = new searchFilesMenu(uiController);
		return menu;
	}

}
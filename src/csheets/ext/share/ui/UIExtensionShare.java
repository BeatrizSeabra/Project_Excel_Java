package csheets.ext.share.ui;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JToolBar;

import csheets.ext.Extension;
import csheets.ext.share.ExtensionShare;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.CellDecorator;
import csheets.ui.ext.TableDecorator;
import csheets.ui.ext.UIExtension;
import javax.swing.ImageIcon;

/**
 **
 * This class implements the UI interface extension for the share extension. A
 * UI interface extension must extend the UIExtension abstract class.
 *
 * @see UIExtension
 *
 * @author Rui 1110506 and Oleg 1120622
 */
public class UIExtensionShare extends UIExtension {

    /**
     * The icon to display with the extension's name
     */
    private Icon icon;
    private JComponent sideBar;
    
    /**
     * The menu of the extension
     */
    private ShareMenu menu;

    public UIExtensionShare(Extension extension, UIController uiController) {
        super(extension, uiController);
        // TODO Auto-generated constructor stub
    }

    /**
     * Returns an icon to display with the extension's name.
     *
     * @return an icon with style
     */
    public Icon getIcon() {
        if (icon == null)
			icon = new ImageIcon(
				ExtensionShare.class.getResource("res/img/share.png"));
		return icon;
    }

    /**
     * Returns an instance of a class that implements JMenu.
     *
     * @see ShareMenu
     * @return a JMenu component
     */
    public JMenu getMenu() {
        if (menu == null) {
            menu = new ShareMenu(uiController);
        }
        return menu;
    }

    /**
     * Returns a cell decorator that visualizes the data added by the extension.
     *
     * @return a cell decorator, or null if the extension does not provide one
     */
    public CellDecorator getCellDecorator() {
        return null;
    }

    /**
     * Returns a table decorator that visualizes the data added by the
     * extension.
     *
     * @return a table decorator, or null if the extension does not provide one
     */
    public TableDecorator getTableDecorator() {
        return null;
    }

    /**
     * Returns a toolbar that gives access to extension-specific functionality.
     *
     * @return a JToolBar component, or null if the extension does not provide
     * one
     */
    public JToolBar getToolBar() {
        return null;
    }

    /**
     * Returns a side bar that gives access to extension-specific functionality.
     *
     * @return a component, or null if the extension does not provide one
     */
    public JComponent getSideBar() {
        if (sideBar == null)
			sideBar = new SharePanel(uiController);
		return sideBar;
    }

}

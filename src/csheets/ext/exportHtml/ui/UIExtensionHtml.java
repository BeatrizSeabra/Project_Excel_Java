package csheets.ext.exportHtml.ui;

import csheets.ext.Extension;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.CellDecorator;
import csheets.ui.ext.TableDecorator;
import csheets.ui.ext.UIExtension;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JToolBar;

/**
 *
 * @author 1040314 - João Paulo Silva
 */
public class UIExtensionHtml extends UIExtension {

    /**
     * The icon to display with the extension's name
     */
    private Icon icon;

    /**
     * The menu of the extension
     */
    private HtmlMenu menu;

    public UIExtensionHtml(Extension extension, UIController uiController) {
        super(extension, uiController);
        // TODO Auto-generated constructor stub
    }

    /**
     * Returns an icon to display with the extension's name.
     *
     * @return an icon with style
     */
    public Icon getIcon() {
        return null;
    }

    /**
     * Returns an instance of a class that implements JMenu. In this simple case
     * this class only supplies one menu option.
     *
     * @see ExampleMenu
     * @return a JMenu component
     */
    public JMenu getMenu() {
        if (menu == null) {
            menu = new HtmlMenu(uiController);
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
        return null;
    }
}

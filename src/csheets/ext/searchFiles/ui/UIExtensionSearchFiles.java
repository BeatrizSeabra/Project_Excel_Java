package csheets.ext.searchFiles.ui;


import csheets.CleanSheets;
import javax.swing.Icon;
import javax.swing.JMenu;


import csheets.ext.Extension;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import javax.swing.ImageIcon;

/**
 * Esta classe implementa a interface UI da Extensao SearchFiles.
 * @author 1120564MarcoEsteves
 */
public class UIExtensionSearchFiles extends UIExtension {

	/** Icon mostrado com o nome da Extensao. */
	private Icon icon;

	/** Menu da extensao */
	private searchFilesMenu menu;

	public UIExtensionSearchFiles(Extension extension, UIController uiController) {
		super(extension, uiController);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Retorna o Icon mostrado com o nome da Extensao
	 */
	public Icon getIcon() {
		if (icon == null){
                    icon = new ImageIcon(CleanSheets.class.getResource("res/img/find.gif"));
                }
		return icon;
	}

	/**
	 * Retorna a instancia da classe que cria o JMenu.
	 * @see searchFilesMenu
	 * @return Um componente JMenu.
	 */
	public JMenu getMenu() {
		if (menu == null)
			menu = new searchFilesMenu(uiController);
		return menu;
	}

}
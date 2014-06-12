package csheets.ext.beanshell;

import csheets.ext.Extension;
import csheets.ext.beanshell.ui.UIbeanShellExtension;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;


/**
 *
 * @author Fabio Carvalho 1121228
 */
public class BeanShellExtension extends Extension {
    
     /** The name of the extension */
	public static final String NAME = "BeanShell";

	/**
	 * Creates a new Example extension.
	 */
	public BeanShellExtension() {
		super(NAME);
	}
	
	/**
	 * Returns the user interface extension of this extension (an instance of the class {@link  csheets.ext.simple.ui.UIExtensionExample}). <br/>
	 * In this extension example we are only extending the user interface.
	 * @param uiController the user interface controller
	 * @return a user interface extension, or null if none is provided
	 */
	public UIExtension getUIExtension(UIController uiController) {
		return new UIbeanShellExtension(this, uiController);
	}
	
}

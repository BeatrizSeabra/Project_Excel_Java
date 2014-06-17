package csheets.ext.exportHtml;

/**
 * @author 1040314 - João Paulo Silva
 */


import csheets.ext.Extension;
import csheets.ext.exportHtml.ui.UIExtensionHtml;



import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

public class ExtensionHtml extends Extension {

    /**
     * The name of the extension
     */
    public static final String NAME = "Export";

    public ExtensionHtml() {
        super(NAME);
    }
    
    public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionHtml(this, uiController);
	}
    
}
package csheets.ext.exportXML;

/**
 * @author i120388
 */

import csheets.ext.Extension;
import csheets.ext.exportXML.ui.UIExtensionXML;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

public class ExtensionXML extends Extension {

    /**
     * The name of the extension
     */
    public static final String NAME = "Export";

    public ExtensionXML() {
        super(NAME);
    }
    
    public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionXML(this, uiController);
	}
    
}

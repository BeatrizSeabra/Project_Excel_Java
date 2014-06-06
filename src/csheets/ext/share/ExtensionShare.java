package csheets.ext.share;

import csheets.ext.Extension;
import csheets.ext.share.ui.UIExtensionShare;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 * An extension must extend the Extension abstract class. The class that
 * implements the Extension is the "bootstrap" of the extension.
 *
 * @see Extension
 *
 * @author Rui 1110506
 */
public class ExtensionShare extends Extension {

    /**
     * The name of the extension
     */
    public static final String NAME = "Share";

    /**
     * Creates a new Share extension.
     */
    public ExtensionShare() {
        super(NAME);
    }

    /**
     * Returns the user interface extension of this extension (an instance of
     * the class {@link  csheets.ext.share.ui.UIExtensionShare}). <br/>
     *
     * @param uiController the user interface controller
     * @return a user interface extension, or null if none is provided
     */
    public UIExtension getUIExtension(UIController uiController) {
        return new UIExtensionShare(this, uiController);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.email;

import csheets.ext.Extension;
import csheets.ext.email.ui.UIExtensionEmail;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 * A simple extension just to show how the extension mechanism works. An
 * extension must extend the Extension abstract class. The class that implements
 * the Extension is the "bootstrap" of the extension.
 *
 * @see Extension
 * @author Rui 1110506
 */
public class ExtensionEmail extends Extension {

    /**
     * The name of the extension
     */
    public static final String NAME = "Email";

    /**
     * Creates a new Example extension.
     */
    public ExtensionEmail() {
        super(NAME);
    }

    /**
     * Returns the user interface extension of this extension (an instance of
     * the class {@link  csheets.ext.simple.ui.UIExtensionExample}). <br/>
     * In this extension example we are only extending the user interface.
     *
     * @param uiController the user interface controller
     * @return a user interface extension, or null if none is provided
     */
    public UIExtension getUIExtension(UIController uiController) {
        return new UIExtensionEmail(this, uiController);
    }
}

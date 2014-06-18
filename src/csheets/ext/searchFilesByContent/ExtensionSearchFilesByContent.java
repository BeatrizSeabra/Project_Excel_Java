/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.searchFilesByContent;

import csheets.ext.Extension;
import csheets.ext.searchFilesByContent.ui.UIExtensionSearchFilesByContent;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 *
 * @author Pedro
 */
    
public class ExtensionSearchFilesByContent extends Extension {

    /**
     * Nome da Extensao
     */
    public static final String NAME = "Search Files by Content";

    /**
     * Cria uma nova Extensao SearchFiles.
     */
    public ExtensionSearchFilesByContent() {
        super(NAME);
    }

    /**
     * @return Uma interface para o Utilizador.
     */
    public UIExtension getUIExtension(UIController uiController) {
        return new UIExtensionSearchFilesByContent(this, uiController);
    }

}

package csheets.ext.searchFilesBackground;

/**
 * @author i120388
 */
import csheets.ext.Extension;
import csheets.ext.searchFilesBackground.ui.UIExtensionSearchFilesBackground;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

public class ExtensionSearchFilesBackground extends Extension {

    /**
     * Nome da Extensao
     */
    public static final String NAME = "Search Files in Background";

    /**
     * Cria uma nova Extensao SearchFiles.
     */
    public ExtensionSearchFilesBackground() {
        super(NAME);
    }

    /**
     * @return Uma interface para o Utilizador.
     */
    public UIExtension getUIExtension(UIController uiController) {
        return new UIExtensionSearchFilesBackground(this, uiController);
    }

}

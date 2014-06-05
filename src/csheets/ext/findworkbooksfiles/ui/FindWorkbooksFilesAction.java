package csheets.ext.findworkbooksfiles.ui;

import csheets.ext.findworkbooksfiles.ui.*;
import java.awt.event.ActionEvent;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;

/**
 * An action of the find workbooks files that allow to find a workbook file,
 * in a diretory choosed by the user, the file chooser window (instance of FileChooser class).
 * @author 1090675
 */
public class FindWorkbooksFilesAction extends BaseAction {

	/** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public FindWorkbooksFilesAction(UIController uiController) {
		this.uiController = uiController;
	}

        @Override
	protected String getName() {
		return "Find Workbooks Files...";
	}

        @Override
	protected void defineProperties() {
	}

	/**
	 * A simple action that presents a confirmation dialog.
	 * If the user confirms then the contents of the cell A1 of the current sheet are set to the string "Changed".
	 * @param event the event that was fired
	 */
        @Override
	public void actionPerformed(ActionEvent event) {

            // declarar a classe que desenha a janela
	}
}

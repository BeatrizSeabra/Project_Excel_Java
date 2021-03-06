package csheets.ext.searchFilesBackground.ui;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

/**
 *
 * @author i120388
 */
public class SearchFilesBackgroundAction extends BaseAction {
     
     
    /**
     * The user interface controller
     */
    protected UIController uiController;

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public SearchFilesBackgroundAction(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "Search Files in Background";
    }

    protected void defineProperties() {
    }

    /**
     * A simple action that presents a confirmation dialog. If the user confirms
     * then the contents of the cell A1 of the current sheet are set to the
     * string "Changed".
     *
     * @param event the event that was fired
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        JDialogSearchFilesBackground background=new JDialogSearchFilesBackground(null, true,uiController);
        background.setVisible(true);
        background.setResizable(false);
        background.setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
        background.pack();
        background.setLocationRelativeTo(null);
        
    }

}

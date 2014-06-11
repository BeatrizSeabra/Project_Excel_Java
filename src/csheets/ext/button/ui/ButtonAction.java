package csheets.ext.button.ui;

import csheets.core.Address;

import java.awt.event.ActionEvent;

import csheets.ui.ctrl.FocusOwnerAction;
import csheets.ui.ctrl.UIController;

import java.awt.Dimension;

import javax.swing.JButton;

import javax.swing.JPanel;

/**
 * An action of the simple extension that exemplifies how to interact with the
 * spreadsheet.
 *
 * @author Tiba
 */
public class ButtonAction extends FocusOwnerAction {

    /**
     * The user interface controller
     */
    protected UIController uiController;

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public ButtonAction(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "Insert Button";
    }

    protected void defineProperties() {
    }

    /**
     * The action proposal is create a button over the sheet with a randow text
     * "Button ..". Scrowling the spreadsheet dont't affect the create buttons.
     *
     * @param event the event that was fired
     */
    public void actionPerformed(ActionEvent event) {

        JPanel jp = new JPanel();
        jp.setOpaque(false);
        jp.setLayout(null);

        JButton btn1 = new JButton("Button 1");
        btn1.setBounds(200, 400, 100, 25);

        jp.add(btn1);
        focusOwner.getRootPane().setGlassPane(jp);
        jp.setVisible(true);
    }
}

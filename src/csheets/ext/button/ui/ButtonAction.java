package csheets.ext.button.ui;

import java.awt.event.ActionEvent;

import csheets.ui.ctrl.FocusOwnerAction;
import csheets.ui.ctrl.UIController;

import javax.swing.JButton;

import javax.swing.JPanel;

/*
 *
 * @author Tiba
 */
public class ButtonAction extends FocusOwnerAction {

    private int cont = 1;

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
     * "Button .."
     *
     * @param event the event that was fired
     */
    public void actionPerformed(ActionEvent event) {
        JPanel jp = new JPanel();
        jp.setOpaque(false);
        jp.setLayout(null);

        JButton btn1 = new JButton("Button " + cont);
        btn1.setBounds(200 + cont * 10, 400 + cont * 10, 100, 25);
        cont++;
        jp.add(btn1);
        focusOwner.getRootPane().setGlassPane(jp);
        jp.setVisible(true);
    }
}

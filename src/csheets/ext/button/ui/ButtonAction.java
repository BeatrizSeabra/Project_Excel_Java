package csheets.ext.button.ui;

import csheets.core.*;
import java.awt.event.*;

import csheets.ui.ctrl.*;

import javax.swing.*;


/*
 *
 * @author Tiba
 */
public class ButtonAction extends FocusOwnerAction {

    private int cont = 1;
    JPanel jp = new JPanel();

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

        jp.setOpaque(false);
        jp.setLayout(null);

        JButton btn1 = new JButton("Button " + cont);
        cont++;
        Address i = this.uiController.getActiveCell().getAddress();
        btn1.setBounds(i.getRow()*30 + 100, i.getColumn()*20 + 100, 90, 40);
        jp.add(btn1);
        focusOwner.getRootPane().setGlassPane(jp);
        jp.setVisible(true);

    }
}

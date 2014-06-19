package csheets.ext.button.ui;

import csheets.core.*;
import csheets.core.formula.Expression;
import csheets.core.formula.compiler.ExcelExpressionCompiler;
import csheets.core.formula.compiler.FormulaCompilationException;
import java.awt.event.*;
import csheets.ui.ctrl.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

/*
 *
 * @author Tiba and Marc
 */
public class ButtonAction extends FocusOwnerAction {

    private int cont = 0;
    ArrayList<JButton> buttons = new ArrayList();
    JPanel jp = new JPanel();
    JButton button = new JButton();

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
     * @param event the event that was fired
     */
    public void actionPerformed(ActionEvent event) {

        final JFrame frame = new JFrame("Button Properties");
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        final JTextField txt1 = new JTextField("Insert Text");
        final JTextField txt2 = new JTextField("Example: =A1+A2");
        txt1.selectAll();
        String[] colors = {"Red", "Blue", "Yellow", "Green"};
        final JComboBox combobox = new JComboBox(colors);
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        
        jp2.setLayout(new GridLayout(3, 2, 15, 15));
        jp2.add(new JLabel("Button Text:"));
        jp2.add(txt1);
        
        jp2.add(new JLabel("Formula:"));
        jp2.add(txt2);

        jp2.add(new JLabel("Color:"));
        jp2.add(combobox);

        jp3.setLayout(new FlowLayout());
        jp3.add(okButton);
        jp3.add(cancelButton);

        jp1.setLayout(new BorderLayout());
        jp1.add(jp2, BorderLayout.NORTH);
        jp1.add(jp3, BorderLayout.SOUTH);

        frame.add(jp1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 200);
        frame.setVisible(true);

        //Botao "OK"
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                button = new JButton();
                button.setText(txt1.getText());
                button.setToolTipText(txt2.getText());
                
                if (combobox.getSelectedItem().equals("Red")) {
                    button.setBackground(Color.red);
                } else if (combobox.getSelectedItem().equals("Blue")) {
                    button.setBackground(Color.BLUE);
                } else if (combobox.getSelectedItem().equals("Yellow")) {
                    button.setBackground(Color.YELLOW);
                } else if (combobox.getSelectedItem().equals("Green")) {
                    button.setBackground(Color.GREEN);
                }
                Dimension size = button.getSize();
                buttons.add(button);
                Address i = uiController.getActiveCell().getAddress();
                button.setBounds(i.getRow() * 30 + 100, i.getColumn() * 20 + 100, 90, 40);
                jp.add(buttons.get(cont));
                focusOwner.getRootPane().setGlassPane(jp);
                jp.setVisible(true);
                jp.setOpaque(false);
                jp.setLayout(null);

                buttons.get(cont).addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {

                        Expression compile = null;
                        ExcelExpressionCompiler ec = new ExcelExpressionCompiler();
                        JButton b = (JButton) e.getSource();
                        try {
                            compile = ec.compile(uiController.getActiveCell(), b.getToolTipText());
                        } catch (FormulaCompilationException ex) {
                            JOptionPane.showMessageDialog(null, "Please Insert a Correct Formula!");
                        }
                        String toString = compile.toString();
                        System.out.println(toString);
                        try {
                            uiController.getActiveCell().setContent("=" + toString);
                        } catch (FormulaCompilationException ex) {
                            Logger.getLogger(ButtonAction.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                cont++;
                frame.dispose();
            }
        });

        //Botao "Cancel" 
        cancelButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.formeditor.ui;

import csheets.ui.ctrl.UIController;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Oleg
 */
public class FormLinesWindow extends JFrame implements ActionListener {
    
    private JTextField lines = new JTextField();  
    private String[] comboTypes = {"Edit Box/Button", "Text Box/Button", "Text Box/Edit Box" };
    
    public FormLinesWindow(UIController UIController){
        super("Creating a new form");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp = new JPanel(new GridLayout(3,1));
        JLabel label = new JLabel("Insert the number of lines of the form");
        jp.add(label);       
        jp.add(lines);        
        JButton button = new JButton("Apply");
        jp.add(button);
        this.getContentPane().add(jp);
        button.addActionListener(this);        
    }
    
    
    public void actionPerformed(ActionEvent e) {
                try {
                    String[] selected = new String[Integer.valueOf(lines.getText())];
                    JComboBox box1 = new JComboBox(comboTypes);
                    for(int i=0; i<Integer.valueOf(lines.getText()); i++){       
                        JOptionPane.showMessageDialog( null, box1, "Select a type of line: "+i, JOptionPane.QUESTION_MESSAGE);
                        selected[i]= box1.getSelectedItem().toString();
                    }
                    FormEditorWindow editorWindow = new FormEditorWindow(Integer.valueOf(lines.getText()), selected);
                    editorWindow.setVisible(true);
                    editorWindow.setLocation(500, 200);
                    editorWindow.setResizable(true);
                    this.dispose();
                }
                catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Entered value is incorrect, please enter an integer.");
                }
    }
    
}

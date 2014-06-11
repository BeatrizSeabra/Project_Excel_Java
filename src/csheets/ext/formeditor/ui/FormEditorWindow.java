/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.formeditor.ui;

import csheets.ui.ctrl.UIController;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Oleg
 */
public class FormEditorWindow extends JFrame{
    
    private JPanel[] jpa;
    public FormEditorWindow(int nLines){
        super("New Form");
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] comboTypes = { "Button", "Edit Box", "Text Box" };
	JComboBox comboList = new JComboBox(comboTypes);
        JPanel p = new JPanel(new GridLayout(1,2));
        p.add(comboList);
        p.add(comboList);
        //for(int i=0; i<nLines; i++){
        //jpa[i] = new JPanel(new GridLayout(2,1));
        //jpa[i].add(comboList);
        //p.add(comboList);
        this.getContentPane().add(p);
        //}
        
        
    }
    
    public void addPanel(){
        JPanel panel1 = new JPanel();
    }
    
}

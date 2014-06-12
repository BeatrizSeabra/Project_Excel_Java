/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.formeditor.ui;

import csheets.ext.formeditor.ExtensionFormEditor;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Oleg
 */
public class FormEditorWindow extends JFrame{
    
    private ExtensionFormEditor form; 
    
    public FormEditorWindow(int nLines, String[] selected){
        super("New Form");
        int size=80;
        final JPanel grid=new JPanel(new GridLayout(nLines,1));
        for(int i=0; i<nLines; i++){
            if(selected[i].equalsIgnoreCase("Text Box/Button")){
                final JTextField textBox=new JTextField("");
                textBox.setPreferredSize( new Dimension( 200, 24 ) );
                textBox.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            textBox.setText("");
            }});
                final JButton button=new JButton("add text...");
                button.addActionListener( new ActionListener() {  
                    public void actionPerformed(ActionEvent e) {                                
                                 String nameButton = JOptionPane.showInputDialog(null, "Insert the text of the button", JOptionPane.OK_CANCEL_OPTION);
                                 button.setText(nameButton);                          
                    }  
                });               
                JPanel temp=new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(textBox);            
                temp.add(button);
                grid.add(temp);
            }
            else if(selected[i].equalsIgnoreCase("Text Box/Edit Box"))
            {
                final JTextField textBox=new JTextField("");
                textBox.setPreferredSize( new Dimension( 200, 24 ) );
                textBox.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e){
                textBox.setText("");
                }});
                
                final JTextField EditBox=new JTextField("(Edit Box)");
                EditBox.setPreferredSize( new Dimension( 200, 24 ) );
                EditBox.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e){
                EditBox.setText("");
                }
                });
                JPanel temp=new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(textBox);
                temp.add(EditBox);                
                grid.add(temp);
            }
            else
            {
                final JTextField EditBox=new JTextField("(Edit Box)");
                EditBox.setPreferredSize( new Dimension( 200, 24 ) );
                EditBox.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e){
                    EditBox.setText("");
                }
                });
                final JButton button=new JButton("add text...");
                button.addActionListener( new ActionListener() {  
                    public void actionPerformed(ActionEvent e) {
                        String nameButton = JOptionPane.showInputDialog(null, "Insert the text of the button", "", JOptionPane.OK_CANCEL_OPTION);
                        button.setText(nameButton);             
                    }  
                });               
                JPanel temp=new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(EditBox);
                temp.add(button);
                grid.add(temp);
            }
        }
        this.add(grid);
        this.pack();
        this.setSize(500,size);       
        this.setVisible(true);      
    }   
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.formeditor.ui;

import csheets.ext.formeditor.Form;
import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Oleg
 */
public class FormEditorWindow extends JFrame{
    
    private Form form;
    private ArrayList<JTextField> dataList;
    private ArrayList<String> buttonList;
    private int bc=0;
    
    public FormEditorWindow(Form form, ArrayList<JTextField> dataList){
        super("Edit Form");
        this.form=form;
        this.dataList = new ArrayList<JTextField>();
        this.dataList = dataList;
        this.buttonList = new ArrayList<String>();
        this.buttonList = form.getButtonList();
        loadForm(form.getnLines(), form.getSelected());
    }
    
    public FormEditorWindow(int nLines, String[] selected){
        super("New Form");
        this.form=new Form(nLines, selected);
        this.dataList=new ArrayList<JTextField>();
        this.buttonList=new ArrayList<String>();
        newForm(nLines, selected);        
    }
    
    public void loadForm(int nLines, String[] selected){
        int cont=0;
        bc = 0;
        int size = 80;
        JPanel center=new JPanel();
        JPanel top=new JPanel();
        JLabel nome=new JLabel("Form");
        top.add(nome);
        final JPanel grid=new JPanel(new GridLayout(nLines+1,1));
        for(int i=0; i<nLines; i++){
            if(selected[i].equalsIgnoreCase("Text Box/Button")){
                final JTextField textBox=new JTextField(dataList.get(cont).getText());
                textBox.setPreferredSize( new Dimension( 200, 24 ) );
                textBox.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            textBox.setText("");
            }});
                final JButton button=new JButton(buttonList.get(bc));
                button.addActionListener( new ActionListener() {  
                    public void actionPerformed(ActionEvent e) {                                
                                 String nameButton = JOptionPane.showInputDialog(null, "Insert the text of the button", JOptionPane.OK_CANCEL_OPTION);
                                 button.setText(nameButton);
                                 buttonList.add(bc, nameButton);
                                 bc++;
                    }  
                });               
                JPanel temp=new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(textBox);            
                temp.add(button);
                dataList.add(cont,textBox);
                cont++;
                grid.add(temp);
            }
            else if(selected[i].equalsIgnoreCase("Text Box/Edit Box"))
            {
                final JTextField textBox=new JTextField(dataList.get(cont).getText());
                textBox.setPreferredSize( new Dimension( 200, 24 ) );
                textBox.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e){                   
                    textBox.setText("");
                }});
                
                final JTextField editBox=new JTextField(dataList.get(cont).getText());
                editBox.setPreferredSize( new Dimension( 200, 24 ) );
                editBox.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e){
                editBox.setText("");
                }
                });
                JPanel temp=new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(textBox);
                temp.add(editBox);
                dataList.add(cont,textBox);
                cont++;
                dataList.add(cont,editBox);
                cont++;
                grid.add(temp);
            }
            else
            {
                final JTextField editBox=new JTextField(dataList.get(cont).getText());
                editBox.setPreferredSize( new Dimension( 200, 24 ) );
                editBox.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e){
                    editBox.setText("");
                }
                });
                final JButton button=new JButton(buttonList.get(bc));
                button.addActionListener( new ActionListener() {  
                    public void actionPerformed(ActionEvent e) {
                        String nameButton = JOptionPane.showInputDialog(null, "Insert the text of the button", "", JOptionPane.OK_CANCEL_OPTION);
                        button.setText(nameButton);
                        buttonList.add(bc, nameButton);
                        bc++;
                    }  
                });
                JPanel temp=new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(editBox);
                temp.add(button);
                dataList.add(cont,editBox);
                cont++;
                grid.add(temp);
            }
            size+=55;
            center.add(grid);
        }     
        this.add(grid);
        this.pack();
        this.setSize(500,size);       
        this.setVisible(true);
        this.setResizable(true);
        play();
    }
    
    public void newForm(int nLines, String[] selected){                
        int cont=0;
        int size=80;
        JPanel center=new JPanel();
        JPanel top=new JPanel();
        JLabel name=new JLabel("Form");
        top.add(name);
        final JPanel grid=new JPanel(new GridLayout(nLines+1,1));
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
                                 String nameButton = JOptionPane.showInputDialog(null, "Insert the text of the button", "",JOptionPane.OK_CANCEL_OPTION);
                                 button.setText(nameButton);
                                 buttonList.add(bc, nameButton);
                                 bc++;
                    }  
                });               
                JPanel temp=new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(textBox);            
                temp.add(button);
                dataList.add(cont,textBox);
                cont++;
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
                
                final JTextField editBox=new JTextField("(Edit Box)");
                editBox.setPreferredSize( new Dimension( 200, 24 ) );
                editBox.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e){
                editBox.setText("");
                }
                });
                JPanel temp=new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(textBox);
                temp.add(editBox);
                dataList.add(cont,textBox);
                cont++;
                dataList.add(cont,editBox);
                cont++;
                grid.add(temp);
            }
            else
            {
                final JTextField editBox=new JTextField("(Edit Box)");
                editBox.setPreferredSize( new Dimension( 200, 24 ) );
                editBox.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e){
                    editBox.setText("");
                }
                });
                final JButton button=new JButton("add text...");
                button.addActionListener( new ActionListener() {  
                    public void actionPerformed(ActionEvent e) {
                        String nameButton = JOptionPane.showInputDialog(null, "Insert the text of the button", "", JOptionPane.OK_CANCEL_OPTION);
                        button.setText(nameButton);
                        buttonList.add(bc, nameButton);
                        bc++;
                    }  
                });               
                JPanel temp=new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(editBox);
                temp.add(button);
                dataList.add(cont,editBox);
                cont++;
                grid.add(temp);
            }
            size+=55;
            center.add(grid);
        }
        form.setButtonList(buttonList);
        this.add(grid);
        this.pack();
        this.setSize(500,size);       
        this.setVisible(true);
        this.setResizable(true);
        play();
    }
    
    public void play(){
        JPanel bot=new JPanel();
        this.add(bot,BorderLayout.SOUTH);
        JButton play=new JButton("Play");
        bot.add(play);
        final FormEditorWindow x=this;//
        play.addActionListener( new ActionListener() {  
                    public void actionPerformed(ActionEvent e) {
                        Form fc=new Form();
                            fc.save(form,dataList);
                            if(valid())
                            {
                                JOptionPane.showMessageDialog(null, "Form validated successfully");
                                x.dispose();
                                loadForm(form.getnLines(), form.getSelected());
                                
                            }else
                            {
                                JOptionPane.showMessageDialog(null, "Fields unfilled");
                            }                           
                    }});
    }
    
    public boolean valid()
    {
        for (JTextField item : dataList) {
            if (item.getText().equals("")||item.getText().equals("(Edit Box)"))
                return false;
        }
        return true;
    }
   
}

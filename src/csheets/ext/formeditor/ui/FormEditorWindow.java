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
 * @author Oleg and Rui 110506
 */
public class FormEditorWindow extends JFrame {

    private String name;
    private Form form;
    private ArrayList<JTextField> dataList;
    private ArrayList<String> buttonList;
    private int bc = 0;
    private static ArrayList<Form> ArrayForms = new ArrayList<>();

    public FormEditorWindow(){
        
    }
    
    public FormEditorWindow(Form form, ArrayList<JTextField> dataList) {
        super("Edit Form");
        this.form = form;
        this.dataList = new ArrayList<JTextField>();
        this.dataList = dataList;
        this.buttonList = new ArrayList<String>();
        this.buttonList = form.getButtonList();
       // loadForm(form.getnLines(), form.getSelected());
    }

    public FormEditorWindow(int nLines, String[] selected) {
        super("New Form");
        this.form = new Form(nLines, selected);
        this.dataList = new ArrayList<JTextField>();
        this.buttonList = new ArrayList<String>();
        newForm(nLines, selected);
    }

    public void loadForm(int nLines, String[] selected,ArrayList<JTextField> dataList, final ArrayList<String> buttonListt) {
        int cont = 0;
        bc = 0;
        System.out.println(nLines + "ANDREEEEEEEEEEEE");
        JPanel center = new JPanel();
        JPanel top = new JPanel();
        JLabel nome = new JLabel("Form");
        top.add(nome);
        final JPanel grid = new JPanel(new GridLayout(nLines + 1, 1));
        for (int i = 0; i < nLines; i++) {
            System.out.println(selected[i]);
            if (selected[i].equalsIgnoreCase("Text Box/Button")) {
                final JTextField textBox = new JTextField(dataList.get(cont).getText());
                
                textBox.setPreferredSize(new Dimension(200, 24));
                textBox.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        textBox.setText("");
                    }
                });
                final JButton button = new JButton(buttonListt.get(bc));
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String nameButton = JOptionPane.showInputDialog(null, "Insert the text of the button", JOptionPane.OK_CANCEL_OPTION);
                        button.setText(nameButton);
                        buttonListt.add(bc, nameButton);
                        bc++;
                    }
                });
                JPanel temp = new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(textBox);
                temp.add(button);
                dataList.add(cont, textBox);
                cont++;
                grid.add(temp);
            } else if (selected[i].equalsIgnoreCase("Text Box/Edit Box")) {
                final JTextField textBox = new JTextField(dataList.get(cont).getText());
                textBox.setPreferredSize(new Dimension(200, 24));
                textBox.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        textBox.setText("");
                    }
                });

                final JTextField editBox = new JTextField(dataList.get(cont).getText());
                editBox.setPreferredSize(new Dimension(200, 24));
                editBox.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        editBox.setText("");
                    }
                });
                JPanel temp = new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(textBox);
                temp.add(editBox);
                dataList.add(cont, textBox);
                cont++;
                dataList.add(cont, editBox);
                cont++;
                grid.add(temp);
            } else {
                final JTextField editBox = new JTextField(dataList.get(cont).getText());
                System.out.println(dataList.get(cont).getText());
                editBox.setPreferredSize(new Dimension(200, 24));
                editBox.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        editBox.setText("");
                    }
                });

                System.out.println("olaaa "+ buttonListt.size());
                for(int j=0;j<buttonListt.size();j++){
                    System.out.println(buttonListt.get(i));
                }
                final JButton button = new JButton(buttonListt.get(bc));
                System.out.println("cagaa");
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String nameButton = JOptionPane.showInputDialog(null, "Insert the text of the button", "", JOptionPane.OK_CANCEL_OPTION);
                        button.setText(nameButton);
                        buttonListt.add(bc, nameButton);
                        bc++;
                    }
                });
                JPanel temp = new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(editBox);
                temp.add(button);
                dataList.add(cont, editBox);
                cont++;
                grid.add(temp);
            }

            center.add(grid);
        }
       this.add(grid);
        this.pack();
        this.setVisible(true);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        //  play();
        
    }

    public void newForm(int nLines, String[] selected) {
     name =  JOptionPane.showInputDialog("Name:");
        int cont = 0;
        JPanel center = new JPanel();
        JPanel bot = new JPanel();
        this.add(bot, BorderLayout.SOUTH);
        JButton create = new JButton("Create");
        bot.add(create);
        final JPanel grid = new JPanel(new GridLayout(nLines + 1, 1));
        for (int i = 0; i < nLines; i++) {
            ChooseComponents(selected[i],cont,grid);
            center.add(grid);
        }
        this.add(grid);
        this.pack();
        this.setVisible(true);
        this.setResizable(true);
        Form f = new Form(name,nLines,selected,buttonList,dataList);
        ArrayForms.add(f);
        bot.add(create);
        create.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (valid()) {
                    
                    JOptionPane.showMessageDialog(null, "The Form has been created");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Fields unfilled");
                }
            }
        });
    }


    public boolean valid() {
        for (JTextField item : dataList) {
            if (item.getText().equals("") || item.getText().equals("(Edit Box)")) {
                return false;
            }
        }
        return true;
    }
    
    public void ChooseComponents(String selected,int cont,JPanel grid){
         if (selected.equalsIgnoreCase("Text Box/Button")) {
                final JTextField textBox = new JTextField("");
                textBox.setPreferredSize(new Dimension(200, 24));
                textBox.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        textBox.setText("");
                    }
                });
                final JButton button = new JButton("add text...");
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String nameButton = JOptionPane.showInputDialog(null, "Insert the text of the button", "", JOptionPane.OK_CANCEL_OPTION);
                        button.setText(nameButton);
                        buttonList.add(bc, nameButton);
                        bc++;
                    }
                });
                JPanel temp = new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(textBox);
                temp.add(button);
                dataList.add(cont, textBox);
                cont++;
                grid.add(temp);
            } else if (selected.equalsIgnoreCase("Text Box/Edit Box")) {
                final JTextField textBox = new JTextField("");
                textBox.setPreferredSize(new Dimension(200, 24));
                textBox.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        textBox.setText("");
                    }
                });

                final JTextField editBox = new JTextField("(Edit Box)");
                editBox.setPreferredSize(new Dimension(200, 24));
                editBox.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        editBox.setText("");
                    }
                });
                JPanel temp = new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(textBox);
                temp.add(editBox);
                dataList.add(cont, textBox);
                cont++;
                dataList.add(cont, editBox);
                cont++;
                grid.add(temp);
            } else {
                final JTextField editBox = new JTextField("(Edit Box)");
                editBox.setPreferredSize(new Dimension(200, 24));
                editBox.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        editBox.setText("");
                    }
                });
                final JButton button = new JButton("add text...");
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String nameButton = JOptionPane.showInputDialog(null, "Insert the text of the button", "", JOptionPane.OK_CANCEL_OPTION);
                        button.setText(nameButton);
                        buttonList.add(bc, nameButton);
                        bc++;
                    }
                });
                JPanel temp = new JPanel(new FlowLayout(FlowLayout.CENTER));
                temp.add(editBox);
                temp.add(button);
                dataList.add(cont, editBox);
                cont++;
                grid.add(temp);
            }
    }
    
    public ArrayList<Form> getForms(){      
        return ArrayForms;
    }
    
    public Form getFormByName(String name){
        Form form1 = new Form();
        for(int i=0;i<ArrayForms.size();i++)
        {
            if(name.equals(ArrayForms.get(i).getName()))
            {
                form1 = ArrayForms.get(i);
            }
        }      
        return form1;
    }
//    
//    public int getLinesByName(String name){
//       int lines=0;
//       for(int i=0;i<ArrayForms.size();i++)
//        {
//            if(name.equals(ArrayForms.get(i).getName()))
//            {
//                lines = ArrayForms.get(i).getnLines();
//            }
//        }   
//        return lines;
//    }
    
//     public String[] getSelectedByName(String name){
//       for(int i=0;i<ArrayForms.size();i++)
//        {
//            if(name.equals(ArrayForms.get(i).getName()))
//            {
//            String [] selected = ArrayForms.get(i).getSelected();
//            }
//        }   
//        return selected;
//    }
     
//  
//             
//             public ArrayList<JTextField> getDataListByName(String name){
//                 ArrayList<JTextField> DataList = new ArrayList<>();
//       for(int i=0;i<ArrayForms.size();i++)
//        {
//            if(name.equals(ArrayForms.get(i).getName()))
//            {
//           DataList = ArrayForms.get(i).getDataList();
//            }
//        }   
//        return DataList;
//    }
//             
//                   public ArrayList<String> getButtonListByName(String name){
//                 ArrayList<String> ButtonList = new ArrayList<>();
//       for(int i=0;i<ArrayForms.size();i++)
//        {
//            if(name.equals(ArrayForms.get(i).getName()))
//            {
//           ButtonList = ArrayForms.get(i).getButtonList();
//            }
//        }   
//        return ButtonList;
//    }
}

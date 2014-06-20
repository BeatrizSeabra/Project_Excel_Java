/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.formeditor.ui;

import csheets.ext.formeditor.Form;
import java.awt.BorderLayout;
import java.awt.Color;

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

    public FormEditorWindow() {

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

    public void loadForm(int nLines, String[] selected, ArrayList<JTextField> dataList, final ArrayList<String> buttonListt, String[] ArrayColors, String[] ArraySizes, int ChangedLine) {
        int cont = 0;
        bc = 0;
        JPanel center = new JPanel();
        JPanel top = new JPanel();
        JLabel nome = new JLabel("Form");
        top.add(nome);
        final JLabel label1 = new JLabel();
        final JLabel label2 = new JLabel();
        final JPanel grid = new JPanel(new GridLayout(nLines + 1, 1));
        for (int i = 0; i < nLines; i++) {
            if (selected[i].equalsIgnoreCase("Text Box/Button")) {
                final JTextField textBox = new JTextField(dataList.get(i).getText());
                textBox.setEditable(false);
                final JButton button = new JButton(buttonListt.get(bc));

                JPanel temp = new JPanel(new FlowLayout(FlowLayout.CENTER));
                label1.setText("TextBox");
                temp.add(label1);
                temp.add(textBox);
                label2.setText("button");
                temp.add(label2);
                temp.add(button);
                cont++;
                bc++;
                if (ChangedLine == i) {
                    if(!ArraySizes[0].equals("Null")){
                    textBox.setPreferredSize(new Dimension(Integer.parseInt(ArraySizes[0]), Integer.parseInt(ArraySizes[0])));
                    }
                    if(!ArraySizes[1].equals("Null")){
                    button.setPreferredSize(new Dimension(Integer.parseInt(ArraySizes[1]), Integer.parseInt(ArraySizes[1])));
                    }
                    if (ArrayColors[0].equals("Red")) {
                        textBox.setBackground(Color.red);
                    } else if (ArrayColors[0].equals("Yellow")) {
                        textBox.setBackground(Color.yellow);
                    } else if (ArrayColors[0].equals("While")) {
                        textBox.setBackground(Color.white);
                    } else if (ArrayColors[0].equals("Green")) {
                        textBox.setBackground(Color.green);
                    } else if (ArrayColors[0].equals("Black")) {
                        textBox.setBackground(Color.black);
                    } else if (ArrayColors[0].equals("Pink")) {
                        textBox.setBackground(Color.pink);
                    } else if (ArrayColors[0].equals("Gray")) {
                        textBox.setBackground(Color.gray);
                    }

                    if (ArrayColors[1].equals("Red")) {
                        button.setBackground(Color.red);
                    } else if (ArrayColors[1].equals("Yellow")) {
                        button.setBackground(Color.yellow);
                    } else if (ArrayColors[1].equals("While")) {
                        button.setBackground(Color.white);
                    } else if (ArrayColors[1].equals("Green")) {
                        button.setBackground(Color.green);
                    } else if (ArrayColors[1].equals("Black")) {
                        button.setBackground(Color.black);
                    } else if (ArrayColors[1].equals("Pink")) {
                        button.setBackground(Color.pink);
                    } else if (ArrayColors[1].equals("Gray")) {
                        button.setBackground(Color.gray);
                    }
                }
                grid.add(temp);

            } else if (selected[i].equalsIgnoreCase("Text Box/Edit Box")) {
                final JTextField textBox = new JTextField(dataList.get(cont + 1).getText());
                textBox.setPreferredSize(new Dimension(Integer.parseInt(ArraySizes[0]), Integer.parseInt(ArraySizes[0])));
                textBox.setEditable(false);
                final JTextField editBox = new JTextField(dataList.get(cont).getText());
                editBox.setPreferredSize(new Dimension(Integer.parseInt(ArraySizes[1]), Integer.parseInt(ArraySizes[1])));
                JPanel temp = new JPanel(new FlowLayout(FlowLayout.CENTER));
                label1.setText("TextBox");
                temp.add(label1);
                temp.add(textBox);
                label2.setText("EditBox");
                temp.add(label1);
                temp.add(editBox);

                if (ChangedLine == i) {
                             if(!ArraySizes[0].equals("Null")){
                    textBox.setPreferredSize(new Dimension(Integer.parseInt(ArraySizes[0]), Integer.parseInt(ArraySizes[0])));
                    }
                    if(!ArraySizes[1].equals("Null")){
                    editBox.setPreferredSize(new Dimension(Integer.parseInt(ArraySizes[1]), Integer.parseInt(ArraySizes[1])));
                    }
  
                    if (ArrayColors[0].equals("Red")) {
                        textBox.setBackground(Color.red);
                    } else if (ArrayColors[0].equals("Yellow")) {
                        textBox.setBackground(Color.yellow);
                    } else if (ArrayColors[0].equals("While")) {
                        textBox.setBackground(Color.white);
                    } else if (ArrayColors[0].equals("Green")) {
                        textBox.setBackground(Color.green);
                    } else if (ArrayColors[0].equals("Black")) {
                        textBox.setBackground(Color.black);
                    } else if (ArrayColors[0].equals("Pink")) {
                        textBox.setBackground(Color.pink);
                    } else if (ArrayColors[0].equals("Gray")) {
                        textBox.setBackground(Color.gray);
                    }

                    if (ArrayColors[0].equals("Red")) {
                        editBox.setBackground(Color.red);
                    } else if (ArrayColors[0].equals("Yellow")) {
                        editBox.setBackground(Color.yellow);
                    } else if (ArrayColors[0].equals("While")) {
                        editBox.setBackground(Color.white);
                    } else if (ArrayColors[0].equals("Green")) {
                        editBox.setBackground(Color.green);
                    } else if (ArrayColors[0].equals("Black")) {
                        editBox.setBackground(Color.black);
                    } else if (ArrayColors[0].equals("Pink")) {
                        editBox.setBackground(Color.pink);
                    } else if (ArrayColors[0].equals("Gray")) {
                        editBox.setBackground(Color.gray);
                    }
                }

                grid.add(temp);
            } else {
                final JTextField editBox = new JTextField(dataList.get(cont).getText());
                editBox.setPreferredSize(new Dimension(Integer.parseInt(ArraySizes[0]), Integer.parseInt(ArraySizes[0])));
                JButton button = new JButton(buttonListt.get(bc));
                bc++;
                JPanel temp = new JPanel(new FlowLayout(FlowLayout.CENTER));
                label1.setText("EditBox");
                temp.add(label1);
                temp.add(editBox);
                label2.setText("button");
                temp.add(label2);
                temp.add(button);
                cont++;
                if (ChangedLine == i) {
                     label1.setText("EditBox");
                temp.add(label1);
                temp.add(editBox);
                label2.setText("button");
                temp.add(label2);
                             if(!ArraySizes[0].equals("Null")){
                    editBox.setPreferredSize(new Dimension(Integer.parseInt(ArraySizes[0]), Integer.parseInt(ArraySizes[0])));
                    }
                    if(!ArraySizes[1].equals("Null")){
                    button.setPreferredSize(new Dimension(Integer.parseInt(ArraySizes[1]), Integer.parseInt(ArraySizes[1])));
                    }

                    if (ArrayColors[0].equals("Red")) {
                        editBox.setBackground(Color.red);
                    } else if (ArrayColors[0].equals("Yellow")) {
                        editBox.setBackground(Color.yellow);
                    } else if (ArrayColors[0].equals("While")) {
                        editBox.setBackground(Color.white);
                    } else if (ArrayColors[0].equals("Green")) {
                        editBox.setBackground(Color.green);
                    } else if (ArrayColors[0].equals("Black")) {
                        editBox.setBackground(Color.black);
                    } else if (ArrayColors[0].equals("Pink")) {
                        editBox.setBackground(Color.pink);
                    } else if (ArrayColors[0].equals("Gray")) {
                        editBox.setBackground(Color.gray);
                    }

                    if (ArrayColors[1].equals("Red")) {
                        button.setBackground(Color.red);
                    } else if (ArrayColors[1].equals("Yellow")) {
                        button.setBackground(Color.yellow);
                    } else if (ArrayColors[1].equals("While")) {
                        button.setBackground(Color.white);
                    } else if (ArrayColors[1].equals("Green")) {
                        button.setBackground(Color.green);
                    } else if (ArrayColors[1].equals("Black")) {
                        button.setBackground(Color.black);
                    } else if (ArrayColors[1].equals("Pink")) {
                        button.setBackground(Color.pink);
                    } else if (ArrayColors[1].equals("Gray")) {
                        button.setBackground(Color.gray);
                    }
                }
                grid.add(temp);
            }
            center.add(grid);
        }
        this.add(grid);
        this.pack();
        this.setVisible(true);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
    }

    public void newForm(int nLines, String[] selected) {
        name = JOptionPane.showInputDialog("Name:");
        int cont = 0;
        JPanel center = new JPanel();
        JPanel bot = new JPanel();
        this.add(bot, BorderLayout.SOUTH);
        JButton create = new JButton("Create");
        bot.add(create);
        
        final JPanel grid = new JPanel(new GridLayout(nLines + 1, 1));
        for (int i = 0; i < nLines; i++) {

            ChooseComponents(selected[i], cont, grid);
            center.add(grid);
        }
        this.add(grid);
        this.pack();
        this.setVisible(true);
        this.setResizable(true);
        Form f = new Form(name, nLines, selected, buttonList, dataList);
        for(int i=0;i<buttonList.size();i++){
            System.out.println(buttonList.get(i));
        }
        System.out.println(buttonList.size());
        ArrayForms.add(f);
        bot.add(create);
        create.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validButtons()) {

                    JOptionPane.showMessageDialog(null, "The Form has been created");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Fields unfilled");
                }
            }
        });
    }

    public boolean validTextFields() {
        for (JTextField item : dataList) {
            if (item.getText().equals("") || item.getText().equals("(Edit Box)")) {
                return false;
            }
        }
        return true;
    }
    
       public boolean validButtons() {
        for (String item : buttonList) {
            System.out.println(item.toString());
            if (item.equals("") || item.equals("add text...")) {
                return false;
            }
        }
        return true;
    }

    public void ChooseComponents(String selected, int cont, JPanel grid) {
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
//                    if(button.getText().equals("add text...")){
//                     buttonList.add(bc,nameButton);
//                    }else {
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

    public ArrayList<Form> getForms() {
        return ArrayForms;
    }

    public Form getFormByName(String name) {
        Form form1 = new Form();
        for (int i = 0; i < ArrayForms.size(); i++) {
            if (name.equals(ArrayForms.get(i).getName())) {
                form1 = ArrayForms.get(i);
            }
        }
        return form1;
    }

}

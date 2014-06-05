/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.invokefunction.ui;

import csheets.core.formula.Function;
import javax.swing.JFrame;
import csheets.core.formula.FunctionParameter;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Biia
 */
public class InvokeUI extends JFrame {

    private JButton Help, Escolher;
    //*funções disponíveis (nomes de classes que implementam a interface Function)
    private String[] functions = {"And", "Average", "Count", "Do", "Factorial", "False", "If", "Not", "NumericFunction", "Or", "Sum", "True"};
    private String[] help = new String[functions.length];

    private JComboBox box;
    private JPanel panel, p1, p2, p3;
    private JTextField sintaxe;
    private JLabel funcao;

    public InvokeUI() {

        panel = new JPanel(new BorderLayout());
        p1 = new JPanel(new BorderLayout());
        funcao = new JLabel("Escolha Função:");
        box = new JComboBox(functions);
        box.setSelectedIndex(0);

        

        p1.add(funcao, BorderLayout.NORTH);
        p1.add(box, BorderLayout.CENTER);
        panel.add(p1, BorderLayout.CENTER);

        p2 = new JPanel();
        Help = new JButton("Help");
        Help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Function f;
                FunctionParameter[] param;
                String help, fActual;;
                
                fActual = box.getSelectedItem().toString();
                Field[] fields;
                
                //ir buscar a classe que implementa a interface Function
                //chamar método getParameters() para ir buscar a descriçao da classe (parameters[3].toString()
                
                JOptionPane.showMessageDialog(InvokeUI.this, box.getSelectedItem().toString() + ":/n");
            }
        });
        Escolher = new JButton("Escolher");
        Escolher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FunctionParameter[] param=null;
                String help, fActual;
                Class c;
                
                fActual = box.getSelectedItem().toString();
                
                JOptionPane.showMessageDialog(InvokeUI.this, box.getSelectedItem().toString() + ":/n");
            }
        });

        p2.add(Help);
        p2.add(Escolher);
        panel.add(p2, BorderLayout.SOUTH);

        p3 = new JPanel();
        sintaxe = new JTextField();
        sintaxe.setText("parametro 1 operator parametro 2");

        p3.add(sintaxe);
        panel.add(p3, BorderLayout.NORTH);

        add(panel);
        pack();
        setLocation(500, 300);
        setVisible(true);
    }
}

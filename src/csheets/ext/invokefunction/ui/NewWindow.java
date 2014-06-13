/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.invokefunction.ui;

import csheets.core.Value;
import csheets.core.formula.Function;
import csheets.core.formula.FunctionParameter;
import csheets.core.formula.Literal;
import csheets.core.formula.lang.Language;
import csheets.core.formula.lang.UnknownElementException;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewWindow extends JFrame {

    private Language lang = Language.getInstance();
    private JPanel panel1, panel2, panel, panelAux;
    private JButton fCall, cancelar;
    private JLabel label, labelAux;
    private JTextField text, textAux;
    private Function funcao;
    private int parametro;
    public NewWindow(String funcao) {
        panel = new JPanel(new BorderLayout());

        panel1 = new JPanel();
        fCall = new JButton("Result");
        cancelar = new JButton("Cancel");
        cancelar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        panel1.add(fCall);
        panel1.add(cancelar);

        panel2 = new JPanel();
        label = new JLabel("Result:");
        text = new JTextField(10);
        text.setEditable(false);

        panel2.add(label);
        panel2.add(text);

        panel.add(panel2, BorderLayout.CENTER);
        panel.add(panel1, BorderLayout.SOUTH);

        try {
            Function f = lang.getFunction(funcao);
            this.funcao=f;
            if (!f.isVarArg()) {
                for (parametro = 0; parametro < f.getParameters().length; parametro++) {
                    panelAux = new JPanel();

                    labelAux = new JLabel("Parâmetro " + parametro + ":");
                    textAux = new JTextField(f.getParameters()[parametro].getName());
                    
                    panelAux.add(labelAux);
                    panelAux.add(textAux);
                    panel.add(panelAux, BorderLayout.NORTH);
                }
            } else {
                for (int parametro = 0; parametro < f.getParameters().length; parametro++) {
                    panelAux = new JPanel();

                    labelAux = new JLabel("Parâmetro " + parametro + ":");
                    textAux = new JTextField(f.getParameters()[parametro].getName());
                    
                    panelAux.add(labelAux);
                    panelAux.add(textAux);
                    panel.add(panelAux, BorderLayout.NORTH);
                    
                    if(parametro==f.getParameters().length-1){
                        parametro++;
                        panel.add(parametro(parametro));
                    }
                }
            }
        } catch (UnknownElementException ex) {
        }

        add(panel);
        pack();
    }
    
    private JPanel parametro(int i) {
        panelAux = new JPanel();
        labelAux = new JLabel("Parâmetro " + i + ":");
        textAux = new JTextField(this.funcao.getParameters()[i-1].getName());
        

        panelAux.add(labelAux);
        panelAux.add(textAux);
        return panelAux;
    }
    
    private void validaParam(FunctionParameter fp, String param){
        try {
                Value v;
                switch(fp.getValueType()){
                    case NUMERIC:
                        v=new Value((Number)Double.valueOf(param));
                        break;
                    case BOOLEAN:
                        if(param.toUpperCase().equalsIgnoreCase("FALSE")){
                            v=new Value(false);
                        }else{
                            v=new Value(true);
                        }
                        break;
                    case DATE:
                        Date date = new SimpleDateFormat("d/M/yy", Locale.ROOT).parse(param);
                        v=new Value(date);
                        break;
                    case UNDEFINED:
                        try{
                            v=new Value((Number)Double.valueOf(param));
                        }
                        catch(Exception ex){
                            v=new Value(param);
                        }
                        break;
                    default:
                        v=new Value(param);
                }
                
            } catch (ParseException ex) {
            }
    }
}

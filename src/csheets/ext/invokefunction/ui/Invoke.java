/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.invokefunction.ui;

import csheets.core.Value;
import csheets.core.formula.Expression;
import csheets.core.formula.FunctionParameter;
import javax.swing.JOptionPane;
import csheets.core.formula.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import csheets.core.formula.Function;
import csheets.core.formula.FunctionCall;
import csheets.core.formula.Literal;
import csheets.ui.ctrl.UIController;
import java.awt.Dimension;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 1120268
 */
public class Invoke extends javax.swing.JFrame {

    /**
     * Creates new form Invoke
     */
    protected final UIController uiController;
    private Language lang=Language.getInstance();
    private JPanel panel;
    private JLabel label;
    private JTextField text;
    
    private String[] help = {"A function that returns true if and only if all of its arguments are true.",
        "A function that returns the numeric average of its arguments.",
        "A function that counts those of its arguments that yield numeric values.",
        "A function that emulates a looping statement, where each cell in a given range that satisfy a given condition, or each corresponding cell in another range, are passed to a function.",
        "A function that that receives a String containing an expression, and returns the result of that expression.",
        "A function that returns the factorial of its argument.",
        "A function that returns the boolean value false.",
        "A function that emulates the if-then-else statement.",
        "A function that returns the boolean opposite of its argument.",
        "A numeric function that invokes a method object.",
        "A function that returns true if any of its arguments are true.",
        "A function that returns the numeric sum of its arguments.",
        "A function that returns the boolean value true."};
    
    public Invoke(UIController uiController) {
        initComponents();
        this.uiController=uiController;
        
    }
    
    private String[] funcoes(){
        Function[] functions=lang.getFunctions();
        String[] funcoes=new String[functions.length];
        for (int i = 0; i < functions.length; i++) {
            funcoes[i]=functions[i].getIdentifier();
        }
        return funcoes;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox(funcoes());
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Function:");
        jLabel1.setToolTipText("");

        jButton2.setText("Choose");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(103, 103, 103))
        );

        jButton1.setText("Function Help");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Function "+jComboBox1.getSelectedItem().toString()+" Sintaxe");

        jFormattedTextField1.setText(getSintaxe(jComboBox1.getSelectedItem().toString()));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addComponent(jFormattedTextField1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jLabel2.setText("Function "+jComboBox1.getSelectedItem().toString()+" Sintaxe");
        jFormattedTextField1.setText(getSintaxe(jComboBox1.getSelectedItem().toString()));
        pack();
        jPanel1.setSize(jPanel2.getSize());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if(lang.getFunction(jComboBox1.getSelectedItem().toString()).getParameters().length==0){
                chooseFunction("()",jComboBox1.getSelectedItem().toString());
            }
            else{
                NewWindow n=new NewWindow(jComboBox1.getSelectedItem().toString());
                n.setVisible(true);
                n.setLocation(500, 200);
            }
        } catch (UnknownElementException ex) {
            Logger.getLogger(Invoke.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(Invoke.this, jComboBox1.getSelectedItem().toString() + ":\n"+ help[jComboBox1.getSelectedIndex()], "HELP",  JOptionPane.INFORMATION_MESSAGE);        
    }//GEN-LAST:event_jButton1ActionPerformed

    private String getSintaxe(String funcao){
        String r="";
        try{
            Function f=lang.getFunction(funcao);
            FunctionParameter[] parameters = f.getParameters();
            if(f.isVarArg()){
                r+=f.getIdentifier()+"(";
                r+=parameters[0].getName();
                r+="[; "+parameters[0].getName()+"[; ... [; ";
                r+=parameters[0].getName()+"]]])";
            }
            else{
                r+=f.getIdentifier()+"(";
                for(int i=0;i<parameters.length;i++){
                    if(parameters[i].isOptional()){
                        r+="[";
                    } 
                    if(i!=0){
                        r+=";";
                    }
                    r+=parameters[i].getName();
                    if(parameters[i].isOptional()){
                        r+="]";
                    } 
                }
                r+=")";
            }
            return r;
        }
        catch(Exception ex){
            return "";
        }
    }
    
    private Literal[] argumentos(String sintaxe,Function funcao){
        Literal[] argumentos;
        String[] args;
        if(sintaxe.isEmpty()){
            args=new String[0];
        }
        else{
            args=sintaxe.split(";");
        }
        argumentos=new Literal[args.length];
        
        FunctionParameter[] parameters = funcao.getParameters();
        int k=1;
        if(funcao.isVarArg()){
            k=0;
        }
        for(int i=0; i<args.length; i++){
            try {
                Value v;
                switch(parameters[i*k].getValueType()){
                    case NUMERIC:
                        v=new Value((Number)Double.valueOf(args[i]));
                        break;
                    case BOOLEAN:
                        if(args[i].toUpperCase().equalsIgnoreCase("FALSE")){
                            v=new Value(false);
                        }else{
                            v=new Value(true);
                        }
                        break;
                    case DATE:
                        Date date = new SimpleDateFormat("d/M/yy", Locale.ROOT).parse(args[i]);
                        v=new Value(date);
                        break;
                    case UNDEFINED:
                        try{
                            v=new Value((Number)Double.valueOf(args[i]));
                        }
                        catch(Exception ex){
                            v=new Value(args[i]);
                        }
                        break;
                    default:
                        v=new Value(args[i]);
                }
                argumentos[i]=new Literal(v);
            } catch (ParseException ex) {
            }
        }
        return argumentos;
    }
    
    private void chooseFunction(String sintaxe, String funcao){
        String s=sintaxe.substring(sintaxe.indexOf("(")+1,sintaxe.indexOf(")"));
        try{
            Function f=lang.getFunction(funcao);
            Literal[] args = argumentos(s,f);
            FunctionCall fCall = new FunctionCall(f,args);
            JOptionPane.showMessageDialog(rootPane, fCall.evaluate().toString());
            this.uiController.getActiveSpreadsheet().getCell(0, 0).setContent(fCall.evaluate().toString());
        }
        catch(Exception ex){
            int result=JOptionPane.showConfirmDialog(null, "Invalid Parameters. Do you want to correct them?");
            
            if (result==JOptionPane.NO_OPTION) {
                dispose();
            }
        }
    }
   
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

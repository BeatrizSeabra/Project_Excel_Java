 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.formeditor.ui;

import csheets.ext.formeditor.Form;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JTextField;

/**
 *
 * @author Oleg and Rui 1110506
 */
public class ChooseFormToPlay extends javax.swing.JFrame {

    /**
     * Creates new form adeus
     */
    FormEditorWindow ed = new FormEditorWindow();
    ArrayList<Form> ArrayForms = ed.getForms();
    ArrayList<String> names = new ArrayList<>();
    ArrayList<JTextField> dataList = new ArrayList<>();
    ArrayList<String> buttonList = new ArrayList<>();
    Form form = new Form();
    String[] ArrayColors = new String[2];
    String[] ArraySizes = new String[2];

    public ChooseFormToPlay() {
        initComponents();
        for (int i = 0; i < ArrayForms.size(); i++) {
            names.add(ArrayForms.get(i).getName());
            jComboBox1.addItem(ArrayForms.get(i).getName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Choose a Form: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String SelectedOption = (String) jComboBox1.getSelectedItem();
        form = ed.getFormByName(SelectedOption);
        int lines = form.getnLines();
        String[] selected = form.getSelected();
        dataList = form.getDataList();
        buttonList = form.getButtonList();
        Collections.reverse(dataList);
        ChooseColorsAndSize edit = new ChooseColorsAndSize(form);
        ChooseFormToEdit edit1 = new ChooseFormToEdit();
        
            if(!form.getColor()){
            ed.loadForm(lines, selected, dataList, buttonList);
        } else {
            int ChangedLine = edit1.getChangedLine();
                  ArrayColors = edit.getColors();
                 ArraySizes = edit.getSizes();
            ed.loadForm(lines, selected, dataList, buttonList, ArrayColors, ArraySizes, ChangedLine);
        }
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    public void run() {
        this.setVisible(true);
        setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

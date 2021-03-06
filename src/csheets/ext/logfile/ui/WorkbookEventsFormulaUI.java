/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.logfile.ui;

import csheets.ext.logfile.AtributeFormula;
import csheets.ui.ctrl.UIController;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuno
 */
public class WorkbookEventsFormulaUI extends javax.swing.JFrame {

    /**
     * Creates new form WorkbookEventsFormulaUI
     */
    UIController uiController;
    public static int CLOSE = 0;
    public static int OPEN = 1;
    public static int SHEETCTEATED = 2;
    public static int SHEETDELETED = 3;
    public static int SHEETRENAMED = 4;

    public WorkbookEventsFormulaUI(UIController ui) {
        this.uiController = ui;
        initComponents();
        ArrayList<String> mylist = uiController.getEvlf();

        jCheckBox1.setSelected(true); // Open
        jCheckBox2.setSelected(true); // Close
        jCheckBox3.setSelected(true); // Create
        jCheckBox4.setSelected(true); // Delet
        jCheckBox5.setSelected(true); // Rename

        if (!mylist.contains("Open")) {
            jCheckBox1.setSelected(false);
        }
        if (!mylist.contains("Close")) {
            jCheckBox2.setSelected(false);
        }
        if (!mylist.contains("sheetCreated")) {
            jCheckBox3.setSelected(false);
        }
        if (!mylist.contains("sheetDeleted")) {
            jCheckBox4.setSelected(false);
        }
        if (!mylist.contains("sheetRenamed")) {
            jCheckBox5.setSelected(false);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Choose the WorkBook Event(s)");
        jLabel1.setToolTipText("");

        jButton1.setText("Set Event");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Open");

        jCheckBox2.setText("Close");

        jCheckBox3.setText("Sheet Created");

        jCheckBox4.setText("sheetDeleted");

        jCheckBox5.setText("Sheet Renamed");

        jLabel2.setText("Insert the Formula:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2))
                    .addComponent(jCheckBox3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: Close
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: Set Event
        ArrayList<String> mylist = uiController.getEvlf();
        String formula = jTextField1.getText();

        if (!formula.isEmpty()) {
            if (jCheckBox1.isSelected() || jCheckBox2.isSelected()
                    || jCheckBox3.isSelected() || jCheckBox4.isSelected()
                    || jCheckBox5.isSelected()) {

                if (jCheckBox1.isSelected()) { // Open
                    if (!mylist.contains("Open")) {
                        mylist.add("Open");
                    }
                    uiController.setFormula(OPEN, formula);
                } else {
                    if (mylist.contains("Open")) {
                        mylist.remove("Open");
                    }
                }
                if (jCheckBox2.isSelected()) { // Close
                    if (!mylist.contains("Close")) {
                        mylist.add("Close");
                    }
                    uiController.setFormula(CLOSE, formula);
                } else {
                    if (mylist.contains("Close")) {
                        mylist.remove("Close");
                    }
                }
                if (jCheckBox3.isSelected()) {
                    if (!mylist.contains("sheetCreated")) { // Create
                        mylist.add("sheetCreated");
                    }
                    uiController.setFormula(SHEETCTEATED, formula);
                } else {
                    if (mylist.contains("sheetCreated")) {
                        mylist.remove("sheetCreated");
                    }
                }
                if (jCheckBox4.isSelected()) { // Delete
                    if (!mylist.contains("sheetDeleted")) {
                        mylist.add("sheetDeleted");
                    }
                    uiController.setFormula(SHEETDELETED, formula);
                } else {
                    if (mylist.contains("sheetDeleted")) {
                        mylist.remove("sheetDeleted");
                    }
                }
                if (jCheckBox5.isSelected()) { // Rename
                    if (!mylist.contains("sheetRenamed")) {
                        mylist.add("sheetRenamed");
                    }
                    uiController.getFormula(SHEETRENAMED);
                } else {
                    if (mylist.contains("sheetRenamed")) {
                        mylist.remove("sheetRenamed");
                    }
                }

                uiController.setEvlf(mylist);

            } else {
                JOptionPane.showMessageDialog(this, "Events can't be empty", "Without Events selected", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Formula can't be empty", "Formula empty", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WorkbookEventsFormulaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkbookEventsFormulaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkbookEventsFormulaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkbookEventsFormulaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkbookEventsFormulaUI(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.logfile.ui;

import csheets.ui.ctrl.UIController;
import java.util.ArrayList;

/**
 *
 * @author Nélson
 */
public class WorkBookEventsUI extends javax.swing.JFrame {
     private UIController uiController;
    /**
     * Creates new form WorkBookEventsUI
     */
    public WorkBookEventsUI(UIController uic) {
        uiController=uic;
        ArrayList<String> mylist=uiController.getEvl();
        initComponents();
        CBOpen.setSelected(true);
        CBClose.setSelected(true);
        CBsheetCreated.setSelected(true);
        CBsheetDeleted.setSelected(true);
        CBsheetRenamed.setSelected(true);
        
        if(!mylist.contains("Open"))
            {
                CBOpen.setSelected(false);
            }
        if(!mylist.contains("Close"))
            {
                CBClose.setSelected(false);
            }
        if(!mylist.contains("sheetCreated"))
            {
                CBsheetCreated.setSelected(false);
            }
        if(!mylist.contains("sheetDeleted"))
            {
                CBsheetDeleted.setSelected(false);
            }
        if(!mylist.contains("sheetRenamed"))
            {
                CBsheetRenamed.setSelected(false);
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
        CBClose = new javax.swing.JCheckBox();
        CBsheetDeleted = new javax.swing.JCheckBox();
        CBsheetCreated = new javax.swing.JCheckBox();
        CBOpen = new javax.swing.JCheckBox();
        jButtonOK = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        CBsheetRenamed = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Choose the WorkBook events to be logged");

        CBClose.setText("Close");
        CBClose.setSelected(true);
        CBClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCloseActionPerformed(evt);
            }
        });

        CBsheetDeleted.setText("sheetDeleted");
        CBClose.setSelected(true);
        CBsheetDeleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBsheetDeletedActionPerformed(evt);
            }
        });

        CBsheetCreated.setText("sheetCreated");
        CBClose.setSelected(true);
        CBsheetCreated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBsheetCreatedActionPerformed(evt);
            }
        });

        CBOpen.setText("Open");
        CBClose.setSelected(true);
        CBOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOpenActionPerformed(evt);
            }
        });

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        CBsheetRenamed.setText("sheetRenamed");
        CBClose.setSelected(true);
        CBsheetRenamed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBsheetRenamedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CBOpen)
                                .addComponent(CBClose))
                            .addGap(65, 65, 65)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CBsheetRenamed)
                                .addComponent(CBsheetCreated)
                                .addComponent(CBsheetDeleted)))))
                .addGap(45, 45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CBsheetCreated)
                        .addGap(18, 18, 18)
                        .addComponent(CBsheetDeleted)
                        .addGap(18, 18, 18)
                        .addComponent(CBsheetRenamed))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(CBOpen)
                        .addGap(27, 27, 27)
                        .addComponent(CBClose)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonOK))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCloseActionPerformed

    private void CBsheetDeletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBsheetDeletedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBsheetDeletedActionPerformed

    private void CBsheetCreatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBsheetCreatedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBsheetCreatedActionPerformed

    private void CBOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBOpenActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        ArrayList<String> mylist=uiController.getEvl();
        if(CBOpen.isSelected()){
            if(!mylist.contains("Open"))
            {
                mylist.add("Open");
            }
        }else{
            if(mylist.contains("Open"))
            {
                mylist.remove("Open");
            }
        }

        if(CBClose.isSelected()){
            if(!mylist.contains("Close"))
            {
                mylist.add("Close");
            }
        }else{
            if(mylist.contains("Close"))
            {
                mylist.remove("Close");
            }
        }
        
        if(CBsheetCreated.isSelected()){
            if(!mylist.contains("sheetCreated"))
            {
                mylist.add("sheetCreated");
            }
        }else{
            if(mylist.contains("sheetCreated"))
            {
                mylist.remove("sheetCreated");
            }
        }
        
        if(CBsheetDeleted.isSelected()){
            if(!mylist.contains("sheetDeleted"))
            {
                mylist.add("sheetDeleted");
            }
        }else{
            if(mylist.contains("sheetDeleted"))
            {
                mylist.remove("sheetDeleted");
            }
        }
        
       if(CBsheetRenamed.isSelected()){
            if(!mylist.contains("sheetRenamed"))
            {
                mylist.add("sheetRenamed");
            }
        }else{
            if(mylist.contains("sheetRenamed"))
            {
                mylist.remove("sheetRenamed");
            }
        }

        uiController.setEvl(mylist);
        this.dispose();

    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void CBsheetRenamedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBsheetRenamedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBsheetRenamedActionPerformed

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
            java.util.logging.Logger.getLogger(WorkBookEventsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkBookEventsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkBookEventsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkBookEventsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkBookEventsUI(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBClose;
    private javax.swing.JCheckBox CBOpen;
    private javax.swing.JCheckBox CBsheetCreated;
    private javax.swing.JCheckBox CBsheetDeleted;
    private javax.swing.JCheckBox CBsheetRenamed;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

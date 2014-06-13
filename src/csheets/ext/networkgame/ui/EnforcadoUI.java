/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.networkgame.ui;

import csheets.ext.networkgame.Enforcado;
import csheets.ext.networkgame.NetworkGameController;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Miguel
 */
public class EnforcadoUI extends javax.swing.JPanel {

    public Enforcado game;

    /**
     * Creates new form EnforcadoUI
     */
    public EnforcadoUI(Enforcado game) {
        initComponents();
        this.game = game;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Guess!");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Loading");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Used");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        guess();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        guess();
    }//GEN-LAST:event_jButton1MouseReleased

    public void guess() {
        if (jTextField1.getText().length() == 1) {
            guess(jTextField1.getText().charAt(0));
        } else {
            guess(jTextField1.getText());
        }
    }

    public void guess(char guess) {
        boolean isRight = false;
        if (game.atempts == null) {
            //1st guess
            game.atempts = "" + guess;
        } else {
            game.atempts = game.atempts + " " + guess;
        }

        updateAtempts(guess);
        int i = 0;
        for (char c : game.dictionary.get(game.wordIndex).toCharArray()) {
            if (guess == c) {
                this.game.discovered.set(i, true);
                isRight = true;
            }
            i++;
        }
        if (isRight) {
            updateMessage();
        } else {
            game.strikes++;
            updateHangman();
            checkLoss();
        }

    }

    public void guess(String guess) {
        if (guess.equalsIgnoreCase(game.dictionary.get(game.wordIndex))) {
            winTrigger();
        } else {
            game.strikes++;
            updateHangman();
            checkLoss();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void updateAtempts(char guess) {
        jTextArea1.setText(game.atempts);

        //send the latest atemp to the other client
        String message = "GM" + "A" + guess;
        try {
            game.s.sendData(message.getBytes(), game.address.getHostName(), 7777);
        } catch (UnknownHostException ex) {
            Logger.getLogger(EnforcadoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void updateMessage() {
        String message = "";
        for (int i = 0; i < game.dictionary.get(game.wordIndex).length() - 1; i++) {
            if (game.discovered.get(i) == true) {
                message += game.message.toCharArray()[i] + " ";
            } else {
                message += "_ ";
            }
        }
        jLabel1.setText(message);
    }

    private void checkLoss() {
        if (game.strikes == 3) {
            String mensagem = "GM" + "E" + "W";
            try {
                game.s.sendData(mensagem.getBytes(), game.address.getHostName(), 7777);
            } catch (UnknownHostException ex) {
                Logger.getLogger(EnforcadoUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            NetworkGameController.mainWindow.dispose();
            NetworkGameController.initJFrame("Results");
            NetworkGameController.mainWindow.add(new ResultUI("You Loose"));
            NetworkGameController.packJFrame();
        }
    }

    private void winTrigger() {
        String mensagem = "GM" + "E" + "L";
        try {
            game.s.sendData(mensagem.getBytes(), game.address.getHostName(), 7777);
        } catch (UnknownHostException ex) {
            Logger.getLogger(EnforcadoUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        NetworkGameController.mainWindow.dispose();
        NetworkGameController.initJFrame("Results");
        NetworkGameController.mainWindow.add(new ResultUI("You Win"));
        NetworkGameController.packJFrame();
    }

    private void updateHangman() {
        if (game.strikes == 0) {
            jPanel1 = new HangmanPanel(0);
        } else if (game.strikes == 1) {
            jPanel1 = new HangmanPanel(1);
        } else if (game.strikes == 2) {
            jPanel1 = new HangmanPanel(2);
        } else {
            jPanel1 = new HangmanPanel(3);
        }
    }
}

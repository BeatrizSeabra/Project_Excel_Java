/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.exporttxt.ui;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Tiba
 */
public class TxtAction extends BaseAction {

    /**
     * The user interface controller
     */
    protected UIController uiController;
    
    public String SEPARATOR = ",";
    public String HEADER ="";

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
   

    public TxtAction(UIController uiController) {
        this.uiController = uiController;
        
    }

    protected String getName() {
        return "TXT";
    }

    protected void defineProperties() {
    }

    /**
     * A simple action that presents a confirmation dialog. If the user confirms
     * then the contents of the cell A1 of the current sheet are set to the
     * string "Changed".
     *
     * @param event the event that was fired
     */
    public void actionPerformed(ActionEvent event) {

        int c = this.uiController.getActiveSpreadsheet().getColumnCount();
        int r = this.uiController.getActiveSpreadsheet().getRowCount();

        try {

            //verificar se existe conteúdo
            /*if (c == 0 && r == 0) { 
             JOptionPane.showMessageDialog(null, "Nao foi mudificado nada.");
             } else {*/
            JFileChooser fc = new JFileChooser();
            //fc.addChoosableFileFilter(new FileNameExtensionFilter("", "pdf"));
            fc.setFileFilter(new FileNameExtensionFilter("Ficheiro TXT (.txt)", "txt"));
            String caminho = "";
            
            // USER OPTIONS FOR SEPARATOR AND HEADER
            SEPARATOR = JOptionPane.showInputDialog("Choose Separator");
            int dialogButton = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog (null,"Include Header ?","Header", dialogButton);
            if(dialogButton == JOptionPane.YES_OPTION) {
               HEADER = JOptionPane.showInputDialog("Header text");
            } else HEADER = "";
                     
            int retorno = fc.showSaveDialog(null);
            if (retorno == JFileChooser.APPROVE_OPTION) {
                caminho = fc.getSelectedFile().getAbsolutePath();
            }

            PrintWriter wr;
            wr = new PrintWriter(new FileWriter(caminho + ".txt"));

            System.out.println(c);
            System.out.println(r);
            wr.println(SEPARATOR+HEADER);
            for (int row = 0; row < r + 1; row++) {
                for (int column = 0; column < c + 1; column++) {
                    wr.print(this.uiController.getActiveSpreadsheet().getCell(column, row).getContent() + SEPARATOR);
                }
                wr.println();
            }
            wr.close();
            JOptionPane.showMessageDialog(null, "Ficheiro guardado com sucesso!");
//            }

        } catch (IOException ex) {
            Logger.getLogger(TxtAction.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.exporttxt.ui;

import csheets.CleanSheets;
import csheets.core.Cell;
import csheets.core.CellListener;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.Action.SMALL_ICON;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author JSilva314 - Joao Paulo Silva/ Stefan Parker
 * 
 */
public class TxtAction extends BaseAction{

    /**
     * The user interface controller
     */
    protected UIController uiController;
    
    public String SEPARATOR = ",";
    public String HEADER ="";
    public String caminho = "";
        
    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public TxtAction(UIController uiController) {
        uiController.setExportStatus(false);
        this.uiController = uiController;
                
    }
    /**
     * 
     * @return 
     */
    protected String getName() {
        return "TXT";
    }
    /**
     * 
     */
    protected void defineProperties() {
        setEnabled(true);
        putValue(SMALL_ICON, new ImageIcon(CleanSheets.class.getResource("res/img/txt.gif")));
    }

    /**
     * A simple action that presents a confirmation dialog. If the user confirms
     * then the contents of the cell A1 of the current sheet are set to the
     * string "Changed".
     *
     * @param event the event that was fired
     */
    public void actionPerformed(ActionEvent event) {
        uiController.setExportStatus(true);
        uiController.setModificado(false);
        File file = new File("txt");
        //nova thread que Exporta o ficheiro
        Thread thread = new Thread(new TxtAction.FileExporter(file));
        //iniciar a thread
        thread.start();
    }
    /**
     * Classe que implementa o Runnable para correr a Thread. Esta thread servirá para 
     * o programa correr em paralelo com o Export
     */
     private class FileExporter implements Runnable{
        File file;
        public FileExporter(File file){
            this.file = file;
        }
        @Override
        public void run() {
            exportFile(file);
            addListeners();
            while(uiController.getExportStatus()){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TxtAction.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(uiController.getModificado()){
                    exportFileWithParameters(file);
                }
                
            }
        }
      
    }
    
    private void exportFile(File file) {
        int c = this.uiController.getActiveSpreadsheet().getColumnCount();
        int r = this.uiController.getActiveSpreadsheet().getRowCount();
           
        try {

            JFileChooser fc = new JFileChooser();
          
            fc.setFileFilter(new FileNameExtensionFilter("Ficheiro TXT (.txt)", "txt"));
            
            // USER OPTIONS FOR SEPARATOR AND HEADER
            do{
            SEPARATOR = JOptionPane.showInputDialog("Choose Separator");
            if (SEPARATOR.length()>1 || SEPARATOR.length()<1)
                JOptionPane.showMessageDialog(null,"Invalid format, only 1 char","ERROR",JOptionPane.ERROR_MESSAGE);
            }while (SEPARATOR.length() > 1 || SEPARATOR.length()<1);
            HEADER = JOptionPane.showInputDialog("Header text");
                                 
            int retorno = fc.showSaveDialog(null);
            if (retorno == JFileChooser.APPROVE_OPTION) {
                caminho = fc.getSelectedFile().getAbsolutePath();
            }
         
            PrintWriter wr;
            wr = new PrintWriter(new FileWriter(caminho + ".txt"));
            wr.println(SEPARATOR+HEADER);
            for (int row = 0; row < r + 1; row++) {
                for (int column = 0; column < c + 1; column++) {
                    wr.print(this.uiController.getActiveSpreadsheet().getCell(column, row).getContent() + SEPARATOR);
                }
                wr.println();
            }
            wr.close();
            JOptionPane.showMessageDialog(null, "Ficheiro guardado com sucesso!");
            uiController.setModificado(false);
            //ExportFile a = new ExportFile(uiController,file, r, c,caminho, SEPARATOR, HEADER);

        } catch (IOException ex) {
            Logger.getLogger(TxtAction.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    /** 
     * A method to write on the file previous created. If this method is called
     * means that the export action already was called once and already is created a file with content.
     * So the class verifies if there any changed cell and calls this method to write on the file.
     * @param file 
     */
	 
     private void exportFileWithParameters(File file){
        int c = this.uiController.getActiveSpreadsheet().getColumnCount();
        int r = this.uiController.getActiveSpreadsheet().getRowCount();
         
         try {
            PrintWriter wr;
            wr = new PrintWriter(new FileWriter(caminho + ".txt"));
            wr.println(SEPARATOR+HEADER);
            for (int row = 0; row < r + 1; row++) {
                for (int column = 0; column < c + 1; column++) {
                    wr.print(this.uiController.getActiveSpreadsheet().getCell(column, row).getContent() + SEPARATOR);
                }
                wr.println();
            }
            wr.close();
            uiController.setModificado(false);

        } catch (IOException ex) {
            Logger.getLogger(TxtAction.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
        /**
         * Implements cell listeners on the active spreedsheet. This class implements cell 
         * listeners to all of the cell on the active spreedsheet, so if any cell change,
         * it will set boolean true and write on the file
         */
	
	class OnChangeListener implements CellListener {

        @Override
        public void valueChanged(Cell cell) {
            uiController.setModificado(true);
        }

        @Override
        public void contentChanged(Cell cell) {
            uiController.setModificado(true);
        }

        @Override
        public void dependentsChanged(Cell cell) {
            uiController.setModificado(true);
        }

        @Override
        public void cellCleared(Cell cell) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void cellCopied(Cell cell, Cell source) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
	 }
	 
	 /**
          * This method calls the OnChangeListener to set Cell Listeners to all of the cells.
          */
        
        
	 public void addListeners(){
	 for (int i=0;i<52;i++){
		for(int j=0;j<128;j++){
			
                        Cell cell = uiController.getActiveSpreadsheet().getCell(i, j);
			cell.addCellListener(new OnChangeListener());
			}
		}
	}
}
package csheets.ext.importfiles.ui;

import csheets.CleanSheets;
import csheets.core.Address;
import csheets.core.Cell;
import csheets.core.Spreadsheet;
import csheets.core.formula.compiler.FormulaCompilationException;
import csheets.ui.FileChooser;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 * An action of the simple extension that exemplifies how to interact with the
 * spreadsheet.
 *
 * @author Tiago and Frederico Calor Us70 and Us71
 */
public class ImportAction extends BaseAction {

    /**
     * The user interface controller
     */
    protected UIController uiController;
    private FileChooser chooser;
    
        public static boolean HAS_HEADER = false;
        public static String SEPARATOR = ",";

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public ImportAction(UIController uiController, FileChooser chooser) {
        this.uiController = uiController; // menu inicial
        this.chooser = chooser; // escolher ficheiro
    }

    protected String getName() {
        return "TXT ";
    }

    protected void defineProperties() {
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

        this.uiController.setImportStatus(false);
        //Filechooser to select file      
        File file = getFile();
        this.uiController.setImportStatus(true);    
        //nova thread que importa o ficheiros
        Thread thread = new Thread(new FileImporter(file));
        //iniciar a thread
        thread.start();
         
    }
    // classe que implementa a thread
    private class FileImporter implements Runnable{
        File file;
        Date date;
        public FileImporter(File file){
            this.file = file;
        }
        @Override
        public void run() {
            //chama o import file
            date = new Date(file.lastModified());
            try {
                importFile(file);
            } catch (FormulaCompilationException ex) {
                Logger.getLogger(ImportAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            // fica à espera da modificação no txt aberto
            while(uiController.getImportStatus())
            {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ImportAction.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(date.before(new Date(file.lastModified()))){
                    try {  
                        importFile(file);
                    } catch (FormulaCompilationException ex) {
                        Logger.getLogger(ImportAction.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    date = new Date(file.lastModified());
                }
            }
        }
        
    }
    
    private void importFile(File file) throws FormulaCompilationException {
        //Variables to manipulate txt file
        clearSpreadSheet();
        FileReader fileReader = null;
        BufferedReader bufferedReader;
        String line = "";
        Cell cl;
        List<String> data;
        Spreadsheet ss;
        Address addr;

        int it = 0;

        if (file != null) {
            //Opens the selected file
            try {
                fileReader = new FileReader(file.getAbsolutePath());
            } catch (FileNotFoundException ex) {
                showErrorDialog("The file you requested was not found.\n");
            }

            if (fileReader != null) {
                bufferedReader = new BufferedReader(fileReader);
                cl = uiController.getActiveCell();
                addr = cl.getAddress();
                ss = cl.getSpreadsheet();

                //Reads the first line
                try {
                    line = bufferedReader.readLine();
                    
                    //separador e o primeiro caracter
                    //NAO PODE SER CARACTERES RESERVADOS EM EXPRESSOES REGULARES!!!!!
                    //exemplos ->  [ ] - + \ * ( ) ? . 
                    SEPARATOR=""+line.charAt(0);
                    //primeira linha sem contar com o primeiro caracter que e o separador
                    line = line.substring(1);
                    // ver se tem o cabeçalho
                    if(line.contains(SEPARATOR))
                        HAS_HEADER=false;
                    else HAS_HEADER=true;
                    
                } catch (IOException ex) {
                    showErrorDialog("There was a problem reading a line.\n");
                }
                
                if(HAS_HEADER){
                    data = Arrays.asList(line.split(SEPARATOR));
                    for (int i = 0; i < data.size(); i++) {
                        cl = ss.getCell(addr.getColumn() + i, addr.getRow() + it);

                        //Inserts data into the cell
                        try {
                            cl.setContent(data.get(i));
                        } catch (FormulaCompilationException ex) {
                            showErrorDialog("There was a problem inserting data into the cell\n");
                        }

                    }
                    
                    it++;
                    
                    try {
                        line = bufferedReader.readLine();
                    } catch (IOException ex) {
                        showErrorDialog("There was a problem reading the file\n");
                    }
                    
                }
                
                while (line != null) {
                    // utilizo a variavel em cima
                    data = Arrays.asList(line.split(SEPARATOR));

                    for (int i = 0; i < data.size(); i++) {
                        cl = ss.getCell(addr.getColumn() + i, addr.getRow() + it);

                        //Inserts data into the cell
                        try {
                            cl.setContent(data.get(i));
                        } catch (FormulaCompilationException ex) {
                            showErrorDialog("There was a problem inserting data into the cell\n");
                        }

                    }

                    it++;
                    try {
                        line = bufferedReader.readLine();
                    } catch (IOException ex) {
                        showErrorDialog("There was a problem reading the file\n");
                    }
                }

                //Closes the file
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    showErrorDialog("There was a problem closing the file\n");
                }

            }
        }
    }
    private void clearSpreadSheet() throws FormulaCompilationException{
       int r = this.uiController.getActiveSpreadsheet().getRowCount();
       int c = this.uiController.getActiveSpreadsheet().getColumnCount();
       
       for(int i=0;i<r+1;i++){
           for(int j=0;j<c+1;j++){
               this.uiController.getActiveSpreadsheet().getCell(i, j).setContent("");
           }
       }
    }
    

    /**
     * Returns the file to open.
     *
     * @return file the file to open
     */
    public File getFile() {
        return chooser.getFileToOpen();

    }
}

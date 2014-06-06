package csheets.ext.importfiles.ui;

import csheets.core.Address;
import csheets.core.Spreadsheet;
import csheets.ui.FileChooser;
import java.awt.event.ActionEvent;

import csheets.core.Cell;
import csheets.core.formula.compiler.FormulaCompilationException;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;

/**
 * An action of the simple extension that exemplifies how to interact with the
 * spreadsheet.
 *
 * @author Tiago
 */
public class ImportAction extends BaseAction {

    /**
     * The user interface controller
     */
    protected UIController uiController;
    private FileChooser chooser;

    public static final String SEPARATOR = ",";

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public ImportAction(UIController uiController, FileChooser chooser) {
        this.uiController = uiController;
        this.chooser = chooser;
    }

    protected String getName() {
        return "TXT ";
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

        //Filechooser to select file
        File file = getFile();

        //Variables to manipulate txt file
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
                } catch (IOException ex) {
                    showErrorDialog("There was a problem reading a line.\n");
                }

                while (line != null) {

                    data = Arrays.asList(line.split(","));

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

    /**
     * Returns the file to open.
     *
     * @return file the file to open
     */
    public File getFile() {
        return chooser.getFileToOpen();

    }
}

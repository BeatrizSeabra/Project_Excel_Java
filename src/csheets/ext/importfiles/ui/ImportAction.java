package csheets.ext.importfiles.ui;

import csheets.core.Cell;
import csheets.core.Spreadsheet;
import csheets.core.Workbook;
import csheets.ext.invokefunction.ui.*;
import csheets.ext.simple.ui.*;
import csheets.io.Codec;
import csheets.io.TXTCodec;
import csheets.ui.FileChooser;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * An action of the simple extension that exemplifies how to interact with the
 * spreadsheet.
 *
 * @author Alexandre Braganca
 */
public class ImportAction extends BaseAction {

    /**
     * The user interface controller
     */
    protected UIController uiController;

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public ImportAction(UIController uiController) {
        this.uiController = uiController;
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

        FileChooser chooser = new FileChooser(null, null);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT", "txt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                TXTCodec c = null;
                String file = chooser.getSelectedFile().getName();
                InputStream stream = new ByteArrayInputStream(file.getBytes(StandardCharsets.UTF_8));
//                c.read(stream);
                this.uiController.getActiveCell();
                this.uiController.setActiveSpreadsheet((Spreadsheet) stream);
            } catch (Exception ex) {
                // para ja ignoramos a excepcao
            }
            System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());

        }
//        int result = JOptionPane.showConfirmDialog(null, "You have selected the Example option. Do you want to set cell A1 to 'Changed'");

        
    }
}


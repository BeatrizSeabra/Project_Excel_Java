package csheets.ext.exportXML.ui;

import csheets.core.Spreadsheet;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author i120388
 */
public class XMLAction extends BaseAction {

    /**
     * Variável auxiliar para teste unitário uma vez que o método a testar é
     * void
     */
    protected boolean unit = false;
    /**
     * The user interface controller
     */
    protected UIController uiController;

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public XMLAction(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "XML";
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
    @Override
    public void actionPerformed(ActionEvent e) {


        try {
            JFileChooser fc = new JFileChooser();
            fc.setFileFilter(new FileNameExtensionFilter("Ficheiro XML (.xml)", "xml"));
            String caminho = "";
            int retorno = fc.showSaveDialog(null);
            if (retorno == JFileChooser.APPROVE_OPTION) {
                caminho = fc.getSelectedFile().getAbsolutePath();
            }

            PrintWriter writer;
            writer = new PrintWriter(new FileWriter(caminho + ".xml"));
            Spreadsheet sheet = uiController.getActiveSpreadsheet();


            writer.print("<CleanSheet xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \n"
                    + "\t\t\txmlns=\"http://www.dei.isep.ipp.pt/lapr4\" \n"
                    + "\t\t\txsi:schemaLocation=\"http://www.dei.isep.ipp.pt/lapr4 cleanSheets.xsd\">\n");

            for (int column = 0; column < sheet.getColumnCount(); column++) {
                writer.print("\t\t\t\t<column id=\"" + (column + 1) + "\">\n");
                for (int row = 0; row < sheet.getRowCount(); row++) {

                    if (!(sheet.getCell(column, row).getContent().isEmpty())) {
                        writer.print("\t\t\t\t\t<row id=\"" + (row + 1) + "\">\n");

                        writer.print("\t\t\t\t\t\t<cell>" + sheet.getCell(column, row).getContent() + "</cell>\n");

                        writer.print("\t\t\t\t\t</row>\n");
                    }

                }
                writer.print("\t\t\t\t</column>\n");
            }

            writer.print("</CleanSheet>\n");

            writer.close();
            System.out.println("Done!");

            JOptionPane.showMessageDialog(null, "Ficheiro guardado com sucesso!");
            unit=true;
        } catch (IOException ex) {
            unit = false;
            Logger.getLogger(XMLAction.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
}

package csheets.ext.exportHtml.ui;

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
 * @author 1040314 - João Paulo Silva
 */
public class HtmlAction extends BaseAction {

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
    public HtmlAction(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "HTML";
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
   
    public void actionPerformed(ActionEvent e) {


        try {
            JFileChooser fc = new JFileChooser();
            fc.setFileFilter(new FileNameExtensionFilter("Ficheiro HTML (.html)", "html"));
            String caminho = "";
            int retorno = fc.showSaveDialog(null);
            if (retorno == JFileChooser.APPROVE_OPTION) {
                caminho = fc.getSelectedFile().getAbsolutePath();
            }

            PrintWriter writer;
            writer = new PrintWriter(new FileWriter(caminho + ".html"));
            Spreadsheet sheet = uiController.getActiveSpreadsheet();


            writer.print("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\"\n" +
                                "   \"http://www.w3.org/TR/html4/strict.dtd\">\n");
            writer.print("<HTML>\n" +
                        "   <HEAD>\n" +
                        "      <TITLE>CleanSheets</TITLE>\n" +
                        "   </HEAD>\n" +
                        "   <BODY>" + "<table cellspacing=\"1\" border=\"5\" style=\"background-color: #eeeeee;\"" );
            for (int column = 0; column < sheet.getColumnCount(); column++) {
                writer.print("\n<tr>\n");
                for (int row = 0; row < sheet.getRowCount(); row++) {
                   writer.print("<td width=\"60\">" + sheet.getCell(row, column).getContent() + "</td>\n");
               
                }
                writer.print("</tr>");
            }

            writer.print("\n</BODY>\n" + "</HTML>");

            writer.close();
            System.out.println("Done!");

            JOptionPane.showMessageDialog(null, "Ficheiro guardado com sucesso!");
            unit=true;
        } catch (IOException ex) {
            unit = false;
            Logger.getLogger(HtmlAction.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
}

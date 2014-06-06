package csheets.ext.pdf.ui;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import csheets.core.Spreadsheet;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;

import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Marc
 */
public class ExportPdfAction extends BaseAction {

    /**
     * The user interface controller
     */
    protected UIController uiController;

    /**
     * Creates a new action.
     *
     * @param uiController the user interface controller
     */
    public ExportPdfAction(UIController uiController) {
        this.uiController = uiController;
    }

    protected String getName() {
        return "ExportPDF";
    }

    protected void defineProperties() {
    }

    /**
     * @param event the event that was fired
     */
    public void actionPerformed(ActionEvent event) {
        JFileChooser pdf = new JFileChooser();
        pdf.setFileFilter(new FileNameExtensionFilter("Portable Document Format (*.pdf)", "pdf"));
        String path = "";
        int returns = pdf.showSaveDialog(null);
        if (returns == JFileChooser.APPROVE_OPTION) {
            path = pdf.getSelectedFile().getAbsolutePath();
            Document document = new Document();
            Spreadsheet thissheet = uiController.getActiveSpreadsheet();

            try {
                PdfWriter.getInstance(document, new FileOutputStream(path + ".pdf"));
                document.open();
                int maxrow = thissheet.getRowCount() + 1;
                int maxcol = thissheet.getColumnCount() + 1;

                for (int i = 0; i < maxrow; i++) {
                    for (int j = 0; j < maxcol; j++) {
                        if (!thissheet.getCell(j, i).getContent().isEmpty()) {
                            Paragraph preface = new Paragraph();
                            Phrase f = new Phrase();
                            f.add(new Chunk(thissheet.getCell(j, i).getAddress().toString() + " - "));
                            f.add(new Chunk(thissheet.getCell(j, i).getContent()));
                            preface.add(f);
                            document.add(preface);
                        }
                    }

                }
                document.close();
            } catch (DocumentException ex) {
                System.err.println(ex.getMessage());
            } catch (FileNotFoundException ex) {
                System.err.println(ex.getMessage());
            }
        } else {
            pdf.cancelSelection();
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.io;

import csheets.core.Spreadsheet;
import csheets.core.Workbook;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author i120388
 */
public class XMLCodec implements Codec {

    public XMLCodec() {
    }

    @Override
    public Workbook read(InputStream stream) throws IOException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void write(Workbook workbook, OutputStream stream) throws IOException {
        System.out.println("Writing!");
        // Wraps stream
        PrintWriter writer = new PrintWriter(new BufferedWriter(
                new OutputStreamWriter(stream)));

        // Writes content of rows
        Spreadsheet sheet = workbook.getSpreadsheet(0);
        writer.print(" <xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \n" +
"            xmlns=\"http://www.dei.isep.ipp.pt/lapr4\" \n" +
"            xsi:schemaLocation=\"http://www.dei.isep.ipp.pt/lapr4 cleanSheets.xsd\">\n");

        for (int column = 0; column < sheet.getColumnCount(); column++) {
            writer.print("    <column id="+(column+1)+ ">\n");
            for (int row = 0; row < sheet.getRowCount(); row++) {

                writer.print("        <row id="+(row+1)+">\n");

                if (column + 1 < sheet.getColumnCount()) {
                    writer.print("            <cell>"+sheet.getCell(column, row).getContent()+"</cell>\n");
                }

                writer.print("        </row>\n");
            }
            writer.print("    </column>\n");
        }

        writer.print("</CleanSheet>\n");

        // Frees resources
        writer.close();
        stream.close();
        System.out.println("Done!");
    }

}

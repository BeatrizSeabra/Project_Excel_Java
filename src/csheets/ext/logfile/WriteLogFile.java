/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.logfile;

import csheets.core.Address;
import csheets.core.Cell;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author RafaelChaves/Stefan Teixeira
 */

/*
 * 
 * */
public final class WriteLogFile {

    /**
     * Create or writes at the end of the EventLog file each event that occurs
     * in the cells.
     *
     * @param address
     * @param event
     * @param evl
     * @param formula
     */
    public static void writeLogFile(String address, String event, ArrayList<String> evl, String formula) {
        if (formula.equals("")) {
            if (evl.contains(event)) {
                try {
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Date date = new Date();
                    File file;
                    String log = "";
                    String newLine = System.getProperty("line.separator");
                    BufferedWriter writer = new BufferedWriter(new FileWriter("EventLog.txt", true));
                    log = String.format("%s Event, on cell %s. time:%s\n\n\n", event, address, dateFormat.format(date));
                    writer.write(log + newLine);
                    writer.close();

                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
        } else {
            try {
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                File file;
                String log = "";
                String newLine = System.getProperty("line.separator");
                BufferedWriter writer = new BufferedWriter(new FileWriter("EventLog.txt", true));
                log = String.format("%s Event with formula: %s time:%s\n\n\n", event, formula, dateFormat.format(date));
                writer.write(log + newLine);
                writer.close();

            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
    }

    public static void writeLogFile(String event, ArrayList<String> evl) {
        if (evl.contains(event)) {
            try {
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                File file;
                String log = "";
                String newLine = System.getProperty("line.separator");
                BufferedWriter writer = new BufferedWriter(new FileWriter("EventLog.txt", true));
                log = String.format("%s WorkBookEvent, time:%s\n\n\n", event, dateFormat.format(date));
                writer.write(log + newLine);
                writer.close();

            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
    }

    public static void writeLogFile(String event) {

        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            File file;
            String log = "";
            String newLine = System.getProperty("line.separator");
            BufferedWriter writer = new BufferedWriter(new FileWriter("EventLog.txt", true));
            log = String.format("%s WorkBookEvent, time:%s\n\n\n", event, dateFormat.format(date));
            writer.write(log + newLine);
            writer.close();

        } catch (Exception ee) {
            ee.printStackTrace();
        }

    }

    public static void writeLogFile(String event, String[] formulas) {
//      0 - Open
//      1 - Close
//      2 - sheetCreated
//      3 - sheetDeleted
//      4 - sheetRenamed

        int i = 99;

        switch (event) {
            case "Open":
                i = 0;
                break;

            case "Close":
                i = 1;
                break;

            case "sheetCreated":
                i = 2;
                break;
            case "sheetDeleted":
                i = 3;
                break;

            case "sheetRenamed":
                i = 4;
                break;
        }

        if (i >= 0 && i <= 4 && formulas[i] != null) {
            try {
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                String log;
                String newLine = System.getProperty("line.separator");
                BufferedWriter writer = new BufferedWriter(new FileWriter("EventLog.txt", true));
                log = String.format("%s WorkBook Event Formula, %s , time:%s\n\n\n", event, formulas[i], dateFormat.format(date));
                writer.write(log + newLine);
                writer.close();

            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
    }
}

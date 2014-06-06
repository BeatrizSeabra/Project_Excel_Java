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
 * @author RafaelChaves
 */

/*
 * 
 * */
public final class WriteLogFile {

    //Create or writes at the end of the EventLog file each event that occurs in the cells. 
    public static void writeLogFile(String address, String event, ArrayList<String> evl) {
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
    }
}

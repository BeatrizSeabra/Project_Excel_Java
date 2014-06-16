/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.temporary;

import csheets.core.Spreadsheet;
import java.util.ArrayList;

/**
 *
 * @author Tiago
 */
public class TemporaryVar{

    private static ArrayList<TemporaryVar> temps = new ArrayList<TemporaryVar>();
    private String name;
    private String value;
    private Spreadsheet sheet;

    public TemporaryVar(String name, String value, Spreadsheet sheet) {
        setName(name);
        setValue(value);
        this.sheet = sheet;
        temps.add(this);
    }

     private void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public Spreadsheet getSheet() {
        return sheet;
    }
    
     public static ArrayList<TemporaryVar> getTemps() {
        return temps;
    }
    
    public static boolean verfiytemp(String name) {
        int c = 0;
        boolean flag = false;
        while (c < temps.size() && !flag) {
            if (temps.get(c).getName().equals(name)) {
                flag = true;
            } else {
                c++;
            }
        }
        return flag;
    }

    public static void removetemps(Spreadsheet sheet) {
        for (TemporaryVar tempVar : temps) {
            if (tempVar.sheet.equals(sheet)) {
                temps.remove(tempVar);
            }
        }
    }

    
    public boolean isDouble() {
        try {
            Double.valueOf(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public String toString() {
        return value;
    }
}



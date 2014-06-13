/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.temporary;

import csheets.core.Spreadsheet;

/**
 *
 * @author Tiago
 */
public class TemporaryVarRep {

    public static void newTemporaryVar(String name, String value, Spreadsheet sheet) {
        new TemporaryVar(name, value, sheet);
    }

    public static void updateTemporaryVarValue(String name, String value) {
        int c = 0;
        boolean flag = false;
        while (c < TemporaryVar.getTemps().size() && !flag) {
            if (TemporaryVar.getTemps().get(c).getName().equals(name)) {
                flag = true;
                TemporaryVar.getTemps().get(c).setValue(value);
            } else {
                c++;
            }
        }
    }

    public static void removeTemporaryVars(Spreadsheet sheet) {
        int vars = 0;
        int c = 0;
        for (TemporaryVar tempVar : TemporaryVar.getTemps()) {
            if (tempVar.getSheet().equals(sheet)) {
                vars++;
            }
        }
        if (vars > 0) {
            while (c < TemporaryVar.getTemps().size() - vars + 1) {
                if (TemporaryVar.getTemps().get(c).getSheet().equals(sheet)) {
                    TemporaryVar.getTemps().remove(c);
                } else {
                    c++;
                }
            }
        }
    }
}

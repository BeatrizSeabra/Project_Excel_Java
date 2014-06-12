/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.logfile;

import csheets.CleanSheets;
import csheets.ui.ctrl.UIController;
import java.util.ArrayList;

/**
 *
 * @author Stefan Parker
 */
public class AtributeFormula {
    
    String evento,formula;
    public boolean activo=false;
    public static ArrayList<String> eve= new ArrayList();
    public static ArrayList<String> form= new ArrayList();

    public AtributeFormula() {
    }
    
    
    
    public AtributeFormula(String evento, String formula) {
        setEvento(evento);
        setFormula(formula);
    }

    public String getEvento() {
        return evento;
    }

    public String getFormula() {
        return formula;
    }

    public ArrayList<String> getEve() {
        return eve;
    }

    public ArrayList<String> getForm() {
        return form;
    }
    
    

    public boolean isActivo() {
        return activo;
    }

    public void setEvento(String evento) {
        this.evento = evento;
        eve.add(this.evento);
        activo=true;
    }

    public void setFormula(String formula) {
        this.formula = formula;
        form.add(this.formula);
    }
    
    
    
}

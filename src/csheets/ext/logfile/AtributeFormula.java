/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.logfile;

import csheets.CleanSheets;
import csheets.ui.ctrl.UIController;

/**
 *
 * @author Stefan Parker
 */
public class AtributeFormula {
    
    String evento,formula;
    public boolean activo=false;
    //public CleanSheets cs;
    
    /*public AtributeFormula(CleanSheets cs){
		this.cs = cs;
	}*/
    
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

    public boolean isActivo() {
        return activo;
    }

    public void setEvento(String evento) {
        this.evento = evento;
        activo=true;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }
    
    
    
}

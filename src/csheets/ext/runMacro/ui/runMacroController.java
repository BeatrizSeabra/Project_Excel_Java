package csheets.ext.runMacro.ui;

import csheets.core.Cell;
import csheets.core.Workbook;
import csheets.ui.ctrl.FocusOwnerAction;
import csheets.ui.sheet.SpreadsheetTable;
import java.awt.event.ActionEvent;

/**
 *
 * @author 1120564MarcoEsteves
 */
public class runMacroController extends FocusOwnerAction {

    
    public runMacroController(SpreadsheetTable focusOwner) {
        this.focusOwner = focusOwner;
    }

    /**
     * Recebe a macro, e depois de executa-la, envia os resultados numa string.
     */
    public String results(String macro ) {
        String [] lines = macro.split("\n");
        Workbook WB = new Workbook(1);
        String res="";
        //if(focusOwner == null) {
           // return "";
        //} else {
        Cell tmp = WB.getSpreadsheet(0).getCell(0 ,0);
        //Cell tmp2 = focusOwner.getSpreadsheet().getCell(30, 30);

        for (int i = 0; i < lines.length; i++) {
            try {
                String content = lines[i];
                
                tmp.setContent(content);
                res=res+tmp.getFormula()+"= ";
                res = res +tmp.getFormula().evaluate().toString()+"\n";
                 
                tmp.setContent("");
            } catch (Exception e) {
                System.err.println(e);
            }

        }
        return res;
       // }
    }

    protected String getName() {
        return "Run Action";
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.formeditor;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Oleg
 */
public class Form {
    
    public static final String NAME = "Form";
    
    public static int nLines;
    
    public static String[] selected;
    
    public static ArrayList<String> buttonList;
    
    public Form(){
        
    }
    
    public Form(int nLines, String[] selected){
        this.nLines = nLines;
        this.selected = selected;
    }
    
    public int getnLines(){
        return nLines;
    }
    
    public String[] getSelected(){
        return selected;
    }
    
    public ArrayList<String> getButtonList(){
        return buttonList;
    }
    
     public void setButtonList(ArrayList<String> buttonList){
        this.buttonList = buttonList;
    }
    
    public void save(Form form, ArrayList<JTextField> dataList) {
        InMemoryForm inm = InMemoryForm.getInstance();
        inm.addForm(form);
        inm.addDataList(dataList);
    }
    
}

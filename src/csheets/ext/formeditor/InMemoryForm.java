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
public class InMemoryForm {
    
    private static final InMemoryForm instance = new InMemoryForm(); 
    
    public static InMemoryForm getInstance() 
    { 
        return instance; 
    }
    
    private static Form form= new Form();
    private static ArrayList<JTextField> dataList;
    
   public void addForm(Form form) 
   { 
       form=form; 
   } 
   
   public void addDataList(ArrayList<JTextField> dataList)
   {
       this.dataList=dataList;
   }
   
   public Form getForm()
   {
       return form;
   }
   
   public ArrayList<JTextField> getDataList()
   {
       return dataList;
   }
    
}

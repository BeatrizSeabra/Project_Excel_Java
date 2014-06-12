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
    
    private static ExtensionFormEditor form= new ExtensionFormEditor();
    private static ArrayList<JTextField> ListaTexto;
    
   public void add(ExtensionFormEditor form) 
   { 
       form=form; 
   } 
   
   public void addPreenchimento(ArrayList<JTextField> ListaTexto)
   {
       this.ListaTexto=ListaTexto;
   }
   
   public ExtensionFormEditor getForm()
   {
       return form;
   }
   
   public ArrayList<JTextField> getPreenchimento()
   {
       return ListaTexto;
   }
    
}

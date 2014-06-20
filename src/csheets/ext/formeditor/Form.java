/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.formeditor;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Oleg & Rui 1110506
 */
public class Form {

    private String name;   
    private  int nLines;
    private  String[] selected;
    private  ArrayList<String> buttonList;
    private  ArrayList<JTextField> dataList;
    private boolean color;
    
    public Form(){ 
    }
   
    public Form(int nLines, String[] selected){
        this.nLines = nLines;
        this.selected = selected;
        this.color = false;
    }
      public Form(String name,int nLines, String[] selected,ArrayList<String> buttonList,ArrayList<JTextField> dataList){
        this.name = name;
        this.nLines = nLines;
        this.selected = selected;
        this.buttonList = buttonList;
        this.dataList = dataList;
        this.color = color;
    }
     public  ArrayList<JTextField> getDataList() {
        return dataList;
    }


    public void setDataList(ArrayList<JTextField> aDataList) {
        dataList = aDataList;
    }
    
    public void setColor(boolean color){
        this.color = color;
    }
    
    public boolean getColor(){
        return color;
    }
    
    public int getnLines(){
        return nLines;
    }
    
    public String getName(){
        return name;
    }
    
     public void setName(String name){
        this.name = name;
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
     
}

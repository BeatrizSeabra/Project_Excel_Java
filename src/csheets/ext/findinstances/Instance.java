/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.findinstances;

import java.net.InetAddress;

/**
 *
 * @author Biia
 */
public class Instance implements Comparable{
    private InetAddress IPAddress;
    private int UniqueID;
    private String[] Workbooks;
    private String[] Extensions;
    
    public Instance(){
        
    }
    public void addWorkbook(String book){
        
        
    }
    
    public void addExtension(String ext){
        
        
    }
    /**
     * @return the IPAddress
     */
    public InetAddress getIPAddress() {
        return IPAddress;
    }

    /**
     * @param IPAddress the IPAddress to set
     */
    public void setIPAddress(InetAddress IPAddress) {
        this.IPAddress = IPAddress;
    }

    /**
     * @return the UniqueID
     */
    public int getUniqueID() {
        return UniqueID;
    }

    /**
     * @param UniqueID the UniqueID to set
     */
    public void setUniqueID(int UniqueID) {
        this.UniqueID = UniqueID;
    }

    /**
     * @return the Workbooks
     */
    public String[] getWorkbooks() {
        return Workbooks;
    }

    /**
     * @param Workbooks the Workbooks to set
     */
    public void setWorkbooks(String[] Workbooks) {
        this.Workbooks = Workbooks;
    }

    /**
     * @return the Extensions
     */
    public String[] getExtensions() {
        return Extensions;
    }

    /**
     * @param Extensions the Extensions to set
     */
    public void setExtensions(String[] Extensions) {
        this.Extensions = Extensions;
    }

    @Override
    public int compareTo(Object o) {
        if(o.getClass()!=this.getClass()){
            return 0;
        }
        Instance inst=(Instance)o;
        return IPAddress.getHostAddress().compareTo(inst.getIPAddress().getHostAddress());
    }
    
}

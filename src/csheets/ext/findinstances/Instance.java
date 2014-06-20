/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.findinstances;

import java.net.InetAddress;
import java.util.ArrayList;

/**
 *
 * @author Biia
 */
public class Instance implements Comparable{
    private InetAddress IPAddress;
    private int UniqueID;
    private ArrayList<String> Workbooks;
    private ArrayList<String> Extensions;
    
    public Instance(InetAddress IPAddress, int UniqueID){
        this.IPAddress=IPAddress;
        this.UniqueID=UniqueID;
        Workbooks=new ArrayList();
        Extensions=new ArrayList();
    }
    
    public void addWorkbook(String book){
        Workbooks.add(book);
    }
    
    public void addExtension(String ext){
        Extensions.add(ext);
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
    public ArrayList<String> getWorkbooks() {
        return Workbooks;
    }

    /**
     * @param Workbooks the Workbooks to set
     */
    public void setWorkbooks(ArrayList<String> Workbooks) {
        this.Workbooks = Workbooks;
    }

    /**
     * @return the Extensions
     */
    public ArrayList<String> getExtensions() {
        return Extensions;
    }

    /**
     * @param Extensions the Extensions to set
     */
    public void setExtensions(ArrayList<String> Extensions) {
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.chat;

import java.util.ArrayList;

/**
 *
 * @author Fabio Carvalho
 */
public class Conversation {
    
    private String ID;
    private ArrayList<String> ips;

    public Conversation(String ID, ArrayList ips) {
        this.ID = ID;
        this.ips = ips;
    }

    public Conversation(String ID) {
        this.ID = ID;
        ips= new ArrayList();
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the ips
     */
    public ArrayList<String> getIps() {
        return ips;
    }

    /**
     * @param ips the ips to set
     */
    public void setIps(ArrayList ips) {
        this.ips = ips;
    }
    
    /**
     * Adiciona IP á conversa
     * @param IP
     */
    public void addIP(String IP){
    if(!this.ips.contains(IP)){
        ips.add(IP);
    }
    }
    /**
     * Remove IP da conversa
     */
    public void removeIP(String IP){
        if(this.ips.contains(IP)){
        ips.remove(IP);
    }
    }
    
}

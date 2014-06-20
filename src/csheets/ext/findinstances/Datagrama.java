/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.findinstances;

/**
 *
 * @author Biia
 */
public class Datagrama {
    private int ID;
    private int numDatagrama;
    private int totalDatagramas;
    private String conteudo;

    public Datagrama(int ID, int numDatagrama, int totalDatagramas, String conteudo){
        this.ID=ID;
        this.numDatagrama=numDatagrama;
        this.totalDatagramas=totalDatagramas;
        this.conteudo=conteudo;
    }
    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the numDatagrama
     */
    public int getNumDatagrama() {
        return numDatagrama;
    }

    /**
     * @param numDatagrama the numDatagrama to set
     */
    public void setNumDatagrama(int numDatagrama) {
        this.numDatagrama = numDatagrama;
    }

    /**
     * @return the totalDatagramas
     */
    public int getTotalDatagramas() {
        return totalDatagramas;
    }

    /**
     * @param totalDatagramas the totalDatagramas to set
     */
    public void setTotalDatagramas(int totalDatagramas) {
        this.totalDatagramas = totalDatagramas;
    }

    /**
     * @return the conteudo
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * @param conteudo the conteudo to set
     */
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    
}

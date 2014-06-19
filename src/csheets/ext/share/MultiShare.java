/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.share;

import javax.swing.DefaultListModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Oleg (1120622)
 */
public class MultiShare {
    
    private static MultiShare multiShare = new MultiShare();
    private DefaultListModel modelServers;
    private DefaultListModel modelClients;
    private DefaultTreeModel server_on_lan;
    
    private MultiShare() {
        modelServers = new DefaultListModel();
        modelClients = new DefaultListModel();
        server_on_lan = new DefaultTreeModel(new DefaultMutableTreeNode("Servers"));
    }
    
    public static MultiShare getShares() {

        return multiShare;
    }
    
    public void addClient(Client client){
        modelClients.addElement(client);
    }
    
    public void addServer(Server server){
        modelServers.addElement(server);
    }
    
    public void stopServerConnection(int index) {

        if (modelServers.get(index) !=null) {
            try {
                ((Server)modelServers.get(index)).stopServer();
                modelServers.remove(index);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
    
    /**
     * Pára uma deternimada Partilha
     * @param server 
     */
    public void stopServerConnection(Server server) {
        int index= modelServers.indexOf(server);
        if (index!=-1) {
            try {
                ((Server)modelServers.get(index)).stopServer();
                modelServers.remove(index);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }else System.out.println("não encontrou");

    }
    
   
    public void stopClientConnection(int index) {

        if (modelClients.get(index) !=null) {
            try {
                ((Client)modelClients.get(index)).stopClient();
                multiShare.getModelClients().remove(index);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
     
   
    public void stopClientConnection(Client client) {
        int index= modelClients.indexOf(client);
        if (index != -1) {
            try {
                ((Client)modelClients.get(index)).stopClient();
                multiShare.getModelClients().remove(index);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
     
    public DefaultListModel getModelServers() {
        return modelServers;
    }

   
    public void setModelServers(DefaultListModel model) {
        this.modelServers = model;
    }

   
    public DefaultListModel getModelClients() {
        return modelClients;
    }

    public void setModelClients(DefaultListModel modelClients) {
        this.modelClients = modelClients;
    }

    public DefaultTreeModel getServer_on_lan() {
        return server_on_lan;
    }

    public void setServer_on_lan(DefaultTreeModel server_on_lan) {
        this.server_on_lan = server_on_lan;
    }
  
}

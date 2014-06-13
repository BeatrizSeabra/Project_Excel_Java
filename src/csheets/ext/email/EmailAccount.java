/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.email;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author Rui 1110506 Classe Responsavel pelas configuracoes.
 * (Guardar/Carregar)
 */
public abstract class EmailAccount {

    private String name;
    private String email;
    private String password;
    private String host;
    private String port;
    
     public EmailAccount(){     
     }  
    
    public EmailAccount(String email, String pass, String name, String host, String port){
        this.setName(name);
        this.setEmail(email);
        this.setPassword(pass);
        this.setHost(host);
        this.setPort(port);
    }
 
        //Gravar configuracoes no ficheiro
        public void Save(){
            Properties prop = new Properties();
            OutputStream output = null;
            try {
                output = new FileOutputStream("src\\csheets\\ext\\email\\email.properties");
                prop.setProperty("name", this.getName());
                prop.setProperty("email", this.getEmail());
                prop.setProperty("password", this.getPassword());
                prop.setProperty("host", this.getHost());
                prop.setProperty("port", this.getPort());

                prop.store(output, null);

            } catch (IOException io) {
                io.printStackTrace();
            } finally {
                if (output != null) {
                    try {
                        output.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
             
        // Metodo para carregar as configuracoes do ficheiro
        public void Load(){
            Properties prop = new Properties();
            InputStream input = null;
            try {
                input = new FileInputStream("src\\csheets\\ext\\email\\email.properties");

                prop.load(input);

                this.setName(prop.getProperty("name"));
                this.setEmail(prop.getProperty("email"));
                this.setPassword(prop.getProperty("password"));
                this.setHost(prop.getProperty("host"));
                this.setPort(prop.getProperty("port"));

            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                if (input != null) {
                    try {
                        input.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

}


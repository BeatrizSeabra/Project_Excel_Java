/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.email;


import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Rui 1110506
 */
public class EmailAccount {

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
    
   //Enviar email teste
    public void Send(){
                final String emails = this.getEmail();
		final String passwords = this.getPassword();
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", this.getHost());
		props.put("mail.smtp.port", this.getPort());
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(emails, passwords);
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(this.getEmail()));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(this.getEmail()));
			message.setSubject("Test");
			message.setText("successful test from "+ this.getName() + ".");
 
			Transport.send(message);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
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


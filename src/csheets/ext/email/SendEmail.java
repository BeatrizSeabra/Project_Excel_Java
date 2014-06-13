/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.email;

import java.io.IOException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Rui 1110506 Classe Responsavel pelo envio dos emails de teste e
 * emais, com ou sem, anexo.
 */
public class SendEmail extends EmailAccount {

    private String listEmail;
    private String subject;
    private String message;
    private String path;
    private boolean attach;

    public SendEmail() {
        this.setBoolAttach(false);
    }

    public SendEmail(String Email, String Pass, String Name, String Host, String Port) {
        super(Email, Pass, Name, Host, Port);
        this.setBoolAttach(false);
    }

    //Enviar email teste
    public void Send() {
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
            message.setText("successful test from " + this.getName() + ".");

            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    //Enviar emails com ou sem anexo
    public void Send(boolean file) throws IOException {

        final String email = this.getEmail();
        final String passwords = this.getPassword();
        final String listEmails = this.getListEmail();
        String listEmailsTmp;
        String[] listEmailsFinal;

        String Path = this.getPath();

        Message messageFich = null;

        listEmailsTmp = listEmails.replaceAll(" ", "");
        listEmailsFinal = listEmailsTmp.split(";");

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", this.getHost());
        props.put("mail.smtp.port", this.getPort());

        for (int i = 0; i < listEmailsFinal.length; i++) {

            if (!listEmailsFinal[i].equalsIgnoreCase("")) {
                Session session = Session.getInstance(props,
                        new javax.mail.Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(email, passwords);
                            }
                        });

                try {

                    MimeMessage message = new MimeMessage(session);

                    message.setFrom(new InternetAddress(listEmailsFinal[i]));
                    message.setRecipients(Message.RecipientType.TO,
                            InternetAddress.parse(listEmailsFinal[i]));

                    message.setSubject(this.getSubject());

                    if (file == true) {
                        messageFich = AttachFile(message, Path);
                        Transport.send(messageFich);
                    } else if (file == false) {
                        Transport.send(message);
                    }
                } catch (MessagingException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    public Message AttachFile(Message message, String path2) throws MessagingException {
        BodyPart messageBodyPart = new MimeBodyPart();
        BodyPart messageBodyPart2 = new MimeBodyPart();
        Multipart multipart = new MimeMultipart();

        messageBodyPart.setText(this.getMessage());
        messageBodyPart.setContent(this.getMessage(), "text/html");
        String[] caminhos = path2.split("\\\\");

        String fileName = caminhos[caminhos.length - 1];

        DataSource source = new FileDataSource(path2);
        messageBodyPart2.setDataHandler(new DataHandler(source));
        messageBodyPart2.setFileName(fileName);
        multipart.addBodyPart(messageBodyPart);
        multipart.addBodyPart(messageBodyPart2);
        message.setContent(multipart);

        return message;
    }

    public String getListEmail() {
        return listEmail;
    }

    public void setListEmail(String listEmail) {
        this.listEmail = listEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean getBoolAttach() {
        return attach;
    }

    public void setBoolAttach(Boolean attach) {
        this.attach = attach;
    }

}

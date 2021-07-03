/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;




public class sendMail {
    private String myAccount;
    private String password;
    private String text;
    private String account;

    public String getMyAccount() {
        return myAccount;
    }

    public void setMyAccount(String myAccount) {
        this.myAccount = myAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

   

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    
    
    public void sendMail() throws Exception{
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");        
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.port","587");        
     
        
                  
        Session session = Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccount,password);
            }
        });
        System.out.println("mysession; "+session);
        Message message = prepareMessage(session,myAccount,account,text);
        Transport.send(message);
        System.out.println("Message correctly sended");
        
    }
    private static Message prepareMessage(Session session, String account,String recipient,String text){
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(account));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            message.setSubject("My first mail from java app");
            message.setText(text);
            return message;
        } catch (Exception e) {
            Logger.getLogger(sendMail.class.getName()).log(Level.SEVERE,null,e);
        }
        return null;
        
    }
    
     public static void enviarMail() {
               
                
                
		final String username = "ventas.agropuntoverde@gmail.com";
		final String password = "agro@verde";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("ventas.agropuntoverde@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("josafatcoronac@gmail.com"));
			message.setSubject("Java Mailer");
			message.setText("Hello this mail is sent from java code");

			Transport.send(message);

			

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
                }
                
  
    

}
    


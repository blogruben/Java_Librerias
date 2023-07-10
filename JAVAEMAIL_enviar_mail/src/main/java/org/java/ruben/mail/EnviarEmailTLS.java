package org.java.ruben.mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EnviarEmailTLS {

    public static void main(String[] args) {

        final String username = "from_correo@gmail.com";
        final String password = "password";
        final String to_usernamesList = "to_correo1@gmail.com, to_correo2@gmail.com";
        String subject = "Hola";
        String text = "\n \n Hola mundo!!! \n \n Saludos";


        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); 
        //props.put("mail.debug", "true"); //ver mensajes debug

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(to_usernamesList)
            );
            message.setSubject(subject);
            message.setText(text);

            Transport.send(message);

            System.out.println("Email enviado");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
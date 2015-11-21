package com.filthy.gnomes.service.impl;

import com.filthy.gnomes.service.MailingService;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

/**
 * Created by Tyzmo on 11/21/2015.
 */
@Service
public class MailingServiceImpl implements MailingService {

    @Override
    public void sendEmail(String email, String name, String code, String date) {

 /*       String to = email;

        String from = "buildo@gmail.com";

        String host = "smtp.gmail.com";

        Properties properties = System.getProperties();

        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.user", "myuser");
        properties.setProperty("mail.password", "mypwd");

        //properties.setProperty("mail.smtp.host", "10.101.3.229");
        //properties.setProperty("mail.smtp.port", "8080");

               Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            message.setSubject("Invitation for " + name);

            message.setText("Buildo has the distinct pleasure of inviting you to a meeting on " + date + " at our headquarters at: " + '\n' +
                    "The Boulevard of Broken Dreams, 69." + '\n' + "Your registration code is: " + code);

            Transport.send(message);

        } catch (Exception e) {
            e.printStackTrace();
        }*/

/*        String host, port, emailid,username, password;
        Properties props = System.getProperties();
        Session l_session = null;
        host = "smtp.mail.yahoo.com";
        port = "587";
        emailid = "a@yahoo.com";
        username = "a";
        password = "pwd";

        emailSettings();
        createSession();
        sendMessage("a@yahoo.com", "rahul@gmail.com","Test","test Mail");
        }

        public void emailSettings() {
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.auth", "true");
            props.put("mail.debug", "false");
            props.put("mail.smtp.port", port);
//        props.put("mail.smtp.socketFactory.port", port);
//        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        props.put("mail.smtp.socketFactory.fallback", "false");

        }

        public void createSession() {

            l_session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });

            l_session.setDebug(true); // Enable the debug mode

        }

        public boolean sendMessage(String emailFromUser, String toEmail, String subject, String msg) {
            //System.out.println("Inside sendMessage 2 :: >> ");
            try {
                //System.out.println("Sending Message *********************************** ");
                MimeMessage message = new MimeMessage(l_session);
                emailid = emailFromUser;
                //System.out.println("mail id in property ============= >>>>>>>>>>>>>> " + emailid);
                //message.setFrom(new InternetAddress(emailid));
                message.setFrom(new InternetAddress(this.emailid));

                message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
                message.addRecipient(Message.RecipientType.BCC, new InternetAddress(AppConstants.fromEmail));
                message.setSubject(subject);
                message.setContent(msg, "text/html");

                //message.setText(msg);
                Transport.send(message);
                System.out.println("Message Sent");
            } catch (MessagingException mex) {
                mex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }//end catch block
            return true;
        }
*/

    }
}
package com.filthy.gnomes.service.impl;

import com.filthy.gnomes.service.MailingService;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * Created by Tyzmo on 11/21/2015.
 */
@Service
public class MailingServiceImpl implements MailingService {

    @Override
    public void sendEmail(String email, String name, String code, String date) {

        Date d = new Date();

    }
}

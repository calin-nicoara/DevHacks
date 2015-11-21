package com.filthy.gnomes.service;

/**
 * Created by Tyzmo on 11/21/2015.
 */
public interface MailingService {

    void sendEmail(String email, String name, String code, String date);
}

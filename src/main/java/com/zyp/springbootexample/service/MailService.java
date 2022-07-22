package com.zyp.springbootexample.service;

import com.zyp.springbootexample.model.Mail;

/**
 * @author xiaoluo
 * @date 2022/7/22
 */
public interface MailService {

    void sendSimpleMail(Mail mail);
}

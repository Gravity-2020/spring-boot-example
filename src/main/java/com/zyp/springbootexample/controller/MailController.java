package com.zyp.springbootexample.controller;

import com.zyp.springbootexample.model.Mail;
import com.zyp.springbootexample.service.MailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xiaoluo
 * @date 2022/7/22
 */
@RestController
@RequestMapping("mail")
public class MailController {

    @Resource
    private MailService service;

    @PostMapping("send")
    public void sendMail(@RequestBody Mail mail) {
        service.sendSimpleMail(mail);
    }
}

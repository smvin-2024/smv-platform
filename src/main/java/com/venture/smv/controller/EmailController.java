package com.venture.smv.controller;

import com.venture.smv.model.Mail;
import com.venture.smv.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private MailService mailService;

    @GetMapping("/send-email")
    public ResponseEntity<String> sayHello() {

        Mail mail = new Mail();
        mail.setMailFrom("sender@gmail.com");
        mail.setMailTo("receiver@gmail.com");
        mail.setMailSubject("Spring Boot - Email demo");
        mail.setMailContent("Just testing");
        mailService.sendEmail(mail);

        return ResponseEntity.ok("Email is send Successfully");
    }
}

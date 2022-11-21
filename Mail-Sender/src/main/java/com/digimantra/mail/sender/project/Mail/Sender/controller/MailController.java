package com.digimantra.mail.sender.project.Mail.Sender.controller;

import com.digimantra.mail.sender.project.Mail.Sender.dto.MailRequest;
import com.digimantra.mail.sender.project.Mail.Sender.dto.MailResponse;
import com.digimantra.mail.sender.project.Mail.Sender.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("mail")
@RestController
public class MailController {
    @Autowired
    private MailService service;

    @PostMapping("/sendMail")
    public ResponseEntity sendMail(@RequestBody MailRequest request){
            MailResponse returnValue = service.sendMail(request);
            return new ResponseEntity(returnValue, HttpStatus.OK);
    }
}

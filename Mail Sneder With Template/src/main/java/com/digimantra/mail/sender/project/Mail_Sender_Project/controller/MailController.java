package com.digimantra.mail.sender.project.Mail_Sender_Project.controller;

import com.digimantra.mail.sender.project.Mail_Sender_Project.dto.MailRequest;
import com.digimantra.mail.sender.project.Mail_Sender_Project.dto.MailResponse;
import com.digimantra.mail.sender.project.Mail_Sender_Project.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("mail")
@RestController
public class MailController {

    @Autowired
    private EmailService service;

    @PostMapping("/sendEmail")
    public MailResponse sendMail(@RequestBody MailRequest request) {
        Map<String, Object> model = new HashMap<>();

        model.put("Name", request.getName());
        model.put("location", "Punjab,India");

        return service.sendEmail(request, model);
    }

}

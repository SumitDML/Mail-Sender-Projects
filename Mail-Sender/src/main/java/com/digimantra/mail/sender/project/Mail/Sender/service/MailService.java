package com.digimantra.mail.sender.project.Mail.Sender.service;

import com.digimantra.mail.sender.project.Mail.Sender.dto.MailRequest;
import com.digimantra.mail.sender.project.Mail.Sender.dto.MailResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public MailResponse sendMail(MailRequest request){
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(request.getFrom());
            message.setTo(request.getTo());
            message.setSubject(request.getSubject());
            message.setText(request.getBody());

            mailSender.send(message);
            return new MailResponse("Mail Sent Successfully!",true);
        }
        catch (Exception e){
            return new MailResponse("Error Occured: " + e.getMessage(),false);
        }
    }
}

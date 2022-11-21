package com.digimantra.mail.sender.project.Mail_Sender_Project.dto;

import lombok.Data;

@Data
public class MailRequest {
    String name;
    String to;
    String from;
    String subject;
}

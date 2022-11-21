package com.digimantra.mail.sender.project.Mail.Sender.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailRequest {
    String from;
    String to;
    String body;
    String subject;

}

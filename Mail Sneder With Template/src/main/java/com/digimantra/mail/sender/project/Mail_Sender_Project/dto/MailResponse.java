package com.digimantra.mail.sender.project.Mail_Sender_Project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailResponse {
    String message;
    Boolean status;

}

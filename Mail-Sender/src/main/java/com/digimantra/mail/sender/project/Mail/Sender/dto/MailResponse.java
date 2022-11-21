package com.digimantra.mail.sender.project.Mail.Sender.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailResponse {
    String message;
    Boolean status;
}

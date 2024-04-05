package com.project.school.service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Data
@ConditionalOnProperty(value = "message.type",havingValue = "email",matchIfMissing = true)
public class EmailService implements MessageService{


    private String emailId = "hi" ;
    private String password;


    public EmailService(){
        log.info("Contacting Customer Via Email:");
    }
    @Override
    public void sendMessage() {
        log.info("Contacting Customer Via Email:");
    }

    public EmailService getemails(){
        EmailService service = new EmailService();
       service.getEmailId();
       service.getPassword();
        return service;
    }
}

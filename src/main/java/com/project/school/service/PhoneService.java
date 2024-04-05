package com.project.school.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@ConditionalOnProperty(value = "message.type",havingValue = "text")
public class PhoneService implements MessageService{

    public PhoneService(){
        log.info("Contacting Customer Via Phone:");
    }
    @Override
    public void sendMessage() {
        log.info("Contacting Customer Via Phone:");
    }
}

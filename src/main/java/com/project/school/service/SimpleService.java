package com.project.school.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class SimpleService {

  /*  public SimpleService(){
        log.info("In Simple Service");
    }*/

    @Autowired
    private EmailService emailService;

    public void print(){
        log.info("EMails {}", emailService.getemails());
        System.out.println("Hello");
    }


}

package com.project.school.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StatusCodes {


    protected final int successStatus = 200;
    protected final int badGateway = 400;
    protected final int NoResponse = 600;

    public StatusCodes(){
        log.info("In Status Code");
    }

}

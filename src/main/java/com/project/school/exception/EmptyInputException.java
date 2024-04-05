package com.project.school.exception;

public class EmptyInputException extends Throwable{


    private String errorMessage;
    private int errorCode;

    public EmptyInputException(String errorMessage,int errorCode){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public EmptyInputException(){

    }
}

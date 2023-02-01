package com.htrap.JPACRUD.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends Exception{
    @ExceptionHandler(Exception.class)
    public String globalException(Exception ex){
        return "Something went wrong!!";
    }
}

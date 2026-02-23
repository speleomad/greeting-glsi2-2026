package com.fsb.greeting.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ExceptionController {
    
 /*     @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public  String missingServletRequestParameterExceptionHandler(Model model,MissingServletRequestParameterException e ){
        model.addAttribute("errorMessage", e.getMessage());
        return "errors";
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
   @ResponseStatus(HttpStatus.BAD_REQUEST)
    public  String methodArgumentTypeMismatchExceptionHandler(Model model,MethodArgumentTypeMismatchException e ){
        model.addAttribute("errorMessage", e.getMessage());
        return "errors";
    } */

     @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public  String exceptionHandler(Model model,Exception e ){
        log.error(e.getMessage());
        model.addAttribute("errorMessage", e.getMessage());
        return "errors";
    }
}
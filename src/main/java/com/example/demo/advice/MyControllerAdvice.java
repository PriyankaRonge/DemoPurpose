package com.example.demo.advice;


import com.example.demo.custom.exception.EmptyInputException;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class MyControllerAdvice {


    @ExceptionHandler(EmptyInputException.class)
    public ResponseEntity<String>  handleEmptyInput(){
        return new ResponseEntity<String>("Input field is empty", HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchElementStringResponseEntity(){
        return new ResponseEntity<String>("No value present ib DB please change your input", HttpStatus.NOT_FOUND);
    }
}

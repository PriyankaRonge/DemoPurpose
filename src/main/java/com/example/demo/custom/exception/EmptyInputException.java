package com.example.demo.custom.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmptyInputException extends RuntimeException{

    private String errorCode;

    private String errorMsg;

}

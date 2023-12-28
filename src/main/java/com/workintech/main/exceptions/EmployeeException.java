package com.workintech.main.exceptions;

import org.springframework.http.HttpStatus;

public class EmployeeException extends RuntimeException {
  private  HttpStatus httpStatus;

    public EmployeeException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}

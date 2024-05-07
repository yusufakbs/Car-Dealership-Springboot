package com.yusuf.Car_Dealership.exception;

import lombok.AllArgsConstructor;
 import lombok.Getter;
 import org.springframework.http.HttpStatus;

 @Getter
 @AllArgsConstructor
 public enum ErrorType {

     INTERNAL_SERVER_ERROR(5100, "Sunucu Hatasi", HttpStatus.INTERNAL_SERVER_ERROR),
     BAD_REQUEST(4100, "Parametre hatasi", HttpStatus.BAD_REQUEST);

     private int code;
     private String message;
     private HttpStatus httpStatus;
 }
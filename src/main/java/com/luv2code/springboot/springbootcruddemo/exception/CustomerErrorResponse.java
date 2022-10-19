package com.luv2code.springboot.springbootcruddemo.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerErrorResponse {
    private int statusCode;
    private String messsage;
    private long timestamp;
}


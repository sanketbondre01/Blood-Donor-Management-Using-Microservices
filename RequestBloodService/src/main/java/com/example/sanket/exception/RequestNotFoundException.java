package com.example.sanket.exception;

@SuppressWarnings("serial")
public class RequestNotFoundException extends RuntimeException {
    public RequestNotFoundException(String message) {
        super(message);
    }
}

package com.example.sanket.exception;

@SuppressWarnings("serial")
public class BloodNotFoundException extends RuntimeException {
    public BloodNotFoundException(String message) {
        super(message);
    }
}

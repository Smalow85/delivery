package com.example.p2pdelivery.exceptions;

public class UserNotFoundException extends RuntimeException{
    private Long id;

    public UserNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}

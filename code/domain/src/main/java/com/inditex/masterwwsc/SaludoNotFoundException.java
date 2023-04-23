package com.inditex.masterwwsc;

public class SaludoNotFoundException extends RuntimeException {
    public SaludoNotFoundException(Long id){
        super("Could not found user with id" + id);
    }
}

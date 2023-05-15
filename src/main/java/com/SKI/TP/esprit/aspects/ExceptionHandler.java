package com.SKI.TP.esprit.aspects;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

public class ExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public Map<String, String> HandleException(Exception exception){

        Map map = new HashMap<>();
        map.put("ERROR!!!!", exception.getMessage());
        return map;

    }
}


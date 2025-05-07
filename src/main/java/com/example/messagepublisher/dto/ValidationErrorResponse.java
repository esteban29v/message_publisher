package com.example.messagepublisher.dto;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class ValidationErrorResponse {
    private boolean status;
    private String message;
    private Map<String, String> errors = new HashMap<>();

    public ValidationErrorResponse(String message, Map<String, String> errors) {
        this.status = false;
        this.message = message;
        this.errors = errors;
    }
}

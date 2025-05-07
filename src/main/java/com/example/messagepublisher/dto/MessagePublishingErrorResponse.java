package com.example.messagepublisher.dto;

import lombok.Data;

@Data
public class MessagePublishingErrorResponse {
	private boolean status;
    private String message;

    public MessagePublishingErrorResponse(String message) {
        this.status = false;
        this.message = message;
    }
}

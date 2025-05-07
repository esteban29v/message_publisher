package com.example.messagepublisher.dto;

import lombok.Data;

@Data
public class MessageResponse {
	private boolean status;
	private String message;

	public MessageResponse() {}
	
	public MessageResponse(boolean status, String message) {
		this.status = status;
		this.message = message;
	}
}

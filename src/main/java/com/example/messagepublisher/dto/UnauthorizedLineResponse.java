package com.example.messagepublisher.dto;

import lombok.Data;

@Data
public class UnauthorizedLineResponse {
	private boolean status;
	private String message;

	public UnauthorizedLineResponse() {}
	
	public UnauthorizedLineResponse(boolean status, String message) {
		this.status = status;
		this.message = message;
	}
}

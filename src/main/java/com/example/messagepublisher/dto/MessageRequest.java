package com.example.messagepublisher.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MessageRequest {

	@NotBlank(message = "El número de origen es obligatorio")
	private String origin;

	@NotBlank(message = "El número de destino es obligatorio")
	private String destination;

	@NotBlank(message = "El tipo de mensaje es obligatorio")
	private String messageType;

	@NotBlank(message = "El contenido del mensaje es obligatorio")
	private String content;
}

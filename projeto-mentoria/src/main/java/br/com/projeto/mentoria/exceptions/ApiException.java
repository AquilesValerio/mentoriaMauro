package br.com.projeto.mentoria.exceptions;

import org.springframework.http.HttpStatus;

public class ApiException extends RuntimeException{

	private HttpStatus statusCode;

	public ApiException(String message, HttpStatus httpStatus){
		super(message);
		statusCode = httpStatus;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}
}

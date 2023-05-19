package br.com.projeto.mentoria.exceptions;

import java.util.List;
import org.springframework.http.HttpStatus;

public class ApiException extends RuntimeException {

	private HttpStatus statusCode;
	private List<String> erros;

	public ApiException(String message, HttpStatus httpStatus) {
		erros = List.of(message);
		statusCode = httpStatus;
	}

	public ApiException(List<String> message, HttpStatus httpStatus) {
		erros = message;
		statusCode = httpStatus;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public List<String> getErros() {
		return erros;
	}
}

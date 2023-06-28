package br.com.course.domain._share.exceptions;

import java.util.List;
import org.springframework.http.HttpStatus;

public class ApiException extends RuntimeException {

	private HttpStatus statusCode;
	private List<String> erros;

	public ApiException(HttpStatus httpStatus, String message){
		statusCode = httpStatus;
		erros = List.of(message);
	}

	public ApiException(HttpStatus httpStatus, List<String> message){
		statusCode = httpStatus;
		erros = message;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public List<String> getErros() {
		return erros;
	}
}

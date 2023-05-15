package br.com.projeto.mentoria.exceptions.handler;

import br.com.projeto.mentoria.exceptions.ApiException;
import br.com.projeto.mentoria.exceptions.ExceptionMessage;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {
	@ExceptionHandler(ApiException.class)
	public ResponseEntity<ExceptionMessage> apiExceptionHandle(ApiException e){
		ExceptionMessage err = new ExceptionMessage(List.of(e.getMessage()));
		return ResponseEntity.status(e.getStatusCode()).body(err);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionMessage> exceptionHandle(Exception e){
		ExceptionMessage err = new ExceptionMessage(List.of(e.getMessage()));
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(err);
	}
}

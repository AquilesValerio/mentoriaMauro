package br.com.course.infrastructure.api.controllers;

import br.com.course.domain._share.exceptions.ApiException;
import br.com.course.domain._share.exceptions.ExceptionMessage;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(ApiException.class)
	public ResponseEntity<ExceptionMessage> apiExceptionHandle(ApiException e){

		ExceptionMessage err = new ExceptionMessage(e.getErros());
		return ResponseEntity.status(e.getStatusCode()).body(err);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionMessage> exceptionHandle(Exception e){
		ExceptionMessage err = new ExceptionMessage(List.of(e.getMessage()));
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(err);
	}
}

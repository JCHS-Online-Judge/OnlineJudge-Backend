package com.github.ioloolo.onlinejudge.common.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class ErrorHandler {

	@ExceptionHandler(Throwable.class)
	public ResponseEntity<ErrorResponse> handleException(Exception e) {

		log.error(e.getMessage());

		return ResponseEntity.internalServerError().body(new ErrorResponse(e));
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handleValidatedException(MethodArgumentNotValidException e) {

		FieldError error = e.getFieldError();

		return handleException(error == null ? e : new Exception(error.getDefaultMessage()));
	}
}

/**
 * 
 */
package com.abhishek.amar.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Abhishek Amar
 *
 */
@ControllerAdvice
public class CustomizedExceptionHandlerConfig extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { CustomerExceptions.class, NullPointerException.class })
	protected ResponseEntity<Object> handleException(Exception ex, HttpHeaders headers, HttpStatus status,
			WebRequest request) {
		ExceptionsResponse exception = new ExceptionsResponse(status.BAD_REQUEST, ex.getMessage(), new Date());
		return new ResponseEntity<>(exception, status.BAD_REQUEST);
	}

}

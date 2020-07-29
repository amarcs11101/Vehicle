/**
 * 
 */
package com.abhishek.amar.config;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.abhishek.amar.exception.BikeException;
import com.abhishek.amar.response.ExceptionResponse;
import com.abhishek.amar.util.StatusConstants;

/**
 * @author Abhishek Amar
 *
 */
@ControllerAdvice
public class CustomizedExceptionConfig extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { BikeException.class })
	@ResponseStatus(HttpStatus.NOT_FOUND)
	protected ResponseEntity<Object> handlingNotFoundException(BikeException ex) {
		ExceptionResponse response = new ExceptionResponse(StatusConstants.NOT_FOUND_CODE, HttpStatus.NOT_FOUND,
				ex.getMessage(), new Date());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@ExceptionHandler(value = { Exception.class })
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	protected ResponseEntity<Object> handlerOtherException(Exception ex) {
		ExceptionResponse response = new ExceptionResponse(StatusConstants.INTERNAL_SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR,
				ex.getMessage(), new Date());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}

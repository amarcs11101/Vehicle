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

import com.abhishek.amar.exception.BookingException;
import com.abhishek.amar.response.ExceptionResponse;
import com.abhishek.amar.util.StatusConstants;

/**
 * @author Abhishek Amar
 *
 */
@ControllerAdvice
public class CustomizedExceptionHandlerConfig extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { BookingException.class })
	@ResponseStatus(HttpStatus.NOT_FOUND)
	protected ResponseEntity<Object> handlerCustomisedException(BookingException exception) {
		ExceptionResponse response = new ExceptionResponse(exception.getMessage(), StatusConstants.NOT_FOUND_CODE,
				HttpStatus.NOT_FOUND, new Date());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@ExceptionHandler(value = { Exception.class })
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	protected ResponseEntity<Object> handleOtherException(BookingException ex) {
		ExceptionResponse response = new ExceptionResponse(ex.getMessage(), StatusConstants.INTERNAL_SERVER_ERROR,
				HttpStatus.INTERNAL_SERVER_ERROR, new Date());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
/*	@ExceptionHandler(value = { CustomerExceptions.class })
	@ResponseStatus(HttpStatus.NOT_FOUND)
	protected ResponseEntity<Object> handleException(HttpServletRequest request,
			CustomerExceptions customerExceptions) {
		ExceptionsResponse exception = new ExceptionsResponse(HttpStatus.NOT_FOUND, customerExceptions.getMessage(),
				new Date(), StatusConstants.NOT_FOUND_CODE);
		return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);
	} 
 
	@ExceptionHandler(value = { Exception.class })
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	protected ResponseEntity<Object> handlerOtherException(HttpServletRequest request, Exception ex) {
		ExceptionsResponse exception = new ExceptionsResponse(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(),
				new Date(), StatusConstants.INTERNAL_SERVER_ERROR);
		return new ResponseEntity<>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	*/
}

/**
 * 
 */
package com.abhishek.amar.exception;

import org.springframework.http.HttpStatus;

/**
 * @author Abhishek Amar
 *
 */
public class CustomizedException extends RuntimeException {
	public CustomizedException(String message) {
		super(message);
	}
}

/**
 * 
 */
package com.abhishek.amar.response;

import java.util.Date;

import org.springframework.http.HttpStatus;

/**
 * @author Abhishek Amar
 *
 */
public class ExceptionResponse {
	private String statusCode;
	private HttpStatus status;
	private String message;
	private Date timeStamp;

	public ExceptionResponse(String statusCode, HttpStatus status, String message, Date timeStamp) { 
		this.statusCode = statusCode;
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}

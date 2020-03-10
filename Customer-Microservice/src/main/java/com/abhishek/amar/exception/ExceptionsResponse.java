package com.abhishek.amar.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class ExceptionsResponse {
	private HttpStatus status;
	private String message;
	private Date timeStamp;

	public ExceptionsResponse() {

	}

	public ExceptionsResponse(HttpStatus status, String message, Date timeStamp) {
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
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

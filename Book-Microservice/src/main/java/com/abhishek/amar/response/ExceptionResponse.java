/**
 * 
 */
package com.abhishek.amar.response;

import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author Abhishek Amar
 *
 */
@Data
@Setter
@Getter
public class ExceptionResponse {
	private String message;
	private String statusCode;
	private HttpStatus status;
	private Date timeStamp;

	public ExceptionResponse(String message, String statusCode, HttpStatus status, Date date) {
		this.message = message;
		this.statusCode = statusCode;
		this.status = status;
		this.timeStamp = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}

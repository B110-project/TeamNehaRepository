package com.crts.app.hm.main.customeexception;

import org.springframework.http.HttpStatus;

public class ExceptionResponse {
	
	private String message;
	private HttpStatus statusMessage;
	private int statusCode;
	private String requesteduri;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(HttpStatus statusMessage) {
		this.statusMessage = statusMessage;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getRequesteduri() {
		return requesteduri;
	}
	public void setRequesteduri(String requesteduri) {
		this.requesteduri = requesteduri;
	}
	
	

}

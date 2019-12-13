package com.crts.app.hm.main.customeexception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerException {
	@ExceptionHandler(EnquiryDetailNotAvailableException.class)
	public ExceptionResponse getEnquiryResponse(EnquiryDetailNotAvailableException message,HttpServletRequest request) {
		ExceptionResponse response=new ExceptionResponse();
		response.setMessage(message.getMessage());
		response.setStatusMessage(HttpStatus.NOT_FOUND);
		response.setStatusCode(HttpServletResponse.SC_NOT_FOUND);
		response.setRequesteduri(request.getRequestURI());
		return response;
	}

}

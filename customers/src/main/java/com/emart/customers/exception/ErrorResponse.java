package com.emart.customers.exception;

import java.util.List;

public class ErrorResponse {
	
	private Integer errorCode;
	private String message;
	
	
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}

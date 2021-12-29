package com.tell.exceptions;

public class EmptyInputExceptions extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String ErrorCode;
	 private String ErrorMessage;
	 
	 
	 
	public String getErrorCode() {
		return ErrorCode;
	}
	public EmptyInputExceptions(String errorCode, String errorMessage) {
		super();
		ErrorCode = errorCode;
		ErrorMessage = errorMessage;
	}
	public void setErrorCode(String errorCode) {
		ErrorCode = errorCode;
	}
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "EmptyInputExceptions [ErrorCode=" + ErrorCode + ", ErrorMessage=" + ErrorMessage + "]";
	}
	 
	 
}
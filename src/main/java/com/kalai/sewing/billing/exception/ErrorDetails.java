package com.kalai.sewing.billing.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	private LocalDateTime timeStamp;
	private String errorMessage;
	private String errorCode;

	public ErrorDetails(LocalDateTime timeStamp, String errorMessage, String errorCode) {
		super();
		this.timeStamp = timeStamp;
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}

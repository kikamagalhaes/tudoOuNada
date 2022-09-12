package com.projeto.integrador.exception;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String code;
	private String message;
	private JsonNode details;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public JsonNode getDetails() {
		return details;
	}
	public void setDetails(JsonNode details) {
		this.details = details;
	}
	
	

}

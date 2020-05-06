package com.intellect.api.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.context.request.WebRequest;

import com.intellect.api.util.Response;

@ControllerAdvice 
public class WealthExceptionHandler {

	
	@ExceptionHandler(org.springframework.web.bind.MethodArgumentNotValidException.class)
	public final ResponseEntity<Response> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, WebRequest request) {

		System.out.println("@controller advice validation exception handled");
		Response er = new Response();
		er.setDescription(ex.getBindingResult().getFieldError().getField()+" "+ex.getBindingResult().getFieldError().getDefaultMessage());	
		return new ResponseEntity<Response>(er, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(org.springframework.web.client.ResourceAccessException.class)
	public ResponseEntity<Response> handleResourceAccessException(ResourceAccessException ex, WebRequest request) {

		System.out.println("IO exception handled");
		Response er = new Response();
		er.setDescription(ex.getMessage());	
		return new ResponseEntity<Response>(er, HttpStatus.FORBIDDEN);
	}
	
	@ExceptionHandler(org.springframework.web.client.HttpClientErrorException.class)
	public ResponseEntity<Response> handleHttpClientErrorException(HttpClientErrorException ex, WebRequest request) {

		System.out.println("HTTP client error exception handled");
		Response er = new Response();
		er.setDescription(ex.getMessage());	
		return new ResponseEntity<Response>(er, ex.getStatusCode());
	}
	
	@ExceptionHandler(org.springframework.web.client.HttpServerErrorException.class)
	public ResponseEntity<Response> handleHttpServerErrorException(HttpServerErrorException ex, WebRequest request) {

		System.out.println("HTTP server error exception handled");
		Response er = new Response();
		er.setDescription(ex.getMessage());	
		return new ResponseEntity<Response>(er, ex.getStatusCode());
	}

	@ExceptionHandler(org.springframework.web.client.RestClientException.class)
	public ResponseEntity<Response> handleRestClientException(RestClientException ex, WebRequest request) {

		System.out.println("rest client exception handled");
		Response er = new Response();
		er.setDescription(ex.getMessage());	
		return new ResponseEntity<Response>(er, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Response> handleException(Exception ex, WebRequest request) {

		System.out.println("exception handled");
		Response er = new Response();
		er.setDescription(ex.getMessage() == null ? "application error" : ex.getMessage());	
		return new ResponseEntity<Response>(er, HttpStatus.BAD_REQUEST);
	}
}

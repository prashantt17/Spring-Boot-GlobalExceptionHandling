package com.prashant.springbootGlobalException.ExceptionHandlerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.prashant.springbootGlobalException.ExceptionHandlers.EmptyInputException;

@ControllerAdvice
public class EmployeeExceptionHandlerAdvice {

	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyDataInput(EmptyInputException emptyInputException) {

		return new ResponseEntity<String>("Please enter the correct data", HttpStatus.BAD_REQUEST);
	}
}

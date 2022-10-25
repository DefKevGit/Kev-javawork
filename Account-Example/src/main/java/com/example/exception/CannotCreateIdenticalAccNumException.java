package com.example.exception;

import javax.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "All new account numbers MUST be unique")
public class CannotCreateIdenticalAccNumException extends EntityNotFoundException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
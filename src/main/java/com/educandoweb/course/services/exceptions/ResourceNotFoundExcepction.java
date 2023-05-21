package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundExcepction extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExcepction(Object id) {
		super("Resource not found. Id " + id);
	}
	
}

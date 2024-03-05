package com.devJava.H_trataExecoes.application03.exceptions;

								// RunTimeException não precisa tratar 
public class DomainException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
	
}

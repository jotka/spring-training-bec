/**
 * Copyright 2012 Marin Solutions
 */
package pl.finsys.controlerAdvice;

/**
 * User Bean
 */
public class User {

	private final String firstName;
	private final String surname;

	public User(String firstName, String surname) {
		super();
		this.firstName = firstName;
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSurname() {
		return surname;
	}
}

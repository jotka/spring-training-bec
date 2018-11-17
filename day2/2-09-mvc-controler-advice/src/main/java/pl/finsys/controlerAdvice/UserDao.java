/**
 * Copyright 2012 Marin Solutions
 */
package pl.finsys.controlerAdvice;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

	public User readUserName() {
		return new User("John", "Doe");
	}

}

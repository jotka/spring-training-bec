package pl.finsys.limitLoginAnnotation.users.dao;

import pl.finsys.limitLoginAnnotation.users.model.UserAttempts;

public interface UserDetailsDao {

	void updateFailAttempts(String username);

	void resetFailAttempts(String username);
	
	UserAttempts getUserAttempts(String username);

}
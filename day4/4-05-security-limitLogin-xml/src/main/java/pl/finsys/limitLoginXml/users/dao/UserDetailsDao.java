package pl.finsys.limitLoginXml.users.dao;

import pl.finsys.limitLoginXml.users.model.UserAttempts;

public interface UserDetailsDao {

	void updateFailAttempts(String username);

	void resetFailAttempts(String username);
	
	UserAttempts getUserAttempts(String username);

}
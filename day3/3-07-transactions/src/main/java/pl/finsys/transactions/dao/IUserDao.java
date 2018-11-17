package pl.finsys.transactions.dao;

import pl.finsys.transactions.model.User;

public interface IUserDao {

	int insertUser(User user);

	int updateUser(User user) throws Exception;

	void deleteUser(int uid);

	User selectUser(int uid);
}

package pl.finsys.transactions.declarative.annotations;

import java.sql.Types;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import pl.finsys.transactions.dao.IUserDao;
import pl.finsys.transactions.model.User;

@Transactional
// domyslnie, @Transactional ustawione jest na readOnly false
public class AnnotatedUserDao implements IUserDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void deleteUser(int uid) {
		String delQuery = "DELETE FROM users WHERE id = ?";
		jdbcTemplate.update(delQuery, uid);

	}

	public int insertUser(User user) {
		String inserQuery = "INSERT INTO users (username, password, enabled , id) VALUES (?, ?, ?, ?) ";
		Object[] params = new Object[] { user.getUserName(), user.getPassword(), user.isEnabled(), user.getId() };
		int[] types = new int[] { Types.VARCHAR, Types.VARCHAR, Types.BIT, Types.INTEGER };
        return jdbcTemplate.update(inserQuery, params, types);
	}

	// nadpisanie zachowania transakcyjnosci zdefiniowanego na poziomie klasy dla jednej
	// konkretnej metody
	@Transactional(readOnly = true,noRollbackFor=RuntimeException.class)
	public User selectUser(int uid) {
		// dla wyjatkow RuntimeExceptions transakcje zostana automatycznie wycofane
		throw new RuntimeException("celowy wyjatek runtime exception");

	}

	public int updateUser(User user) throws Exception {
		/*
		 * dla checked exceptions, transakcje nie sa autmatycznie wycofywane
		 */
		throw new Exception("Celowy wyjatek typu checked exception");
	}

}

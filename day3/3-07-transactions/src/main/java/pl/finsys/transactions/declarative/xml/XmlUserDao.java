package pl.finsys.transactions.declarative.xml;

import java.sql.Types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import pl.finsys.transactions.dao.IUserDao;
import pl.finsys.transactions.model.User;

public class XmlUserDao implements IUserDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ApplicationContext applicationContext;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void deleteUser(int uid) {
        String delQuery = "DELETE FROM users WHERE id = ?";
        jdbcTemplate.update(delQuery, uid);

    }

    public int insertUser(User user) {
        String inserQuery = "INSERT INTO users (username, password, enabled , id) VALUES (?, ?, ?, ?) ";
        Object[] params = new Object[]{user.getUserName(), user.getPassword(), user.isEnabled(), user.getId()};
        int[] types = new int[]{Types.VARCHAR, Types.VARCHAR, Types.BIT, Types.INTEGER};
        int number = jdbcTemplate.update(inserQuery, params, types);

        IUserDao dao = applicationContext.getBean("userDao", IUserDao.class);

        //aby przetestowac propagacje transakcji, wywolamy inna metode transakcyjna
        //w tym przypadku selectUser
        dao.selectUser(3);

        return number;
    }

    public User selectUser(int uid) {
        // dla wszystkich wyjatkow RuntimeExceptions transakcje zostana cofniete
        throw new RuntimeException("celowy runtime exception");

    }

    public int updateUser(User user) throws Exception {
		//dla wyjatkow typu checked exceptions, transakcje nie zostana cofniete
		throw new Exception("celowy checked exception");
    }

}

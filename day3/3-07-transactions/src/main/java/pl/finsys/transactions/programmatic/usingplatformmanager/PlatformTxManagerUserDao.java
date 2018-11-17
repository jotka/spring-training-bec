package pl.finsys.transactions.programmatic.usingplatformmanager;

import java.sql.Types;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import pl.finsys.transactions.dao.IUserDao;
import pl.finsys.transactions.model.User;

public class PlatformTxManagerUserDao implements IUserDao {

    private JdbcTemplate jdbcTemplate;
    private PlatformTransactionManager platformTransactionManager;

    public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
        this.platformTransactionManager = platformTransactionManager;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void deleteUser(final int uid) {
        DefaultTransactionDefinition paramTransactionDefinition = new DefaultTransactionDefinition();

        //ustawianie propagacji transakcji:
        //paramTransactionDefinition.setPropagationBehavior(DefaultTransactionDefinition.PROPAGATION_REQUIRES_NEW);

        TransactionStatus status = platformTransactionManager.getTransaction(paramTransactionDefinition);
        try {
            String delQuery = "DELETE FROM users WHERE id = ?";
            jdbcTemplate.update(delQuery, uid);
            platformTransactionManager.commit(status);
        } catch (Exception e) {
            platformTransactionManager.rollback(status);
        }

    }

    public int insertUser(final User user) {
        TransactionDefinition paramTransactionDefinition = new DefaultTransactionDefinition();
        TransactionStatus status = platformTransactionManager.getTransaction(paramTransactionDefinition);
        String inserQuery = "INSERT INTO users (username, password, enabled , id) VALUES (?, ?, ?, ?) ";
        Object[] params = new Object[]{user.getUserName(), user.getPassword(), user.isEnabled(), user.getId()};
        int[] types = new int[]{Types.VARCHAR, Types.VARCHAR, Types.BIT, Types.INTEGER};
        int rowsAffected = jdbcTemplate.update(inserQuery, params, types);
        platformTransactionManager.commit(status);
        return rowsAffected;
    }

    public User selectUser(int uid) {
        throw new RuntimeException("celowy runtime exception");
    }

    public int updateUser(User user) throws Exception {
        throw new Exception("celowy checked exception");
    }

}

package pl.finsys.transactions.programmatic.usingtxtemplate;

import java.sql.Types;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import pl.finsys.transactions.dao.IUserDao;
import pl.finsys.transactions.model.User;

/**
 * Uzycie transaction template
 */
public class TxTemplatedUserDao implements IUserDao {

    private JdbcTemplate jdbcTemplate;
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;

        //ustawienie propagacji transakcji
        this.transactionTemplate.setPropagationBehavior(TransactionTemplate.PROPAGATION_REQUIRES_NEW);
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void deleteUser(final int uid) {
        //uzyj handlera TransactionCallbackWithoutResult jesli zapytanie moze nic nie zwrocic
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            protected void doInTransactionWithoutResult(
                TransactionStatus paramTransactionStatus) {
                try {
                    String delQuery = "delete from users where id = ?";
                    jdbcTemplate.update(delQuery, uid);
                } catch (Exception e) {
                    //w przypadku wyjatku, rollback
                    paramTransactionStatus.setRollbackOnly();
                }
            }
        });
    }

    public int insertUser(final User user) {
        //uzyj handlera TransactionCallback
        return transactionTemplate.execute(new TransactionCallback<Integer>() {
            public Integer doInTransaction(TransactionStatus paramTransactionStatus) {
                String inserQuery = "insert into users (username, password, enabled , id) values (?, ?, ?, ?) ";
                Object[] params = new Object[]{user.getUserName(), user.getPassword(), user.isEnabled(), user.getId()};
                int[] types = new int[]{Types.VARCHAR, Types.VARCHAR, Types.BIT, Types.INTEGER};
                return jdbcTemplate.update(inserQuery, params, types);
            }
        });
    }

    public User selectUser(int uid) {
        throw new RuntimeException("celowy runtime exception");
    }

    public int updateUser(User user) throws Exception {
        throw new Exception("celowy checked exception");
    }

}

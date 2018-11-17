package pl.finsys.transactions.programmatic.usingtxtemplate;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.finsys.transactions.dao.IUserDao;
import pl.finsys.transactions.model.User;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("txTemplateContext.xml");
        IUserDao dao = applicationContext.getBean("userDao", IUserDao.class);
        User user = new User(generateId(), "uuu" + generateId(), "secret", false);

        dao.insertUser(user);
        dao.deleteUser(2);

        try {
            //wyrzuci wyjatek typu checked Exception, transakcja nie zostanie automatycznie wycofana
            //w przeciwienstwie do wyjatku typu RuntimeException, ktory wycofa transakcje.
            dao.updateUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //wyrzuci wyjatek runtime exception, ktory wycofa transakcje
            dao.selectUser(2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static int generateId() {
        return new Random().nextInt(500);
    }
}

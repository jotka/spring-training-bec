package pl.finsys.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Place description here.
 *
 * @author jarek@finsys.pl
 */

public class App {
    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        MessageConsumerBean mc = (MessageConsumerBean) context.getBean("consumer");
        MessageProducerBean mp = (MessageProducerBean) context.getBean("producer");

        logger.info("Startuję wątek odbiorcy...");
        new Thread(new MessageConsumerRunnable(mc)).start();

        logger.info("Wysyłam komunikat 1...");
        mp.sendMessage(new EmailObject("test@test.com", "Test Message 1"));

        logger.info("Wysyłam komunikat 2...");
        mp.sendMessage(new EmailObject("123@akuku.pl", "Test Message 2"));

        logger.info("Wysyłam komunikat 3...");
        mp.sendMessage(new EmailObject("root@onet.pl", "Test Message 3"));

    }
}

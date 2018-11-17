package pl.finsys.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private final static Logger logger = LoggerFactory.getLogger(App.class.getName());

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] {"applicationContext-aop-interceptor.xml"});

		CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy");

		logger.info("*************************");
		cust.printName();
        logger.info("*************************");
		cust.printURL();
        logger.info("*************************");
		try {
			cust.printThrowException();
		} catch (Exception e) {

		}

	}
}
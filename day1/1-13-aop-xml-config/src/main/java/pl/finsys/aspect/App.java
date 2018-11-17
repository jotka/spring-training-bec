package pl.finsys.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private final static Logger logger = LoggerFactory.getLogger(App.class.getName());

	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext-aop-xml-config.xml");

		Customer customer = (Customer) appContext.getBean("customer");

        customer.addCustomer();
		
		customer.addCustomerReturnValue();
		
		customer.addCustomerAround("Bill Gates");

        try {
            customer.addCustomerThrowException();
        } catch (Exception e) {
            logger.info("Exception caught: " + e.getMessage());
        }

    }
}
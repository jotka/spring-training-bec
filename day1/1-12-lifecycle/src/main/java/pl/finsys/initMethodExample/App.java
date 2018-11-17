package pl.finsys.initMethodExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private final static Logger logger = LoggerFactory.getLogger(App.class.getName());

    public static void main( String[] args ) {



        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-initMethods.xml");
	
    	CustomerService cust = (CustomerService)context.getBean("customerService");
    	
    	logger.info(cust.toString());
    	
    	context.close();
    }
}

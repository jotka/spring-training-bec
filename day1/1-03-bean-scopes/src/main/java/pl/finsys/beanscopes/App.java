package pl.finsys.beanscopes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.finsys.beanscopes.services.AnotherService;
import pl.finsys.beanscopes.services.AnotherServiceImpl;
import pl.finsys.beanscopes.services.CustomerService;
import pl.finsys.beanscopes.services.CustomerServiceImpl;

public class App {
    private final static Logger logger = LoggerFactory.getLogger(App.class.getName());

    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext-beanScopes.xml"});


    	CustomerService service = (CustomerServiceImpl)context.getBean("customerService");
    	service.setMessage("example message");
        logger.info("Message : " + service.getMessage());
    	
    	//ponownie ten sam bean
    	CustomerService serviceAgain = (CustomerServiceImpl)context.getBean("customerService");
        logger.info("Message : " + serviceAgain.getMessage());

        AnotherService anotherService = (AnotherServiceImpl)context.getBean("anotherService");
        anotherService.setMessage("another example message");
        logger.info("Message : " + anotherService.getMessage());

        //ponownie ten sam bean
        AnotherService anotherServiceAgain = (AnotherServiceImpl)context.getBean("anotherService");
        logger.info("Another Message : " + anotherServiceAgain.getMessage());

    }
}

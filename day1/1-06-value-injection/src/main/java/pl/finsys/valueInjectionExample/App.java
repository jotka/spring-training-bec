package pl.finsys.valueInjectionExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private final static Logger logger = LoggerFactory.getLogger(App.class.getName());

    public static void main( String[] args ) {
    	ConfigurableApplicationContext context = 
    		new ClassPathXmlApplicationContext("applicationContext-valueInjection.xml");
	
    	FileNameGenerator generator1 = (FileNameGenerator)context.getBean("fileNameGenerator1");
        logger.info(generator1.generate());


        FileNameGenerator generator2 = (FileNameGenerator)context.getBean("fileNameGenerator2");
        logger.info(generator2.generate());


        FileNameGenerator generator3 = (FileNameGenerator)context.getBean("fileNameGenerator3");
        logger.info(generator3.generate());
    	
    	context.close();
    }
}

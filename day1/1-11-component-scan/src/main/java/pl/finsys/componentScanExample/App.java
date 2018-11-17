package pl.finsys.componentScanExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.finsys.componentScanExample.services.CustomerService;

public class App {
    public static void main( String[] args ) {
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext(new String[] {"applicationContext-componentScan.xml"});

    	CustomerService cust = (CustomerService)context.getBean("customerService");
    	System.out.println(cust);
    	
    }
}

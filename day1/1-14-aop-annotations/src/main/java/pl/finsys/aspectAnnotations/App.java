package pl.finsys.aspectAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext-aop-annotations.xml");

		Customer customer = (Customer) appContext.getBean("customer");

        customer.addCustomer();
		
		customer.addCustomerReturnValue();
		
		customer.addCustomerAround("Bill gates");

        try {
            customer.addCustomerThrowException();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
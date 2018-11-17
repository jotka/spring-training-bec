package pl.finsys.eventsExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext-events.xml"});

        Order order = (Order) context.getBean("order");

        order.setupCustomer(new CustomerInfo("2345678", "customer3@gmail.com"));
        order.checkOut();
        order.postponeDelivery();

        order.setupCustomer(new CustomerInfo("1234567", "customer2@gmail.com"));
        order.checkOut();
        order.deliver();
    }
}
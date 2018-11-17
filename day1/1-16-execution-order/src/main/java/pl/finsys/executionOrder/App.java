package pl.finsys.executionOrder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-executionOrder.xml");

        TestBean testBean = (TestBean)context.getBean("testBean");
        System.out.println(testBean);

    }
}
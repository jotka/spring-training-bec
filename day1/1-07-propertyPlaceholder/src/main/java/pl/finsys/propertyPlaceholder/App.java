package pl.finsys.propertyPlaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-propertyPlaceholder.xml");

        HelloWorld hello = (HelloWorld) context.getBean("helloWorldBean");

        hello.sayHello();

        hello.sayGoodbye();
    }
}
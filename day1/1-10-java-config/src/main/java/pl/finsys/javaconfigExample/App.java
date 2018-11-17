package pl.finsys.javaconfigExample;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
	    
		//ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
	    
	    obj.printHello("Spring Java Config");

	}
}
package pl.finsys.autowired.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-byType.xml");

		Panda panda = (Panda) context.getBean("panda");
		System.out.println(panda);
	}
}
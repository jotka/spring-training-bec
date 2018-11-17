package pl.finsys.constructorExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-constructor.xml");

		OutputHelper output = (OutputHelper)context.getBean("outputHelper");
    	output.generateOutput();
	}
}
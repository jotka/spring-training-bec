package pl.finsys.boothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootHelloworldApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootHelloworldApplication.class, args);
		DummyService dummyService = context.getBean(DummyService.class);
		System.out.println(dummyService.sayHello());
	}
}

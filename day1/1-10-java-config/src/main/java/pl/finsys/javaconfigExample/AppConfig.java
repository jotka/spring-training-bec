package pl.finsys.javaconfigExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.finsys.javaconfigExample.impl.HelloWorldImpl;

@Configuration
public class AppConfig {
	
	@Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
	
}
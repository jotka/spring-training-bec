package pl.finsys.mvcHelloWorld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;

//..
public class HelloController {

    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    public static final String VIEW_HELLO = "hello";


	public String printWelcome(ModelMap model) {

        logger.info("> HelloController GET");

		model.addAttribute("message", "Spring MVC Hello World");
		return VIEW_HELLO;

	}
	
}
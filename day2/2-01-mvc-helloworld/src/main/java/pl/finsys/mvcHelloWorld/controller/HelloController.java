package pl.finsys.mvcHelloWorld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    public static final String VIEW_HELLO = "hello";


    /**
     * * Respond to GET http://localhost:8080/hello/
     */
    @RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

        logger.info("> HelloController GET");

		model.addAttribute("message", "Spring MVC Hello World");
		return "hello";

	}
	
}
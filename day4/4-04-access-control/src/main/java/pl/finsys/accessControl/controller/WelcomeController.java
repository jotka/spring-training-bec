package pl.finsys.accessControl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

    public static final String VIEW_HELLO = "hello";

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String welcomeAdmin(ModelMap model) {

		model.addAttribute("message", "Spring Security - ROLE_ADMIN");
		return VIEW_HELLO;

	}
	
}
package pl.finsys.getUser;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class HelloController {

    public static final String VIEW_HELLO = "hello";

    @RequestMapping(value="/hello1", method = RequestMethod.GET)
	public String hello1(ModelMap model, Principal principal ) {
 		String name = principal.getName();
		model.addAttribute("username", name);
		model.addAttribute("message", "using UsernamePasswordAuthenticationToken");

        return VIEW_HELLO;
	}

    @RequestMapping(value="/hello2", method = RequestMethod.GET)
    public String hello2(ModelMap model) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();

		model.addAttribute("username", name);
        model.addAttribute("message", "using SecurityContextHolder + Authentication.getName()");

        return VIEW_HELLO;
    }

    @RequestMapping(value="/hello3", method = RequestMethod.GET)
    public String hello3(ModelMap model) {

        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername();

        model.addAttribute("username", name);
        model.addAttribute("message", "using SecurityContextHolder + User.getUsername()");

        return VIEW_HELLO;
    }
 
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
 		return "login";
 
	}
	
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
 
		//String errormessage = resources.getMessage("login.error", null, null);
		model.addAttribute("error", "true");
		return "login";
 
	}
	
}
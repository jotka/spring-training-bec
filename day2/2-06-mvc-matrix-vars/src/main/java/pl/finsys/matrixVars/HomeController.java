package pl.finsys.matrixVars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    public static final String VIEW_HOME = "home";

    @RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
        logger.info("HomeController GET");
		return VIEW_HOME;
	}
	
}

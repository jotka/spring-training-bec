package pl.finsys.formValidation.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

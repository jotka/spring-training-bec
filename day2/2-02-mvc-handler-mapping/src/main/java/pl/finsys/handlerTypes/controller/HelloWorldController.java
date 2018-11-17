package pl.finsys.handlerTypes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	@Override
    /**
     * /welcome.htm is requested, DispatcherServlet will forward the request to the “WelcomeController“
     */
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

        logger.info("HelloWorldController  (BeanNameUrlHandlerMapping)");
        ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("msg", "world");
		
		return model;
	}

}
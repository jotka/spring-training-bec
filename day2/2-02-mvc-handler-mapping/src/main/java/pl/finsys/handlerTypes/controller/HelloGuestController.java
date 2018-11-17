package pl.finsys.handlerTypes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloGuestController extends AbstractController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

        logger.info("HelloGuestController (ControllerClassNameHandlerMapping)");

		ModelAndView model = new ModelAndView("HelloGuestPage");
		model.addObject("msg", "guest");
		
		return model;
	}

}
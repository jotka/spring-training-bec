package pl.finsys.handlerTypes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ThirdController extends AbstractController {

    private static final Logger logger = LoggerFactory.getLogger(FirstController.class);

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

        logger.info("HelloStrangerController (SimpleUrlHandlerMapping)");

		ModelAndView model = new ModelAndView("HelloStrangerPage");
		model.addObject("msg", "third");
		
		return model;
	}

}
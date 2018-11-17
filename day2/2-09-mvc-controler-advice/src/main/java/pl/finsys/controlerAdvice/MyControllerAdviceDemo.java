package pl.finsys.controlerAdvice;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyControllerAdviceDemo {

    private final static Logger logger = LoggerFactory.getLogger(MyControllerAdviceDemo.class);

	@Autowired private UserDao userDao;

	/**
	 * Catch IOException and redirect to a 'personal' page.
	 */
	@ExceptionHandler(IOException.class)
	public ModelAndView handleIOException(IOException ex) {

		logger.info("handleIOException - Catching: " + ex.getClass().getSimpleName());
		return errorModelAndView(ex);
	}

	/**
	 * Get the users details for the 'personal' page
	 */
	private ModelAndView errorModelAndView(Exception ex) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("error");
		modelAndView.addObject("name", ex.getClass().getSimpleName());
		modelAndView.addObject("user", userDao.readUserName());

		return modelAndView;
	}
}

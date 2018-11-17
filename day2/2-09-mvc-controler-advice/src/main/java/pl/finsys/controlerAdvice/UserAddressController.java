package pl.finsys.controlerAdvice;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for user address
 */
@Controller
public class UserAddressController {

    private static final Logger logger = LoggerFactory.getLogger(UserAddressController.class);

    /**
	 * Whoops, throw an IOException
	 */
	@RequestMapping(value = "useraddress", method = RequestMethod.GET)
	public String getUserAddress(Model model) throws IOException {

		logger.info("This will throw an IOException");

		boolean throwException = true;

		if (throwException) {
			throw new IOException("This is my IOException");
		}

        return HomeController.VIEW_HOME;
	}

}

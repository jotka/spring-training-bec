package pl.finsys.methodnameResolvers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class PropertiesController extends MultiActionController {

	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("CustomerPage", "msg",  "PropertiesMethodNameResolver");
	}
	
}
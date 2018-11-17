package pl.finsys.methodnameResolvers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class InternalController extends MultiActionController {

    public ModelAndView doaddSomething(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("CustomerPage", "msg", "InternalPathMethodNameResolver");
    }

}
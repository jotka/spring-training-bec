package pl.finsys.methodnameResolvers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

//...
public class AnnotatedController {

//    ...
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("CustomerPage", "msg", "AnnotatedController");
    }

}
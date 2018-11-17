package pl.finsys.localization;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
public class ContactController {

    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public ModelAndView showForm() {

        Contact contact = new Contact();
        return new ModelAndView("contact" , "contact", contact);
    }
}

package pl.finsys.viewResolvers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/helloXml.htm", method = RequestMethod.GET)
    public String helloXml() {
        logger.info("> /helloXml.htm GET");
        return "welcomePageXml";
    }

    @RequestMapping(value = "/helloProperties.htm", method = RequestMethod.GET)
    public String helloProperties() {
        logger.info("> /helloProperties.htm GET");
        return "welcomePageProperties";
    }

    @RequestMapping(value = "/helloInternal.htm", method = RequestMethod.GET)
    public String helloInternal() {
        logger.info("> /helloInternal.htm GET");
        return "welcomePageInter";
    }

}
package pl.finsys.responses.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.finsys.responses.model.JavaBean;
import pl.finsys.responses.model.Shop;

@Controller
@RequestMapping(value = "/responses")
public class ResponseController {

    private final static Logger logger = LoggerFactory.getLogger(ResponseController.class);

    @RequestMapping(value="/string", method = RequestMethod.GET, produces = "text/plain")
    public @ResponseBody String responseBody() {
        return "The String ResponseBody";
    }

    @RequestMapping(value="/charset/accept", method = RequestMethod.GET)
    public @ResponseBody String responseAcceptHeaderCharset() {
        return "\u3053\u3093\u306b\u3061\u306f\u4e16\u754c\uff01 (\"Hello world!\" in Japanese)";
    }

    @RequestMapping(value = "/charset/produce", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String responseProducesConditionCharset() {
        return "\u3053\u3093\u306b\u3061\u306f\u4e16\u754c\uff01 (\"Hello world!\" in Japanese)";
    }

    @RequestMapping(value = "/entity/status", method = RequestMethod.GET)
    public ResponseEntity<String> responseEntityStatusCode() {
        return new ResponseEntity<>("The String ResponseBody with custom status code (403 Forbidden)",
            HttpStatus.FORBIDDEN);
    }

    @RequestMapping(value = "/entity/headers", method = RequestMethod.GET)
    public ResponseEntity<String> responseEntityCustomHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        headers.add("city", "Warsaw");

        return new ResponseEntity<>("The String ResponseBody with custom header Content-Type=text/plain",
            headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Shop getShopInJSON() {
        Shop shop = new Shop();
        shop.setName("test show");
        shop.setStaffName(new String[] { "worker1", "worker2" });
        return shop;
    }

    @RequestMapping(value="/xml", method=RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody JavaBean writeXml() {
        return new JavaBean("bar", "apple");
    }
}
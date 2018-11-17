package pl.finsys.responses.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.finsys.responses.model.JavaBean;
import pl.finsys.responses.model.Shop;

@Controller
@RequestMapping(value = "/responses")
public class ResponseController {

    private final static Logger logger = LoggerFactory.getLogger(ResponseController.class);

    //...
    public @ResponseBody String responseBody() {
        return "The String ResponseBody";
    }

    //...
    public @ResponseBody String responseProducesConditionCharset() {
        return "\u3053\u3093\u306b\u3061\u306f\u4e16\u754c\uff01 (\"Hello world!\" in Japanese)";
    }

    //..
    public ResponseEntity<String> responseEntityStatusCode() {
        return new ResponseEntity<>("The String ResponseBody with custom status code (403 Forbidden)",
            HttpStatus.PAYMENT_REQUIRED);
    }

    //...
    public ResponseEntity<String> responseEntityCustomHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        headers.add("city", "Lublin");

        return new ResponseEntity<>("The String ResponseBody with custom header Content-Type=text/plain",
            headers, HttpStatus.OK);
    }

    //...
    public @ResponseBody Shop getShopInJSON() {
        Shop shop = new Shop();
        shop.setName("test show");
        shop.setStaffName(new String[] { "worker1", "worker2" });
        return shop;
    }

    //...
    public @ResponseBody JavaBean writeXml() {
        return new JavaBean("bar", "apple");
    }
}
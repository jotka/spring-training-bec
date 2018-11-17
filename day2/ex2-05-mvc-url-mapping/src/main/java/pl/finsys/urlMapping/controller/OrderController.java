package pl.finsys.urlMapping.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//..
public class OrderController {

    //...
    public @ResponseBody String byHeader() {
        return "Mapped by path + method + presence of header!";
    }

    //...
    public @ResponseBody String withPathVariable(@PathVariable String var) {
        return "Mapped by path variable!";
    }

    //...
    public @ResponseBody String byPathPattern(HttpServletRequest request) {
        return "Mapped by path pattern ('" + request.getRequestURI() + "')";
    }

    //...
	public @ResponseBody String byPath() {
		return "Mapped by path!";
	}

    //...
    public @ResponseBody String byParameter(@RequestParam String foo) {
		return "Mapped presence of query parameter!";
	}

}

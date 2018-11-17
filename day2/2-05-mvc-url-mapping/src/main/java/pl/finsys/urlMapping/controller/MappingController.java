package pl.finsys.urlMapping.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/mapping")
public class MappingController {

	@RequestMapping("/path")
	public @ResponseBody String byPath() {
		return "Mapped by path!";
	}

	@RequestMapping(value="/path/*", method=RequestMethod.GET)
	public @ResponseBody String byPathPattern(HttpServletRequest request) {
		return "Mapped by path pattern ('" + request.getRequestURI() + "')";
	}

	@RequestMapping(value="/method", method=RequestMethod.GET)
	public @ResponseBody String byMethod() {
		return "Mapped by path + method";
	}

	@RequestMapping(value="/parameter", method=RequestMethod.GET, params="foo")
	public @ResponseBody String byParameter(@RequestParam String foo) {
		return "Mapped by path + method + presence of query parameter: foo = " + foo;
	}

	@RequestMapping(value="/parameter", method=RequestMethod.GET, params="!foo")
	public @ResponseBody String byParameterNegation() {
		return "Mapped by path + method + not presence of query parameter!";
	}

	@RequestMapping(value="/header", method=RequestMethod.GET, headers="FooHeader=foo")
	public @ResponseBody String byHeader() {
		return "Mapped by path + method + presence of header!";
	}

	@RequestMapping(value="/header", method=RequestMethod.GET, headers="!FooHeader")
	public @ResponseBody String byHeaderNegation() {
		return "Mapped by path + method + absence of header!";
	}

    @RequestMapping(value="/headerDefault", method=RequestMethod.GET)
    public @ResponseBody String withHeader(@RequestHeader String Accept) {
        return "Obtained 'Accept' header '" + Accept + "'";
    }

    @RequestMapping(value="/pathVariable/{var}", method=RequestMethod.GET)
    public @ResponseBody String withPathVariable(@PathVariable String var) {
        return "Obtained 'var' path variable value '" + var + "'";
    }

    @RequestMapping(value="/cookie", method=RequestMethod.GET)
    public @ResponseBody String withCookie(@CookieValue String openid_provider) {
        return "Obtained 'openid_provider' cookie '" + openid_provider + "'";
    }

    @RequestMapping(value="/body", method=RequestMethod.POST)
    public @ResponseBody String withBody(@RequestBody String body) {
        return "Posted request body '" + body + "'";
    }

}

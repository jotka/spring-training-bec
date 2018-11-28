package pl.finsys.mvcRest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import pl.finsys.mvcRest.Movie;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final static Logger logger = LoggerFactory.getLogger(MovieController.class);
    public static final String DESCRIPTION = "The Matrix is a 1999 American science fiction action film written " +
        "and directed by The Wachowski Brothers, starring Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss, " +
        "Hugo Weaving, and Joe Pantoliano. It depicts a dystopian future in which reality as perceived by most" +
        " humans is actually a simulated reality called \"the Matrix\"";

    /**
     * curl -H "Accept: application/json" http://localhost:8080/movie/Matrix
     * curl -H "Accept: application/xml" http://localhost:8080/movie/Matrix
     */
    @RequestMapping(value="/{name}", method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public Movie geDescription(@PathVariable String name) {

        logger.info("> GET for /{name}/" + name);

        return new Movie(1999, "Matrix", DESCRIPTION);
    }
}
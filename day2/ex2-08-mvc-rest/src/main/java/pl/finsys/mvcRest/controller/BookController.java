package pl.finsys.mvcRest.controller;

import org.springframework.web.bind.annotation.PathVariable;

import pl.finsys.mvcRest.Book;

//..
public class BookController {

    //..
    public Book geDescription(@PathVariable String name) {

        return new Book(2009, "Spring in Action", "what a nice book!");
    }
}
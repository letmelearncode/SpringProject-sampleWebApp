package com.springExpress.spring5WebApp.controller;

import com.springExpress.spring5WebApp.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(value = "/books")
    public String getBooks(Model model) {
        model.addAttribute("books",bookRepository.findAll());
        return  "books";
    }
}

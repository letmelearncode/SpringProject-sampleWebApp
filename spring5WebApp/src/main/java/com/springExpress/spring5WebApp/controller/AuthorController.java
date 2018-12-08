package com.springExpress.spring5WebApp.controller;

import com.springExpress.spring5WebApp.repository.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping(value ="/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors",authorRepository.findAll());
        return "authors";
    }
}

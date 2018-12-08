package com.springExpress.spring5WebApp.bootstrap;

import com.springExpress.spring5WebApp.model.*;
import com.springExpress.spring5WebApp.repository.AuthorRepository;
import com.springExpress.spring5WebApp.repository.BookRepository;
import com.springExpress.spring5WebApp.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void initData() {

        Publisher publisher1 = new Publisher("Robin Singh","New York");
        publisherRepository.save(publisher1);

        //Eric
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","1234",publisher1);
        eric.getBooks().add(ddd);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod","Johnson");
       /* Publisher publisher2 = new Publisher("Ricky Sigh","Australia");
        publisherRepository.save(publisher2);*/
        Book noEjb = new Book("J2EE Development without EJB","2234",publisher1);
        rod.getBooks().add(noEjb);
        authorRepository.save(rod);
        bookRepository.save(noEjb);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    initData();
    }
}

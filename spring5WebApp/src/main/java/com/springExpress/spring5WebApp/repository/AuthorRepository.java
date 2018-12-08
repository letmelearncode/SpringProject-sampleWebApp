package com.springExpress.spring5WebApp.repository;

import com.springExpress.spring5WebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}


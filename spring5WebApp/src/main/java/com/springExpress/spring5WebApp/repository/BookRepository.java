package com.springExpress.spring5WebApp.repository;

import org.springframework.data.repository.CrudRepository;
import com.springExpress.spring5WebApp.model.Book;

public interface BookRepository extends CrudRepository<Book,Long>{
}

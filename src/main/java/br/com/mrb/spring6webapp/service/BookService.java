package br.com.mrb.spring6webapp.service;

import br.com.mrb.spring6webapp.domain.Book;
import org.springframework.stereotype.Service;

public interface BookService {

    Iterable<Book> findAll();
}

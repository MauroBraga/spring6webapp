package br.com.mrb.spring6webapp.repositories;

import br.com.mrb.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}

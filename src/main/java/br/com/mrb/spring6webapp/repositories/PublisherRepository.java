package br.com.mrb.spring6webapp.repositories;

import br.com.mrb.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

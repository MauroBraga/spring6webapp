package br.com.mrb.spring6webapp.bootstrap;

import br.com.mrb.spring6webapp.domain.Author;
import br.com.mrb.spring6webapp.domain.Book;
import br.com.mrb.spring6webapp.domain.Publisher;
import br.com.mrb.spring6webapp.repositories.AuthorRepository;
import br.com.mrb.spring6webapp.repositories.BookRepository;
import br.com.mrb.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Publisher ciela = new Publisher();
        ciela.setPublisherName("Ciela");
        ciela.setAddress("Patriarh Evtimii 12");
        ciela.setCity("Sofia");
        ciela.setState("Sofia");
        ciela.setZip("12345");

        publisherRepository.save(ciela);

        Author erick =  new Author();
        erick.setFirstName("Erick");
        erick.setLastName("Evans");

        Book ddd = new Book();
        ddd.setIsbn("123456");
        ddd.setTitle("Domain Driven Design");

        Author erickSaved = authorRepository.save(erick);
        Book dddSaved = bookRepository.save(ddd);

        Author rod =  new Author();
        rod.setFirstName("Erick");
        rod.setLastName("Evans");

        Book noEJB = new Book();
        noEJB.setIsbn("123456");
        noEJB.setTitle("Domain Driven Design");

        Author rodkSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        erickSaved.getBooks().add(dddSaved);
        rodkSaved.getBooks().add(noEJBSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: "+ authorRepository.count());
        System.out.println("Book Count: "+bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());
    }
}

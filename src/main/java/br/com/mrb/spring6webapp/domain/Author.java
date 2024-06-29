package br.com.mrb.spring6webapp.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"firstName", "lastName"})
@Getter
@Setter
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;
}

package edu.ifpe.bookapp.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8080")
@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Long> {

    Iterable<Book> findByTitle(String title);
}

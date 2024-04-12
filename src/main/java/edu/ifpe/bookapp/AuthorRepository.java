package edu.ifpe.bookapp;

import edu.ifpe.bookapp.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8080")
@RepositoryRestResource
public interface AuthorRepository extends CrudRepository<Author, Long> {
}

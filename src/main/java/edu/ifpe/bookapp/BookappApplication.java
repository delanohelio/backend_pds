package edu.ifpe.bookapp;

import edu.ifpe.bookapp.domain.Author;
import edu.ifpe.bookapp.domain.Book;
import edu.ifpe.bookapp.domain.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Set;

@SpringBootApplication
public class BookappApplication implements CommandLineRunner {


    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookappApplication(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public static void main(String[] args)  {

        SpringApplication.run(BookappApplication.class, args);
    }

    private static final Logger logger =
            LoggerFactory.getLogger(
                    BookappApplication.class
            );



    @Override
    public void run(String... args) throws Exception {
        Author author1 = new Author("Maria", "Fernanda");
        Author author2 = new Author("Hiany", "Gabriely");

        //authorRepository.saveAll(Arrays.asList(author1, author2));

        Book book1 = new Book("Mil gotas", Set.of(author1));
        Book book2 = new Book("Dez Mil gotas", Set.of(author1));
        Book book3 = new Book("Sem gotas", Set.of(author2));

        bookRepository.saveAll(Arrays.asList(book1, book2, book3));

        for (Book book : bookRepository.findAll()) {
            logger.info("title: {} author: {}", book.getTitle(), null);
        }
    }
}

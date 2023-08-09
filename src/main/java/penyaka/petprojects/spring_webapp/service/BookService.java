package penyaka.petprojects.spring_webapp.service;

import penyaka.petprojects.spring_webapp.entity.Book;
import penyaka.petprojects.spring_webapp.repository.BookRepository;

public interface BookService {
    Iterable<Book> findAll ();

}

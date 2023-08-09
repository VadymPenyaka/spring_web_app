package penyaka.petprojects.spring_webapp.service;

import penyaka.petprojects.spring_webapp.entity.Book;
import penyaka.petprojects.spring_webapp.repository.BookRepository;

public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}

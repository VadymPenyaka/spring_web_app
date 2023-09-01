package penyaka.petprojects.spring_webapp.service;

import penyaka.petprojects.spring_webapp.entity.Author;

public interface AuthorService {
    Iterable<Author> findAll ();
}

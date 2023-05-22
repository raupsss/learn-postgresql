package com.belajarpostgresql.crud.service;

import com.belajarpostgresql.crud.entities.BookEntity;

import java.util.List;
import java.util.Optional;

public interface BookService {

    public List<BookEntity> getBooks();
    public Optional<BookEntity> getBooksById(Long id);
    public BookEntity createBook(BookEntity request);
    public BookEntity updateBook(BookEntity request);
    public void deleteBook(Long id);
}

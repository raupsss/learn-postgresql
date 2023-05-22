package com.belajarpostgresql.crud.service;

import com.belajarpostgresql.crud.entities.BookEntity;
import com.belajarpostgresql.crud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookEntity> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<BookEntity> getBooksById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public BookEntity createBook(BookEntity request) {
        return bookRepository.save(request);
    }

    @Override
    public BookEntity updateBook(BookEntity request) {
        return bookRepository.save(request);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

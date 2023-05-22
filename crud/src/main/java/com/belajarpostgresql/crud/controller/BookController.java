package com.belajarpostgresql.crud.controller;

import com.belajarpostgresql.crud.entities.BookEntity;
import com.belajarpostgresql.crud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/withjpa")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public List<BookEntity> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/books/{id}")
    public Optional<BookEntity> getBooksById(@PathVariable Long id){
        return bookService.getBooksById(id);
    }

    @PostMapping("/createBook")
    public BookEntity createBook(@RequestBody BookEntity request){
        return bookService.createBook(request);
    }

    @PutMapping("/updateBook")
    public BookEntity updateBook(@RequestBody BookEntity request){
        return bookService.updateBook(request);
    }

    @DeleteMapping("/deleteBook/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
    }
}

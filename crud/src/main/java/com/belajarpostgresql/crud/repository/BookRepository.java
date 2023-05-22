package com.belajarpostgresql.crud.repository;

import com.belajarpostgresql.crud.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}

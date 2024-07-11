package com.BookStore.BookStore.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookStore.BookStore.Model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}

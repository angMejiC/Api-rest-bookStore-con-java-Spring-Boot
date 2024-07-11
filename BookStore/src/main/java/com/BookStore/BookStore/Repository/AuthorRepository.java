package com.BookStore.BookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookStore.BookStore.Model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
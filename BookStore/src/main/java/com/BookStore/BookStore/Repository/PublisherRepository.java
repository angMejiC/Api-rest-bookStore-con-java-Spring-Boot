package com.BookStore.BookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookStore.BookStore.Model.publisher;

@Repository
public interface PublisherRepository extends JpaRepository<publisher, Long> {
}


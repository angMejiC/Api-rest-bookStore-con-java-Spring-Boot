package com.BookStore.BookStore.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookStore.BookStore.Model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
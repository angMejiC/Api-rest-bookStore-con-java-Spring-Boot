package com.BookStore.BookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookStore.BookStore.Model.Inventario;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Long> {
}

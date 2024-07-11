package com.BookStore.BookStore.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookStore.BookStore.Model.Inventario;
import com.BookStore.BookStore.Repository.InventarioRepository;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    public List<Inventario> getAllInventarios() {
        return inventarioRepository.findAll();
    }

    public Inventario getInventarioById(Long id) {
        return inventarioRepository.findById(id).orElse(null);
    }

    public Inventario saveInventario(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    public void deleteInventario(Long id) {
        inventarioRepository.deleteById(id);
    }
}


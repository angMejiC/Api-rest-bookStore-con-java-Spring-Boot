package com.BookStore.BookStore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookStore.BookStore.Model.Inventario;
import com.BookStore.BookStore.Services.InventarioService;

@RestController
@RequestMapping("/inventarios")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @GetMapping
    public List<Inventario> getAllInventarios() {
        return inventarioService.getAllInventarios();
    }

    @GetMapping("/{id}")
    public Inventario getInventarioById(@PathVariable Long id) {
        return inventarioService.getInventarioById(id);
    }

    @PostMapping
    public Inventario createInventario(@RequestBody Inventario inventario) {
        return inventarioService.saveInventario(inventario);
    }

    @PutMapping("/{id}")
    public Inventario updateInventario(@PathVariable Long id, @RequestBody Inventario inventario) {
        inventario.setId(id);
        return inventarioService.saveInventario(inventario);
    }

    @DeleteMapping("/{id}")
    public void deleteInventario(@PathVariable Long id) {
        inventarioService.deleteInventario(id);
    }
}


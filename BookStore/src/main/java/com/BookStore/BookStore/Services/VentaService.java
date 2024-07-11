package com.BookStore.BookStore.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookStore.BookStore.Model.Venta;
import com.BookStore.BookStore.Repository.VentaRepository;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }

    public Venta getVentaById(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }

    public Venta saveVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    public void deleteVenta(Long id) {
        ventaRepository.deleteById(id);
    }

}


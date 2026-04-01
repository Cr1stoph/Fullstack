package com.example.Libreria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Libreria.model.Producto;
import com.example.Libreria.service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> listarProductos(){return productoService.getProductos();}

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable int id) {
        return productoService.getProductoId(id);}
    
    @PostMapping
    public Producto agregarProducto(@RequestBody Producto p){return productoService.saveProducto(p);}

    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable int id){return productoService.deleteProducto(id);} 
}

package com.example.Libreria.service;
import com.example.Libreria.model.Producto;
import com.example.Libreria.repo.Productrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProductoService {
    @Autowired
    private Productrepo productorepo;

    public List<Producto> getProductos(){return productorepo.obtenerProductos();}

    public Producto getProductoId(int id){return productorepo.buscarId(id);}

    public Producto saveProducto(Producto p){return productorepo.agregarProducto(p);}

    public String deleteProducto(int id){productorepo.eliminarProducto(id); return "Producto eliminado correctamente";}
    
}

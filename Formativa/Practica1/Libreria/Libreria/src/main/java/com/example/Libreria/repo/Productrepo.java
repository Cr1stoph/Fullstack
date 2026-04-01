package com.example.Libreria.repo;

import java.util.List;
import java.util.ArrayList;
import com.example.Libreria.model.Producto;
import org.springframework.stereotype.Repository;

@Repository
public class Productrepo {
    //Crea una lista de productos
    private List<Producto> listaProductos = new ArrayList<>();

    //Metodo que devuelve la lista de productos
    public List<Producto> obtenerProductos(){return listaProductos;} 

    //Metodo que agrega productos
    public Producto agregarProducto(Producto p){
        listaProductos.add(p);
        return p;
    }

    public Producto buscarId(int id){
        for(Producto p: listaProductos){
            if(p.getId() == id){
                return p;
            } 
        }
        return null;
    }
    //Metodo que elimina productos
    public void eliminarProducto(int id){
        Producto p = buscarId(id);
        if(p != null){
            listaProductos.remove(p);
        }
    }
}

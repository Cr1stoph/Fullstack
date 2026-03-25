package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {
    //array que guarda todos los libros
    private List<Libro> listaLibros = new ArrayList<>();


    //Metodo que retorna todos los libros
    public List<Libro> obtenerListaLibros() {
        return listaLibros;
    }

    public Libro buscarPorID(int id){
        for (Libro libro : listaLibros) {
            if(libro.getId() == id){
                return libro;
            }
        }
        return null;
    }
    public Libro buscarPorIsbn(String isbn){
        for (Libro libro : listaLibros) {
            if(libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }
}

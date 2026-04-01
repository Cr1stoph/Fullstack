//En modelo siempre irán los objetos que vamos a crear
package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Genera getter, setters, toString equals, HashCode y un constructor con los campos requeridos.
@AllArgsConstructor //Genera constructor con todos los campos.
@NoArgsConstructor //Ggenera Constructor sin ningun campo, vacio.
public class Libro {
    private int id;
    private String isbn; //Codigo internacional del libro
    private String titulo;
    private String editorial;
    private int fechaDePublicacion;
    private String autor;
}
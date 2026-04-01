package com.example.Libreria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Producto {
    private int id;
    private int precio;
    private String nombre;
    private String categoria;
}

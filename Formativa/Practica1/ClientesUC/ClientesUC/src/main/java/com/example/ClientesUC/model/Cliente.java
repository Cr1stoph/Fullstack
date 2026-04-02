package com.example.ClientesUC.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {
    @Id
    @NotNull
    private int id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String correo;

    @NotNull
    private int edad;
}

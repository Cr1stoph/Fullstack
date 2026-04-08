package com.example.TareasPendientes.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tarea {
    
    @Id
    @NotNull
    private int id;

    @NotBlank
    private String tarea;

    @NotBlank
    private boolean terminada;
}

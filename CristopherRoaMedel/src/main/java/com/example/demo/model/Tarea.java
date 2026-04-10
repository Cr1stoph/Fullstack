package com.example.demo.model;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Tarea {
    @Id
    private Long id;

    @NotBlank(message = "La descripcion es obligatoria")
    private String descripcion;

    @NotBlank(message = "El estado es obligatorio")
    private String estado;

    @NotBlank(message = "Nombre del responsable es obligatorio")
    private String responsable;
    
    @NotBlank(message = "Escrible la hora como: DD-MM-YY")
    private String fechaAsociada;

    @Min(value = 1, message = "El valor minimo de la prioridad es de 1")
    @Max(value = 5, message = "El valor máximo de la prioridad es de 5")
    @NotNull
    private Integer prioridad;    
}

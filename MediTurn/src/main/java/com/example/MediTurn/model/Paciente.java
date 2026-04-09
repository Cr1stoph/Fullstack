package com.example.MediTurn.model;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {
    @Id
    private Long id;

    @NotBlank(message = "El nombre del paciente es oblicatorio")
    private String nombre;

    @NotBlank(message = "La especialidad es requerida")
    private String especialidad;

    @NotBlank (message = "El estado del paciente es oblicatorio")
    private String estado;

    private LocalDateTime fechaRegistro;

    @NotNull(message = "La prioridad es obligatoria")
    @Min(value = 1, message = "La prioridad minima es de 1")
    @Max(value = 5, message = "La prioridad maxima es de 5")
    private Integer prioridad;

}

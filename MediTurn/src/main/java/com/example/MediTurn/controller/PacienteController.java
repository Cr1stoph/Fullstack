package com.example.MediTurn.controller;
import com.example.MediTurn.model.Paciente;
import com.example.MediTurn.service.PacienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> listarPacientes(){return pacienteService.getPacientes();}

    @GetMapping("/{id}")
    public Paciente obtenerPaciente(@PathVariable Long id){
        return pacienteService.getPacienteId(id);
    }

    @PostMapping
    public Paciente salvarPaciente(@Valid @RequestBody Paciente paciente){
        return pacienteService.savePaciente(paciente);
    }

    @PutMapping("/{id}")
    public Paciente actualizarPaciente(@PathVariable Long id, @Valid @RequestBody Paciente paciente){
        return pacienteService.ActualizarPaciente(id, paciente);
    }
    @DeleteMapping("/{id}")
    public String eliminarPaciente(@PathVariable Long id){
        return pacienteService.deletePaciente(id);
    }



}

package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

import com.example.demo.model.Tarea;
import com.example.demo.service.TareaService;
import java.util.List;


@RestController
@RequestMapping("/api/v1/tareas")
public class TareaController {

    @Autowired
    private TareaService tareaservice;

    @GetMapping
    public List<Tarea> listartareas(){
        return tareaservice.getTareas();
    }

    @GetMapping("/{id}")
    public Tarea obtenerTareas(@PathVariable Long id){
        return tareaservice.getPacienteId(id);
    }

    @PostMapping
    public Tarea saveTareas(@Valid @RequestBody Tarea tarea){
        return tareaservice.saveTareas(tarea);
    }

    @PutMapping("/{id}")
    public Tarea actualizarPaciente(@PathVariable Long id, @Valid @RequestBody Tarea tarea){
        return tareaservice.actualizarTarea(id, tarea);
    }
    @DeleteMapping("/{id}")
    public String eliminarTarea(@PathVariable Long id){
        return tareaservice.deletePaciente(id);
    }

    
}

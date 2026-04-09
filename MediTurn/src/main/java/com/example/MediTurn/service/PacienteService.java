package com.example.MediTurn.service;
import com.example.MediTurn.model.Paciente;
import com.example.MediTurn.repo.PacienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepo pacienteRepo;

    public List<Paciente> getPacientes(){
        return pacienteRepo.obtenerListaPacientes();
    }
    public Paciente getPacienteId(Long id){
        Paciente encontrada = pacienteRepo.buscarPorId(id);
        if(encontrada == null){throw new RuntimeException("Paciente no encontrado");
        }
        return encontrada;
    }

    public String deletePaciente(Long id){
        pacienteRepo.eliminarPaciente(id);
        return "Paciente eliminado correctamente";
    }
    public Paciente savePaciente(Paciente paciente){
        return pacienteRepo.agregaroActualizaPaciente(paciente);
    }
    public Paciente ActualizarPaciente(Long id, Paciente datosNuevos){
        Paciente existente = getPacienteId(id);

        //Actualiza
        existente.setNombre(datosNuevos.getNombre());
        existente.setEspecialidad(datosNuevos.getEspecialidad());
        existente.setEstado(datosNuevos.getEstado());
        existente.setPrioridad(datosNuevos.getPrioridad());

        return pacienteRepo.agregaroActualizaPaciente(existente);
    }

}

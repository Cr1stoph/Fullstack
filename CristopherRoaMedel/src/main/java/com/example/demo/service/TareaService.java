package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Tarea;
import com.example.demo.repo.TareaRepo;
import java.util.List;


@Service
public class TareaService {
    @Autowired
    private TareaRepo tarearepo;
    //Llama a lista de Tareas
    public List<Tarea> getTareas(){
        return tarearepo.listarTareas();
    }
    //Llama a buscar por id y si no encuentra regresa el mensaje de "no encontrado"
    public Tarea getPacienteId(Long id){
        Tarea encontrada = tarearepo.buscarPorId(id);
        if(encontrada == null){
            throw new RuntimeException("Paciente no encontrado");
        }
        return encontrada;
    }
    //Llama a eliminarTarea y devuelve el mensaje de "elimnado correctamente "
    public String deletePaciente(Long id){
        tarearepo.eliminarTarea(id);
        return "Tarea eliminado correctamente";
    }
    //Llama a la funcion agregarActualizar para agregar una tarea
    public Tarea saveTareas(Tarea tarea){
        return tarearepo.AgregarActualizar(tarea);
    }

    public Tarea actualizarTarea(Long id, Tarea tareaNueva){
        Tarea existente =getPacienteId(id);
        existente.setDescripcion(tareaNueva.getDescripcion());
        existente.setEstado(tareaNueva.getEstado());
        existente.setFechaAsociada(tareaNueva.getFechaAsociada());
        existente.setPrioridad(tareaNueva.getPrioridad());
        existente.setResponsable(tareaNueva.getResponsable());
        return tarearepo.AgregarActualizar(existente);
    }

}

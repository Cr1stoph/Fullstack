package com.example.demo.repo;

import org.springframework.stereotype.Repository;
import com.example.demo.model.Tarea;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;

@Repository
public class TareaRepo {
    public List<Tarea> listaDeTareas = new ArrayList<>();
    //Para autoincrementar el id
    private final AtomicLong contadorId = new AtomicLong(1);

    //Metodo que lista las tareas
    public List<Tarea> listarTareas(){
        return listaDeTareas;
    }
    //Metodo que si no encuentra id, crea, pero si encuentra id, modifica(actualiza)
    public Tarea AgregarActualizar(Tarea t){
        if (t.getId() == null) {
            t.setId(contadorId.getAndIncrement());
            t.setFechaAsociada(t.getFechaAsociada());
            listaDeTareas.add(t);
        }else {
            for(int i = 0; i <listaDeTareas.size(); i++) {
                if (listaDeTareas.get(i).getId().equals(t.getId())) {
                    listaDeTareas.set(i, t);
                    break;
                }
            }
        }
        return t;
    }
    //Metodo para buscar por id
    public Tarea buscarPorId(Long id){
        for(Tarea t : listaDeTareas){
            if(t.getId().equals(id)){return t;}
        }
        return null;
    }
    //Metodo que elimina tareas
    public String eliminarTarea(Long Id){
        Tarea t = buscarPorId(Id);
        listaDeTareas.remove(t);
        return "Tarea eliminada correctamente";
    }
}

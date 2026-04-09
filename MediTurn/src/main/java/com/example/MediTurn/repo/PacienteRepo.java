package com.example.MediTurn.repo;

import com.example.MediTurn.model.Paciente;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class PacienteRepo {
    //Crea lista de pacientes de tipo paciente, con todos sus atributos
    private List<Paciente> listaPacientes = new ArrayList<>();

    //Crea un objeto que autoincrementa solo el id
    private final AtomicLong contadorId = new AtomicLong(1);


    public List<Paciente> obtenerListaPacientes() {return  listaPacientes;}

    public Paciente agregaroActualizaPaciente(Paciente p) {
        if (p.getId() == null) {
            p.setId(contadorId.getAndIncrement());
            p.setFechaRegistro(LocalDateTime.now());
            listaPacientes.add(p);
        }else {
            for(int i = 0; i <listaPacientes.size(); i++) {
                if (listaPacientes.get(i).getId().equals(p.getId())) {
                    listaPacientes.set(i, p);
                    break;
                }
            }
        }
        return p;
    }
    //Buscar por id
    public Paciente buscarPorId(Long id){
        for(Paciente p:listaPacientes){
            if(p.getId().equals(id)){return p;}
        }
        return null;
    }
    public String eliminarPaciente(Long id){
        Paciente p = buscarPorId(id);
        listaPacientes.remove(p);
        return "Paciente eliminado correctamente";
    }
}

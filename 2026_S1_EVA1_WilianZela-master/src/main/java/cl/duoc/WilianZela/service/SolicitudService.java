package cl.duoc.WilianZela.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.duoc.WilianZela.model.Solicitud;
import cl.duoc.WilianZela.repository.SolicitudRepository;

@Service
public class SolicitudService {

    private final SolicitudRepository solicitudRepository;

    public SolicitudService(SolicitudRepository solicitudRepository){
        this.solicitudRepository = solicitudRepository;
    }

    public List<Solicitud> getAllSolicitudes(){
        return solicitudRepository.findAll();
    }

    public Solicitud getSolicitudById(Long id){
        return solicitudRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Solicitud no encontrada"));
    }

    public Solicitud createSolicitud(Solicitud solicitud){
        solicitud.setFechaRegistro(LocalDateTime.now());
        solicitud.setEstado("PENDIENTE");

        return solicitudRepository.save(solicitud);
    }

    public Solicitud updateSolicitud(Long id, Solicitud solicitud){
        Solicitud existente = getSolicitudById(id);

        existente.setNombrePaciente(solicitud.getNombrePaciente());
        existente.setEspecialidad(solicitud.getEspecialidad());
        existente.setEstado(solicitud.getEstado());
        existente.setPrioridad(solicitud.getPrioridad());
        return solicitudRepository.save(existente);
    }

    public void deleteSolicitud(Long id){
        if(!solicitudRepository.existsById(id)){
            throw new RuntimeException("Solicitud no encontrada");
        }
        solicitudRepository.deleteById(id);
    }

    public List<Solicitud> buscarPorEspecialidad(String especialidad){
        return solicitudRepository.findAll()
                .stream()
                .filter(s -> s.getEspecialidad().equalsIgnoreCase(especialidad))
                .toList();
    }
}
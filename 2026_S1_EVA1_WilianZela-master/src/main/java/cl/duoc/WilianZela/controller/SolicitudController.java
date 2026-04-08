package cl.duoc.WilianZela.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cl.duoc.WilianZela.model.Solicitud;
import cl.duoc.WilianZela.service.SolicitudService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/solicitudes")
public class SolicitudController {

    private final SolicitudService service;

    public SolicitudController(SolicitudService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Solicitud>> getAll(){
        return ResponseEntity.ok(service.getAllSolicitudes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Solicitud> getById(@PathVariable Long id){
        return ResponseEntity.ok(service.getSolicitudById(id));
    }

    @PostMapping
    public ResponseEntity<Solicitud> create(@Valid @RequestBody Solicitud solicitud){
        return ResponseEntity.ok(service.createSolicitud(solicitud));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Solicitud> update(@PathVariable Long id, @Valid @RequestBody Solicitud solicitud){
        return ResponseEntity.ok(service.updateSolicitud(id, solicitud));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.deleteSolicitud(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Solicitud>> buscarPorEspecialidad(@RequestParam String especialidad){
        return ResponseEntity.ok(service.buscarPorEspecialidad(especialidad));
    }
}

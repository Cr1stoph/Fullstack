package com.example.ClientesUC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ClientesUC.service.ClienteService;
import com.example.ClientesUC.model.Cliente;
import java.util.List;

@RestController
@RequestMapping("api/v1/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteservice;

    @GetMapping
    public List<Cliente>listarCliente(){return clienteservice.getCliente();}

    @GetMapping("/{id}")
    public Cliente clienteId(@PathVariable int id){return clienteservice.getClienteId(id);}

    @PostMapping
    public Cliente agregaCliente(@RequestBody Cliente c){return clienteservice.saveCliente(c);}

    @DeleteMapping("/{id}")
    public String eliminarCliente(@PathVariable int id){clienteservice.deleteCliente(id);
        return "Cliente eliminado correctamente";}
}

package com.example.ClientesUC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ClientesUC.repo.ClienteRepo;
import com.example.ClientesUC.model.Cliente;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    public ClienteRepo clienterepo;

    public List<Cliente> getCliente(){return clienterepo.obtenerClientes();}

    public Cliente saveCliente(Cliente cliente){return clienterepo.agregaCliente(cliente);}

    public Cliente getClienteId(int id){return clienterepo.buscarPorId(id);}

    public String deleteCliente(int id){clienterepo.eliminarCliente(id);
        return "Cliente eliminado correctamente";
    }
}

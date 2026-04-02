package com.example.ClientesUC.repo;

import org.springframework.stereotype.Repository;
import com.example.ClientesUC.model.Cliente;
import java.util.ArrayList;
import java.util.List;

//Que hacer: Debe permitir registrar, listar y eliminar clientes, validando campos como nombre, correo y edad.

@Repository
public class ClienteRepo {
    private List<Cliente> listaClientes = new ArrayList<>();

//---------Metodo que lista Clientes---------
    public List<Cliente> obtenerClientes(){
        return listaClientes;}

//---------Metodo que Registra Clientes---------
    public Cliente agregaCliente(Cliente p){
        listaClientes.add(p);
        return p;}

//---------Metodo que elimina Clientes---------
    public void eliminarCliente(int id){
        Cliente cliente = buscarPorId(id);
        if (cliente != null){
            listaClientes.remove(cliente);}}
            
//---------Metodo que busca por id---------
    public Cliente buscarPorId(int id){
        for(Cliente p: listaClientes){
            if (p.getId() == id) {
                return p;}}
        return null;}
}

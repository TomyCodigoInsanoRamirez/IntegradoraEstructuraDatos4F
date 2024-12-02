package org.example.integradoraestructuradatos.response.Cliente;

import org.example.integradoraestructuradatos.model.Cliente;
import org.example.integradoraestructuradatos.response.Cliente.ClienteResponse;

import java.util.List;

public class ClienteResponse {
    private List<Cliente> clientes;
    public List<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
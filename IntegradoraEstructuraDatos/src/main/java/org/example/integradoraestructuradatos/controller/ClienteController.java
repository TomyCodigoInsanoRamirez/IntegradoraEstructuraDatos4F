package org.example.integradoraestructuradatos.controller;
import org.example.integradoraestructuradatos.model.Cliente;
import org.example.integradoraestructuradatos.dao.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private IClienteRepository clienteRepository;

    @PostMapping("/agregarCliente")
    public ResponseEntity<Cliente> agregarCliente(@RequestBody Cliente cliente) {
        Cliente nuevoCliente = clienteRepository.save(cliente);
        return ResponseEntity.ok(nuevoCliente);
    }
}

package org.example.integradoraestructuradatos.dao;

import org.example.integradoraestructuradatos.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IClienteRepository extends CrudRepository<Cliente, Long> {
}

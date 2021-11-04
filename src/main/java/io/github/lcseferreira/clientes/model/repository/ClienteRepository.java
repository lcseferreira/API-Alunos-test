package io.github.lcseferreira.clientes.model.repository;

import io.github.lcseferreira.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}

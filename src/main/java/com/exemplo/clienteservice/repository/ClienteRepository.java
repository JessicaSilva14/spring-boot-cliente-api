package com.exemplo.clienteservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemplo.clienteservice.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
package com.dio.repository;

import org.springframework.data.repository.CrudRepository;

import com.dio.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}

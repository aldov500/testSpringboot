package com.aldov500.backJava.dao;

import com.aldov500.backJava.dto.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDAO extends JpaRepository<Cliente,Long> {

}

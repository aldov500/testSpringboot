package com.aldov500.backJava.service;

import com.aldov500.backJava.dto.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> listarClientes();

    public Cliente guardarCliente(Cliente cliente);

    public Cliente listarClientePorID(Long id);

    public Cliente actualizarCliente(Cliente cliente);

    public void eliminarCliente(Long id);

}

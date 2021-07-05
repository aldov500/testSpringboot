package com.aldov500.backJava.service;

import com.aldov500.backJava.dao.IClienteDAO;
import com.aldov500.backJava.dto.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    IClienteDAO iClienteDAO;

    @Override
    public List<Cliente> listarClientes() {
        return iClienteDAO.findAll();
    }

    @Override
    public Cliente guardarCliente(Cliente cliente) {
        return null;
    }

    @Override
    public Cliente listarClientePorID(Long id) {
        return null;
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        return null;
    }

    @Override
    public void eliminarCliente(Long id) {

    }
}

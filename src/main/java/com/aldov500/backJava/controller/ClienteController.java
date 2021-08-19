package com.aldov500.backJava.controller;

import com.aldov500.backJava.dto.Cliente;
import com.aldov500.backJava.service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    ClienteServiceImpl clienteService;

    @GetMapping("/clientes")
    public List<Cliente> listarClientes(){
        return clienteService.listarClientes();
    }

    @PostMapping("/clientes")
    public Cliente salvarCliente(@RequestBody  Cliente cliente){
        return clienteService.guardarCliente(cliente);
    }

    @GetMapping("/clientes/{id}")
    public Cliente listarClientePorID(@PathVariable(name="id") Long id){
        Cliente clienteRetorno = new Cliente();
        clienteRetorno = clienteService.listarClientePorID(id);
        System.out.println("Cliente seleccionado: " + clienteRetorno.toString());
        return clienteRetorno;
    }

    @PutMapping("/clientes/{id}")
    public Cliente actualizarCliente(@PathVariable(name="id") Long id, @RequestBody Cliente cliente){



        return null;
    }
}

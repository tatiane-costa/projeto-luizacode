package com.projeto.luizaLabs.controller;

import com.projeto.luizaLabs.entity.Cliente;
import com.projeto.luizaLabs.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
//@RequestMapping("/apidabia")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    //Adicionar
    //tipo do retorno --nome do método (parametros)
    @PostMapping("/clientes")
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return clienteService.adicionarCliente(cliente);
    }

    @GetMapping("/clientes/{id}")
    //Buscar Cliente
    public Optional<Cliente> buscarCliente(@PathVariable long id){
        return clienteService.buscarCliente(id);
    }

    //Atualizar cliente
    @PutMapping("/clientes/{id}")
    public Cliente atualizarCliente(@PathVariable long id, @RequestBody Cliente cliente) {
        Optional<Cliente> clientePosBusca = clienteService.buscarCliente(id);
        if (clientePosBusca != null) {
            cliente.setID(clientePosBusca.get().getID());
            return clienteService.atualizarCliente(cliente);
        }
        return null;
    }

    @GetMapping("/qtdeclientes")
    public long  qtdeClientes() {
        return clienteService.quantidadeDeClientes();
    }

}

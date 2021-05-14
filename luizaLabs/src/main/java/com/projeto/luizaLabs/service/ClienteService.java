package com.projeto.luizaLabs.service;

import com.projeto.luizaLabs.entity.Cliente;
import com.projeto.luizaLabs.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //Criar um cliente
    public Cliente adicionarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    //Mostrar um cliente
    public Optional<Cliente> buscarCliente(long id)
    {
        return clienteRepository.findByID(id);
    }

    //Atualizar dados do cliente
    public Cliente atualizarCliente(Cliente cliente)
    {
        return clienteRepository.save(cliente);
    }

    //contar quantos clientes tem
    public long quantidadeDeClientes(){
        return clienteRepository.count();
    }

}

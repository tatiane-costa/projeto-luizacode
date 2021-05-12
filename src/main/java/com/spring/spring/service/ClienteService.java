package com.spring.spring.service;

import com.spring.spring.entity.Cliente;
import com.spring.spring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
     private ClienteRepository clienteRepository;

    //Criar um cliente
    public Cliente adicionarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    //Mostrar um cliente
    public Cliente buscarCliente(long id)
    {
        return ClienteRepository.findById(id);
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

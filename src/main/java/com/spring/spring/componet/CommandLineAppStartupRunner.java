package com.spring.spring.componet;

import com.spring.spring.entity.Cliente;
import com.spring.spring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    @Autowired
    private ClienteService clienteService;

    @Override
    public void run(String...args)
    {
        this.criarCliente();
        //this.criarProduto();
    }

    private void criarCliente()
    {
        Cliente clienteBia = new Cliente();
        clienteBia.setCpf("2345678987654");
        clienteBia.setNome("bia");

        clienteService.adicionarCliente(clienteBia);
    }

}

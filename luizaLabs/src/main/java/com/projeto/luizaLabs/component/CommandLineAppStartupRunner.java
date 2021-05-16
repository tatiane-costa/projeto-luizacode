package com.projeto.luizaLabs.component;

import com.projeto.luizaLabs.entity.Cliente;
import com.projeto.luizaLabs.entity.Produto;
import com.projeto.luizaLabs.service.ClienteService;
import com.projeto.luizaLabs.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    @Autowired
    private ClienteService clienteService;
    @Autowired
    private ProdutoService produtoService;

    @Override
    public void run(String...args)
    {
        this.criarCliente();
        this.criarProduto();
    }

    private void criarCliente()
    {
        Cliente clienteBia = new Cliente();
        clienteBia.setCpf("23456789876");
        clienteBia.setNome("bia");
        clienteService.adicionarCliente(clienteBia);
    }

    private void criarProduto()
    {
        Produto produto = new Produto();
        produto.setNome("Geladeira");
        produto.setDescricao("Essa geladeira é muito legal");
        //Produto create  = produtoService.adicionarProduto(produto);
        //produto.add(create);

        BigDecimal geladeira = new BigDecimal(1000);
        produto.setPreco(geladeira);
        produtoService.adicionarProduto(produto);
    }


}

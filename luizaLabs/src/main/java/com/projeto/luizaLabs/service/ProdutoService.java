package com.projeto.luizaLabs.service;

import com.projeto.luizaLabs.entity.Produto;
import com.projeto.luizaLabs.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    //Adicionar produto no banco
    public Produto adicionarProduto(Produto produto)
    {
        return produtoRepository.save(produto);
    }

}
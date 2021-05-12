package com.spring.spring.service;

import com.spring.spring.entity.Produto;
import com.spring.spring.repository.ProdutoRepository;
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

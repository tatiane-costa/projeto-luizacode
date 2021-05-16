package com.projeto.luizaLabs.repository;

import com.projeto.luizaLabs.entity.Cliente;
import com.projeto.luizaLabs.entity.Produto;
import com.projeto.luizaLabs.entity.WishList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishListRepository extends JpaRepository<WishList, Long> {

    WishList findById(long id);
    //List<WishList> listaProdutos(Produto produto);

    //WishList buscarClienteWishlist(Cliente cliente);
    //WishList buscarProdutoWishlist(Produto produto);
}

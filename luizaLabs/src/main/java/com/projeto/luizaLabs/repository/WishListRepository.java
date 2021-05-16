package com.projeto.luizaLabs.repository;

import com.projeto.luizaLabs.entity.Cliente;
import com.projeto.luizaLabs.entity.Produto;
import com.projeto.luizaLabs.entity.WishList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishListRepository extends JpaRepository<WishList, Long> {

    WishList findById(long id);

    /*@Query("select p.nome, p.descricao, p.preco, w.id_cliente, p.id as id_produto from produto p " +
    "inner join whishlist_produto wp on wp.produto_id = p.id " +
    "inner join whishlist w on w.id = wp.WISH_LIST_ID " +
    "where w.id_cliente = ?1 and wp.produto_id = ?1 ")
    Produto buscarProdutoWishList(long idCliente, long idProduto);*/


    //List<WishList> listaProdutos(WishList produto);
    //o property listaProdutos found for type WishList!
    //WishList adicionarProdutosNaWishList(WishList produto);
    //WishList buscarProdutosNaWishList(WishList cliente);
}

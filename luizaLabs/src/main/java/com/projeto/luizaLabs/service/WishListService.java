package com.projeto.luizaLabs.service;

import com.projeto.luizaLabs.entity.Cliente;
import com.projeto.luizaLabs.entity.Produto;
import com.projeto.luizaLabs.entity.WishList;
import com.projeto.luizaLabs.repository.WishListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService {

    private WishListRepository wishListRepository;

    //Adicionar a lista no banco
    public WishList adicionarProdutosNaWishList(WishList wishlist){
        return wishListRepository.save(wishlist);
    }
    //Buscar produtos na WishList
    public WishList buscarProdutosNaWishList(long id) {
        return wishListRepository.findById(id);
    }

    //Visualizar produtos na wishlist
//    public List<WishList> visualizarProdutosNaWishList(Produto produto) {
//        return wishListRepository.findAll();
//    }


//    //Buscar cliente no banco
//    public WishList buscarClienteWishlist(long id_cliente){
//        return  wishListRepository.findById(id_cliente);
//    }



//    public WishList atualizarProdutoWishList(Object object) {
//        return wishListRepository.save((WishList) object);
//    }

}

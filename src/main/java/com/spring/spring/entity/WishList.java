package com.spring.spring.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "whishlist")
public class WishList  implements Serializable {

    private static final long SerialVersionUID = 1L;


    @OneToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @OneToMany
    @JoinColumn(name = "idProduto")
    private Produto produto;

    //Getter and Setter


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}

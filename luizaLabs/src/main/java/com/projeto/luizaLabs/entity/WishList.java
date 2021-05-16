package com.projeto.luizaLabs.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "whishlist")
public class WishList  implements Serializable {

    private static final long SerialVersionUID = 1L;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @OneToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @OneToMany
    @Column(name = "idProduto")
    private List<Produto> produto;

    @NotNull
    @Column(name = "total")
    private BigDecimal total;

    //Getter and Setter

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
}

package com.zitrus.backendproject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String descricao;
    private Double valorFornecedor;
    private int quantidadeEstoque;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Produto() {

    }

    public Produto(Long codigo, String descricao, Double valorFornecedor, int quantidadeEstoque, Categoria categoria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorFornecedor = valorFornecedor;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}

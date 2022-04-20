package com.zitrus.backendproject.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
public class Produto implements Serializable {

    private Long codigo;

    @EqualsAndHashCode.Exclude
    private String descricao;

    @EqualsAndHashCode.Exclude
    private Double valorFornecedor;

    @EqualsAndHashCode.Exclude
    private int quantidadeEstoque;

    @EqualsAndHashCode.Exclude
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
}

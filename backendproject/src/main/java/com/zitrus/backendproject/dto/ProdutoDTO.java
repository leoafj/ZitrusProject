package com.zitrus.backendproject.dto;

import com.zitrus.backendproject.model.Categoria;
import com.zitrus.backendproject.model.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {

    private Long codigo;
    private String descricao;
    private Double valorFornecedor;
    private int quantidadeEstoque;


    public ProdutoDTO(Produto produto) {
        this.codigo = produto.getCodigo();
        this.descricao = produto.getDescricao();
        this.valorFornecedor = produto.getValorFornecedor();
        this.quantidadeEstoque = produto.getQuantidadeEstoque();
    }
}

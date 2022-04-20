package com.zitrus.backendproject.model;

import com.zitrus.backendproject.dto.ProdutoDTO;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
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

    public Produto(ProdutoDTO produtoDTO) {
        this.codigo = produtoDTO.getCodigo();
        this.descricao = produtoDTO.getDescricao();
        this.valorFornecedor = produtoDTO.getValorFornecedor();
        this.quantidadeEstoque = produtoDTO.getQuantidadeEstoque();
    }
}

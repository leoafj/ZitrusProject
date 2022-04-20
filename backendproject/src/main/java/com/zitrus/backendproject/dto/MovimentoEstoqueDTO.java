package com.zitrus.backendproject.dto;

import com.zitrus.backendproject.model.MovimentoEstoque;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovimentoEstoqueDTO {

    private Long codigo;
    private String tipoMovimentacao;
    private Double valorVenda;
    private Date dataVenda;
    private int quantidadeMovimentada;

    public MovimentoEstoqueDTO(MovimentoEstoque movimentoEstoque) {
        this.codigo = movimentoEstoque.getCodigo();
        this.tipoMovimentacao = movimentoEstoque.getTipoMovimentacao();
        this.valorVenda = movimentoEstoque.getValorVenda();
        this.dataVenda = movimentoEstoque.getDataVenda();
        this.quantidadeMovimentada = movimentoEstoque.getQuantidadeMovimentada();
    }
}

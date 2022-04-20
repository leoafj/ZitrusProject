package com.zitrus.backendproject.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
public class MovimentoEstoque {

    private String tipoMovimentacao;
    private Double valorVenda;
    private Date dataVenda;
    private int quantidadeMovimentada;
}

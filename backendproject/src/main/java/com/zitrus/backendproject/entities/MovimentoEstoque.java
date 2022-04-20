package com.zitrus.backendproject.entities;

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

package com.zitrus.backendproject.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SaidaProdutoDTO {

    @NotBlank
    private int quantidadeSaida;

    @NotBlank
    private double valorlUnitarioProduto;

    @NotBlank
    private double valorTotalVenda;

    @NotBlank
    private String tipoMovimentacao;

}

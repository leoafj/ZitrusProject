package com.zitrus.backendproject.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zitrus.backendproject.model.Produto;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
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

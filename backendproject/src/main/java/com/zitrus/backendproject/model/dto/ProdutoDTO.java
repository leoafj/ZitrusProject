package com.zitrus.backendproject.model.dto;

import lombok.Data;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class ProdutoDTO {

    @NotBlank
    private String tipoProduto;

    @NotBlank
    private String descricao;

    @NotBlank
    @DecimalMin(value = "00.01")
    private Double valorCusto;

    @NotBlank
    @Min(value = 1)
    private int quantidadeEstoque;

}

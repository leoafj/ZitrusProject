package com.zitrus.backendproject.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "table_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @NotBlank(message = "Campo não informado")
    private String descricao;

    @NotBlank(message = "Campo não informado")
    private String tipoProduto;

    @DecimalMin(value = "00.01", message = "Valor de custo deve ser maior que 0")
    private Double valorCusto;

    @Min(value = 1, message = "A quantidade de estoque deve ser maior que 0")
    private int quantidadeEstoque;



}

package com.zitrus.backendproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "table_saidaproduto")
public class SaidaProduto{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Min(value = 1, message = "A quantidade de saida deve ser maior que 0")
    private int quantidadeSaida;

    @DecimalMin(value = "00.01", message = "Valor de custo deve ser maior que 0")
    private double valorlUnitarioProduto;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "idProduto", referencedColumnName = "id")
    private Produto produto;

    @JsonIgnore
    private double valorTotalVenda;

    @JsonIgnore
    @Temporal(TemporalType.DATE)
    private Date dataMovimentacao;

    @JsonIgnore
    private String tipoMovimentacao;
}

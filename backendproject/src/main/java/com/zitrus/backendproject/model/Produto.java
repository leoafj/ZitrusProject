package com.zitrus.backendproject.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "table_produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String tipoProduto;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private Double valorCusto;

    @Column(nullable = false, length = 3)
    private int quantidadeEstoque;

    @Column(nullable = false)
    private LocalDateTime dataRegistro;


}

package com.zitrus.backendproject.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class MovimentoEstoque implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column
    private String tipoMovimentacao;

    @Column
    private Double valorVenda;

    @Column
    private Date dataVenda;

    @Column
    private int quantidadeMovimentada;
}

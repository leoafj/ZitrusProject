package com.zitrus.backendproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tabela_entradaproduto")
public class EntradaProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Min(value = 1, message = "A quantidade de saida deve ser maior que 0")
    private int quantidadeEntrada;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "idProduto", referencedColumnName = "id")
    private Produto produto;

    @JsonIgnore
    @Temporal(TemporalType.DATE)
    private Date dataMovimentacao;

    @JsonIgnore
    private String tipoMovimentacao;
}

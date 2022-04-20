package com.zitrus.backendproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zitrus.backendproject.dto.CategoriaDTO;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String tipoCategoria;

    @JsonIgnore
    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos = new ArrayList<>();

    public Categoria(CategoriaDTO categoriaDTO) {
        this.codigo = categoriaDTO.getCodigo();
        this.tipoCategoria = categoriaDTO.getTipoCategoria();
    }
}

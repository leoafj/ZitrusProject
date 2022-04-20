package com.zitrus.backendproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String tipoCategoria;

    @JsonIgnore
    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos = new ArrayList<>();

    public Categoria() {

    }

    public Categoria(Long codigo, String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
        this.codigo = codigo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria)) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(codigo, categoria.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}

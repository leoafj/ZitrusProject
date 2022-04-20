package com.zitrus.backendproject.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
public class Categoria implements Serializable {

    private long codigo;

    @EqualsAndHashCode.Exclude
    private String tipoCategoria;


    private List<Produto> produtos = new ArrayList<>();

    public Categoria(long codigo, String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }
}

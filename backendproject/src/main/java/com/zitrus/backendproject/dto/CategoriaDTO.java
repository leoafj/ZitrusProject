package com.zitrus.backendproject.dto;

import com.zitrus.backendproject.model.Categoria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDTO {

    private Long codigo;
    private String tipoCategoria;


    public CategoriaDTO(Categoria categoria) {
        this.codigo = categoria.getCodigo();
        this.tipoCategoria = categoria.getTipoCategoria();
    }
}

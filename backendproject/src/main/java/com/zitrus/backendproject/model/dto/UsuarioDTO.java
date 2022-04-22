package com.zitrus.backendproject.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UsuarioDTO {

    @NotBlank
    private String nome;
}

package com.zitrus.backendproject.controller;

import com.zitrus.backendproject.model.EntradaProduto;
import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.service.EntradaProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;
import java.util.UUID;

public class EntradaProdutoController {

    @Autowired
    EntradaProdutoService entradaProdutoServiceService;

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Produto entradaProduto(@PathVariable UUID id, @RequestBody @Valid EntradaProduto entradaProduto){
        return entradaProdutoServiceService.entradaProduto(id, entradaProduto);
    }
}

package com.zitrus.backendproject.controller;

import com.zitrus.backendproject.model.EntradaProduto;
import com.zitrus.backendproject.service.EntradaProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/entradaproduto")
public class EntradaProdutoController {

    @Autowired
    EntradaProdutoService entradaProdutoService;

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String entradaProduto(@PathVariable UUID id, @RequestBody @Valid EntradaProduto entradaProduto){
        return entradaProdutoService.entradaProduto(id, entradaProduto);
    }
}

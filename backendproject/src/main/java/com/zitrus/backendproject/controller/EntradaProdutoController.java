package com.zitrus.backendproject.controller;

import com.zitrus.backendproject.model.EntradaProduto;
import com.zitrus.backendproject.service.EntradaProdutoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@Tag(name = "Entrada Produto Endpoint")
@RestController
@RequestMapping("/api/saidaproduto/v1")
public class EntradaProdutoController {

    @Autowired
    EntradaProdutoService entradaProdutoService;

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String entradaProduto(@PathVariable UUID id, @RequestBody @Valid EntradaProduto entradaProduto){
        return entradaProdutoService.entradaProduto(id, entradaProduto);
    }
}

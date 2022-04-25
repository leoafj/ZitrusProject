package com.zitrus.backendproject.controller;

import com.zitrus.backendproject.service.MovimentoProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Tag(name = "Movimento de Produtos Endpoint")
@RestController
@RequestMapping("/api/movimentoproduto/v1")
public class MovimentoProdutoController {

    @Autowired
    MovimentoProdutoService movimentoProdutoService;

    @Operation(summary = "Pegar por tipo de produto")
    @GetMapping("/{tipoProduto}")
    public String movimentoTipoProduto(@PathVariable String tipoProduto){
        return movimentoProdutoService.movimentoTipoProduto(tipoProduto);
    }

    @Operation(summary = "Lucro por ID")
    @GetMapping("/lucro/{id}")
    public String quantidadeSaidaLucro(@PathVariable UUID id){
        return movimentoProdutoService.quantidadeSaidaLucro(id);
    }
}

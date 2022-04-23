package com.zitrus.backendproject.controller;

import com.zitrus.backendproject.service.MovimentoProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/movimentoproduto")
public class MovimentoProdutoController {

    @Autowired
    MovimentoProdutoService movimentoProdutoService;

    @GetMapping("/{tipoProduto}")
    public String movimentoTipoProduto(@PathVariable String tipoProduto){
        return movimentoProdutoService.movimentoTipoProduto(tipoProduto);
    }

    @GetMapping("/lucro/{id}")
    public String quantidadeSaidaLucro(@PathVariable UUID id){
        return movimentoProdutoService.quantidadeSaidaLucro(id);
    }
}

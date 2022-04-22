package com.zitrus.backendproject.controller;

import com.zitrus.backendproject.service.MovimentoProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

public class MovimentoProdutoController {

    @Autowired
    MovimentoProdutoService movimentoProdutoService;

    @GetMapping("/{tipoProduto}")
    public ResponseEntity<String> movimentoTipoProduto(@PathVariable String tipoProduto){
        return movimentoProdutoService.movimentoTipoProduto(tipoProduto);
    }

    @GetMapping("/lucro/{id}")
    public ResponseEntity<String> quantidadetSaidaLucro(@PathVariable UUID id){
        return movimentoProdutoService.quantidadeSaidaLucro(id);
    }
}

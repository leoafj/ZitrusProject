package com.zitrus.backendproject.controller;

import com.zitrus.backendproject.service.MovimentoProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/movimentoproduto")
=======
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

>>>>>>> 754d460013f1c3ee2670de8959dbfb8d272bdcd6
public class MovimentoProdutoController {

    @Autowired
    MovimentoProdutoService movimentoProdutoService;

    @GetMapping("/{tipoProduto}")
<<<<<<< HEAD
    public String movimentoTipoProduto(@PathVariable String tipoProduto){
=======
    public ResponseEntity<String> movimentoTipoProduto(@PathVariable String tipoProduto){
>>>>>>> 754d460013f1c3ee2670de8959dbfb8d272bdcd6
        return movimentoProdutoService.movimentoTipoProduto(tipoProduto);
    }

    @GetMapping("/lucro/{id}")
<<<<<<< HEAD
    public String quantidadeSaidaLucro(@PathVariable UUID id){
=======
    public ResponseEntity<String> quantidadetSaidaLucro(@PathVariable UUID id){
>>>>>>> 754d460013f1c3ee2670de8959dbfb8d272bdcd6
        return movimentoProdutoService.quantidadeSaidaLucro(id);
    }
}

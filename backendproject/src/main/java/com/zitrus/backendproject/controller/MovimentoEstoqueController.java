package com.zitrus.backendproject.controller;

import com.zitrus.backendproject.dto.MovimentoEstoqueDTO;
import com.zitrus.backendproject.model.MovimentoEstoque;
import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.repository.MovimentoEstoqueRepository;
import com.zitrus.backendproject.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/movimento")
public class MovimentoEstoqueController {

    @Autowired
    private MovimentoEstoqueRepository movimentoEstoqueRepository;

    @GetMapping
    public ResponseEntity<List<MovimentoEstoque>> findAll() {
        List<MovimentoEstoque> list = movimentoEstoqueRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<MovimentoEstoque> findById(@PathVariable Long id) {
        MovimentoEstoque prod = movimentoEstoqueRepository.findById(id).get();
        return ResponseEntity.ok().body(prod);
    }
}

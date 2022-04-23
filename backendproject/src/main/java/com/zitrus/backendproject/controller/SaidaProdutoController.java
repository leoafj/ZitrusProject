package com.zitrus.backendproject.controller;

import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.model.SaidaProduto;
import com.zitrus.backendproject.service.ProdutoService;
import com.zitrus.backendproject.service.SaidaProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/saidaproduto")
public class SaidaProdutoController {

    @Autowired
    private SaidaProdutoService saidaProdutoService;

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> saidaProduto(@PathVariable UUID id, @RequestBody @Valid SaidaProduto saidaProduto){

        return ResponseEntity.ok(saidaProdutoService.saidaProduto(id,saidaProduto));

    }


}

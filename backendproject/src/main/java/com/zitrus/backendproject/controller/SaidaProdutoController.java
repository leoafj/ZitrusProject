package com.zitrus.backendproject.controller;

import com.zitrus.backendproject.model.SaidaProduto;
import com.zitrus.backendproject.model.dto.ProdutoDTO;
import com.zitrus.backendproject.model.dto.SaidaProdutoDTO;
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



    @PutMapping("/{idProduto}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> saidaProduto(@PathVariable UUID id,@RequestBody @Valid SaidaProduto saidaProduto){
        return saidaProdutoService.saidaProduto(id, saidaProduto);
//        return ResponseEntity.status(HttpStatus.OK).body(saidaProdutoService.saidaProduto(id, saidaProduto));
    }
}

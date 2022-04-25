package com.zitrus.backendproject.controller;

import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.service.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@Tag(name = "Produtos Endpoint")
@RestController
@RequestMapping(value = "/api/produto/v1")
public class ProdutoController {


    @Autowired
    private ProdutoService produtoService;

    @Operation(summary = "Salvar")
    @PostMapping
    @ResponseStatus
    public ResponseEntity<Object> save(@RequestBody Produto produto){

        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.save(produto));
    }



    @Operation(summary = "Procurar todos")
    @GetMapping
    public ResponseEntity<Object> findAll(@PageableDefault(page = 0, size = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){

        return ResponseEntity.status(HttpStatus.OK).body(produtoService.findAll(pageable));
    }

    @Operation(summary = "Procurar por ID")
    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable(value = "id") UUID id) {
        Optional<Produto> produtoOptional = produtoService.findById(id);
        if (!produtoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
        }

        return ResponseEntity.status(HttpStatus.OK).body(produtoOptional.get());
    }

    @Operation(summary = "Deletar por ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable(value = "id") UUID id){
        Optional<Produto> produtoOptional = produtoService.findById(id);
        if (!produtoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
        }
        produtoService.delete(produtoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Produto deletado com sucesso.");
    }

    @Operation(summary = "Editar por ID")
    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable(value = "id") UUID id, @RequestBody @Valid Produto produto){
        Optional<Produto> produtoOptional = produtoService.findById(id);
        if (!produtoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
        }

        produto.setId(produtoOptional.get().getId());

        return ResponseEntity.status(HttpStatus.OK).body(produtoService.save(produto));
    }

}

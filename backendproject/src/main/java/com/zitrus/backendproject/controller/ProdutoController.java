package com.zitrus.backendproject.controller;

import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.model.dto.ProdutoDTO;
import com.zitrus.backendproject.service.ProdutoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {


    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    @ResponseStatus
    public ResponseEntity<Object> save(@RequestBody ProdutoDTO produtoDTO){
        var produto = new Produto();
        BeanUtils.copyProperties(produtoDTO, produto);
        produto.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.save(produto));
    }

    @GetMapping
    public ResponseEntity<Page<Produto>> findAll(@PageableDefault(page = 0, size = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable(value = "id") UUID id) {
        Optional<Produto> produtoOptional = produtoService.findById(id);
        if (!produtoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(produtoOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable(value = "id") UUID id){
        Optional<Produto> produtoOptional = produtoService.findById(id);
        if (!produtoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
        }
        produtoService.delete(produtoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Produto deletado com sucesso.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable(value = "id") UUID id, @RequestBody @Valid ProdutoDTO produtoDTO){
        Optional<Produto> produtoOptional = produtoService.findById(id);
        if (!produtoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
        }
        var produto = new Produto();
        BeanUtils.copyProperties(produtoDTO, produto);
        produto.setId(produtoOptional.get().getId());
        produto.setDataRegistro(produtoOptional.get().getDataRegistro());
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.save(produto));
    }

}

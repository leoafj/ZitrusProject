package com.zitrus.backendproject.controller;

import com.zitrus.backendproject.model.EntradaProduto;
<<<<<<< HEAD
import com.zitrus.backendproject.service.EntradaProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
=======
import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.service.EntradaProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
>>>>>>> 754d460013f1c3ee2670de8959dbfb8d272bdcd6

import javax.validation.Valid;
import java.util.UUID;

<<<<<<< HEAD
@RestController
@RequestMapping("/entradaproduto")
public class EntradaProdutoController {

    @Autowired
    EntradaProdutoService entradaProdutoService;

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String entradaProduto(@PathVariable UUID id, @RequestBody @Valid EntradaProduto entradaProduto){
        return entradaProdutoService.entradaProduto(id, entradaProduto);
=======
public class EntradaProdutoController {

    @Autowired
    EntradaProdutoService entradaProdutoServiceService;

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Produto entradaProduto(@PathVariable UUID id, @RequestBody @Valid EntradaProduto entradaProduto){
        return entradaProdutoServiceService.entradaProduto(id, entradaProduto);
>>>>>>> 754d460013f1c3ee2670de8959dbfb8d272bdcd6
    }
}

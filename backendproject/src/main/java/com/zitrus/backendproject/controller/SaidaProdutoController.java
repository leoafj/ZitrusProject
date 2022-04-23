package com.zitrus.backendproject.controller;

<<<<<<< HEAD
import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.model.SaidaProduto;
import com.zitrus.backendproject.service.ProdutoService;
=======
import com.zitrus.backendproject.model.SaidaProduto;
import com.zitrus.backendproject.model.dto.ProdutoDTO;
import com.zitrus.backendproject.model.dto.SaidaProdutoDTO;
>>>>>>> 754d460013f1c3ee2670de8959dbfb8d272bdcd6
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
<<<<<<< HEAD

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> saidaProduto(@PathVariable UUID id, @RequestBody @Valid SaidaProduto saidaProduto){

        return ResponseEntity.ok(saidaProdutoService.saidaProduto(id,saidaProduto));

    }
=======
>>>>>>> 754d460013f1c3ee2670de8959dbfb8d272bdcd6



    @PutMapping("/{idProduto}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> saidaProduto(@PathVariable UUID id,@RequestBody @Valid SaidaProduto saidaProduto){
        return saidaProdutoService.saidaProduto(id, saidaProduto);
//        return ResponseEntity.status(HttpStatus.OK).body(saidaProdutoService.saidaProduto(id, saidaProduto));
    }
}

package com.zitrus.backendproject.controller;

import com.zitrus.backendproject.repository.ProdutoRepository;
import com.zitrus.backendproject.repository.SaidaProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saidaproduto")
public class SaidaProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private SaidaProdutoRepository saidaProdutoRepository;

}

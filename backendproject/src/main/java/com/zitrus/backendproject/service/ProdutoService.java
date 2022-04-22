package com.zitrus.backendproject.service;

import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.model.dto.ProdutoDTO;
import com.zitrus.backendproject.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public Page<Produto> findAll(Pageable pageable) {
        return produtoRepository.findAll(pageable);
    }


    @Transactional
    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }

    public Optional<Produto> findById(UUID id) {
        return produtoRepository.findById(id);
    }

    @Transactional
    public void delete(Produto produto) {
        produtoRepository.delete(produto);
    }
}

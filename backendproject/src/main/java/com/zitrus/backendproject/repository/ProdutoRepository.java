package com.zitrus.backendproject.repository;

import com.zitrus.backendproject.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID> {


    List<Produto> findProdutosPorTipoProduto(String tipoProduto);

    List<Produto> ProcurarProdutosPorTipoProduto(String tipoProduto);
}

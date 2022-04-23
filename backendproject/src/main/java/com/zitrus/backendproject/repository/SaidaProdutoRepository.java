package com.zitrus.backendproject.repository;

import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.model.SaidaProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SaidaProdutoRepository extends JpaRepository<SaidaProduto, UUID> {

    List<SaidaProduto> findSaidaProdutosByProduto_TipoProduto(String tipoProduto);

    List<SaidaProduto> findSaidaProdutosByProduto(Produto produto);


}

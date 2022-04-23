package com.zitrus.backendproject.repository;

import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.model.SaidaProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SaidaProdutoRepository extends JpaRepository<SaidaProduto, UUID> {

<<<<<<< HEAD
    List<SaidaProduto> findSaidaProdutosByProduto_TipoProduto(String tipoProduto);

    List<SaidaProduto> findSaidaProdutosByProduto(Produto produto);


=======
    List<SaidaProduto> ProcurarSaidaProdutosPorProduto(Produto produto);

    List<SaidaProduto> ProcurarSaidaProdutosPorProduto_TipoProduto(String tipoProduto);
>>>>>>> 754d460013f1c3ee2670de8959dbfb8d272bdcd6
}

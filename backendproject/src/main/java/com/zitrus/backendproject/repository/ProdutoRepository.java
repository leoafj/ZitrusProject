package com.zitrus.backendproject.repository;

import com.zitrus.backendproject.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID> {


<<<<<<< HEAD
    List<Produto> findProdutosByTipoProduto(String tipoProduto);


=======
    List<Produto> findProdutosPorTipoProduto(String tipoProduto);

    List<Produto> ProcurarProdutosPorTipoProduto(String tipoProduto);
>>>>>>> 754d460013f1c3ee2670de8959dbfb8d272bdcd6
}

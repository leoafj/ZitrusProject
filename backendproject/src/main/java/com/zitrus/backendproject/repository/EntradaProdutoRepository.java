package com.zitrus.backendproject.repository;

import com.zitrus.backendproject.model.EntradaProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EntradaProdutoRepository extends JpaRepository<EntradaProduto, UUID> {
}

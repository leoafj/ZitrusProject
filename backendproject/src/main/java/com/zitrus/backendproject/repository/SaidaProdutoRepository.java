package com.zitrus.backendproject.repository;

import com.zitrus.backendproject.model.SaidaProduto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SaidaProdutoRepository extends JpaRepository<SaidaProduto, UUID> {
}

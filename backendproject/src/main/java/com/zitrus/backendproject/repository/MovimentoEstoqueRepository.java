package com.zitrus.backendproject.repository;

import com.zitrus.backendproject.dto.MovimentoEstoqueDTO;
import com.zitrus.backendproject.model.MovimentoEstoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MovimentoEstoqueRepository extends JpaRepository<MovimentoEstoque, Long> {
}

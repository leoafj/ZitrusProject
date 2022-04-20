package com.zitrus.backendproject.repository;

import com.zitrus.backendproject.dto.CategoriaDTO;
import com.zitrus.backendproject.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}

package com.zitrus.backendproject;

import com.zitrus.backendproject.entities.Categoria;
import com.zitrus.backendproject.entities.Produto;
import com.zitrus.backendproject.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BackendprojectApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackendprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(1L, "Eletronicos");
		Categoria cat2 = new Categoria(2L, "Movel");
		Categoria cat3 = new Categoria(3L, "Eletrodomesticos");

		Produto prod1 = new Produto(1L, "TV", 1000.00, 10, cat1);
		Produto prod2 = new Produto(2L, "Armario", 400.00, 15, cat2);
		Produto prod3 = new Produto(3L, "Microondas", 200.00, 5, cat3);

		cat1.getProdutos().addAll(Arrays.asList(prod1));
		cat2.getProdutos().addAll(Arrays.asList(prod2));
		cat3.getProdutos().addAll(Arrays.asList(prod3));

		categoriaRepository.save(cat1);
		categoriaRepository.save(cat2);
		categoriaRepository.save(cat3);
	}
}

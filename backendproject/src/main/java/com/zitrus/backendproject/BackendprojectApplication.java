package com.zitrus.backendproject;

import com.zitrus.backendproject.model.Categoria;
import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.repository.CategoriaRepository;
import com.zitrus.backendproject.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BackendprojectApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackendprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Eletronicos");
		Categoria cat2 = new Categoria(null, "Movel");
		Categoria cat3 = new Categoria(null, "Eletrodomesticos");

		Produto prod1 = new Produto(null, "TV", 1000.00, 10, cat1);
		Produto prod2 = new Produto(null, "Armario", 400.00, 15, cat2);
		Produto prod3 = new Produto(null, "Microondas", 200.00, 5, cat3);

		cat1.getProdutos().addAll(Arrays.asList(prod1));
		cat2.getProdutos().addAll(Arrays.asList(prod2));
		cat3.getProdutos().addAll(Arrays.asList(prod3));

		categoriaRepository.save(cat1);
		categoriaRepository.save(cat2);
		categoriaRepository.save(cat3);

		produtoRepository.save(prod1);
		produtoRepository.save(prod2);
		produtoRepository.save(prod3);
	}
}

package com.zitrus.backendproject.service;

import com.zitrus.backendproject.model.EntradaProduto;
import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.repository.EntradaProdutoRepository;
import com.zitrus.backendproject.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class EntradaProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private EntradaProdutoRepository entradaProdutoRepository;

<<<<<<< HEAD
    public String entradaProduto(UUID id, EntradaProduto entradaProduto) {

=======
    public Produto entradaProduto(UUID id, EntradaProduto entradaProduto) {
>>>>>>> 754d460013f1c3ee2670de8959dbfb8d272bdcd6
        Produto produto = produtoRepository.findById(id).get();

        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() + entradaProduto.getQuantidadeEntrada());

        entradaProduto.setProduto(produto);
        entradaProduto.setDataMovimentacao(new Date());
        entradaProduto.setTipoMovimentacao("ENTRADA");

        entradaProdutoRepository.save(entradaProduto);
<<<<<<< HEAD
        produtoRepository.save(produto);

        return "Entrada Realizada com sucesso!";
=======
        return produtoRepository.save(produto);
>>>>>>> 754d460013f1c3ee2670de8959dbfb8d272bdcd6
    }

}
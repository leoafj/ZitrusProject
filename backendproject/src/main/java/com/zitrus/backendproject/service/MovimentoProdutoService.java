package com.zitrus.backendproject.service;

import com.google.gson.Gson;
import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.model.SaidaProduto;
import com.zitrus.backendproject.repository.ProdutoRepository;
import com.zitrus.backendproject.repository.SaidaProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@Service
public class MovimentoProdutoService {


    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private SaidaProdutoRepository saidaProdutoRepository;

    public ResponseEntity<String> movimentoTipoProduto(String tipoProduto) {
        List<Produto> produtos = produtoRepository.ProcurarProdutosPorTipoProduto(tipoProduto);
        List<SaidaProduto> saidaProdutos = saidaProdutoRepository.ProcurarSaidaProdutosPorProduto_TipoProduto(tipoProduto);

        if (produtos.isEmpty()) {
            return ResponseEntity.ok("Tipo de produto sem produto cadastrado.");
        }

        int quantidadeDisponivel = produtos.stream().map(Produto::getQuantidadeEstoque).reduce(Integer::sum).get();

        int quantidadeSaida = 0;
        if (!saidaProdutos.isEmpty()) {
            quantidadeSaida = saidaProdutos.stream().map(SaidaProduto::getQuantidadeSaida).reduce(Integer::sum).get();
        }

        return ResponseEntity.ok("Tipo do Produto (" + tipoProduto + ")\n"
                + "Quantidade disponível:(" + quantidadeDisponivel + ")\n"
                + "Quantidade de saída:(" + quantidadeSaida + ")\n"
                + new Gson().toJson(produtos));
    }

    public ResponseEntity<String> quantidadeSaidaLucro(UUID id) {
        Produto produto = produtoRepository.findById(id).get();
        List<SaidaProduto> saidaProdutos = saidaProdutoRepository.ProcurarSaidaProdutosPorProduto(produto);

        if (saidaProdutos.isEmpty()) {
            return ResponseEntity.ok("Produto sem saída registrada.");
        }

        Integer quantidadeTotalSaida = saidaProdutos.stream().map(SaidaProduto::getQuantidadeSaida).reduce(Integer::sum).get();
        Double valorTotalVenda = saidaProdutos.stream().map(SaidaProduto::getValorTotalVenda).reduce(Double::sum).get();
        Double valorTotalLucro = valorTotalVenda - (quantidadeTotalSaida * produto.getValorCusto());

        return ResponseEntity.ok("Produto(" + produto.getId() + " - " + produto.getDescricao() + ")\n"
                + "Quantidade total de saída:(" + quantidadeTotalSaida + ")\n"
                + "Lucro total:(" + valorTotalLucro + ")");
    }

}

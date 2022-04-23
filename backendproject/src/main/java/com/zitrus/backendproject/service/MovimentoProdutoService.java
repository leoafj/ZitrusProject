package com.zitrus.backendproject.service;

import com.google.gson.Gson;
import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.model.SaidaProduto;
import com.zitrus.backendproject.repository.ProdutoRepository;
import com.zitrus.backendproject.repository.SaidaProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MovimentoProdutoService {


    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private SaidaProdutoRepository saidaProdutoRepository;

    public String movimentoTipoProduto(String tipoProduto) {
        List<Produto> produtos = produtoRepository.findProdutosByTipoProduto(tipoProduto);
        List<SaidaProduto> saidaProdutos = saidaProdutoRepository.findSaidaProdutosByProduto_TipoProduto(tipoProduto);

        if (produtos.isEmpty()) {
            return "Tipo de produto sem produto cadastrado.";
        }

        int quantidadeDisponivel = produtos.stream().map(Produto::getQuantidadeEstoque).reduce(Integer::sum).get();

        int quantidadeSaida = 0;

        if (!saidaProdutos.isEmpty()) {
            quantidadeSaida = saidaProdutos.stream().map(SaidaProduto::getQuantidadeSaida).reduce(Integer::sum).get();
        }

        return ("Tipo do Produto (" + tipoProduto + ")\n"
                + "Quantidade disponível:(" + quantidadeDisponivel + ")\n"
                + "Quantidade de saída:(" + quantidadeSaida + ")\n"
                + new Gson().toJson(produtos));
    }

    public String quantidadeSaidaLucro(UUID id) {
        Produto produto = produtoRepository.findById(id).get();
        List<SaidaProduto> saidaProdutos = saidaProdutoRepository.findSaidaProdutosByProduto(produto);

        if (saidaProdutos.isEmpty()) {
            return "Produto sem saída registrada.";
        }

        Integer quantidadeTotalSaida = saidaProdutos.stream().map(SaidaProduto::getQuantidadeSaida).reduce(Integer::sum).get();
        Double valorTotalVenda = saidaProdutos.stream().map(SaidaProduto::getValorTotalVenda).reduce(Double::sum).get();
        Double valorTotalLucro = valorTotalVenda - (quantidadeTotalSaida * produto.getValorCusto());

        return ("Produto(" + produto.getId() + " - " + produto.getDescricao() + ")\n"
                + "Quantidade total de saída:(" + quantidadeTotalSaida + ")\n"
                + "Lucro total:(" + valorTotalLucro + ")");
    }

}

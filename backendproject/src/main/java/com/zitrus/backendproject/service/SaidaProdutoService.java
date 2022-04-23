package com.zitrus.backendproject.service;

import com.zitrus.backendproject.model.Produto;
import com.zitrus.backendproject.model.SaidaProduto;
import com.zitrus.backendproject.repository.ProdutoRepository;
import com.zitrus.backendproject.repository.SaidaProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.http.ResponseEntity;
>>>>>>> 754d460013f1c3ee2670de8959dbfb8d272bdcd6
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class SaidaProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private SaidaProdutoRepository saidaProdutoRepository;

<<<<<<< HEAD

    public String saidaProduto(UUID id, SaidaProduto saidaProduto) {

        Produto produto = produtoRepository.findById(id).get();

        if (saidaProduto.getQuantidadeSaida() > produto.getQuantidadeEstoque()) {
            return "Quantidade do produto em estoque é menor que a quantidade solicitada para saida.";
        } else if (produto.getValorCusto() > saidaProduto.getValorlUnitarioProduto()) {
            return "O valor de venda deve ser maior que o de custo.";
        }
        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - saidaProduto.getQuantidadeSaida());

        saidaProduto.setValorTotalVenda(saidaProduto.getQuantidadeSaida() * saidaProduto.getValorlUnitarioProduto());
        saidaProduto.setDataMovimentacao(new Date());
        saidaProduto.setTipoMovimentacao("SAIDA");
        saidaProduto.setProduto(produto);

        saidaProdutoRepository.save(saidaProduto);
        produtoRepository.save(produto);

        return "Saída realizada com sucesso!";
    }
}
=======
    public ResponseEntity<String> saidaProduto(UUID id, SaidaProduto saidaProduto) {
        Produto produto = produtoRepository.findById(id).get();

        if (saidaProduto.getQuantidadeSaida() > produto.getQuantidadeEstoque()) {
            return ResponseEntity.ok("Quantidade do produto em estoque é menor que a quantidade solicitada para saida.");
        } else if (produto.getValorCusto() > saidaProduto.getValorlUnitarioProduto()) {
                return ResponseEntity.ok("O valor de venda deve ser maior que o de custo.");
            }

            produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - saidaProduto.getQuantidadeSaida());

            saidaProduto.setValorTotalVenda(saidaProduto.getQuantidadeSaida() * saidaProduto.getValorlUnitarioProduto());
            saidaProduto.setDataMovimentacao(new Date());
            saidaProduto.setTipoMovimentacao("SAIDA");
            saidaProduto.setProduto(produto);

            saidaProdutoRepository.save(saidaProduto);
            produtoRepository.save(produto);

            return ResponseEntity.ok("Produto: (" + produto.getDescricao() + "), " +
                    "quantidade de saida(" + saidaProduto.getQuantidadeSaida() + ") " +
                    "realizada com sucesso!!");
        }

}
>>>>>>> 754d460013f1c3ee2670de8959dbfb8d272bdcd6

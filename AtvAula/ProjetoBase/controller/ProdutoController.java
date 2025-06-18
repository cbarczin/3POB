package AtvAula.ProjetoBase.controller;

import AtvAula.ProjetoBase.model.Produto;
import AtvAula.ProjetoBase.exception.ProdutoNaoEncontradoException;
import AtvAula.ProjetoBase.exception.ProdutoJaExisteException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoController {
    private List<Produto> produtos;

    public ProdutoController() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) throws ProdutoJaExisteException {
        if (buscarProdutoPorID(produto.getId()).isPresent()) {
            throw new ProdutoJaExisteException("Produto com ID " + produto.getId());
        }
        produtos.add(produto);
    }

    public void alterarProduto(Produto produto) throws ProdutoNaoEncontradoException
}

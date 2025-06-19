/*// Exercício 3: Cadastro de Produto com Preço Mínimo
// Implemente uma classe Produto com os atributos nome e preco.
// Lance uma exceção personalizada (PrecoInvalidoException) se o preço for menor ou igual a zero.
// Trate a exceção no programa principal exibindo uma mensagem de erro. */

package fase06.ExercExcecoes.Exer3.dominio;

import fase06.ExercExcecoes.Exer3.exception.ValorInvalidoException;

public class Produto {
    public String nome;
    public double preco;

    public Produto(String nome, double preco) throws ValorInvalidoException {
        if (preco <= 0) {
            throw new ValorInvalidoException("Preço deve ser maior que zero");
        }

        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

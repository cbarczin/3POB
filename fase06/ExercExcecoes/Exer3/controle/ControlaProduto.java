/*// Exercício 3: Cadastro de Produto com Preço Mínimo
// Implemente uma classe Produto com os atributos nome e preco.
// Lance uma exceção personalizada (PrecoInvalidoException) se o preço for menor ou igual a zero.
// Trate a exceção no programa principal exibindo uma mensagem de erro. */

package fase06.ExercExcecoes.Exer3.controle;

import java.util.Scanner;
import fase06.ExercExcecoes.Exer3.dominio.Produto;
import fase06.ExercExcecoes.Exer3.exception.ValorInvalidoException;

public class ControlaProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Informe o nome do produto: ");
            String nome = entrada.nextLine();

            System.out.print("Informe o preco: ");
            double preco = entrada.nextDouble();

            new Produto(nome, preco);

            System.out.println("Produto cadastrado com sucesso: " + nome);

        } catch (ValorInvalidoException e) {
                System.out.println("Erro ao cadastrar produto: " + e.getMessage());
            
        } finally {
            entrada.close();
        }
    }
}

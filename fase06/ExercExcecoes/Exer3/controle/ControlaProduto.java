package fase06.ExercExcecoes.Exer3.controle;

import java.util.Scanner;
import fase06.ExercExcecoes.Exer3.dominio.Produto;

public class ControlaProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Informe o nome do produto: ");
            String nome = entrada.nextLine();

            System.out.println("Informe o preco: ");
            double preco = entrada.nextDouble();

            Produto produto = new Produto(null, preco);
        } catch {
            
        }
    }
}

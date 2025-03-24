package projeto01.controle;

import projeto01.dominio.Pessoa;
import java.util.Scanner;

public class ControlarPessoa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite o altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite o peso: ");
        double peso = entrada.nextDouble();

        entrada.nextLine();

        System.out.print("Digite o sexo: ");
        String sexo = entrada.nextLine();

        Pessoa pessoa = new Pessoa(nome,idade,altura,peso,sexo);

        System.out.println("-----------------------------------");
        System.out.println("Exibir dados da pessoa: ");
        pessoa.listarPessoas();
        entrada.close();
    }
}

package fase06.L6Exercicio02.controle;

import java.util.Scanner;
import fase06.L6Exercicio02.dominio.Funcionario;

public class GerenciadorDeFuncionario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== Cadastro de Funcionario ===");
        System.out.print("Informe o nome do funcionário: ");
        String nome = entrada.nextLine();

        System.out.print("Qual é o seu salário base?: ");
        double salarioBase = entrada.nextDouble();

        entrada.nextLine();

        System.out.print("Categoria (A, B ou C): ");
        String categoria = entrada.nextLine().toUpperCase();
        System.out.println("=============================");

        Funcionario funcionario = new Funcionario(nome, salarioBase, categoria);

        System.out.println("=== Informações do funcionario ===");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário base: " + funcionario.getSalarioBase());
        System.out.println("Salario final: " + funcionario.calcularSalarioFinal());
        entrada.close();
    }
}

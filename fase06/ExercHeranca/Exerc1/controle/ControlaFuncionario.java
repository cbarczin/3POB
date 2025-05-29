package fase06.ExercHeranca.Exerc1.controle;

import java.util.Scanner;
//import java.util.Locale;
//import fase06.ExercHeranca.Exerc1.dominio.Funcionario;
import fase06.ExercHeranca.Exerc1.dominio.Estagiario;
import fase06.ExercHeranca.Exerc1.dominio.Gerente;

public class ControlaFuncionario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        String nome;
        double salarioBase;

        do {
            System.out.println("-----------------");
            System.out.println("Qual é o cargo desse funcionário?: ");
            System.out.println("1. Gerente");
            System.out.println("2. Estagiário");
            System.out.println("0. Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("----------------");
                    System.out.println("Qual o nome do funcionário?: ");
                    nome = entrada.nextLine();

                    System.out.println("\nQual é o seu salário base?: ");
                    salarioBase = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.println("----------------");

                    Gerente gerente = new Gerente(nome, salarioBase, 0.2);
                    gerente.exibirDados();
                    break;

                case 2:
                    System.out.println("----------------");
                    System.out.println("Qual o nome do funcionário?: ");
                    nome = entrada.nextLine();

                    System.out.println("Qual é o seu salário base?: ");
                    salarioBase = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.println("----------------");

                    Estagiario estagiario = new Estagiario(nome, salarioBase, 0.05);
                    estagiario.exibirDados();
                    break;

                case 0:
                    System.out.println("Encerrando programa...");    
            
                default:
                    System.out.println("Opção digitada é inválida. Por favor, tente novamente!");
                    break;
            }
        } while (opcao != 0);
    entrada.close();
    }
}

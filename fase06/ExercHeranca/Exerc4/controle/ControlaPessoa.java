package fase06.ExercHeranca.Exerc4.controle;

import java.util.Scanner;
import fase06.ExercHeranca.Exerc4.dominio.Aluno;
import fase06.ExercHeranca.Exerc4.dominio.Professor;

public class ControlaPessoa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String opcao, nome, curso;
        int idade;
        double salario;

        
        System.out.println("---------------");
        System.out.print("É aluno ou professor?: ");
        opcao = entrada.nextLine();

        if(opcao.equalsIgnoreCase("ALUNO")) {
            System.out.print("Qual é o nome do aluno?: ");
            nome = entrada.nextLine();

            System.out.print("Qual é a idade do aluno?: ");
            idade = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Qual é o seu curso?: ");
            curso = entrada.nextLine();

            Aluno aluno = new Aluno(nome, idade, curso);
            aluno.exibirDados();
        } else {
            if(opcao.equalsIgnoreCase("PROFESSOR")) {
                System.out.print("Qual é o nome do professor?: ");
            nome = entrada.nextLine();

            System.out.print("Qual é a idade do professor?: ");
            idade = entrada.nextInt();

            System.out.print("Qual é o seu salário?: ");
            salario = entrada.nextDouble();

            Professor professor = new Professor(nome, idade, salario);
            professor.exibirDados();
            } else {
                System.out.println("Opção inválida. Por favor, rode o código novamente e digite uma opção válida!");
            }
        }
        entrada.close();
    }
}

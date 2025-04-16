package fase06.L6Exercicio04.controle;

import java.util.Scanner;

import fase06.L6Exercicio04.dominio.Aluno;

public class ControlaAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;

        System.out.print("Qual é o nome do aluno?: ");
        String nome = entrada.nextLine();

        System.out.print("Informe a nota de " + nome + " (0-10): ");
        nota = entrada.nextDouble();

        Aluno aluno = new Aluno(nome, nota);

        while (aluno.validarNota(nota) == 0) {
            System.out.println("\nPor favor, informe uma nota válida!");
            System.out.print("Informe a nota de " + nome + " (0-10): ");
        nota = entrada.nextDouble();
        }

        System.out.println("----------------------------------");
        System.out.println("A situação do aluno é: " + aluno.classificarAluno(nota));
        System.out.print("-----------------------------------");
    entrada.close();
    }
}

/*Escreva um programa que leia uma nota de 0 a 10 e exiba o conceito
correspondente, utilizando switch-case. */

package fase02.L2Exercicio05;

import java.util.Scanner;

public class NotasParaConceito {
    public static void main (String[] args) {
        Scanner entrada =  new Scanner(System.in);
        System.out.print("Digite a sua nota (1-10): ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 10:
            case 9:
            System.out.print("A nota do aluno foi: A");
            break;

            case 8:
            case 7:
            System.out.print("A nota do aluno foi: B");
            break;

            case 6:
            case 5:
            System.out.print("A nota do aluno foi: C");
            break;

            case 4:
            case 3:
            System.out.print("A nota do aluno foi: D");
            break;

            case 2:
            case 1:
            case 0:
            System.out.print("A nota do aluno foi: E");
            break;
        
            default:
            System.out.print("A nota inserida é inválida! Por favor, tente novamente!");
            break;
        }
        entrada.close();
    }
}

/*Escreva um programa que solicite a idade de uma pessoa e classifique-a em uma
das categorias abaixo, utilizando if-else:*/

package fase02.L2Exercicio02;

import java.util.Scanner;

public class ClassificacaoIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a sua idade: ");
        int idade = entrada.nextInt();

        if(idade < 18) {
            System.out.print("Você é MENOR DE IDADE");
        } else {
            if(idade <= 60) {
                System.out.print("Você é ADULTO");
            } else {
                if(idade > 60) {
                    System.out.print("Você é IDOSO");
                }
            }
        }
        entrada.close();
    }
}

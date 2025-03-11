/*Crie um programa que solicite um número inteiro ao usuário e determine se ele é
par ou ímpar, utilizando a estrutura if-else. */

package fase02.L2Exercicio01;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o número desejado: ");
        int numero = entrada.nextInt();

        if(numero%2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
        entrada.close();
    }
}
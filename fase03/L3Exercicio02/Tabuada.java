/*Escreva um programa que solicite um número ao usuário e exiba a tabuada
desse número de 1 a 10, utilizando um loop while.*/
package fase03.L3Exercicio02;

import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("A tabuada de qual número deseja exibir?: ");
        int numero = entrada.nextInt();

        for(int i=0;i<=10;i++) {
            int multiplicador = numero*i;
            System.out.println(numero + " X " + i + " = " + multiplicador);
        }
        entrada.close();
    }
}

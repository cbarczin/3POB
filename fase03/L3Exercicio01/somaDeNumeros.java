/*Crie um programa que solicite ao usuário um número N e utilize um loop for
para calcular a soma dos primeiros N números naturais. */
package fase03.L3Exercicio01;

import java.util.Scanner;

public class somaDeNumeros {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor de N: ");
        int N = entrada.nextInt();
        
        int soma = 0;

        for(int i=1;i<=N;i++) {
            soma+=i;
        }

        System.out.print("A soma desses números resultou em: " + soma);
        entrada.close();
    }
}

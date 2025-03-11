/*Crie um programa que solicite um número ao usuário e faça uma contagem
regressiva até 0, utilizando um loop do-while. */
package fase03.L3Exercicio03;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o número desejado para a contagem regressiva: ");
        int numero = entrada.nextInt();
        
        System.out.println("CONTAGEM: ");

        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 0);
        entrada.close();
    }
}

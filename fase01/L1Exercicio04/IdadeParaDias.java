/*5. Conversão de Idade para Dias
Desenvolva um programa que leia a idade de uma pessoa em anos e exiba a quantidade aproximada de dias que ela já viveu.

Considere um ano com 365 dias. */

package fase01.L1Exercicio04;

import java.util.Scanner;

public class IdadeParaDias {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        int conversao = idade*365;

        System.out.print("A conversão da idade: " + idade + " para dias é igual a: " + conversao + " dias");
        entrada.close();
    }
}
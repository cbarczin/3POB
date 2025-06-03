/*Exercício 1: Conversor de Temperatura
//Crie um programa que leia uma temperatura em Celsius informada pelo usuário e a converta para Fahrenheit.
// Trate a possibilidade de entrada inválida (valores não numéricos) usando try-catch.*/

package fase06.ExercExcecoes.Exer1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a temperatura em graus celsius: ");
        try {
            double tempC = entrada.nextDouble();
            double result = (tempC * 9/5) + 32;
            System.out.println("A conversao de " + tempC + " é igual a: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Valor digitado não é válido!");
        } finally {
            entrada.close();
        }
    }
}
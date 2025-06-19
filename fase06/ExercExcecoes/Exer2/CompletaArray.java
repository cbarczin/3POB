/* Exercício 2: Leitura de Vários Números
// Crie um programa que leia cinco números inteiros do usuário e armazene-os em um array.
// Caso o usuário digite algo que não seja inteiro, exiba uma mensagem de erro e repita a leitura até completar o array.*/

package fase06.ExercExcecoes.Exer2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class CompletaArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        while (numeros.size() < 5) {
            try {
                System.out.print("Insira um número no array: ");
                int numero = entrada.nextInt();
                numeros.add(numero);
            } catch (InputMismatchException e) {
            System.out.println("Valor digitado não é válido!");
            }
        }

        System.out.println("Array: ");

        for (int n : numeros) {
            System.out.print(n + " ");
        }
        entrada.close();
    }
}

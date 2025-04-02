package fase05.L5Exercicio05;
/*Crie um programa que solicite ao usuário inserir quantos números desejar em
um ArrayList<Integer>. Em seguida, ordene os números em ordem crescente e
exiba a lista ordenada. */

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class OrdenacaoNums {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    ArrayList<Integer> numeros = new ArrayList<>();

    int numero;
    do {
        System.out.println("Digite o número desejado! (Digite -1 para sair)");
        numero = entrada.nextInt();

        if(numero == -1) {
            break;
        }

        numeros.add(numero);
    } while (numero != -1);


    Collections.sort(numeros);

    System.out.println("Lista ordenada: " + numeros);
    entrada.close();
    }
}

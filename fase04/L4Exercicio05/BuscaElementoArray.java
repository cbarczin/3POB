/*Implemente um programa que solicite ao usuário 10 números inteiros e os
armazene em um array. Em seguida, o usuário deve digitar um número para buscar
no array. O programa deve informar se o número está presente e em qual posição.*/
package fase04.L4Exercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscaElementoArray {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i=0;i<10;i++) {
            System.out.print("Informe o " + (i+1) + "º valor desejado: ");
            int numero = entrada.nextInt();
            numeros.add(numero);
        }    

        System.out.print("Qual número será procurado?: ");
        int valor = entrada.nextInt();

        int achou = 0;
        int posicao = 0;
        
        for(int j=0;j<10;j++) {
            if(numeros.get(j) == valor) {
                achou++;
                posicao = j;
                break;
            }
        }

        if(achou == 1) {
            System.out.print("O número foi " + valor + " foi encontrado na posicao " + posicao);
        } else {
            System.out.print("O número não foi encontrado");
        }
        entrada.close();
    }
}

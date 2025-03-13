/*Escreva um programa que solicite ao usuário 6 números inteiros e os armazene
em um array. Em seguida, exiba os números na ordem inversa à de entrada.*/

package fase04.L4Exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class InversaoElementosArray {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> valores = new ArrayList<>();

        for(int i=0;i<6;i++) {
            System.out.print("Informe o " + (i+1) + "º valor desejado: ");
            int valor = entrada.nextInt();
            valores.add(valor);
        }
        
        System.out.println("Sequencia exibida de forma inversa: ");
        for(int j=5;j>=0;j--) {
            System.out.println(valores.get(j));
        }
        entrada.close();
    }
}

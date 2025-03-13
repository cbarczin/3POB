/*Crie um programa que solicite ao usuário 8 números inteiros e armazene-os em
um array. O programa deve contar e exibir a quantidade de números pares no
array. */
package fase04.L4Exercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class ContParesArray {
    public static void main (String[] args) {
      Scanner entrada = new Scanner(System.in);

      ArrayList<Integer> numeros = new ArrayList<>();

      int cont = 0;

      for(int i=0;i<8;i++) {
        System.out.print("Informe o " + (i+1) + "º valor desejado: ");
        int numero = entrada.nextInt();
        numeros.add(numero);

        if(numeros.get(i) % 2 == 0) {
            cont++;
        }
    }

    System.out.print("Foram encontrados " + cont + " números pares no array acima!");
    entrada.close();
    }
}

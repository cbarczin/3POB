/*Crie um programa que solicite ao usuário 5 números inteiros e armazene-os em
um array. Após isso, o programa deve exibir o maior e o menor número do array.*/

package fase04.L4Exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class MenorMaiorValorArray {
    public static void main (String[] args) {
      Scanner entrada = new Scanner(System.in);

      ArrayList<Integer> valores = new ArrayList<>();

      for(int i=0;i<5;i++) {
        System.out.print("Informe o " + (i+1) + "º valor: ");
        int valor = entrada.nextInt();
        valores.add(valor);
      }
      
      int maior = Integer.MIN_VALUE;
      int menor = Integer.MAX_VALUE;

      for(int i=0;i<5;i++) {
          if(valores.get(i) > maior) {
            maior = valores.get(i);
          } else {
            if(valores.get(i) < menor) {
                menor = valores.get(i);
            }
          }
      }

      System.out.println("O maior valor: " + maior + " e o menor valor é o: " + menor);
      entrada.close();
    }
}


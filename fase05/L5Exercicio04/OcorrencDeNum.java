package fase05.L5Exercicio04;
/*Desenvolva um programa que solicite ao usuário inserir 10 números inteiros em um ArrayList<Integer>. Depois, peça ao usuário para digitar um número e informe quantas vezes esse número aparece na lista. */

import java.util.Scanner;
import java.util.ArrayList;

public class OcorrencDeNum {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Integer> valores = new ArrayList<>();

        for(int i=0;i<10;i++) {
            System.out.print("Informe o " + (i+1) + "º número desejado: ");
            int valor = entrada.nextInt();
            valores.add(valor);
        }
        System.out.println("------------------------------------------");
        System.out.print("Qual número será buscado?: ");
        int valBuscado = entrada.nextInt();

        int contador = 0;
        for(int numero : valores) {
            if(numero == valBuscado) {
                contador++;
            }
        }

        System.out.print("O número " + valBuscado + " aparece " + contador + " vezes na lista!");
        
        entrada.close();    
    }
}

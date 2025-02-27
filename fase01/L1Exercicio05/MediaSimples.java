/*4. Cálculo de Média Simples
Faça um programa que solicite ao usuário três notas (valores decimais) e exiba a média aritmética delas.*/
package fase01.L1Exercicio05;

import java.util.Scanner;

public class MediaSimples {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float valor1 = entrada.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float valor2 = entrada.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float valor3 = entrada.nextFloat();

        float media = (valor1 + valor2 + valor3)/3;

        System.out.print("A média aritmética é: " + media);
        entrada.close();
    }
    
}

/*2. Área de um Círculo
Desenvolva um programa que leia o raio de um círculo e calcule sua área. */

package fase01.L1Exercicio02;

import java.util.Scanner;

public class AreaDeUmCirculo {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o raio do círculo: ");
        double raio = entrada.nextDouble();

        double area = 3.14159*(raio*raio);

        System.out.print("A soma dos valores: " + area);
        entrada.close();
    }
    
}

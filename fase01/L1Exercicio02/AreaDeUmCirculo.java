/*2. Área de um Círculo
Desenvolva um programa que leia o raio de um círculo e calcule sua área. */

package fase01.L1Exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class AreaDeUmCirculo {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o raio do círculo: ");
        double raio = entrada.nextDouble();

        double area = 3.14159*Math.pow(raio, 2);

        System.out.print("A área do círculo é igual a: " + String.format(Locale.US, "%.2f", area));
        entrada.close();
    }
    
}

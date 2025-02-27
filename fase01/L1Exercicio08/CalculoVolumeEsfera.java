/*8. Cálculo do Volume de uma Esfera
Crie um programa que leia o raio de uma esfera e calcule o seu volume.

Fórmula: V = (4/3) * π * raio³.

Use π = 3.14159.
 */
package fase01.L1Exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class CalculoVolumeEsfera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual é o raio da esfera?: ");
        double raio = entrada.nextDouble();

        double volume = Math.pow(raio, 3)*3.14159*(4.0/3);

        System.out.print("O volume dessa esfera é igual a: " + String.format(Locale.US, "%.2f", volume));
        entrada.close();
    }
}

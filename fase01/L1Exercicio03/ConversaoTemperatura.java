/*3. Conversão de Temperatura
Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit. */

package fase01.L1Exercicio03;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a temperatura em ºC: ");
        float celsius = entrada.nextFloat();

        float fahrenheit = (celsius * 9/5) + 32;

        System.out.print("A temperatura  " + celsius + "ºC em fahrenheit é igual a: " + fahrenheit);
        entrada.close();
    }
}

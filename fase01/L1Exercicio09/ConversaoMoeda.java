/*9. Conversão de Moeda
Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia. O programa deve calcular e exibir o valor equivalente em dólares (US$). */

package fase01.L1Exercicio09;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoMoeda {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor em R$ a ser convertido: ");
        float valReais = entrada.nextFloat();
        System.out.print("Informe a cotação do dólar: ");
        float cotDolar = entrada.nextFloat();

        float conversao = valReais/cotDolar;

        System.out.print("O valor de: R$" + valReais + " na cotação atual do dólar equivale a: US$" + String.format(Locale.US, "%.2f", conversao));
        entrada.close();
    }
}

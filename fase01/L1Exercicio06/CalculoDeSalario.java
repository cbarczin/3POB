/*6. Cálculo do Salário
Escreva um programa que receba o salário bruto de um funcionário e o valor de desconto do INSS. O programa deve calcular e exibir o salário líquido.

---------------------------------

Dados 2025:

7,5% para quem ganha até R$ 1.518,00
9% para quem ganha entre R$ 1.518,01 até R$ 2.793,88
12% para quem ganha entre R$ 2.793,89 até R$ 4.190,83
14% para quem ganha de R$ 4.190,84 até R$ 8.157,41

*/

package fase01.L1Exercicio06;

import java.util.Scanner;

public class CalculoDeSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o seu salário a seguir: ");
        double salario = entrada.nextDouble();

        double desconto = 0;

        if(salario <= 1.518) {
            desconto = salario*0.075;
        } else {
            if(salario <= 2793.88) {
                desconto = salario*0.09;
            } else {
                if(salario <= 4190.83) {
                    desconto = salario*0.12;
                } else {
                    if(salario <= 8157.41) {
                        desconto = salario*0.14;
                    }
                }
            }
        }

        double conversao = salario-desconto;

        System.out.print("O salario líquido após o desconto do INSS será de: " + conversao + " reais!");
        entrada.close();
    }    
}
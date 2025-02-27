/*7. Cálculo do Perímetro e Área de um Retângulo
Faça um programa que solicite a base e a altura de um retângulo e exiba o seu perímetro e sua área.

Fórmulas:

Área = base × altura

Perímetro = 2 × (base + altura). */

package fase01.L1Exercicio07;

import java.util.Scanner;

public class PerimetroEAreaRetângulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual é a base do retângulo?: ");
        float base = entrada.nextFloat();

        System.out.print("Qual é a altura do retângulo?: ");
        float altura = entrada.nextFloat();

        float area = base*altura;
        float perimetro = 2*(base+altura);

        System.out.print("A área desse retângulo é igual a: " + area);
        System.out.print("\nO perímetro desse retângulo é igual a: " + perimetro);
        entrada.close();
    }
}

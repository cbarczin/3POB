/*Crie um programa que simule uma calculadora simples, permitindo ao usuário
escolher uma operação matemática básica (+, -, *, /) e dois números.*/
package fase02.L2Exercicio03;

import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Escolha a operação desejada: ");
        System.out.println("(1) ADIÇÃO\t(2) SUBTRAÇÃO\t(3) MULTIPLICAÇÃO\t(4) DIVISÃO");
        System.out.println("------------------------------");
        int operacao = entrada.nextInt();
        System.out.print("Qual será o primeiro valor da operação? ");
        int valor1 = entrada.nextInt();
        System.out.print("Qual será o segundo valor da operação? ");
        int valor2 = entrada.nextInt();

        int result;

        switch (operacao) {
            case 1:
                result = valor1+valor2;
                System.out.println("O resultado da adição é: " + result);
                break;

            case 2:
                result = valor1-valor2;
                System.out.println("O resultado da subtração é: " + result);
                break;
            
            case 3: 
                result = valor1*valor2;
                System.out.println("O resultado da multiplicação é: " + result);
                break;
            
            case 4:
                if(valor2 == 0) {
                    System.out.print("Operação impossível! O divisor não pode ser zero!");
                } else {
                result = valor1/valor2;
                System.out.println("O resultado da divisão é: " + result);
                }
                break;
        
            default:
                System.out.println("A operação digitada é inválida!");
                break;
        }
        entrada.close();
    }
}

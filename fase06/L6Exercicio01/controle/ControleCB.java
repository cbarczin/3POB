package fase06.L6Exercicio01.controle;
/*Crie um programa que simule uma conta bancária, permitindo depósitos e
saques.*/

import java.util.Scanner;
import fase06.L6Exercicio01.dominio.ContaBancaria;

public class ControleCB {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        double saldo = 0.0;

        System.out.print("Informe o nome do titular da conta: ");
        String titular = entrada.nextLine();

        ContaBancaria controle = new ContaBancaria(titular);

        do {
            System.out.println("==== MENU DE OPÇOES ====");
            System.out.println("(1) Depositar");
            System.out.println("(2) Sacar");
            System.out.println("(3) Exibir saldo");
            System.out.println("========================");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Qual valor será depositado?: ");
                    double deposito = entrada.nextDouble();
                    saldo = controle.depositarValor(deposito, saldo);
                    System.out.println(titular + ", o valor foi depositado com sucesso!");
                    break;

                case 2: 
                    System.out.print("Qual o valor que será sacado?: ");
                    double saque = entrada.nextDouble();
                    saldo = controle.sacarValor(saque, saldo);
                    System.out.println(titular + ", o valor foi debitado com sucesso!");
                    break;

                case 3: 
                    System.out.println(titular + ", o saldo disponível é: " + saldo);
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        entrada.close();
    }
}
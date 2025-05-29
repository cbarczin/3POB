package fase06.L6Exercicio05.controle;

import java.util.Scanner;
import fase06.L6Exercicio05.dominio.CaixaEletronico;

public class SimuladorCaixa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual é o saldo disponível?: ");
        double saldo = entrada.nextDouble();

        int opcao = 1;
        double valor;

        CaixaEletronico caixa = new CaixaEletronico(saldo);

        while(opcao != 0) {
            System.out.println("\n==== MENU DE OPÇÕES ====");
            System.out.println("\t(1) SACAR");
            System.out.println("\t(0) SAIR");
            System.out.println("========================");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nQual valor será debitado?: ");
                    valor = entrada.nextDouble();
                    caixa.sacar(valor);
                    caixa.exibirSaldo();
                    break;
            
                case 0:
                    System.out.println("\nEncerrando sessão...");
                    break;
            }
        }
        entrada.close();
    }
}

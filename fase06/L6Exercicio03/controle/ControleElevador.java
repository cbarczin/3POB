package fase06.L6Exercicio03.controle;

import java.util.Scanner;
import fase06.L6Exercicio03.dominio.Elevador;

public class ControleElevador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual é o andar atual?: ");
        int andarAtual = entrada.nextInt();

        System.out.print("Qual o total de andares?: ");
        int totalAndares = entrada.nextInt();
        int opcao;

        Elevador elevador = new Elevador(andarAtual, totalAndares);

        do {
            System.out.println("\n=== MENU DE OPÇÕES ===");
            System.out.println("(1) SUBIR");
            System.out.println("(2) DESCER");
            System.out.println("(3) EXIBIR ANDAR ATUAL");
            System.out.println("(4) SAIR");
            System.out.println("=======================");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    elevador.subir();
                    break;

                case 2:
                    elevador.descer();
                    break;

                case 3:
                    elevador.exibirAndar();
                    break;

                case 4:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 4);
        entrada.close();
    }
}

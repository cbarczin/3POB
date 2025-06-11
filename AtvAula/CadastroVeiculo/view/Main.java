package AtvAula.CadastroVeiculo.view;

import java.util.Scanner;

import AtvAula.CadastroVeiculo.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        int opcao;
        
        do {
            System.out.println("\n-----MENU DE OPCOES-----");
            System.out.println("\n1 - Cadastrar novo veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - SAIR");
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            System.out.println("\n");
            switch (opcao) {
                case 1:
                    CadastroController(veiculos, entrada);
                    break;

                case 2:
                    if(veiculos.isEmpty()) {
                        System.out.println("Nenhum veículo foi cadastrado até o momento!");
                    } else {
                        System.out.println("-----VEICULOS CADASTRADOS-----");
                        for(Veiculo veiculo : veiculos) {
                            veiculo.exibirDados();
                        }
                    }
                    break;

                case 3: 
                    System.out.println("Encerrando o programa...");
                    break; 

                default:
                    System.out.println("Opção escolhida é inválida!");
                    break;
            }
            System.out.println("-----------------------------------");
        } while (opcao != 3);
    }
}

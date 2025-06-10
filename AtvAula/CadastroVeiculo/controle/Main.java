package AtvAula.CadastroVeiculo.controle;

import java.util.Scanner;
import java.util.ArrayList;

import AtvAula.CadastroVeiculo.dominio.Carro;
import AtvAula.CadastroVeiculo.dominio.*;

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
                    CadastroVeiculo(veiculos, entrada);
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

    public static void CadastroVeiculo(ArrayList<Veiculo> veiculos, Scanner entrada) {
    System.out.print("Qual é o modelo do veiculo?: ");
    String modelo = entrada.nextLine();
    System.out.print("Qual é a placa do veículo?: ");
    String placa = entrada.nextLine();
    System.out.print("Qual é o ano do veículo?: ");
    int ano = entrada.nextInt();

    System.out.print("Qual é o tipo do veículo?: ");
    int tipo = entrada.nextInt();

    switch (tipo) {
        case 1:
            System.out.print("Qual é a quantidade de portas do carro?: ");
            int qntdPortas = entrada.nextInt();
            Carro carro = new Carro(placa, modelo, ano, qntdPortas);
            veiculos.add(carro);
            break;

        case 2:
            System.out.print("Qual é a quantidade de cilindradas da moto?: ");
            int cilindradas = entrada.nextInt();
            Moto moto = new Moto(placa, modelo, ano, cilindradas);
            veiculos.add(moto);
            break;
            
        case 3:
            System.out.print("Qual é a capacidade de carga do caminhão?: ");
            double capacidadeCarga = entrada.nextDouble();
            Caminhao caminhao = new Caminhao(placa, modelo, ano, capacidadeCarga);
            veiculos.add(caminhao);
            break;

        default:
            System.out.println("Opção digitada é inválida. Tente novamente!");
            break;
        }
    }
}

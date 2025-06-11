package AtvAula.CadastroVeiculo.controller;

import java.util.ArrayList;
import java.util.Scanner;
import AtvAula.CadastroVeiculo.model.*;

public class CadastroController {
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

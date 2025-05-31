package fase06.ExercHeranca.Exerc2.controle;

import java.util.Scanner;
import fase06.ExercHeranca.Exerc2.dominio.Carro;
import fase06.ExercHeranca.Exerc2.dominio.Moto;

public class ControlaVeiculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao, ano, qntdPortas, cilindradas;
        String marca, modelo;

        do {
            System.out.println("---------------");
            System.out.println("Qual é o tipo do veículo?: ");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("0. Sair\n");
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("\nQual é a marca do carro?: ");
                    marca = entrada.nextLine();

                    System.out.print("Qual é o modelo?: ");
                    modelo = entrada.nextLine();

                    System.out.print("Qual é o ano do carro?: ");
                    ano = entrada.nextInt();

                    System.out.print("Qual é a quantidade de portas?: ");
                    qntdPortas = entrada.nextInt();
                    
                    Carro carro = new Carro(marca, modelo, ano, qntdPortas);
                    carro.exibirDados();
                    break;
            
                case 2:
                    System.out.print("Qual é a marca da moto?: ");
                    marca = entrada.nextLine();

                    System.out.print("Qual é o modelo?: ");
                    modelo = entrada.nextLine();

                    System.out.print("Qual é o ano da moto?: ");
                    ano = entrada.nextInt();

                    System.out.print("Qual é a quantidade de cilindradas?: ");
                    cilindradas = entrada.nextInt();
                    
                    Moto moto = new Moto(marca, modelo, ano, cilindradas);
                    moto.exibirDados();
                    break;

                default:
                    break;
            }
        } while (opcao != 0);
        entrada.close();
    }
}

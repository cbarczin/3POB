package fase06.ExercHeranca.Exerc2.controle;

import java.util.Scanner;
import fase06.ExercHeranca.Exer2.dominio.Carro;
import fase06.ExercHeranca.Exer2.dominio.Moto;

public class ControlaVeiculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = entrada.nextInt();

        do {
            System.out.println("---------------");
            System.out.println("Qual é o tipo do veículo?: ");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("0. Sair");

            switch (opcao) {
                case 1:
                    System.out.println("Qual é a quantidade de portas?: ");
                    int qntdPortas = entrada.nextInt();
                    
                    
                    break;
            
                default:
                    break;
            }

        }
    }
}

package fase06.ExercHeranca.Exerc5.controle;

import java.util.Scanner;
import fase06.ExercHeranca.Exerc5.dominio.Carro;
import fase06.ExercHeranca.Exerc5.dominio.Moto;

public class ControlaVeiculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ano, qntdPortas;
        String marca, opcao, resposta;
        boolean temPartidaEletrica;

        System.out.println("------------------------------------------");
        System.out.print("Qual é o tipo do veículo? Carro ou Moto?: ");
        opcao = entrada.nextLine();
        //entrada.nextLine();

        if(opcao.equalsIgnoreCase("CARRO")) {
            System.out.print("\nQual é a marca do carro?: ");
            marca = entrada.nextLine();

            System.out.print("Qual é o ano do carro?: ");
            ano = entrada.nextInt();

            System.out.print("Qual é a quantidade de portas?: ");
            qntdPortas = entrada.nextInt();
            
            Carro carro = new Carro(marca, ano, qntdPortas);
            carro.exibirDados();
        } else {
            if(opcao.equalsIgnoreCase("MOTO")) {
                System.out.print("\nQual é a marca da moto?: ");
                marca = entrada.nextLine();

                System.out.print("Qual é o ano da moto?: ");
                ano = entrada.nextInt();
                entrada.nextLine();

                System.out.print("Tem partida elétrica? (Sim/Não): ");
                resposta = entrada.nextLine();
                temPartidaEletrica = resposta.equalsIgnoreCase("Sim");
                    
                Moto moto = new Moto(marca, ano, temPartidaEletrica);
                moto.exibirDados();
            }
        }
        entrada.close();
    }
}

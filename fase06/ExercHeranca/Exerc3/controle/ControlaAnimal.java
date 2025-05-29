package fase06.ExercHeranca.Exerc3.controle;

import java.util.Scanner;
import fase06.ExercHeranca.Exerc3.dominio.Cachorro;
import fase06.ExercHeranca.Exerc3.dominio.Gato;

public class ControlaAnimal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String opcao, nome;
        int idade;

        do {
            System.out.println("---------------");
            System.out.print("Qual é o seu animal? (Gato/Cachorro/Sair): ");
            opcao = entrada.nextLine();
            opcao = opcao.toUpperCase();

            switch (opcao) {
                case "GATO":
                    System.out.print("Qual é o nome do gato?: ");
                    nome = entrada.nextLine();
                    
                    System.out.print("Qual é a sua idade?: ");
                    idade = entrada.nextInt();

                    Gato gato = new Gato(nome, idade, "Miando...");
                    gato.exibirInfos();
                    entrada.nextLine();
                    break;

                case "CACHORRO":
                    System.out.print("Qual é o nome do cachorro?: ");
                    nome = entrada.nextLine();
                    
                    System.out.print("Qual é a sua idade?: ");
                    idade = entrada.nextInt();

                    Cachorro cachorro = new Cachorro(nome, idade, "Latindo...");
                    cachorro.exibirInfos();
                    entrada.nextLine();
                    break;

                case "SAIR":
                    System.out.println("Encerrando o programa...");
                    break;   

                default:
                    System.out.println("Opção inválida! Tente novamente!");
                    break;
            }
        } while (!opcao.equals("SAIR"));
        entrada.close();
    }
}

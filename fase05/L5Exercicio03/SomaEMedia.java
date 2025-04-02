package fase05.L5Exercicio03;
/*Crie um programa que solicite ao usuário inserir números em um
ArrayList<Double> até que ele digite -1. Depois, exiba a soma e a média dos
números inseridos (excluindo o -1). */

import java.util.Scanner;
import java.util.ArrayList;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qntd = 0;
        double soma = 0;
        double valor;

        ArrayList<Double> valores = new ArrayList<>();

        do {
            System.out.println("Digite o número desejado! (Digite -1 para sair)");
            valor = entrada.nextDouble();
            valores.add(valor);

            if(valor != -1) {
                soma += valor;
                qntd++;
            }
        } while (valor != -1);

        System.out.print("A média dos números digitados é igual a: " + soma/qntd);

        entrada.close();
    }
}

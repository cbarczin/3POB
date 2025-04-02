package fase05.L5Exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElemLista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        for(int i=0;i<5;i++) {
            System.out.print("Informe o " + (i+1) + "º nome desejado: ");
            String nome = entrada.nextLine();
            nomes.add(nome);
        }
        System.out.println("------------------------------------------");
        System.out.print("Qual nome será removido?: ");
        String nomeRem = entrada.nextLine();
        nomes.remove(nomeRem);

        for(String j : nomes) {
            System.out.println(j);

        }
        entrada.close();
    }
}

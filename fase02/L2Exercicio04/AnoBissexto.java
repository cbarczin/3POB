package fase02.L2Exercicio04;

import java.util.Scanner;

public class AnoBissexto {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o ano desejado: ");
        int ano = entrada.nextInt();

        if(ano%4 == 0) {
            System.out.print("O ano é bissexto!");
        } else {
            if((ano%100 == 0) && (ano%400 == 0)) {
                System.out.print("O ano é bissexto!");
            } else {
                System.out.print("O ano não é bissexto!");
            }
        }
        entrada.close();
    }
}

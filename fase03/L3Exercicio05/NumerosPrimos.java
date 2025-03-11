package fase03.L3Exercicio05;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o inicio do intervalo: ");
        int inicio = entrada.nextInt();
        System.out.print("Informe o fim do intervalo: ");
        int fim = entrada.nextInt();

        System.out.println("Números primos encontrados no intervalo: ");
        for(int i=inicio;i<=fim;i++) {
            int cont = 0;
            for(int j=1;j<=fim; j++) {
                if(i%j == 0) {
                    cont++;
                }
            }

            if(cont == 2) {
                System.out.println(i);
            }
        }
        entrada.close();
    }
}

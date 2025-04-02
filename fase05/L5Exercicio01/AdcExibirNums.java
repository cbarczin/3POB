package fase05.L5Exercicio01;
/*Crie um programa que permita ao usuário inserir quantos números desejar em
um ArrayList<Integer>. Após a inserção, o programa deve exibir todos os números
digitados. */
import java.util.Scanner;
import java.util.ArrayList;

public class AdcExibirNums {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcao;

        ArrayList<Integer> numeros = new ArrayList<>();

        do {
            System.out.print("Qual número deseja inserir?: ");
            int numero = entrada.nextInt();
            numeros.add(numero);

            entrada.nextLine();

            System.out.print("Deseja continuar inserindo números? (S/N): ");
            opcao = entrada.nextLine();

        } while (opcao.equalsIgnoreCase("s"));

        System.out.print("Os números digitados foram: ");
        for(int i : numeros) {
            System.out.print(i);
        }

        entrada.close();
    }
}

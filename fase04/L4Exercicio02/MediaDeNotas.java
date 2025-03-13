/*Desenvolva um programa que peça ao usuário para inserir 4 notas e armazene-as
em um array. Depois, o programa deve calcular e exibir a média das notas.*/

package fase04.L4Exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaDeNotas {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Float> notas = new ArrayList<>();

        float soma = 0;
        
        for(int i=0;i<4;i++) {
            System.out.print("Informe a " + (i+1) + "º nota: ");
            float nota = entrada.nextFloat();
            notas.add(nota);
            soma+= notas.get(i);
        }

        float result = soma/4;

        System.out.print("A média desse aluno é de: " + result);
        entrada.close();
    }
}
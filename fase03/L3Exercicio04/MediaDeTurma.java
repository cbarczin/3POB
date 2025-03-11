package fase03.L3Exercicio04;

import java.util.Scanner;

public class MediaDeTurma {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual a quantidade de alunos nessa sala?: ");
        int qntd = entrada.nextInt();
        float somaNotas = 0;


        for(int i=1;i<=qntd;i++) {
            System.out.print("Qual foi a nota do " + i + "º aluno?: ");
            float soma = entrada.nextFloat();
            somaNotas += soma;
        }

        float result = somaNotas/qntd;

        System.out.print("A média da turma é igual a: " + result);
        entrada.close();
    }
    
}

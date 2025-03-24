package projeto02.controle;

import java.util.Scanner;

import projeto02.dominio.Pessoa;

public class ControlarPessoa {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome?: ");
        String nome = entrada.nextLine();

        System.out.println("Qual o seu altura?: ");
        float altura = entrada.nextFloat();

        //entrada.nextLine();

        System.out.println("Qual o seu peso?: ");
        float peso = entrada.nextFloat();

        System.out.println("Qual a sua idade?: ");
        int idade = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Qual o seu genero?: ");
        String genero = entrada.nextLine();

        Pessoa pessoa2 = new Pessoa(nome,altura,peso,idade,genero);

        pessoa2.CalcularIMC();
        entrada.close();
    }
}

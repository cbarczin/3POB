package fase06.controle;

import java.util.Scanner;
import java.util.ArrayList;

import fase06.dominio.ContaBancaria;

public class ControleCB {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        String titular = entrada.nextLine();

        System.out.println("Digite o saldo disponível");
        double saldo = entrada.nextDouble();
    }
    
}
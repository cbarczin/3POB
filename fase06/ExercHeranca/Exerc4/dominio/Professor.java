package fase06.ExercHeranca.Exerc4.dominio;

import java.text.NumberFormat;

public class Professor extends Pessoa{
    public double salario;

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirDados() {
        System.out.println("\n-----Dados do Professor-----");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        NumberFormat moeda = NumberFormat.getCurrencyInstance();
        System.out.println("Salário: " + moeda.format(salario));
        System.out.println("----------------------------");
    }
}

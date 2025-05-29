package fase06.ExercHeranca.Exerc1.dominio;

import java.text.NumberFormat;

public class Estagiario extends Funcionario {
    private double bonus;
    int moeda;

    public Estagiario(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = 0.05;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override 
    public double calcularSalario() {
        return salarioBase + (bonus*salarioBase);
    }

    @Override
    public void exibirDados() {
        System.out.println("\nDados do estagiário(a):");
        System.out.println("Nome: " + nome);
        System.out.println("Salario base: " + salarioBase);

        NumberFormat moeda = NumberFormat.getCurrencyInstance();
        System.out.println("Salario total: " + moeda.format(calcularSalario()));
    }


}

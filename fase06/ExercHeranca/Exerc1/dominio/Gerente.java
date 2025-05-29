package fase06.ExercHeranca.Exerc1.dominio;

import java.text.NumberFormat;

public class Gerente extends Funcionario {
    private double bonus;


    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = 0.2;
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
        System.out.println("\nDados do gerente: ");
        System.out.println("Nome: " + nome);
        System.out.println("Salario base: " + salarioBase);
        NumberFormat moeda = NumberFormat.getCurrencyInstance();
        System.out.println("Salario total: " + moeda.format(calcularSalario()));
    }
}

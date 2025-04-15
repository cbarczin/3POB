package fase06.L6Exercicio02.dominio;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private String categoria;

    public Funcionario(String nome, double salarioBase, String categoria) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.categoria = categoria.toUpperCase();
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double calcularSalarioFinal() {

        switch (categoria) {
            case "A":
                return salarioBase+(salarioBase*0.2);

            case "B":
                return salarioBase+(salarioBase*0.1);

            case "C":
                return salarioBase;

            default:
                System.out.println("Categoria inválida!");
                break;
        }
        return salarioBase;
    }
}
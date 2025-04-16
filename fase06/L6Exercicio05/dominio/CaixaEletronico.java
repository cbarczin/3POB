package fase06.L6Exercicio05.dominio;

public class CaixaEletronico {
    private double saldo;

    public CaixaEletronico(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if((valor%10 == 0) && (saldo >= valor)) {
            saldo -= valor;
            System.out.println("Sacando valor...");
        } else {
            System.out.println("\nSaldo insuficiente ou valor não é múltiplo de 10");
        }
    }

    public void exibirSaldo() {
        System.out.println("O saldo disponível é: " + saldo);
    }
}



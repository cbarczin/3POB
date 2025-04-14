package fase06.dominio;

public class ContaBancaria {
    private String titular;
    private double saldo;

public ContaBancaria(String titular) {
    this.titular = titular;
    this.saldo = 0.0;
    }

public String getTitular() {
    return titular;
}

public double getSaldo() {
    return saldo;
}

public void setTitular(String titular) {
    this.titular = titular;
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}

public double depositarValor(double valor, double saldo) {
    return saldo += valor;
}

public double sacarValor(double valor, double saldo) {
    if(saldo >= valor) {
        return saldo -= valor;
    } else {
        System.out.println("Saldo insuficiente");
        return saldo;
    }
}

public void exibirSaldo(double saldo) {
    System.out.println("Seu saldo é igual a: " + saldo);
}

}

